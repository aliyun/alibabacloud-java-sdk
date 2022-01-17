// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class RollbackCurrentProjectNodeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public Long nodeId;

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
