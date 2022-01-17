// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ResumeProjectRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("Remark")
    public String remark;

    public static ResumeProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeProjectRequest self = new ResumeProjectRequest();
        return TeaModel.build(map, self);
    }

    public ResumeProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResumeProjectRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ResumeProjectRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
