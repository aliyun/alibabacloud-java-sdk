// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdateJobTemplateRequest extends TeaModel {
    /**
     * <p>The template configuration.</p>
     */
    @NameInMap("JobTemplateConfig")
    public UpdateJobTemplateRequestJobTemplateConfig jobTemplateConfig;

    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("JobTemplateDescription")
    public String jobTemplateDescription;

    /**
     * <p>The job template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jt-xxxx</p>
     */
    @NameInMap("JobTemplateId")
    public String jobTemplateId;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("JobTemplateName")
    public String jobTemplateName;

    public static UpdateJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobTemplateRequest self = new UpdateJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobTemplateRequest setJobTemplateConfig(UpdateJobTemplateRequestJobTemplateConfig jobTemplateConfig) {
        this.jobTemplateConfig = jobTemplateConfig;
        return this;
    }
    public UpdateJobTemplateRequestJobTemplateConfig getJobTemplateConfig() {
        return this.jobTemplateConfig;
    }

    public UpdateJobTemplateRequest setJobTemplateDescription(String jobTemplateDescription) {
        this.jobTemplateDescription = jobTemplateDescription;
        return this;
    }
    public String getJobTemplateDescription() {
        return this.jobTemplateDescription;
    }

    public UpdateJobTemplateRequest setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public UpdateJobTemplateRequest setJobTemplateName(String jobTemplateName) {
        this.jobTemplateName = jobTemplateName;
        return this;
    }
    public String getJobTemplateName() {
        return this.jobTemplateName;
    }

    public static class UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork extends TeaModel {
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

        public static UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork self = new UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork setEnableExternalIpAddress(Boolean enableExternalIpAddress) {
            this.enableExternalIpAddress = enableExternalIpAddress;
            return this;
        }
        public Boolean getEnableExternalIpAddress() {
            return this.enableExternalIpAddress;
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork setVswitch(java.util.List<String> vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public java.util.List<String> getVswitch() {
            return this.vswitch;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags extends TeaModel {
        /**
         * <p>The job tag key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The job tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags self = new UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy extends TeaModel {
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
         * <li>Performance: performance-optimized.</li>
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
        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork network;

        /**
         * <p>The job resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pool</p>
         */
        @NameInMap("Pool")
        public String pool;

        /**
         * <p>The job priority. A larger value indicates a higher scheduling priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The job tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags> tags;

        public static UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy self = new UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy setAllocationSpec(String allocationSpec) {
            this.allocationSpec = allocationSpec;
            return this;
        }
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy setNetwork(UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork network) {
            this.network = network;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyNetwork getNetwork() {
            return this.network;
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy setPool(String pool) {
            this.pool = pool;
            return this;
        }
        public String getPool() {
            return this.pool;
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy setTags(java.util.List<UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicyTags> getTags() {
            return this.tags;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup extends TeaModel {
        /**
         * <p>The array of security group IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxx</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static UpdateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup self = new UpdateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigSecurityPolicy extends TeaModel {
        /**
         * <p>The security group.</p>
         */
        @NameInMap("SecurityGroup")
        public UpdateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup securityGroup;

        public static UpdateJobTemplateRequestJobTemplateConfigSecurityPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigSecurityPolicy self = new UpdateJobTemplateRequestJobTemplateConfigSecurityPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigSecurityPolicy setSecurityGroup(UpdateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigSecurityPolicySecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec extends TeaModel {
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

        public static UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec self = new UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec setIndexEnd(Integer indexEnd) {
            this.indexEnd = indexEnd;
            return this;
        }
        public Integer getIndexEnd() {
            return this.indexEnd;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec setIndexStart(Integer indexStart) {
            this.indexStart = indexStart;
            return this;
        }
        public Integer getIndexStart() {
            return this.indexStart;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec setIndexStep(Integer indexStep) {
            this.indexStep = indexStep;
            return this;
        }
        public Integer getIndexStep() {
            return this.indexStep;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy extends TeaModel {
        /**
         * <p>The details of the array job.</p>
         */
        @NameInMap("ArraySpec")
        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec arraySpec;

        /**
         * <p>The maximum number of nodes for running the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxCount")
        public Integer maxCount;

        public static UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy self = new UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy setArraySpec(UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec arraySpec) {
            this.arraySpec = arraySpec;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicyArraySpec getArraySpec() {
            return this.arraySpec;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks extends TeaModel {
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

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource extends TeaModel {
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
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks> disks;

        /**
         * <p>Specifies whether to enable hyper-threading in the runtime environment.</p>
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

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setDisks(java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResourceDisks> getDisks() {
            return this.disks;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setEnableHT(Boolean enableHT) {
            this.enableHT = enableHT;
            return this;
        }
        public Boolean getEnableHT() {
            return this.enableHT;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions extends TeaModel {
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

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy extends TeaModel {
        /**
         * <p>The retry rules.</p>
         */
        @NameInMap("ExitCodeActions")
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions;

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy setExitCodeActions(java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions) {
            this.exitCodeActions = exitCodeActions;
            return this;
        }
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> getExitCodeActions() {
            return this.exitCodeActions;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars extends TeaModel {
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

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer extends TeaModel {
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
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars;

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
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setEnvironmentVars(java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setImageRegistryOptions(String imageRegistryOptions) {
            this.imageRegistryOptions = imageRegistryOptions;
            return this;
        }
        public String getImageRegistryOptions() {
            return this.imageRegistryOptions;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM extends TeaModel {
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
         * <p>The prolog script. The value must be Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("PrologScript")
        public String prologScript;

        /**
         * <p>The job script to run. The value must be Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("Script")
        public String script;

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setPrologScript(String prologScript) {
            this.prologScript = prologScript;
            return this;
        }
        public String getPrologScript() {
            return this.prologScript;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor extends TeaModel {
        /**
         * <p>The container environment configuration.</p>
         */
        @NameInMap("Container")
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer container;

        /**
         * <p>The virtual machine environment configuration.</p>
         */
        @NameInMap("VM")
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM VM;

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor setContainer(UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer container) {
            this.container = container;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorContainer getContainer() {
            return this.container;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor setVM(UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM VM) {
            this.VM = VM;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutorVM getVM() {
            return this.VM;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount extends TeaModel {
        /**
         * <p>The list of data volume mount options. The value is in key-value format and passed as JSON.</p>
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

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount setMountOptions(String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public String getMountOptions() {
            return this.mountOptions;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount setVolumeDriver(String volumeDriver) {
            this.volumeDriver = volumeDriver;
            return this;
        }
        public String getVolumeDriver() {
            return this.volumeDriver;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec extends TeaModel {
        /**
         * <p>The runtime environment resource information.</p>
         */
        @NameInMap("Resource")
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource resource;

        /**
         * <p>The task retry policy.</p>
         */
        @NameInMap("RetryPolicy")
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy retryPolicy;

        /**
         * <p>The task execution configuration.</p>
         */
        @NameInMap("TaskExecutor")
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor> taskExecutor;

        /**
         * <p>The list of data volumes mounted to the task. A maximum of 10 data volumes are supported.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount> volumeMount;

        public static UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec self = new UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec setResource(UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource resource) {
            this.resource = resource;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecResource getResource() {
            return this.resource;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec setRetryPolicy(UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecRetryPolicy getRetryPolicy() {
            return this.retryPolicy;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec setTaskExecutor(java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor> taskExecutor) {
            this.taskExecutor = taskExecutor;
            return this;
        }
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecTaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec setVolumeMount(java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpecVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfigTasks extends TeaModel {
        /**
         * <p>The task execution policy.</p>
         */
        @NameInMap("ExecutorPolicy")
        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy executorPolicy;

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
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec taskSpec;

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

        public static UpdateJobTemplateRequestJobTemplateConfigTasks build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfigTasks self = new UpdateJobTemplateRequestJobTemplateConfigTasks();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasks setExecutorPolicy(UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy executorPolicy) {
            this.executorPolicy = executorPolicy;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigTasksExecutorPolicy getExecutorPolicy() {
            return this.executorPolicy;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasks setTaskSpec(UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec taskSpec) {
            this.taskSpec = taskSpec;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigTasksTaskSpec getTaskSpec() {
            return this.taskSpec;
        }

        public UpdateJobTemplateRequestJobTemplateConfigTasks setTaskSustainable(Boolean taskSustainable) {
            this.taskSustainable = taskSustainable;
            return this;
        }
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

    }

    public static class UpdateJobTemplateRequestJobTemplateConfig extends TeaModel {
        /**
         * <p>The resource deployment policy.</p>
         */
        @NameInMap("DeploymentPolicy")
        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy deploymentPolicy;

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>Demo</p>
         */
        @NameInMap("JobDescription")
        public String jobDescription;

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The job scheduler type.</p>
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
        public UpdateJobTemplateRequestJobTemplateConfigSecurityPolicy securityPolicy;

        /**
         * <p>The task list. A maximum of five tasks are supported.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasks> tasks;

        public static UpdateJobTemplateRequestJobTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobTemplateRequestJobTemplateConfig self = new UpdateJobTemplateRequestJobTemplateConfig();
            return TeaModel.build(map, self);
        }

        public UpdateJobTemplateRequestJobTemplateConfig setDeploymentPolicy(UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy deploymentPolicy) {
            this.deploymentPolicy = deploymentPolicy;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigDeploymentPolicy getDeploymentPolicy() {
            return this.deploymentPolicy;
        }

        public UpdateJobTemplateRequestJobTemplateConfig setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
        }

        public UpdateJobTemplateRequestJobTemplateConfig setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public UpdateJobTemplateRequestJobTemplateConfig setJobScheduler(String jobScheduler) {
            this.jobScheduler = jobScheduler;
            return this;
        }
        public String getJobScheduler() {
            return this.jobScheduler;
        }

        public UpdateJobTemplateRequestJobTemplateConfig setSecurityPolicy(UpdateJobTemplateRequestJobTemplateConfigSecurityPolicy securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }
        public UpdateJobTemplateRequestJobTemplateConfigSecurityPolicy getSecurityPolicy() {
            return this.securityPolicy;
        }

        public UpdateJobTemplateRequestJobTemplateConfig setTasks(java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<UpdateJobTemplateRequestJobTemplateConfigTasks> getTasks() {
            return this.tasks;
        }

    }

}
