// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PauseProjectRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("Remark")
    public String remark;

    public static PauseProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseProjectRequest self = new PauseProjectRequest();
        return TeaModel.build(map, self);
    }

    public PauseProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PauseProjectRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public PauseProjectRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
