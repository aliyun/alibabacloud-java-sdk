// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
    @NameInMap("DeploymentPolicy")
    public String deploymentPolicyShrink;

    /**
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("JobDescription")
    public String jobDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testjob</p>
     */
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobScheduler")
    public String jobScheduler;

    @NameInMap("SecurityPolicy")
    public String securityPolicyShrink;

    /**
     * <p>This parameter is required.</p>
     */
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

    public CreateJobShrinkRequest setJobScheduler(String jobScheduler) {
        this.jobScheduler = jobScheduler;
        return this;
    }
    public String getJobScheduler() {
        return this.jobScheduler;
    }

    public CreateJobShrinkRequest setSecurityPolicyShrink(String securityPolicyShrink) {
        this.securityPolicyShrink = securityPolicyShrink;
        return this;
    }
    public String getSecurityPolicyShrink() {
        return this.securityPolicyShrink;
    }

    public CreateJobShrinkRequest setTasksShrink(String tasksShrink) {
        this.tasksShrink = tasksShrink;
        return this;
    }
    public String getTasksShrink() {
        return this.tasksShrink;
    }

}
