// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentDeploymentStatus extends TeaModel {
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

    @NameInMap("serviceDeployments")
    public java.util.Map<String, String> serviceDeployments;

    public static EnvironmentDeploymentStatus build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentDeploymentStatus self = new EnvironmentDeploymentStatus();
        return TeaModel.build(map, self);
    }

    public EnvironmentDeploymentStatus setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public EnvironmentDeploymentStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public EnvironmentDeploymentStatus setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public EnvironmentDeploymentStatus setServiceDeployments(java.util.Map<String, String> serviceDeployments) {
        this.serviceDeployments = serviceDeployments;
        return this;
    }
    public java.util.Map<String, String> getServiceDeployments() {
        return this.serviceDeployments;
    }

}
