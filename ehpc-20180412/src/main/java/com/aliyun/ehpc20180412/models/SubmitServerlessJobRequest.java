// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitServerlessJobRequest extends TeaModel {
    /**
     * <p>The configuration of the array job.</p>
     * <blockquote>
     * <p> The value of an array job index is passed to a serverless job container through the environment variable <code>EHPC_ARRAY_TASK_ID</code>. Users can access the container from business programs.</p>
     * </blockquote>
     */
    @NameInMap("ArrayProperties")
    public SubmitServerlessJobRequestArrayProperties arrayProperties;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The properties of the Serverless job container.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Container")
    public SubmitServerlessJobRequestContainer container;

    /**
     * <p>The vCPU size of the serverless job container. Unit: cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The dependencies of the serverless job.</p>
     */
    @NameInMap("DependsOn")
    public java.util.List<SubmitServerlessJobRequestDependsOn> dependsOn;

    /**
     * <p>The size of the temporary storage space added to the serverless job container. Unit: GiB.</p>
     * <blockquote>
     * <p> By default, a space of 30 GiB is provided free of charge. If you require a larger space, you can pass this parameter to specify your required space size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>The Elastic Compute Service (ECS) instance types used by the serverless job container.</p>
     */
    @NameInMap("InstanceType")
    public java.util.List<String> instanceType;

    /**
     * <p>The name of the serverless job.</p>
     * <blockquote>
     * <p> The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testjob</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The scheduling priority of the serverless job. Valid values: 0 to 999. A greater value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("JobPriority")
    public Long jobPriority;

    /**
     * <p>The memory size of the serverless job container. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The Resource Access Manamement (RAM) role that is associated with the Serverless job container.</p>
     * 
     * <strong>example:</strong>
     * <p>testRamRoleName</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The retry policy of the serverless job.</p>
     */
    @NameInMap("RetryStrategy")
    public SubmitServerlessJobRequestRetryStrategy retryStrategy;

    /**
     * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places.</p>
     * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0.062</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy of the ECS instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotWithPriceLimit</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The validity period of the serverless job. After the validity period expires, the job is forcibly terminated. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
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
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("IndexEnd")
        public Long indexEnd;

        /**
         * <p>The starting value of the array job index. Valid values: 0 to 4999.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndexStart")
        public Long indexStart;

        /**
         * <p>The interval of the array job index.</p>
         * <blockquote>
         * <p> If the array job property is IndexStart=1,IndexEnd=5, and IndexStep=2, the array job contains three subtasks. The values of the subtask indexes are 1,3, and 5.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>The name of the environment variable for the container. The name can be 1 to 128 characters in length and can contain letters, digits, and underscores (_). The name cannot start with a digit. Specify the name in the [0-9a-zA-Z] format.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable for the container. The value must be 0 to 256 bits in length.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
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
         * <p>The driver type when you use the FlexVolume plug-in to mount a volume. Valid values:</p>
         * <ul>
         * <li>alicloud/nas: a NAS driver.</li>
         * <li>alicloud/oss: an OSS driver.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alicloud/oss</p>
         */
        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        /**
         * <p>The options of the FlexVolume object. Each option is a key-value pair in a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bucket&quot;:&quot;hpctest&quot;,&quot;url&quot;: &quot;oss-cn-hangzhou-internal.aliyuncs.com
         * &quot;,&quot;path&quot;:&quot;/data&quot;,&quot;ramRole&quot;:&quot;AliyunECSInstanceForEHPCRole&quot;}</p>
         */
        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        /**
         * <p>The directory to which the volume is mounted.</p>
         * <blockquote>
         * <p> The data stored in this directory is overwritten by the data on the volume. Exercise caution when you specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/data</p>
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
         * <p>The value of the environment variable for the container.</p>
         */
        @NameInMap("EnvironmentVar")
        public java.util.List<SubmitServerlessJobRequestContainerEnvironmentVar> environmentVar;

        /**
         * <p>The number of GPUs used by the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

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
         * <p>The data volumes that are mounted to the container.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<SubmitServerlessJobRequestContainerVolumeMount> volumeMount;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/</p>
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
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The dependency type. Valid values:</p>
         * <ul>
         * <li>AfterSucceeded: <strong>All subtasks</strong> of the dependent job or array job succeed. The exit code is 0.</li>
         * <li>AfterFailed: <strong>All subtasks</strong> of the dependent job or array job fail. The exit code is not 0.</li>
         * <li>AfterAny: The dependent job completes (succeeds or fails).</li>
         * <li>AfterCorresponding: The subtask corresponding to the dependent array job succeeds. The exit code is 0.</li>
         * </ul>
         * <p>Default value: AfterSucceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>AfterAny</p>
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
        /**
         * <p>The job action. Valid values:</p>
         * <ul>
         * <li>Retry: The job starts a retry when a specific exit code is hit.</li>
         * <li>Exit: The job exits when a specific exit code is hit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Retry</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The job exit code, which is used together with Action to form a job retry rule. Valid values: 0 to 255.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The number of retries for the serverless job. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Attempts")
        public Integer attempts;

        /**
         * <p>The retry rules for the serverless job. You can specify up to 10 rules.</p>
         */
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
