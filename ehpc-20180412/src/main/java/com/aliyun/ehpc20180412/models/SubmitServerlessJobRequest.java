// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitServerlessJobRequest extends TeaModel {
    @NameInMap("ArrayProperties")
    public SubmitServerlessJobRequestArrayProperties arrayProperties;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Container")
    public SubmitServerlessJobRequestContainer container;

    @NameInMap("Cpu")
    public Float cpu;

    @NameInMap("DependsOn")
    public java.util.List<SubmitServerlessJobRequestDependsOn> dependsOn;

    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    @NameInMap("InstanceType")
    public java.util.List<String> instanceType;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobPriority")
    public Long jobPriority;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("Timeout")
    public Long timeout;

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
        @NameInMap("IndexEnd")
        public Long indexEnd;

        @NameInMap("IndexStart")
        public Long indexStart;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static SubmitServerlessJobRequestContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestContainerEnvironmentVar self = new SubmitServerlessJobRequestContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestContainerEnvironmentVar setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitServerlessJobRequestContainerEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SubmitServerlessJobRequestContainerVolumeMountFlexVolume extends TeaModel {
        @NameInMap("Driver")
        public String driver;

        @NameInMap("Options")
        public String options;

        public static SubmitServerlessJobRequestContainerVolumeMountFlexVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestContainerVolumeMountFlexVolume self = new SubmitServerlessJobRequestContainerVolumeMountFlexVolume();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestContainerVolumeMountFlexVolume setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public SubmitServerlessJobRequestContainerVolumeMountFlexVolume setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

    }

    public static class SubmitServerlessJobRequestContainerVolumeMountNFSVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Server")
        public String server;

        public static SubmitServerlessJobRequestContainerVolumeMountNFSVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestContainerVolumeMountNFSVolume self = new SubmitServerlessJobRequestContainerVolumeMountNFSVolume();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestContainerVolumeMountNFSVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public SubmitServerlessJobRequestContainerVolumeMountNFSVolume setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public SubmitServerlessJobRequestContainerVolumeMountNFSVolume setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class SubmitServerlessJobRequestContainerVolumeMount extends TeaModel {
        @NameInMap("FlexVolume")
        public SubmitServerlessJobRequestContainerVolumeMountFlexVolume flexVolume;

        @NameInMap("NFSVolume")
        public SubmitServerlessJobRequestContainerVolumeMountNFSVolume NFSVolume;

        @NameInMap("MountPath")
        public String mountPath;

        public static SubmitServerlessJobRequestContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            SubmitServerlessJobRequestContainerVolumeMount self = new SubmitServerlessJobRequestContainerVolumeMount();
            return TeaModel.build(map, self);
        }

        public SubmitServerlessJobRequestContainerVolumeMount setFlexVolume(SubmitServerlessJobRequestContainerVolumeMountFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }
        public SubmitServerlessJobRequestContainerVolumeMountFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        public SubmitServerlessJobRequestContainerVolumeMount setNFSVolume(SubmitServerlessJobRequestContainerVolumeMountNFSVolume NFSVolume) {
            this.NFSVolume = NFSVolume;
            return this;
        }
        public SubmitServerlessJobRequestContainerVolumeMountNFSVolume getNFSVolume() {
            return this.NFSVolume;
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
        @NameInMap("Arg")
        public java.util.List<String> arg;

        @NameInMap("Command")
        public java.util.List<String> command;

        @NameInMap("EnvironmentVar")
        public java.util.List<SubmitServerlessJobRequestContainerEnvironmentVar> environmentVar;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Image")
        public String image;

        @NameInMap("VolumeMount")
        public java.util.List<SubmitServerlessJobRequestContainerVolumeMount> volumeMount;

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
        @NameInMap("JobId")
        public String jobId;

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

}
