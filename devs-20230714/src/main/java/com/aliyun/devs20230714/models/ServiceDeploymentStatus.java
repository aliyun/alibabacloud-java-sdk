// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceDeploymentStatus extends TeaModel {
    @NameInMap("finishedTime")
    public String finishedTime;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>my-pipeline</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>my-task</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static ServiceDeploymentStatus build(java.util.Map<String, ?> map) throws Exception {
        ServiceDeploymentStatus self = new ServiceDeploymentStatus();
        return TeaModel.build(map, self);
    }

    public ServiceDeploymentStatus setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public ServiceDeploymentStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ServiceDeploymentStatus setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public ServiceDeploymentStatus setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ServiceDeploymentStatus setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
