// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeRunModeRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("SchedulerType")
    public Integer schedulerType;

    public static UpdateNodeRunModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeRunModeRequest self = new UpdateNodeRunModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeRunModeRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public UpdateNodeRunModeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public UpdateNodeRunModeRequest setSchedulerType(Integer schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public Integer getSchedulerType() {
        return this.schedulerType;
    }

}
