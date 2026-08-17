// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The dependency policy.</p>
     */
    @NameInMap("DependencyPolicy")
    public CreateJobRequestDependencyPolicy dependencyPolicy;

    /**
     * <p>The resource deployment policy.</p>
     */
    @NameInMap("DeploymentPolicy")
    public CreateJobRequestDeploymentPolicy deploymentPolicy;

    /**
     * <p>The job description.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("JobDescription")
    public String jobDescription;

    /**
     * <p>The job name. The name must be 2 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testjob</p>
     */
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobScheduler")
    public String jobScheduler;

    /**
     * <p>The job template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>jt-xxxx</p>
     */
    @NameInMap("JobTemplateId")
    public String jobTemplateId;

    /**
     * <p>The security policy.</p>
     */
    @NameInMap("SecurityPolicy")
    public CreateJobRequestSecurityPolicy securityPolicy;

    /**
     * <p>The task list. Currently, only one task is supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<CreateJobRequestTasks> tasks;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setDependencyPolicy(CreateJobRequestDependencyPolicy dependencyPolicy) {
        this.dependencyPolicy = dependencyPolicy;
        return this;
    }
    public CreateJobRequestDependencyPolicy getDependencyPolicy() {
        return this.dependencyPolicy;
    }

    public CreateJobRequest setDeploymentPolicy(CreateJobRequestDeploymentPolicy deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
        return this;
    }
    public CreateJobRequestDeploymentPolicy getDeploymentPolicy() {
        return this.deploymentPolicy;
    }

    public CreateJobRequest setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public CreateJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobRequest setJobScheduler(String jobScheduler) {
        this.jobScheduler = jobScheduler;
        return this;
    }
    public String getJobScheduler() {
        return this.jobScheduler;
    }

    public CreateJobRequest setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public CreateJobRequest setSecurityPolicy(CreateJobRequestSecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }
    public CreateJobRequestSecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    public CreateJobRequest setTasks(java.util.List<CreateJobRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<CreateJobRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class CreateJobRequestDependencyPolicyJobDependency extends TeaModel {
        /**
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-bjxxxxxxxxxxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The dependency type. Valid values:</p>
         * <ul>
         * <li>AfterSucceeded: <strong>All tasks</strong> in the dependent job or array job run successfully (exit code 0).</li>
         * <li>AfterFailed: <strong>Any task</strong> in the dependent job or array job fails (exit code is not 0).</li>
         * <li>AfterAny: The dependent job finishes running (succeeded or failed).</li>
         * <li>AfterCorresponding: The corresponding task in the dependent array job runs successfully (exit code 0).</li>
         * </ul>
         * <p>Default value: AfterSucceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>AfterSucceeded</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateJobRequestDependencyPolicyJobDependency build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestDependencyPolicyJobDependency self = new CreateJobRequestDependencyPolicyJobDependency();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestDependencyPolicyJobDependency setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateJobRequestDependencyPolicyJobDependency setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateJobRequestDependencyPolicy extends TeaModel {
        /**
         * <p>The job dependencies. A maximum of 10 groups are supported.</p>
         */
        @NameInMap("JobDependency")
        public java.util.List<CreateJobRequestDependencyPolicyJobDependency> jobDependency;

        public static CreateJobRequestDependencyPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestDependencyPolicy self = new CreateJobRequestDependencyPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestDependencyPolicy setJobDependency(java.util.List<CreateJobRequestDependencyPolicyJobDependency> jobDependency) {
            this.jobDependency = jobDependency;
            return this;
        }
        public java.util.List<CreateJobRequestDependencyPolicyJobDependency> getJobDependency() {
            return this.jobDependency;
        }

    }

    public static class CreateJobRequestDeploymentPolicyNetwork extends TeaModel {
        /**
         * <p>Specifies whether to create a public IP address for the job.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableExternalIpAddress")
        public Boolean enableExternalIpAddress;

        /**
         * <p>The vSwitch array.</p>
         */
        @NameInMap("Vswitch")
        public java.util.List<String> vswitch;

        public static CreateJobRequestDeploymentPolicyNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestDeploymentPolicyNetwork self = new CreateJobRequestDeploymentPolicyNetwork();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestDeploymentPolicyNetwork setEnableExternalIpAddress(Boolean enableExternalIpAddress) {
            this.enableExternalIpAddress = enableExternalIpAddress;
            return this;
        }
        public Boolean getEnableExternalIpAddress() {
            return this.enableExternalIpAddress;
        }

        public CreateJobRequestDeploymentPolicyNetwork setVswitch(java.util.List<String> vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public java.util.List<String> getVswitch() {
            return this.vswitch;
        }

    }

    public static class CreateJobRequestDeploymentPolicyTag extends TeaModel {
        /**
         * <p>The tag key of the job. If you specify this parameter, the value cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the job. If you specify this parameter, the value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateJobRequestDeploymentPolicyTag build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestDeploymentPolicyTag self = new CreateJobRequestDeploymentPolicyTag();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestDeploymentPolicyTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateJobRequestDeploymentPolicyTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateJobRequestDeploymentPolicy extends TeaModel {
        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        /**
         * <p>The computing power level. This parameter is valid only when the resource type is economy. Valid values:</p>
         * <ul>
         * <li>General: general-purpose.</li>
         * <li>Performance: compute-optimized.</li>
         * </ul>
         * <p>Default value: General</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("Network")
        public CreateJobRequestDeploymentPolicyNetwork network;

        /**
         * <p>The job resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        @NameInMap("Pool")
        public String pool;

        /**
         * <p>The job priority. A larger value indicates a higher scheduling priority. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The job tag information. A maximum of 20 tags are supported.</p>
         */
        @NameInMap("Tag")
        public java.util.List<CreateJobRequestDeploymentPolicyTag> tag;

        public static CreateJobRequestDeploymentPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestDeploymentPolicy self = new CreateJobRequestDeploymentPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestDeploymentPolicy setAllocationSpec(String allocationSpec) {
            this.allocationSpec = allocationSpec;
            return this;
        }
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        public CreateJobRequestDeploymentPolicy setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateJobRequestDeploymentPolicy setNetwork(CreateJobRequestDeploymentPolicyNetwork network) {
            this.network = network;
            return this;
        }
        public CreateJobRequestDeploymentPolicyNetwork getNetwork() {
            return this.network;
        }

        public CreateJobRequestDeploymentPolicy setPool(String pool) {
            this.pool = pool;
            return this;
        }
        public String getPool() {
            return this.pool;
        }

        public CreateJobRequestDeploymentPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateJobRequestDeploymentPolicy setTag(java.util.List<CreateJobRequestDeploymentPolicyTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateJobRequestDeploymentPolicyTag> getTag() {
            return this.tag;
        }

    }

    public static class CreateJobRequestSecurityPolicySecurityGroup extends TeaModel {
        /**
         * <p>The array of security group IDs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static CreateJobRequestSecurityPolicySecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestSecurityPolicySecurityGroup self = new CreateJobRequestSecurityPolicySecurityGroup();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestSecurityPolicySecurityGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class CreateJobRequestSecurityPolicy extends TeaModel {
        /**
         * <p>The security group.</p>
         */
        @NameInMap("SecurityGroup")
        public CreateJobRequestSecurityPolicySecurityGroup securityGroup;

        public static CreateJobRequestSecurityPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestSecurityPolicy self = new CreateJobRequestSecurityPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestSecurityPolicy setSecurityGroup(CreateJobRequestSecurityPolicySecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public CreateJobRequestSecurityPolicySecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class CreateJobRequestTasksExecutorPolicyArraySpec extends TeaModel {
        /**
         * <p>The end value of the array job index. Valid values: 0 to 4999. The value must be greater than or equal to IndexStart.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("IndexEnd")
        public Integer indexEnd;

        /**
         * <p>The start value of the array job index. Valid values: 0 to 4999.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IndexStart")
        public Integer indexStart;

        /**
         * <p>The interval between indexes in an array job.</p>
         * <blockquote>
         * <p>If the array job has the properties IndexStart=1, IndexEnd=5, and IndexStep=2, the array job contains three sub-jobs with indexes 1, 3, and 5. Your application can access these indexes through environment variables.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndexStep")
        public Integer indexStep;

        public static CreateJobRequestTasksExecutorPolicyArraySpec build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksExecutorPolicyArraySpec self = new CreateJobRequestTasksExecutorPolicyArraySpec();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksExecutorPolicyArraySpec setIndexEnd(Integer indexEnd) {
            this.indexEnd = indexEnd;
            return this;
        }
        public Integer getIndexEnd() {
            return this.indexEnd;
        }

        public CreateJobRequestTasksExecutorPolicyArraySpec setIndexStart(Integer indexStart) {
            this.indexStart = indexStart;
            return this;
        }
        public Integer getIndexStart() {
            return this.indexStart;
        }

        public CreateJobRequestTasksExecutorPolicyArraySpec setIndexStep(Integer indexStep) {
            this.indexStep = indexStep;
            return this;
        }
        public Integer getIndexStep() {
            return this.indexStep;
        }

    }

    public static class CreateJobRequestTasksExecutorPolicy extends TeaModel {
        /**
         * <p>The array job details. Sub-job index values are passed to the runtime environment through environment variables, which can be referenced by user applications. The environment variables include:</p>
         * <ul>
         * <li>EHPC_JOB_NAME: the job name, corresponding to the JobName parameter.</li>
         * <li>EHPC_JOB_ID: the job ID.</li>
         * <li>EHPC_TASK_NAME: the task name, corresponding to the TaskName parameter.</li>
         * <li>EHPC_EXECUTOR_ID: the executor ID.</li>
         * <li>EHPC_ARRAY_TASK_ID: the sub-job index value.</li>
         * <li>EHPC_ARRAY_TASK_COUNT: the total number of sub-jobs.</li>
         * <li>EHPC_ARRAY_TASK_MAX: the maximum sub-job index value, corresponding to the IndexStart parameter.</li>
         * <li>EHPC_ARRAY_TASK_MIN: the minimum sub-job index value, corresponding to the IndexEnd parameter.</li>
         * <li>EHPC_ARRAY_TASK_STEP: the sub-job index step, corresponding to the IndexStep parameter.</li>
         * </ul>
         */
        @NameInMap("ArraySpec")
        public CreateJobRequestTasksExecutorPolicyArraySpec arraySpec;

        /**
         * <p>The maximum number of nodes for the job.</p>
         * <blockquote>
         * <p>The value must comply with the following formula: <code>MaxCount = (IndexEnd - IndexStart) / IndexStep + 1</code></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxCount")
        public Integer maxCount;

        public static CreateJobRequestTasksExecutorPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksExecutorPolicy self = new CreateJobRequestTasksExecutorPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksExecutorPolicy setArraySpec(CreateJobRequestTasksExecutorPolicyArraySpec arraySpec) {
            this.arraySpec = arraySpec;
            return this;
        }
        public CreateJobRequestTasksExecutorPolicyArraySpec getArraySpec() {
            return this.arraySpec;
        }

        public CreateJobRequestTasksExecutorPolicy setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

    }

    public static class CreateJobRequestTasksTaskSpecResourceDisks extends TeaModel {
        /**
         * <p>The cloud disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The cloud disk type. Currently, only System is supported, which indicates a system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateJobRequestTasksTaskSpecResourceDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecResourceDisks self = new CreateJobRequestTasksTaskSpecResourceDisks();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecResourceDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateJobRequestTasksTaskSpecResourceDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateJobRequestTasksTaskSpecResource extends TeaModel {
        /**
         * <p>The number of CPUs in the runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Float cores;

        /**
         * <p>The cloud disk array.</p>
         */
        @NameInMap("Disks")
        public java.util.List<CreateJobRequestTasksTaskSpecResourceDisks> disks;

        /**
         * <p>Specifies whether hyper-threading is enabled in the runtime environment. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableHT")
        public Boolean enableHT;

        /**
         * <p>The hostname prefix of the runtime environment. The following limits apply:</p>
         * <ul>
         * <li>A period (.) and a hyphen (-) cannot be used as the first or last character, or consecutively.</li>
         * <li>Windows environment: The value can be up to 10 characters in length, cannot contain periods (.), and cannot consist of digits only. Uppercase and lowercase letters, digits, and hyphens (-) are allowed.</li>
         * <li>Linux environment: The value can be up to 32 characters in length and can contain multiple periods (.). The hostname is divided into segments by periods. Each segment can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>The instance types of the runtime environment. A maximum of 5 instance types are supported.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The memory size of the runtime environment. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        public static CreateJobRequestTasksTaskSpecResource build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecResource self = new CreateJobRequestTasksTaskSpecResource();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public CreateJobRequestTasksTaskSpecResource setDisks(java.util.List<CreateJobRequestTasksTaskSpecResourceDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<CreateJobRequestTasksTaskSpecResourceDisks> getDisks() {
            return this.disks;
        }

        public CreateJobRequestTasksTaskSpecResource setEnableHT(Boolean enableHT) {
            this.enableHT = enableHT;
            return this;
        }
        public Boolean getEnableHT() {
            return this.enableHT;
        }

        public CreateJobRequestTasksTaskSpecResource setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public CreateJobRequestTasksTaskSpecResource setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateJobRequestTasksTaskSpecResource setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions extends TeaModel {
        /**
         * <p>The next action for the node. Valid values:</p>
         * <ul>
         * <li><p>Retry: When a specific exit code is matched, the job starts a new retry.</p>
         * </li>
         * <li><p>Exit: When a specific exit code is matched, the job exits.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Retry</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The task exit code, which is used together with Action to form a job retry rule. Valid values: 0 to 255.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        public static CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions self = new CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

    }

    public static class CreateJobRequestTasksTaskSpecRetryPolicy extends TeaModel {
        /**
         * <p>The retry rules. A maximum of 10 rules are supported.</p>
         */
        @NameInMap("ExitCodeActions")
        public java.util.List<CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions;

        /**
         * <p>The number of retries. Valid values: 1 to 10. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        public static CreateJobRequestTasksTaskSpecRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecRetryPolicy self = new CreateJobRequestTasksTaskSpecRetryPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecRetryPolicy setExitCodeActions(java.util.List<CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions) {
            this.exitCodeActions = exitCodeActions;
            return this;
        }
        public java.util.List<CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions> getExitCodeActions() {
            return this.exitCodeActions;
        }

        public CreateJobRequestTasksTaskSpecRetryPolicy setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars extends TeaModel {
        /**
         * <p>The environment variable name. The name must be 1 to 128 characters in length. The format is [0-9a-zA-Z] and underscores. The name cannot start with a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The environment variable value. The value can be 0 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars self = new CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutorContainer extends TeaModel {
        /**
         * <p>The container application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ci-vm-32k6LXAi3cOG</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The arguments for the container startup command. A maximum of 10 arguments are supported.</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The list of container startup commands. A maximum of 20 commands are supported. Each command can contain up to 256 characters.</p>
         * <blockquote>
         * <ol>
         * <li>If a startup command contains spaces (for example, <code>sleep 60s</code>), pass the JSON parameter as <code>[&quot;sleep&quot;, &quot;60s&quot;]</code>.</li>
         * <li>If a startup command is complex, use a combination of <code>Command: [&quot;/bin/bash&quot;]</code> and <code>Arg:[&quot;-c&quot;, &quot;&lt;customized command&gt;&quot;]</code>, where <code>&lt;customized command&gt;</code> is a user-defined command that can contain spaces and other characters.</li>
         * </ol>
         * </blockquote>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The environment variables of the container. A maximum of 20 environment variables are supported.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars;

        /**
         * <p>The container image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc/hpl:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The list of mount parameters for a self-managed image registry. The parameters are in key-value format and passed as a JSON string.</p>
         * <ul>
         * <li>Reference format: {&quot;ImageRegistryType&quot;:&quot;https&quot;,&quot;ImageRegistryServer&quot;:&quot;xxx&quot;,&quot;ImageRegistryUserName&quot;:&quot;xxx&quot;,&quot;ImageRegistryPassword&quot;:&quot;xxx&quot;}</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ImageRegistryType&quot;:&quot;https&quot;,&quot;ImageRegistryServer&quot;:&quot;xxx&quot;,&quot;ImageRegistryUserName&quot;:&quot;xxx&quot;,&quot;ImageRegistryPassword&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("ImageRegistryOptions")
        public String imageRegistryOptions;

        /**
         * <p>The container working directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static CreateJobRequestTasksTaskSpecTaskExecutorContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecTaskExecutorContainer self = new CreateJobRequestTasksTaskSpecTaskExecutorContainer();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainer setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainer setEnvironmentVars(java.util.List<CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainer setImageRegistryOptions(String imageRegistryOptions) {
            this.imageRegistryOptions = imageRegistryOptions;
            return this;
        }
        public String getImageRegistryOptions() {
            return this.imageRegistryOptions;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars self = new CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutorVM extends TeaModel {
        /**
         * <p>The virtual machine application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ci-vm-9jc58Pm5Leky</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("EnvironmentVars")
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars> environmentVars;

        /**
         * <p>The image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-xxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The logon password for the virtual machine environment. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Supported special characters are:</p>
         * <p>()`~!@#$%^&amp;*-_+=|{}[]:;\&quot;&lt;&gt;,.?/</p>
         * <p>For Windows environments, the password cannot start with a forward slash (/).</p>
         * <blockquote>
         * <p>If you specify the Password parameter, use HTTPS to send the request to prevent password leakage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EHPC@1234</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The pre-processing script. The script must be Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("PrologScript")
        public String prologScript;

        /**
         * <p>The job execution script. The script must be Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("Script")
        public String script;

        public static CreateJobRequestTasksTaskSpecTaskExecutorVM build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecTaskExecutorVM self = new CreateJobRequestTasksTaskSpecTaskExecutorVM();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setEnvironmentVars(java.util.List<CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutorVMEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setPrologScript(String prologScript) {
            this.prologScript = prologScript;
            return this;
        }
        public String getPrologScript() {
            return this.prologScript;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutor extends TeaModel {
        /**
         * <p>The container environment settings.</p>
         */
        @NameInMap("Container")
        public CreateJobRequestTasksTaskSpecTaskExecutorContainer container;

        /**
         * <p>The virtual machine environment settings.</p>
         */
        @NameInMap("VM")
        public CreateJobRequestTasksTaskSpecTaskExecutorVM VM;

        public static CreateJobRequestTasksTaskSpecTaskExecutor build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecTaskExecutor self = new CreateJobRequestTasksTaskSpecTaskExecutor();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecTaskExecutor setContainer(CreateJobRequestTasksTaskSpecTaskExecutorContainer container) {
            this.container = container;
            return this;
        }
        public CreateJobRequestTasksTaskSpecTaskExecutorContainer getContainer() {
            return this.container;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutor setVM(CreateJobRequestTasksTaskSpecTaskExecutorVM VM) {
            this.VM = VM;
            return this;
        }
        public CreateJobRequestTasksTaskSpecTaskExecutorVM getVM() {
            return this.VM;
        }

    }

    public static class CreateJobRequestTasksTaskSpecVolumeMount extends TeaModel {
        /**
         * <p>The list of volume mount parameters. Passed as key-value pairs in JSON format.</p>
         * <ul>
         * <li><p>Reference format for mounting NAS: {&quot;server&quot;:&quot;xxxxx-xxxxx.cn-heyuan.nas.aliyuncs.com&quot;,&quot;vers&quot;:&quot;3&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;options&quot;:&quot;nolock,tcp,noresvport&quot;}</p>
         * <blockquote>
         * <p>server specifies the mount target address of the NAS file system. path specifies a subdirectory under the NAS path, starting with /, and the directory must already exist. vers specifies the NFS protocol version for mounting NAS. Version 3 is recommended. options specifies custom parameters for mounting NAS, in the format &quot;xxx,xxx,xxx&quot;.</p>
         * </blockquote>
         * </li>
         * <li><p>Reference format for mounting OSS: {&quot;bucket&quot;:&quot;xxxxx&quot;, &quot;url&quot;:&quot;oss-cn-heyuan-internal.aliyuncs.com&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;akId&quot;:&quot;xxxxx&quot;,&quot;akSecret&quot;:&quot;xxxxx&quot;}</p>
         * <blockquote>
         * <p>bucket specifies the name of the OSS bucket. url specifies the endpoint of the OSS bucket. You can log on to the OSS console and obtain the endpoint on the overview page of the target bucket. path specifies the directory structure relative to the root of the bucket when mounting. The default value is /. The directory must already exist. akId specifies the AccessKey ID used for direct authorization with an AccessKey pair. akSecret specifies the AccessKey secret used for direct authorization with an AccessKey pair.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;server&quot;:&quot;xxxxx-xxxxx.cn-heyuan.nas.aliyuncs.com&quot;,&quot;vers&quot;:&quot;3&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;options&quot;:&quot;nolock,tcp,noresvport&quot;}</p>
         */
        @NameInMap("MountOptions")
        public String mountOptions;

        /**
         * <p>The directory where the data volume is mounted to the task.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>Specifies whether the data volume is read-only. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The supported data volume type. Valid values:</p>
         * <ul>
         * <li>alicloud/nas: mounts a NAS file system.</li>
         * <li>alicloud/oss: mounts an OSS bucket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alicloud/nas</p>
         */
        @NameInMap("VolumeDriver")
        public String volumeDriver;

        public static CreateJobRequestTasksTaskSpecVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecVolumeMount self = new CreateJobRequestTasksTaskSpecVolumeMount();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecVolumeMount setMountOptions(String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public String getMountOptions() {
            return this.mountOptions;
        }

        public CreateJobRequestTasksTaskSpecVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateJobRequestTasksTaskSpecVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateJobRequestTasksTaskSpecVolumeMount setVolumeDriver(String volumeDriver) {
            this.volumeDriver = volumeDriver;
            return this;
        }
        public String getVolumeDriver() {
            return this.volumeDriver;
        }

    }

    public static class CreateJobRequestTasksTaskSpec extends TeaModel {
        /**
         * <p>The resource information of the runtime environment.</p>
         */
        @NameInMap("Resource")
        public CreateJobRequestTasksTaskSpecResource resource;

        /**
         * <p>The task retry policy.</p>
         */
        @NameInMap("RetryPolicy")
        public CreateJobRequestTasksTaskSpecRetryPolicy retryPolicy;

        /**
         * <p>The task execution configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TaskExecutor")
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutor> taskExecutor;

        /**
         * <p>The list of data volumes mounted to the task. A maximum of 10 data volumes are supported.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<CreateJobRequestTasksTaskSpecVolumeMount> volumeMount;

        public static CreateJobRequestTasksTaskSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpec self = new CreateJobRequestTasksTaskSpec();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpec setResource(CreateJobRequestTasksTaskSpecResource resource) {
            this.resource = resource;
            return this;
        }
        public CreateJobRequestTasksTaskSpecResource getResource() {
            return this.resource;
        }

        public CreateJobRequestTasksTaskSpec setRetryPolicy(CreateJobRequestTasksTaskSpecRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public CreateJobRequestTasksTaskSpecRetryPolicy getRetryPolicy() {
            return this.retryPolicy;
        }

        public CreateJobRequestTasksTaskSpec setTaskExecutor(java.util.List<CreateJobRequestTasksTaskSpecTaskExecutor> taskExecutor) {
            this.taskExecutor = taskExecutor;
            return this;
        }
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

        public CreateJobRequestTasksTaskSpec setVolumeMount(java.util.List<CreateJobRequestTasksTaskSpecVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<CreateJobRequestTasksTaskSpecVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

    }

    public static class CreateJobRequestTasks extends TeaModel {
        /**
         * <p>The task execution policy.</p>
         */
        @NameInMap("ExecutorPolicy")
        public CreateJobRequestTasksExecutorPolicy executorPolicy;

        /**
         * <p>The task name. The name must be 2 to 32 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>task0</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The task specification details.</p>
         */
        @NameInMap("TaskSpec")
        public CreateJobRequestTasksTaskSpec taskSpec;

        /**
         * <p>Specifies whether the job is a long-running job. Valid values:</p>
         * <ul>
         * <li>true: background service job.</li>
         * <li>false: batch job.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TaskSustainable")
        public Boolean taskSustainable;

        public static CreateJobRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasks self = new CreateJobRequestTasks();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasks setExecutorPolicy(CreateJobRequestTasksExecutorPolicy executorPolicy) {
            this.executorPolicy = executorPolicy;
            return this;
        }
        public CreateJobRequestTasksExecutorPolicy getExecutorPolicy() {
            return this.executorPolicy;
        }

        public CreateJobRequestTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateJobRequestTasks setTaskSpec(CreateJobRequestTasksTaskSpec taskSpec) {
            this.taskSpec = taskSpec;
            return this;
        }
        public CreateJobRequestTasksTaskSpec getTaskSpec() {
            return this.taskSpec;
        }

        public CreateJobRequestTasks setTaskSustainable(Boolean taskSustainable) {
            this.taskSustainable = taskSustainable;
            return this;
        }
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

    }

}
