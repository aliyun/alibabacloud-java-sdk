// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
    /**
     * <p>Dependency policy.</p>
     */
    @NameInMap("DependencyPolicy")
    public String dependencyPolicyShrink;

    /**
     * <p>The resource deployment policy.</p>
     */
    @NameInMap("DeploymentPolicy")
    public String deploymentPolicyShrink;

    /**
     * <p>The description of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("JobDescription")
    public String jobDescription;

    /**
     * <p>The job name. The name must be 2 to 64 characters in length and can contain letters, digits, and Chinese characters. It can contain hyphens (-) and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testjob</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The type of the job scheduler.</p>
     * <ul>
     * <li>HPC</li>
     * <li>K8S</li>
     * </ul>
     * <p>Default value: HPC</p>
     * 
     * <strong>example:</strong>
     * <p>HPC</p>
     */
    @NameInMap("JobScheduler")
    public String jobScheduler;

    /**
     * <p>The security policy.</p>
     */
    @NameInMap("SecurityPolicy")
    public String securityPolicyShrink;

    /**
     * <p>The list of tasks. Only one task is supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tasks")
    public String tasksShrink;

    public static CreateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobShrinkRequest self = new CreateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobShrinkRequest setDependencyPolicyShrink(String dependencyPolicyShrink) {
        this.dependencyPolicyShrink = dependencyPolicyShrink;
        return this;
    }
    public String getDependencyPolicyShrink() {
        return this.dependencyPolicyShrink;
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
