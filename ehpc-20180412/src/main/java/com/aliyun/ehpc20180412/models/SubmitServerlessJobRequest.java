// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitServerlessJobRequest extends TeaModel {
    /**
     * <p>The configuration of the array job.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The index value of an array job is passed to the serverless job container by using the environment variable **EHPC_JOB_ARRAY_INDEX** to allow access to the array job from business programs.</p>
     */
    @NameInMap("ArrayProperties")
    public SubmitServerlessJobRequestArrayProperties arrayProperties;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The properties of the serverless job container.</p>
     */
    @NameInMap("Container")
    public SubmitServerlessJobRequestContainer container;

    /**
     * <p>The vCPU size of the serverless job container. Unit: cores.</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The serverless job dependencies.</p>
     */
    @NameInMap("DependsOn")
    public java.util.List<SubmitServerlessJobRequestDependsOn> dependsOn;

    /**
     * <p>The size of the temporary storage that is added to the serverless job container. Unit: GiB.</p>
     * <br>
     * <p>>  By default, the serverless job container provides 30 GiB of free storage quota. If you require storage of more than 30 GiB, you can use this parameter to specify the temporary storage to add to the job container.</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>The ECS instance types used by the serverless job container.</p>
     */
    @NameInMap("InstanceType")
    public java.util.List<String> instanceType;

    /**
     * <p>The name of the serverless job.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The scheduling priority of the serverless job. Valid values: 0 to 999. A greater value indicates a higher priority.</p>
     */
    @NameInMap("JobPriority")
    public Long jobPriority;

    /**
     * <p>The memory size of the serverless job container. Unit: GiB.</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The name of the RAM role that is associated with the serverless job container.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RetryStrategy")
    public SubmitServerlessJobRequestRetryStrategy retryStrategy;

    /**
     * <p>The maximum hourly price of the preemptible instance. The value can contain up to three decimal places.</p>
     * <br>
     * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the instance. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is created as a pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is used as the bid price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The validity period of the serverless job. After the validity period expires, the job is forcibly terminated. Unit: seconds.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The IDs of the vSwitches to which the serverless job container belongs.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    public static SubmitServerlessJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitServerlessJobRequest self = new SubmitServerlessJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitServerlessJobRequest setArrayProperties(SubmitServerlessJobRequestArrayProperties arrayProperties) {
        this.arrayProperties = arrayProperties;
        return this;
    }
    public SubmitServerlessJobRequestArrayProperties getArrayProperties() {
        return this.arrayProperties;
    }

    public SubmitServerlessJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SubmitServerlessJobRequest setContainer(SubmitServerlessJobRequestContainer container) {
        this.container = container;
        return this;
    }
    public SubmitServerlessJobRequestContainer getContainer() {
        return this.container;
    }

    public SubmitServerlessJobRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public SubmitServerlessJobRequest setDependsOn(java.util.List<SubmitServerlessJobRequestDependsOn> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }
    public java.util.List<SubmitServerlessJobRequestDependsOn> getDependsOn() {
        return this.dependsOn;
    }

    public SubmitServerlessJobRequest setEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    public SubmitServerlessJobRequest setInstanceType(java.util.List<String> instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public java.util.List<String> getInstanceType() {
        return this.instanceType;
    }

    public SubmitServerlessJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SubmitServerlessJobRequest setJobPriority(Long jobPriority) {
        this.jobPriority = jobPriority;
        return this;
    }
    public Long getJobPriority() {
        return this.jobPriority;
    }

    public SubmitServerlessJobRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public SubmitServerlessJobRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public SubmitServerlessJobRequest setRetryStrategy(SubmitServerlessJobRequestRetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }
    public SubmitServerlessJobRequestRetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    public SubmitServerlessJobRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public SubmitServerlessJobRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public SubmitServerlessJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public SubmitServerlessJobRequest setVSwitchId(java.util.List<String> vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

    public static class SubmitServerlessJobRequestArrayProperties extends TeaModel {
        /**
         * <p>The end value of the array job index. Valid values: 0 to 4999. The value must be greater than or equal to the value of IndexStart.</p>
         */
        @NameInMap("IndexEnd")
        public Long indexEnd;

        /**
         * <p>The starting value of the array job index. Valid values: 0 to 4999.</p>
         */
        @NameInMap("IndexStart")
        public Long indexStart;

        /**
         * <p>The interval of the array job index.</p>
         * <br>
         * <p>>  If the IndexStart of the array job is set to 1, IndexEnd is set to 5, and IndexStep is set to 2, the array job contains three subtasks. The subtask indexes are 1, 3, and 5.</p>
         */
        @NameInMap("IndexStep")
        public Long indexStep;

        public static SubmitServerlessJobRequestArrayProperties build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestArrayProperties self = new SubmitServerlessJobRequestArrayProperties();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestArrayProperties setIndexEnd(Long indexEnd) {
            this.indexEnd = indexEnd;
            return this;
        }
        public Long getIndexEnd() {
            return this.indexEnd;
        }

        public SubmitServerlessJobRequestArrayProperties setIndexStart(Long indexStart) {
            this.indexStart = indexStart;
            return this;
        }
        public Long getIndexStart() {
            return this.indexStart;
        }

        public SubmitServerlessJobRequestArrayProperties setIndexStep(Long indexStep) {
            this.indexStep = indexStep;
            return this;
        }
        public Long getIndexStep() {
            return this.indexStep;
        }

    }

    public static class SubmitServerlessJobRequestContainerEnvironmentVar extends TeaModel {
        /**
         * <p>环境变量名。长度为1~128位。格式要求：[0-9a-zA-Z]，以及下划线，不能以数字开头。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable for the container. The value must be 0 to 256 characters in length.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SubmitServerlessJobRequestContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestContainerEnvironmentVar self = new SubmitServerlessJobRequestContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestContainerEnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitServerlessJobRequestContainerEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SubmitServerlessJobRequestContainerVolumeMount extends TeaModel {
        /**
         * <p>使用FlexVolume插件挂载数据卷时的驱动类型。取值范围如下：</p>
         * <br>
         * <p>alicloud/nas：挂载NAS。</p>
         * <br>
         * <p>alicloud/oss：挂载OSS。</p>
         */
        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        /**
         * <p>FlexVolume对象选项列表。为KV形式，采用JSON传递。</p>
         */
        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        /**
         * <p>The directory to which the volume is mounted.</p>
         * <br>
         * <p>> The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        public static SubmitServerlessJobRequestContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestContainerVolumeMount self = new SubmitServerlessJobRequestContainerVolumeMount();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestContainerVolumeMount setFlexVolumeDriver(String flexVolumeDriver) {
            this.flexVolumeDriver = flexVolumeDriver;
            return this;
        }
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        public SubmitServerlessJobRequestContainerVolumeMount setFlexVolumeOptions(String flexVolumeOptions) {
            this.flexVolumeOptions = flexVolumeOptions;
            return this;
        }
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        public SubmitServerlessJobRequestContainerVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class SubmitServerlessJobRequestContainer extends TeaModel {
        /**
         * <p>The arguments of the container startup command. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The container startup commands.</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The environment variable of the container.</p>
         */
        @NameInMap("EnvironmentVar")
        public java.util.List<SubmitServerlessJobRequestContainerEnvironmentVar> environmentVar;

        /**
         * <p>The number of GPUs of the container.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the container.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The data volumes mounted to the container.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<SubmitServerlessJobRequestContainerVolumeMount> volumeMount;

        /**
         * <p>The working directory of the container.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static SubmitServerlessJobRequestContainer build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestContainer self = new SubmitServerlessJobRequestContainer();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public SubmitServerlessJobRequestContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public SubmitServerlessJobRequestContainer setEnvironmentVar(java.util.List<SubmitServerlessJobRequestContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<SubmitServerlessJobRequestContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public SubmitServerlessJobRequestContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public SubmitServerlessJobRequestContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public SubmitServerlessJobRequestContainer setVolumeMount(java.util.List<SubmitServerlessJobRequestContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<SubmitServerlessJobRequestContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public SubmitServerlessJobRequestContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class SubmitServerlessJobRequestDependsOn extends TeaModel {
        /**
         * <p>The ID of the dependent job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The type of the dependency. Valid values:</p>
         * <br>
         * <p>*   AfterSucceeded: **All subtasks** of the array job or the dependent job are successfully run. The exit code is 0.</p>
         * <p>*   AfterFailed: **Any subtask** of the array job or the dependent job fails. The exit code is not 0.</p>
         * <p>*   AfterAny: The dependent job completes.</p>
         * <p>*   AfterCorresponding: The subtasks of the array job is successfully run. The exit code is 0.</p>
         * <br>
         * <p>Default value: AfterSucceeded.</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitServerlessJobRequestDependsOn build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestDependsOn self = new SubmitServerlessJobRequestDependsOn();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestDependsOn setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitServerlessJobRequestDependsOn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitServerlessJobRequestRetryStrategyEvaluateOnExit extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("OnExitCode")
        public String onExitCode;

        public static SubmitServerlessJobRequestRetryStrategyEvaluateOnExit build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestRetryStrategyEvaluateOnExit self = new SubmitServerlessJobRequestRetryStrategyEvaluateOnExit();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestRetryStrategyEvaluateOnExit setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public SubmitServerlessJobRequestRetryStrategyEvaluateOnExit setOnExitCode(String onExitCode) {
            this.onExitCode = onExitCode;
            return this;
        }
        public String getOnExitCode() {
            return this.onExitCode;
        }

    }

    public static class SubmitServerlessJobRequestRetryStrategy extends TeaModel {
        @NameInMap("Attempts")
        public Integer attempts;

        @NameInMap("EvaluateOnExit")
        public java.util.List<SubmitServerlessJobRequestRetryStrategyEvaluateOnExit> evaluateOnExit;

        public static SubmitServerlessJobRequestRetryStrategy build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestRetryStrategy self = new SubmitServerlessJobRequestRetryStrategy();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestRetryStrategy setAttempts(Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public Integer getAttempts() {
            return this.attempts;
        }

        public SubmitServerlessJobRequestRetryStrategy setEvaluateOnExit(java.util.List<SubmitServerlessJobRequestRetryStrategyEvaluateOnExit> evaluateOnExit) {
            this.evaluateOnExit = evaluateOnExit;
            return this;
        }
        public java.util.List<SubmitServerlessJobRequestRetryStrategyEvaluateOnExit> getEvaluateOnExit() {
            return this.evaluateOnExit;
        }

    }

}
