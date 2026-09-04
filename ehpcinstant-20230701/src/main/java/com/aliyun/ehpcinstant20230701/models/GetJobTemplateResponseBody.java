// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetJobTemplateResponseBody extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 11:09:59</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The template configuration.</p>
     */
    @NameInMap("JobTemplateConfig")
    public GetJobTemplateResponseBodyJobTemplateConfig jobTemplateConfig;

    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("JobTemplateDescription")
    public String jobTemplateDescription;

    /**
     * <p>The ID of the job template.</p>
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

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The job template status.</p>
     * 
     * <strong>example:</strong>
     * <p>Working</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 11:09:59</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobTemplateResponseBody self = new GetJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetJobTemplateResponseBody setJobTemplateConfig(GetJobTemplateResponseBodyJobTemplateConfig jobTemplateConfig) {
        this.jobTemplateConfig = jobTemplateConfig;
        return this;
    }
    public GetJobTemplateResponseBodyJobTemplateConfig getJobTemplateConfig() {
        return this.jobTemplateConfig;
    }

    public GetJobTemplateResponseBody setJobTemplateDescription(String jobTemplateDescription) {
        this.jobTemplateDescription = jobTemplateDescription;
        return this;
    }
    public String getJobTemplateDescription() {
        return this.jobTemplateDescription;
    }

    public GetJobTemplateResponseBody setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public GetJobTemplateResponseBody setJobTemplateName(String jobTemplateName) {
        this.jobTemplateName = jobTemplateName;
        return this;
    }
    public String getJobTemplateName() {
        return this.jobTemplateName;
    }

    public GetJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobTemplateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetJobTemplateResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork extends TeaModel {
        /**
         * <p>Indicates whether a public IP address is created for the job. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableExternalIpAddress")
        public Boolean enableExternalIpAddress;

        /**
         * <p>The vSwitch array.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxx</p>
         */
        @NameInMap("Vswitch")
        public java.util.List<String> vswitch;

        public static GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork self = new GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork setEnableExternalIpAddress(Boolean enableExternalIpAddress) {
            this.enableExternalIpAddress = enableExternalIpAddress;
            return this;
        }
        public Boolean getEnableExternalIpAddress() {
            return this.enableExternalIpAddress;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork setVswitch(java.util.List<String> vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public java.util.List<String> getVswitch() {
            return this.vswitch;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags extends TeaModel {
        /**
         * <p>The job tag key.</p>
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

        public static GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags self = new GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy extends TeaModel {
        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        /**
         * <p>The computing power level. This parameter is valid only when the resource type is Economy. Valid values:</p>
         * <ul>
         * <li>General: General-purpose.</li>
         * <li>Performance: Performance.</li>
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
        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork network;

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
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags> tags;

        public static GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy self = new GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy setAllocationSpec(String allocationSpec) {
            this.allocationSpec = allocationSpec;
            return this;
        }
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy setNetwork(GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork network) {
            this.network = network;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyNetwork getNetwork() {
            return this.network;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy setPool(String pool) {
            this.pool = pool;
            return this;
        }
        public String getPool() {
            return this.pool;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy setTags(java.util.List<GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicyTags> getTags() {
            return this.tags;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicySecurityGroup extends TeaModel {
        /**
         * <p>The array of security group IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxx</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicySecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicySecurityGroup self = new GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicySecurityGroup();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicySecurityGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicy extends TeaModel {
        /**
         * <p>The security group.</p>
         */
        @NameInMap("SecurityGroup")
        public GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicySecurityGroup securityGroup;

        public static GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicy self = new GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicy setSecurityGroup(GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicySecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicySecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec extends TeaModel {
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
         * <p>The step of the array job index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndexStep")
        public Integer indexStep;

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec self = new GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec setIndexEnd(Integer indexEnd) {
            this.indexEnd = indexEnd;
            return this;
        }
        public Integer getIndexEnd() {
            return this.indexEnd;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec setIndexStart(Integer indexStart) {
            this.indexStart = indexStart;
            return this;
        }
        public Integer getIndexStart() {
            return this.indexStart;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec setIndexStep(Integer indexStep) {
            this.indexStep = indexStep;
            return this;
        }
        public Integer getIndexStep() {
            return this.indexStep;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy extends TeaModel {
        /**
         * <p>The array job details.</p>
         */
        @NameInMap("ArraySpec")
        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec arraySpec;

        /**
         * <p>The maximum number of nodes for running the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxCount")
        public Integer maxCount;

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy self = new GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy setArraySpec(GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec arraySpec) {
            this.arraySpec = arraySpec;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicyArraySpec getArraySpec() {
            return this.arraySpec;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks extends TeaModel {
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

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource extends TeaModel {
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
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks> disks;

        /**
         * <p>Indicates whether hyper-threading is enabled in the runtime environment.</p>
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

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource setDisks(java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResourceDisks> getDisks() {
            return this.disks;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource setEnableHT(Boolean enableHT) {
            this.enableHT = enableHT;
            return this;
        }
        public Boolean getEnableHT() {
            return this.enableHT;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions extends TeaModel {
        /**
         * <p>The next action for the task. Valid values:</p>
         * <ul>
         * <li>Retry: retries the task.</li>
         * <li>Exit: exits the task.</li>
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

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy extends TeaModel {
        /**
         * <p>The retry rules.</p>
         */
        @NameInMap("ExitCodeActions")
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions;

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy setExitCodeActions(java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions) {
            this.exitCodeActions = exitCodeActions;
            return this;
        }
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicyExitCodeActions> getExitCodeActions() {
            return this.exitCodeActions;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars extends TeaModel {
        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer extends TeaModel {
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
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars;

        /**
         * <p>The container image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc/hpl:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The list of self-managed image registry mount parameters. The parameters are in key-value format and passed as JSON.</p>
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

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer setEnvironmentVars(java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainerEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer setImageRegistryOptions(String imageRegistryOptions) {
            this.imageRegistryOptions = imageRegistryOptions;
            return this;
        }
        public String getImageRegistryOptions() {
            return this.imageRegistryOptions;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM extends TeaModel {
        /**
         * <p>The VM application ID.</p>
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
         * <p>The login password for the VM environment.</p>
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

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM setPrologScript(String prologScript) {
            this.prologScript = prologScript;
            return this;
        }
        public String getPrologScript() {
            return this.prologScript;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor extends TeaModel {
        /**
         * <p>The container environment configuration.</p>
         */
        @NameInMap("Container")
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer container;

        /**
         * <p>The virtual machine (VM) environment configuration.</p>
         */
        @NameInMap("VM")
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM VM;

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor setContainer(GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer container) {
            this.container = container;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorContainer getContainer() {
            return this.container;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor setVM(GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM VM) {
            this.VM = VM;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutorVM getVM() {
            return this.VM;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount extends TeaModel {
        /**
         * <p>The list of data volume mount parameters. The parameters are in key-value format and passed as JSON.</p>
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
         * <p>Indicates whether the data volume is read-only.</p>
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

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount setMountOptions(String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public String getMountOptions() {
            return this.mountOptions;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount setVolumeDriver(String volumeDriver) {
            this.volumeDriver = volumeDriver;
            return this;
        }
        public String getVolumeDriver() {
            return this.volumeDriver;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec extends TeaModel {
        /**
         * <p>The runtime environment resource information.</p>
         */
        @NameInMap("Resource")
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource resource;

        /**
         * <p>The task retry policy.</p>
         */
        @NameInMap("RetryPolicy")
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy retryPolicy;

        /**
         * <p>The task execution configuration.</p>
         */
        @NameInMap("TaskExecutor")
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor> taskExecutor;

        /**
         * <p>The list of data volumes mounted to the task. A maximum of 10 volumes are supported.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount> volumeMount;

        public static GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec self = new GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec setResource(GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource resource) {
            this.resource = resource;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecResource getResource() {
            return this.resource;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec setRetryPolicy(GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecRetryPolicy getRetryPolicy() {
            return this.retryPolicy;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec setTaskExecutor(java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor> taskExecutor) {
            this.taskExecutor = taskExecutor;
            return this;
        }
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecTaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec setVolumeMount(java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpecVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfigTasks extends TeaModel {
        /**
         * <p>The task execution policy.</p>
         */
        @NameInMap("ExecutorPolicy")
        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy executorPolicy;

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
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec taskSpec;

        /**
         * <p>Specifies whether the job is long-running. Valid values:</p>
         * <ul>
         * <li>true: The job is a background service job.</li>
         * <li>false: The job is a batch processing job.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TaskSustainable")
        public Boolean taskSustainable;

        public static GetJobTemplateResponseBodyJobTemplateConfigTasks build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfigTasks self = new GetJobTemplateResponseBodyJobTemplateConfigTasks();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasks setExecutorPolicy(GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy executorPolicy) {
            this.executorPolicy = executorPolicy;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigTasksExecutorPolicy getExecutorPolicy() {
            return this.executorPolicy;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasks setTaskSpec(GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec taskSpec) {
            this.taskSpec = taskSpec;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigTasksTaskSpec getTaskSpec() {
            return this.taskSpec;
        }

        public GetJobTemplateResponseBodyJobTemplateConfigTasks setTaskSustainable(Boolean taskSustainable) {
            this.taskSustainable = taskSustainable;
            return this;
        }
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

    }

    public static class GetJobTemplateResponseBodyJobTemplateConfig extends TeaModel {
        /**
         * <p>The resource deployment policy.</p>
         */
        @NameInMap("DeploymentPolicy")
        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy deploymentPolicy;

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
        public GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicy securityPolicy;

        /**
         * <p>The task list.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasks> tasks;

        public static GetJobTemplateResponseBodyJobTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyJobTemplateConfig self = new GetJobTemplateResponseBodyJobTemplateConfig();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyJobTemplateConfig setDeploymentPolicy(GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy deploymentPolicy) {
            this.deploymentPolicy = deploymentPolicy;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigDeploymentPolicy getDeploymentPolicy() {
            return this.deploymentPolicy;
        }

        public GetJobTemplateResponseBodyJobTemplateConfig setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
        }

        public GetJobTemplateResponseBodyJobTemplateConfig setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobTemplateResponseBodyJobTemplateConfig setJobScheduler(String jobScheduler) {
            this.jobScheduler = jobScheduler;
            return this;
        }
        public String getJobScheduler() {
            return this.jobScheduler;
        }

        public GetJobTemplateResponseBodyJobTemplateConfig setSecurityPolicy(GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicy securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }
        public GetJobTemplateResponseBodyJobTemplateConfigSecurityPolicy getSecurityPolicy() {
            return this.securityPolicy;
        }

        public GetJobTemplateResponseBodyJobTemplateConfig setTasks(java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetJobTemplateResponseBodyJobTemplateConfigTasks> getTasks() {
            return this.tasks;
        }

    }

}
