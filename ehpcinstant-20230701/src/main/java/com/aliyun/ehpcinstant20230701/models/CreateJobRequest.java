// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>Dependency policy.</p>
     */
    @NameInMap("DependencyPolicy")
    public CreateJobRequestDependencyPolicy dependencyPolicy;

    /**
     * <p>The resource deployment policy.</p>
     */
    @NameInMap("DeploymentPolicy")
    public CreateJobRequestDeploymentPolicy deploymentPolicy;

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
    public CreateJobRequestSecurityPolicy securityPolicy;

    /**
     * <p>The list of tasks. Only one task is supported.</p>
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
         * <p>The ID of the job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-bjxxxxxxxxxxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The type of the dependency. Valid values:</p>
         * <ul>
         * <li>AfterSucceeded: <strong>All subtasks</strong> of the dependent job or array job succeed. The exit code is 0.</li>
         * <li>AfterFailed: <strong>All subtasks</strong> of the dependent job or array job fail. The exit code is not 0.</li>
         * <li>AfterAny: The dependent job completes (succeeds or fails).</li>
         * <li>AfterCorresponding: The subtask corresponding to the dependent array job succeeds. The exit code is 0.</li>
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
         * <p>The job dependency. A maximum of 10 groups.</p>
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
         * <p>Whether the job creates a public IP address.</p>
         * <ul>
         * <li>true: creates a public IP address.</li>
         * <li>false: does not create a public IP address.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableExternalIpAddress")
        public Boolean enableExternalIpAddress;

        /**
         * <p>The VSwitch array.</p>
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
         * <p>The key of the job tag. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the job tag. You can specify empty strings as tag values. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
         * <p>The resource type,</p>
         * <ul>
         * <li>Standard</li>
         * <li>Dedicated: You must enable a whitelist for use.</li>
         * <li>Economic: You must enable a whitelist for use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        /**
         * <p>The computing power level. This value is valid only when the resource type is Economic. The following disk categories are supported:</p>
         * <ul>
         * <li>General</li>
         * <li>Performance</li>
         * </ul>
         * <p>Default value: General.</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The network configuration information.</p>
         */
        @NameInMap("Network")
        public CreateJobRequestDeploymentPolicyNetwork network;

        /**
         * <p>The resource pool of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        @NameInMap("Pool")
        public String pool;

        /**
         * <p>The priorities of the jobs. A larger value indicates a higher job scheduling priority. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The tag information of the job. A maximum of 20 groups.</p>
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
         * <p>The security group ID.</p>
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
         * <p>The end value of the array job index. Valid values: 0 to 4999. The value must be greater than or equal to the value of IndexStart.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("IndexEnd")
        public Integer indexEnd;

        /**
         * <p>The starting value of the array job index. Valid values: 0 to 4999.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IndexStart")
        public Integer indexStart;

        /**
         * <p>The interval of the array job index.</p>
         * <blockquote>
         * <p>If the array job property is IndexStart=1,IndexEnd=5, and IndexStep=2, the array job contains three sub-jobs. The index values of the sub-jobs are 1,3, and 5. You can access the sub-jobs by using environment variables.</p>
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
         * <p>The details of the array job. The index value of the sub-job is passed to the running environment through environment variables to support user business program reference. Environment variables include:</p>
         * <ul>
         * <li>EHPC_JOB_NAME: the name of the job. This parameter corresponds to the JobName parameter.</li>
         * <li>EHPC_JOB_ID: The ID of the job.</li>
         * <li>EHPC_TASK_NAME: the name of the task. This parameter corresponds to the TaskName parameter.</li>
         * <li>EHPC_EXECUTOR_ID: The ID of the execution unit.</li>
         * <li>EHPC_ARRAY_TASK_ID: the sub-job index value.</li>
         * <li>EHPC_ARRAY_TASK_COUNT: the total number of sub-jobs.</li>
         * <li>EHPC_ARRAY_TASK_MAX: the maximum sub-job index, which corresponds to the IndexStart parameter.</li>
         * <li>EHPC_ARRAY_TASK_MIN: the minimum value of the sub-job index, which corresponds to the IndexEnd parameter.</li>
         * <li>EHPC_ARRAY_TASK_STEP: the index step size of the sub-job, which corresponds to the IndexStep parameter.</li>
         * </ul>
         */
        @NameInMap("ArraySpec")
        public CreateJobRequestTasksExecutorPolicyArraySpec arraySpec;

        /**
         * <p>The maximum number of nodes to run the job.</p>
         * <blockquote>
         * <p>Follow the calculation formula: <code>MaxCount = (IndexEnd - IndexStart) / IndexStep +1</code></p>
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
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The type of the disk. Currently, only System is supported, which indicates the system disk.</p>
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
         * <p>The number of CPUs in the running environment.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Float cores;

        /**
         * <p>The array of the disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<CreateJobRequestTasksTaskSpecResourceDisks> disks;

        @NameInMap("EnableHT")
        public Boolean enableHT;

        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>The instance type of the running environment. A maximum of 5 groups.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The memory size of the running environment. Unit: GiB.</p>
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
         * <p>The next step behavior of the task.</p>
         * <ul>
         * <li>Retry: The job starts a retry when a specific exit code is hit.</li>
         * <li>Exit: The job exits when a specific exit code is hit.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Retry</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The task exit code, which is used together with the action to form a job retry rule. Valid values: 0 to 255.</p>
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
         * <p>The retry rule. A maximum of 10 groups.</p>
         */
        @NameInMap("ExitCodeActions")
        public java.util.List<CreateJobRequestTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions;

        /**
         * <p>The maximum number of retries. Valid values: 1 to 10. Default value: 3.</p>
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
         * <p>The name of the environment variable for the container. It can be 1 to 128 characters in length. Format requirement: [0-9a-zA-Z], and underscores, cannot start with a number.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the environment variable for the container. The value must be 0 to 256 bits in length.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ci-vm-32k6LXAi3cOG</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The startup argument of the init container. A maximum of 10 groups.</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The container startup commands. You can specify up to 20 commands. Each command can be up to 256 characters in length.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the start command contains spaces (for example, <code>sleep 60s</code> ), the input JSON format parameter is <code>[&quot;sleep&quot;, &quot;60s&quot;]</code>.</p>
         * </li>
         * <li><p>If the startup command is complex, the parameter format may be a combination of <code>Command: [&quot;/bin/bash&quot;]</code> and <code>Arg:[&quot;-c&quot;, &quot;&lt;customized command&gt;&quot;]</code>. The <code>&lt;customized command&gt;</code> is a user-defined combination of commands and can contain characters such as spaces.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The environment variables of the container. A maximum of 20 groups.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars;

        /**
         * <p>The image of the container.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc/hpl:latest</p>
         */
        @NameInMap("Image")
        public String image;

        @NameInMap("ImageRegistryOptions")
        public String imageRegistryOptions;

        /**
         * <p>The working directory of the container.</p>
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

    public static class CreateJobRequestTasksTaskSpecTaskExecutorVM extends TeaModel {
        /**
         * <p>The ID of the virtual machine application.</p>
         * 
         * <strong>example:</strong>
         * <p>ci-vm-9jc58Pm5Leky</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-xxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The logon password of the virtual machine environment. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
         * <p>()\`~!@#$%^&amp;\*-_+=|{}[]:;\&quot;&lt;&gt;,.?/ In Windows, the password cannot contain a forward slash (/) as the first character.</p>
         * <blockquote>
         * <p>We recommend that you use HTTPS to send requests if you specify Password to avoid password leakage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EHPC@1234</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The pre-processing script. Base64 encoding is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("PrologScript")
        public String prologScript;

        /**
         * <p>The running-job script. Base64 encoding is required.</p>
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
         * <p>Use the container environment.</p>
         */
        @NameInMap("Container")
        public CreateJobRequestTasksTaskSpecTaskExecutorContainer container;

        /**
         * <p>Use a virtual machine environment.</p>
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
         * <p>The list of data volume mount parameters. Each option is a key-value pair in a JSON string.</p>
         * <ul>
         * <li>Format for mounting a NAS file system:{&quot;server&quot;:&quot;xxxxx-xxxxx.cn-heyuan.nas.aliyuncs.com&quot;,&quot;vers&quot;:&quot;3&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;options&quot;:&quot;nolock,tcp,noresvport&quot;}</li>
         * </ul>
         * <blockquote>
         * <p>server indicates the address of the mount point of the NAS file system. path indicates the subdirectory of the NAS file system. The subdirectory must start with a (/) and must already exist. vers indicates the version number of the NFS protocol used to mount the file system. We recommend that you use v3. options indicates the custom parameters in the format of &quot;xxx,xxx,xxx&quot;.</p>
         * </blockquote>
         * <ul>
         * <li>OSS mount format:{&quot;bucket&quot;:&quot;xxxxx&quot;, &quot;url&quot;:&quot;oss-cn-heyuan-internal.aliyuncs.com&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;akId&quot;:&quot;xxxxx&quot;,&quot;akSecret&quot;:&quot;xxxxx&quot;}</li>
         * </ul>
         * <blockquote>
         * <p>bucket indicates the name of the OSS bucket. url indicates the endpoint of the OSS bucket. You can log on to the OSS console and obtain the endpoint on the Overview page of the destination bucket. path indicates the directory structure of the root file of the bucket. The default value is /, which requires that the directory already exists. akId indicates the AccessKey ID. akSecret indicates the AccessKey secret.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;server&quot;:&quot;xxxxx-xxxxx.cn-heyuan.nas.aliyuncs.com&quot;,&quot;vers&quot;:&quot;3&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;options&quot;:&quot;nolock,tcp,noresvport&quot;}</p>
         */
        @NameInMap("MountOptions")
        public String mountOptions;

        /**
         * <p>The directory where the task mounts the data volume.</p>
         * <blockquote>
         * <p>The content of the mounted directory is overwritten by the content of the volume. Exercise caution when you use the directory.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/mnt</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>Specifies whether the volume is read-only. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>Currently supported data volume types.</p>
         * <ul>
         * <li>alicloud/nas: mounts NAS.</li>
         * <li>alicloud/oss: mounts OSS.</li>
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
         * <p>The resource information of the running environment.</p>
         */
        @NameInMap("Resource")
        public CreateJobRequestTasksTaskSpecResource resource;

        /**
         * <p>Task retry policy.</p>
         */
        @NameInMap("RetryPolicy")
        public CreateJobRequestTasksTaskSpecRetryPolicy retryPolicy;

        /**
         * <p>The task execution configurations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TaskExecutor")
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutor> taskExecutor;

        /**
         * <p>The list of data volumes mounted to the task. A maximum of 10 groups.</p>
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
         * <p>The job name. It must be 2 to 32 characters in length and can contain letters, digits, and Chinese characters. It can contain hyphens (-) and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>task0</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The details of the task specification.</p>
         */
        @NameInMap("TaskSpec")
        public CreateJobRequestTasksTaskSpec taskSpec;

        /**
         * <p>Indicate whether the job is a long-running job.</p>
         * <ul>
         * <li>true: background service the job.</li>
         * <li>false: batch jobs.</li>
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
