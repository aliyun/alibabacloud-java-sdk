// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class RollbackCurrentProjectNodeRequest extends TeaModel {
    /**
     * <p>The instance ID of the Alibaba Cloud Marketplace order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4****89</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the current process node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1925</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The remarks for the rejection reason.</p>
     * 
     * <strong>example:</strong>
     * <p>尊敬的顾客您好，您提交的收货地址存在多个匹配结果，请您核对后再重新提交。</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static RollbackCurrentProjectNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackCurrentProjectNodeRequest self = new RollbackCurrentProjectNodeRequest();
        return TeaModel.build(map, self);
    }

    public RollbackCurrentProjectNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RollbackCurrentProjectNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public RollbackCurrentProjectNodeRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
