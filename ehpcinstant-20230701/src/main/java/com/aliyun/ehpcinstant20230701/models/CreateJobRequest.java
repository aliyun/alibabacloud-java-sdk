// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    @NameInMap("DeploymentPolicy")
    public CreateJobRequestDeploymentPolicy deploymentPolicy;

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
    public CreateJobRequestSecurityPolicy securityPolicy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<CreateJobRequestTasks> tasks;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
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

    public static class CreateJobRequestDeploymentPolicyNetwork extends TeaModel {
        @NameInMap("EnableExternalIpAddress")
        public Boolean enableExternalIpAddress;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

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
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        @NameInMap("Network")
        public CreateJobRequestDeploymentPolicyNetwork network;

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

        public CreateJobRequestDeploymentPolicy setNetwork(CreateJobRequestDeploymentPolicyNetwork network) {
            this.network = network;
            return this;
        }
        public CreateJobRequestDeploymentPolicyNetwork getNetwork() {
            return this.network;
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
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("IndexEnd")
        public Integer indexEnd;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IndexStart")
        public Integer indexStart;

        /**
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
        @NameInMap("ArraySpec")
        public CreateJobRequestTasksExecutorPolicyArraySpec arraySpec;

        /**
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
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Float cores;

        @NameInMap("Disks")
        public java.util.List<CreateJobRequestTasksTaskSpecResourceDisks> disks;

        /**
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

        public CreateJobRequestTasksTaskSpecResource setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Command")
        public java.util.List<String> command;

        @NameInMap("EnvironmentVars")
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutorContainerEnvironmentVars> environmentVars;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc/hpl:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
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

        public CreateJobRequestTasksTaskSpecTaskExecutorContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutorVM extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-xxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("PrologScript")
        public String prologScript;

        /**
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
        @NameInMap("Container")
        public CreateJobRequestTasksTaskSpecTaskExecutorContainer container;

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
         * <strong>example:</strong>
         * <p>{&quot;server&quot;:&quot;xxxxx-xxxxx.cn-heyuan.nas.aliyuncs.com&quot;,&quot;vers&quot;:&quot;3&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;options&quot;:&quot;nolock,tcp,noresvport&quot;}</p>
         */
        @NameInMap("MountOptions")
        public String mountOptions;

        /**
         * <strong>example:</strong>
         * <p>/mnt</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
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

        public CreateJobRequestTasksTaskSpecVolumeMount setVolumeDriver(String volumeDriver) {
            this.volumeDriver = volumeDriver;
            return this;
        }
        public String getVolumeDriver() {
            return this.volumeDriver;
        }

    }

    public static class CreateJobRequestTasksTaskSpec extends TeaModel {
        @NameInMap("Resource")
        public CreateJobRequestTasksTaskSpecResource resource;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("TaskExecutor")
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutor> taskExecutor;

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
        @NameInMap("ExecutorPolicy")
        public CreateJobRequestTasksExecutorPolicy executorPolicy;

        /**
         * <strong>example:</strong>
         * <p>task0</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskSpec")
        public CreateJobRequestTasksTaskSpec taskSpec;

        /**
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
