// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
    @NameInMap("DeploymentPolicy")
    public String deploymentPolicyShrink;

    @NameInMap("JobDescription")
    public String jobDescription;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Tasks")
    public String tasksShrink;

    public static CreateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobShrinkRequest self = new CreateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobShrinkRequest setDeploymentPolicyShrink(String deploymentPolicyShrink) {
        this.deploymentPolicyShrink = deploymentPolicyShrink;
        return this;
    }
    public String getDeploymentPolicyShrink() {
        return this.deploymentPolicyShrink;
    }

    public CreateJobShrinkRequest setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public CreateJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobShrinkRequest setTasksShrink(String tasksShrink) {
        this.tasksShrink = tasksShrink;
        return this;
    }
    public String getTasksShrink() {
        return this.tasksShrink;
    }

}
