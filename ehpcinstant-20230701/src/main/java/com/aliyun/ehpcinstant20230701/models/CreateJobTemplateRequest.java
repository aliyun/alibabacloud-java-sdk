// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobTemplateRequest extends TeaModel {
    /**
     * <p>The configuration of the template.</p>
     */
    @NameInMap("JobTemplateConfig")
    public CreateJobTemplateRequestJobTemplateConfig jobTemplateConfig;

    /**
     * <p>The description of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("JobTemplateDescription")
    public String jobTemplateDescription;

    /**
     * <p>The name of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("JobTemplateName")
    public String jobTemplateName;

    public static CreateJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateRequest self = new CreateJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateRequest setJobTemplateConfig(CreateJobTemplateRequestJobTemplateConfig jobTemplateConfig) {
        this.jobTemplateConfig = jobTemplateConfig;
        return this;
    }
    public CreateJobTemplateRequestJobTemplateConfig getJobTemplateConfig() {
        return this.jobTemplateConfig;
    }

    public CreateJobTemplateRequest setJobTemplateDescription(String jobTemplateDescription) {
        this.jobTemplateDescription = jobTemplateDescription;
        return this;
    }
    public String getJobTemplateDescription() {
        return this.jobTemplateDescription;
    }

    public CreateJobTemplateRequest setJobTemplateName(String jobTemplateName) {
        this.jobTemplateName = jobTemplateName;
        return this;
    }
    public String getJobTemplateName() {
        return this.jobTemplateName;
    }

    public static class CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork extends TeaModel {
        /**
         * <p>Specifies whether to create a public IP address for the job. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableExternalIpAddress")
        public Boolean enableExternalIpAddress;

        /**
         * <p>The array of vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxx</p>
         */
        @NameInMap("Vswitch")
        public java.util.List<String> vswitch;

        public static CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork self = new CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork setEnableExternalIpAddress(Boolean enableExternalIpAddress) {
            this.enableExternalIpAddress = enableExternalIpAddress;
            return this;
        }
        public Boolean getEnableExternalIpAddress() {
            return this.enableExternalIpAddress;
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork setVswitch(java.util.List<String> vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public java.util.List<String> getVswitch() {
            return this.vswitch;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags extends TeaModel {
        /**
         * <p>The key of the job tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the job tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags self = new CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy extends TeaModel {
        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        /**
         * <p>The computing power level. This parameter takes effect only when the resource type is economy. Valid values:</p>
         * <ul>
         * <li>General: general-purpose.</li>
         * <li>Performance: compute-optimized instance.</li>
         * </ul>
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
        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork network;

        /**
         * <p>The resource pool for the job.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pool</p>
         */
        @NameInMap("Pool")
        public String pool;

        /**
         * <p>The priority of the job. A larger value indicates a higher scheduling priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The tag information of the job.</p>
         */
        @NameInMap("Tags")
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags> tags;

        public static CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy self = new CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy setAllocationSpec(String allocationSpec) {
            this.allocationSpec = allocationSpec;
            return this;
        }
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy setNetwork(CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork network) {
            this.network = network;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork getNetwork() {
            return this.network;
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy setPool(String pool) {
            this.pool = pool;
            return this;
        }
        public String getPool() {
            return this.pool;
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy setTags(java.util.List<CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags> getTags() {
            return this.tags;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup extends TeaModel {
        /**
         * <p>The array of security group IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxx</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static CreateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup self = new CreateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigSecurityPolicy extends TeaModel {
        /**
         * <p>The security group.</p>
         */
        @NameInMap("SecurityGroup")
        public CreateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup securityGroup;

        public static CreateJobTemplateRequestJobTemplateConfigSecurityPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigSecurityPolicy self = new CreateJobTemplateRequestJobTemplateConfigSecurityPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigSecurityPolicy setSecurityGroup(CreateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec extends TeaModel {
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
         * <p>The step size of the array job index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndexStep")
        public Integer indexStep;

        public static CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec self = new CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec setIndexEnd(Integer indexEnd) {
            this.indexEnd = indexEnd;
            return this;
        }
        public Integer getIndexEnd() {
            return this.indexEnd;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec setIndexStart(Integer indexStart) {
            this.indexStart = indexStart;
            return this;
        }
        public Integer getIndexStart() {
            return this.indexStart;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec setIndexStep(Integer indexStep) {
            this.indexStep = indexStep;
            return this;
        }
        public Integer getIndexStep() {
            return this.indexStep;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy extends TeaModel {
        /**
         * <p>The array job details.</p>
         */
        @NameInMap("ArraySpec")
        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec arraySpec;

        /**
         * <p>The maximum number of nodes for running the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxCount")
        public Integer maxCount;

        public static CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy self = new CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy setArraySpec(CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec arraySpec) {
            this.arraySpec = arraySpec;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec getArraySpec() {
            return this.arraySpec;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks extends TeaModel {
        /**
         * <p>The cloud disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The cloud disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource extends TeaModel {
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
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks> disks;

        /**
         * <p>Specifies whether hyper-threading is enabled in the runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableHT")
        public Boolean enableHT;

        /**
         * <p>The hostname prefix of the runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>The instance types of the runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c7a.8xlarge</p>
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

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setDisks(java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks> getDisks() {
            return this.disks;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setEnableHT(Boolean enableHT) {
            this.enableHT = enableHT;
            return this;
        }
        public Boolean getEnableHT() {
            return this.enableHT;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions extends TeaModel {
        /**
         * <p>The next action for the task. Valid values:</p>
         * <ul>
         * <li>Retry: Retry the task.</li>
         * <li>Exit: Exit the task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Retry</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The task exit code, which is used together with Action to form a job retry rule. Valid values: 0 to 255.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy extends TeaModel {
        /**
         * <p>The retry rules.</p>
         */
        @NameInMap("ExitCodeActions")
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions;

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy setExitCodeActions(java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions) {
            this.exitCodeActions = exitCodeActions;
            return this;
        }
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> getExitCodeActions() {
            return this.exitCodeActions;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars extends TeaModel {
        /**
         * <p>The environment variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The environment variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer extends TeaModel {
        /**
         * <p>The container application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ci-vm-32k6LXAi3cOG</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The arguments for the container startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The list of container startup commands.</p>
         * 
         * <strong>example:</strong>
         * <p>sleep</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The environment variables of the container.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars;

        /**
         * <p>The container image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc/hpl:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The mount parameter list for the self-managed image repository. The parameters are in key-value format and passed as JSON.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setEnvironmentVars(java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setImageRegistryOptions(String imageRegistryOptions) {
            this.imageRegistryOptions = imageRegistryOptions;
            return this;
        }
        public String getImageRegistryOptions() {
            return this.imageRegistryOptions;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM extends TeaModel {
        /**
         * <p>The virtual machine application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ci-vm-9jc58Pm5Leky</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-xxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The logon password for the virtual machine environment.</p>
         * 
         * <strong>example:</strong>
         * <p>EHPC@1234</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The prolog script. The script must be Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("PrologScript")
        public String prologScript;

        /**
         * <p>The job script. The script must be Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("Script")
        public String script;

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setPrologScript(String prologScript) {
            this.prologScript = prologScript;
            return this;
        }
        public String getPrologScript() {
            return this.prologScript;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor extends TeaModel {
        /**
         * <p>The container environment configuration.</p>
         */
        @NameInMap("Container")
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer container;

        /**
         * <p>The virtual machine environment configuration.</p>
         */
        @NameInMap("VM")
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM VM;

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor setContainer(CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer container) {
            this.container = container;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer getContainer() {
            return this.container;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor setVM(CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM VM) {
            this.VM = VM;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM getVM() {
            return this.VM;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount extends TeaModel {
        /**
         * <p>The list of data volume mount options. The options are in key-value format and passed as JSON.</p>
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
         * <p>Specifies whether the data volume is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The currently supported data volume type.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud/nas</p>
         */
        @NameInMap("VolumeDriver")
        public String volumeDriver;

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount setMountOptions(String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public String getMountOptions() {
            return this.mountOptions;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount setVolumeDriver(String volumeDriver) {
            this.volumeDriver = volumeDriver;
            return this;
        }
        public String getVolumeDriver() {
            return this.volumeDriver;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec extends TeaModel {
        /**
         * <p>The runtime environment resource information.</p>
         */
        @NameInMap("Resource")
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource resource;

        /**
         * <p>The task retry policy.</p>
         */
        @NameInMap("RetryPolicy")
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy retryPolicy;

        /**
         * <p>The task execution configuration.</p>
         */
        @NameInMap("TaskExecutor")
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor> taskExecutor;

        /**
         * <p>The list of data volumes mounted to the task. A maximum of 10 data volumes are supported.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount> volumeMount;

        public static CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec self = new CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec setResource(CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource resource) {
            this.resource = resource;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource getResource() {
            return this.resource;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec setRetryPolicy(CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy getRetryPolicy() {
            return this.retryPolicy;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec setTaskExecutor(java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor> taskExecutor) {
            this.taskExecutor = taskExecutor;
            return this;
        }
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec setVolumeMount(java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfigTasks extends TeaModel {
        /**
         * <p>The task execution policy.</p>
         */
        @NameInMap("ExecutorPolicy")
        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy executorPolicy;

        /**
         * <p>The task name.</p>
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
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec taskSpec;

        /**
         * <p>Specifies whether the job is long-running. Valid values:</p>
         * <ul>
         * <li>true: The job is a background service job.</li>
         * <li>false: The job is a batch job.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TaskSustainable")
        public Boolean taskSustainable;

        public static CreateJobTemplateRequestJobTemplateConfigTasks build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfigTasks self = new CreateJobTemplateRequestJobTemplateConfigTasks();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfigTasks setExecutorPolicy(CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy executorPolicy) {
            this.executorPolicy = executorPolicy;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy getExecutorPolicy() {
            return this.executorPolicy;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasks setTaskSpec(CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec taskSpec) {
            this.taskSpec = taskSpec;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigTasksTaskSpec getTaskSpec() {
            return this.taskSpec;
        }

        public CreateJobTemplateRequestJobTemplateConfigTasks setTaskSustainable(Boolean taskSustainable) {
            this.taskSustainable = taskSustainable;
            return this;
        }
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

    }

    public static class CreateJobTemplateRequestJobTemplateConfig extends TeaModel {
        /**
         * <p>The resource deployment policy.</p>
         */
        @NameInMap("DeploymentPolicy")
        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy deploymentPolicy;

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Demo</p>
         */
        @NameInMap("JobDescription")
        public String jobDescription;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>HPC</p>
         */
        @NameInMap("JobScheduler")
        public String jobScheduler;

        /**
         * <p>The security policy.</p>
         */
        @NameInMap("SecurityPolicy")
        public CreateJobTemplateRequestJobTemplateConfigSecurityPolicy securityPolicy;

        /**
         * <p>The task list. A maximum of 5 tasks are supported.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasks> tasks;

        public static CreateJobTemplateRequestJobTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateJobTemplateRequestJobTemplateConfig self = new CreateJobTemplateRequestJobTemplateConfig();
            return TeaModel.build(map, self);
        }

        public CreateJobTemplateRequestJobTemplateConfig setDeploymentPolicy(CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy deploymentPolicy) {
            this.deploymentPolicy = deploymentPolicy;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigDeploymentPolicy getDeploymentPolicy() {
            return this.deploymentPolicy;
        }

        public CreateJobTemplateRequestJobTemplateConfig setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
        }

        public CreateJobTemplateRequestJobTemplateConfig setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public CreateJobTemplateRequestJobTemplateConfig setJobScheduler(String jobScheduler) {
            this.jobScheduler = jobScheduler;
            return this;
        }
        public String getJobScheduler() {
            return this.jobScheduler;
        }

        public CreateJobTemplateRequestJobTemplateConfig setSecurityPolicy(CreateJobTemplateRequestJobTemplateConfigSecurityPolicy securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }
        public CreateJobTemplateRequestJobTemplateConfigSecurityPolicy getSecurityPolicy() {
            return this.securityPolicy;
        }

        public CreateJobTemplateRequestJobTemplateConfig setTasks(java.util.List<CreateJobTemplateRequestJobTemplateConfigTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<CreateJobTemplateRequestJobTemplateConfigTasks> getTasks() {
            return this.tasks;
        }

    }

}
