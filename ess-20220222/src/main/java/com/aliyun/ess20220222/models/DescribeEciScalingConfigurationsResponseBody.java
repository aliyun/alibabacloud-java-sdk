// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeEciScalingConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The total number of scaling configurations.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Details of the scaling configurations.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the scaling configuration was created.</p>
     */
    @NameInMap("ScalingConfigurations")
    public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurations> scalingConfigurations;

    /**
     * <p>Details of the scaling configurations.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEciScalingConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciScalingConfigurationsResponseBody self = new DescribeEciScalingConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEciScalingConfigurationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEciScalingConfigurationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEciScalingConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEciScalingConfigurationsResponseBody setScalingConfigurations(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurations> scalingConfigurations) {
        this.scalingConfigurations = scalingConfigurations;
        return this;
    }
    public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurations> getScalingConfigurations() {
        return this.scalingConfigurations;
    }

    public DescribeEciScalingConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos extends TeaModel {
        /**
         * <p>The IP addresses of the DNS servers.</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The domain name of the Container Registry Enterprise Edition instance. By default, all domain names of the Container Registry Enterprise Edition instance are displayed. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The domain name of the Container Registry Enterprise Edition instance. By default, all domain names of the Container Registry Enterprise Edition instance are displayed. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars extends TeaModel {
        /**
         * <p>The container startup commands. You can specify up to 20 commands. Each command can contain up to 256 characters.</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The container startup commands. You can specify up to 20 commands. Each command can contain up to 256 characters.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars setFieldRefFieldPath(String fieldRefFieldPath) {
            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts extends TeaModel {
        /**
         * <p>The volumes that are mounted on the container.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The volumes that are mounted on the container.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts extends TeaModel {
        /**
         * <p>Details of the environment variables.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>Details of the environment variables.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The directory in which the container mounts the volume.</p>
         * <br>
         * <p>> Data in this directory is overwritten by the data on the volume.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the volume. The value of this parameter is the same as the value of the Volumes.Name parameter.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation allows the sharing of volumes that are mounted on one container with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.</p>
         * <p>*   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.</p>
         * <p>*   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.</p>
         * <br>
         * <p>Default value: None.</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers extends TeaModel {
        /**
         * <p>The commands that are run in the container when you use the CLI to perform probes.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The commands that are run in the container when you use the CLI to perform probes.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The minimum number of consecutive failures for a probe to be considered failed after having been successful.</p>
         * <br>
         * <p>Default value: 3.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The name of the environment variable.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars> environmentVars;

        /**
         * <p>Indicates whether the container allocates buffer resources to standard input streams when the container runs. If you do not specify this parameter, an end-of-file (EOF) error may occur. Default value: false.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The protocol type of HTTP GET requests when you use HTTP requests to perform probes. Valid values:</p>
         * <br>
         * <p>*   HTTP</p>
         * <p>*   HTTPS</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The number of vCPUs that are allocated to the container.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The arguments that are passed to the container startup commands. You can specify up to 10 arguments.</p>
         */
        @NameInMap("LivenessProbeExecCommands")
        public java.util.List<String> livenessProbeExecCommands;

        /**
         * <p>The exposed ports and protocols of the container.</p>
         */
        @NameInMap("LivenessProbeFailureThreshold")
        public Integer livenessProbeFailureThreshold;

        /**
         * <p>The port number of TcpSocket.</p>
         */
        @NameInMap("LivenessProbeHttpGetPath")
        public String livenessProbeHttpGetPath;

        /**
         * <p>The number of seconds between the time when the startup of the container ends and the time when the probe starts.</p>
         */
        @NameInMap("LivenessProbeHttpGetPort")
        public Integer livenessProbeHttpGetPort;

        /**
         * <p>Indicates whether interaction is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>If the value of the Command parameter is /bin/bash, the value of this parameter is true.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("LivenessProbeHttpGetScheme")
        public String livenessProbeHttpGetScheme;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <br>
         * <p>*   Always: Image pulling is performed each time.</p>
         * <p>*   IfNotPresent: Image pulling is performed only if on-premises images are unavailable. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</p>
         * <p>*   Never: On-premises images are always used. Image pulling is not performed.</p>
         */
        @NameInMap("LivenessProbeInitialDelaySeconds")
        public Integer livenessProbeInitialDelaySeconds;

        /**
         * <p>The protocol type of HTTP GET requests when you use HTTP requests to perform probes. Valid values:</p>
         * <br>
         * <p>*   HTTP</p>
         * <p>*   HTTPS</p>
         */
        @NameInMap("LivenessProbePeriodSeconds")
        public Integer livenessProbePeriodSeconds;

        /**
         * <p>The user ID (UID) that is used to run the entry point of the container process.</p>
         */
        @NameInMap("LivenessProbeSuccessThreshold")
        public Integer livenessProbeSuccessThreshold;

        /**
         * <p>The working directory of the container.</p>
         */
        @NameInMap("LivenessProbeTcpSocketPort")
        public Integer livenessProbeTcpSocketPort;

        /**
         * <p>The minimum number of consecutive failures for a probe to be considered failed after having been successful.</p>
         * <br>
         * <p>Default value: 3.</p>
         */
        @NameInMap("LivenessProbeTimeoutSeconds")
        public Integer livenessProbeTimeoutSeconds;

        /**
         * <p>Indicates whether the root file system is set to the read-only mode. The only valid value is true.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The path to which the system sends an HTTP GET request for a probe.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts> ports;

        /**
         * <p>The permissions granted to processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
         * <br>
         * <p>> To use NET_RAW, you need to submit a ticket.</p>
         */
        @NameInMap("ReadinessProbeExecCommands")
        public java.util.List<String> readinessProbeExecCommands;

        /**
         * <p>The exposed ports and protocols of the container.</p>
         */
        @NameInMap("ReadinessProbeFailureThreshold")
        public Integer readinessProbeFailureThreshold;

        /**
         * <p>The interval at which probes are performed. Default value: 10. Minimum value: 1. Unit: seconds.</p>
         */
        @NameInMap("ReadinessProbeHttpGetPath")
        public String readinessProbeHttpGetPath;

        /**
         * <p>The timeout period of a probe. Default value: 1. Minimum value: 1. Unit: seconds.</p>
         */
        @NameInMap("ReadinessProbeHttpGetPort")
        public Integer readinessProbeHttpGetPort;

        /**
         * <p>The minimum number of consecutive successes for a probe to be considered successful after having failed. Default value: 1. Valid value: 1.</p>
         */
        @NameInMap("ReadinessProbeHttpGetScheme")
        public String readinessProbeHttpGetScheme;

        /**
         * <p>The memory size of the container.</p>
         */
        @NameInMap("ReadinessProbeInitialDelaySeconds")
        public Integer readinessProbeInitialDelaySeconds;

        /**
         * <p>Indicates whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected during multiple sessions.</p>
         * <br>
         * <p>If StdinOnce is set to true, standard input streams are connected after the container is started and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected and remain in the disconnected state until the container is started again.</p>
         */
        @NameInMap("ReadinessProbePeriodSeconds")
        public Integer readinessProbePeriodSeconds;

        /**
         * <p>The port number of TcpSocket.</p>
         */
        @NameInMap("ReadinessProbeSuccessThreshold")
        public Integer readinessProbeSuccessThreshold;

        /**
         * <p>The path to which the system sends an HTTP GET request for a probe.</p>
         */
        @NameInMap("ReadinessProbeTcpSocketPort")
        public Integer readinessProbeTcpSocketPort;

        /**
         * <p>The number of seconds between the time when the startup of the container ends and the time when the probe starts.</p>
         */
        @NameInMap("ReadinessProbeTimeoutSeconds")
        public Integer readinessProbeTimeoutSeconds;

        /**
         * <p>The init containers.</p>
         */
        @NameInMap("SecurityContextCapabilityAdds")
        public java.util.List<String> securityContextCapabilityAdds;

        /**
         * <p>The image of the container.</p>
         */
        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        public Boolean securityContextReadOnlyRootFilesystem;

        /**
         * <p>The interval at which probes are performed. Default value: 10. Minimum value: 1. Unit: seconds.</p>
         */
        @NameInMap("SecurityContextRunAsUser")
        public Long securityContextRunAsUser;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>The timeout period of a probe. Default value: 1. Minimum value: 1. Unit: seconds.</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>Indicates whether the volume is read-only.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts> volumeMounts;

        /**
         * <p>The port to which HTTP GET requests were sent.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setEnvironmentVars(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeExecCommands(java.util.List<String> livenessProbeExecCommands) {
            this.livenessProbeExecCommands = livenessProbeExecCommands;
            return this;
        }
        public java.util.List<String> getLivenessProbeExecCommands() {
            return this.livenessProbeExecCommands;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeFailureThreshold(Integer livenessProbeFailureThreshold) {
            this.livenessProbeFailureThreshold = livenessProbeFailureThreshold;
            return this;
        }
        public Integer getLivenessProbeFailureThreshold() {
            return this.livenessProbeFailureThreshold;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeHttpGetPath(String livenessProbeHttpGetPath) {
            this.livenessProbeHttpGetPath = livenessProbeHttpGetPath;
            return this;
        }
        public String getLivenessProbeHttpGetPath() {
            return this.livenessProbeHttpGetPath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeHttpGetPort(Integer livenessProbeHttpGetPort) {
            this.livenessProbeHttpGetPort = livenessProbeHttpGetPort;
            return this;
        }
        public Integer getLivenessProbeHttpGetPort() {
            return this.livenessProbeHttpGetPort;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeHttpGetScheme(String livenessProbeHttpGetScheme) {
            this.livenessProbeHttpGetScheme = livenessProbeHttpGetScheme;
            return this;
        }
        public String getLivenessProbeHttpGetScheme() {
            return this.livenessProbeHttpGetScheme;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeInitialDelaySeconds(Integer livenessProbeInitialDelaySeconds) {
            this.livenessProbeInitialDelaySeconds = livenessProbeInitialDelaySeconds;
            return this;
        }
        public Integer getLivenessProbeInitialDelaySeconds() {
            return this.livenessProbeInitialDelaySeconds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbePeriodSeconds(Integer livenessProbePeriodSeconds) {
            this.livenessProbePeriodSeconds = livenessProbePeriodSeconds;
            return this;
        }
        public Integer getLivenessProbePeriodSeconds() {
            return this.livenessProbePeriodSeconds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeSuccessThreshold(Integer livenessProbeSuccessThreshold) {
            this.livenessProbeSuccessThreshold = livenessProbeSuccessThreshold;
            return this;
        }
        public Integer getLivenessProbeSuccessThreshold() {
            return this.livenessProbeSuccessThreshold;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeTcpSocketPort(Integer livenessProbeTcpSocketPort) {
            this.livenessProbeTcpSocketPort = livenessProbeTcpSocketPort;
            return this;
        }
        public Integer getLivenessProbeTcpSocketPort() {
            return this.livenessProbeTcpSocketPort;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLivenessProbeTimeoutSeconds(Integer livenessProbeTimeoutSeconds) {
            this.livenessProbeTimeoutSeconds = livenessProbeTimeoutSeconds;
            return this;
        }
        public Integer getLivenessProbeTimeoutSeconds() {
            return this.livenessProbeTimeoutSeconds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setPorts(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts> getPorts() {
            return this.ports;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeExecCommands(java.util.List<String> readinessProbeExecCommands) {
            this.readinessProbeExecCommands = readinessProbeExecCommands;
            return this;
        }
        public java.util.List<String> getReadinessProbeExecCommands() {
            return this.readinessProbeExecCommands;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeFailureThreshold(Integer readinessProbeFailureThreshold) {
            this.readinessProbeFailureThreshold = readinessProbeFailureThreshold;
            return this;
        }
        public Integer getReadinessProbeFailureThreshold() {
            return this.readinessProbeFailureThreshold;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeHttpGetPath(String readinessProbeHttpGetPath) {
            this.readinessProbeHttpGetPath = readinessProbeHttpGetPath;
            return this;
        }
        public String getReadinessProbeHttpGetPath() {
            return this.readinessProbeHttpGetPath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeHttpGetPort(Integer readinessProbeHttpGetPort) {
            this.readinessProbeHttpGetPort = readinessProbeHttpGetPort;
            return this;
        }
        public Integer getReadinessProbeHttpGetPort() {
            return this.readinessProbeHttpGetPort;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeHttpGetScheme(String readinessProbeHttpGetScheme) {
            this.readinessProbeHttpGetScheme = readinessProbeHttpGetScheme;
            return this;
        }
        public String getReadinessProbeHttpGetScheme() {
            return this.readinessProbeHttpGetScheme;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeInitialDelaySeconds(Integer readinessProbeInitialDelaySeconds) {
            this.readinessProbeInitialDelaySeconds = readinessProbeInitialDelaySeconds;
            return this;
        }
        public Integer getReadinessProbeInitialDelaySeconds() {
            return this.readinessProbeInitialDelaySeconds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbePeriodSeconds(Integer readinessProbePeriodSeconds) {
            this.readinessProbePeriodSeconds = readinessProbePeriodSeconds;
            return this;
        }
        public Integer getReadinessProbePeriodSeconds() {
            return this.readinessProbePeriodSeconds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeSuccessThreshold(Integer readinessProbeSuccessThreshold) {
            this.readinessProbeSuccessThreshold = readinessProbeSuccessThreshold;
            return this;
        }
        public Integer getReadinessProbeSuccessThreshold() {
            return this.readinessProbeSuccessThreshold;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeTcpSocketPort(Integer readinessProbeTcpSocketPort) {
            this.readinessProbeTcpSocketPort = readinessProbeTcpSocketPort;
            return this;
        }
        public Integer getReadinessProbeTcpSocketPort() {
            return this.readinessProbeTcpSocketPort;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setReadinessProbeTimeoutSeconds(Integer readinessProbeTimeoutSeconds) {
            this.readinessProbeTimeoutSeconds = readinessProbeTimeoutSeconds;
            return this;
        }
        public Integer getReadinessProbeTimeoutSeconds() {
            return this.readinessProbeTimeoutSeconds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setSecurityContextCapabilityAdds(java.util.List<String> securityContextCapabilityAdds) {
            this.securityContextCapabilityAdds = securityContextCapabilityAdds;
            return this;
        }
        public java.util.List<String> getSecurityContextCapabilityAdds() {
            return this.securityContextCapabilityAdds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
            this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
            return this;
        }
        public Boolean getSecurityContextReadOnlyRootFilesystem() {
            return this.securityContextReadOnlyRootFilesystem;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setSecurityContextRunAsUser(Long securityContextRunAsUser) {
            this.securityContextRunAsUser = securityContextRunAsUser;
            return this;
        }
        public Long getSecurityContextRunAsUser() {
            return this.securityContextRunAsUser;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setVolumeMounts(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions extends TeaModel {
        /**
         * <p>The hostname aliases of a container.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The hostname aliases of a container.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases extends TeaModel {
        /**
         * <p>The system information of the security context in which the elastic container instance runs.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The hostnames that are added.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials extends TeaModel {
        /**
         * <p>The username that is used to access the image repository.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The options. Each option is a name-value pair. The value in the name-value pair is optional.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The options. Each option is a name-value pair. The value in the name-value pair is optional.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars extends TeaModel {
        /**
         * <p>Details of the init container ports.</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Details of the init container ports.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars setFieldRefFieldPath(String fieldRefFieldPath) {
            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts extends TeaModel {
        /**
         * <p>The volumes that are mounted on the container.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The volumes that are mounted on the container.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts extends TeaModel {
        /**
         * <p>The permissions that are granted to the processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
         * <br>
         * <p>> To use NET_RAW, you need to submit a ticket.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The permissions that are granted to the processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
         * <br>
         * <p>> To use NET_RAW, you need to submit a ticket.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The directory to which the volume is mounted. Data under this directory is overwritten by the data on the volume.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the volume.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation allows the sharing of volumes that are mounted on one container with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.</p>
         * <p>*   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.</p>
         * <p>*   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.</p>
         * <br>
         * <p>Default value: None.</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers extends TeaModel {
        /**
         * <p>The number of GPUs that are allocated to the container.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The size of the memory.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The ID of the user that runs the container.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The tags of the elastic container instance. The tags are specified in the key-value pair format.</p>
         */
        @NameInMap("InitContainerArgs")
        public java.util.List<String> initContainerArgs;

        /**
         * <p>The container startup arguments.</p>
         */
        @NameInMap("InitContainerCommands")
        public java.util.List<String> initContainerCommands;

        /**
         * <p>The name of the environment variable.</p>
         */
        @NameInMap("InitContainerEnvironmentVars")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars;

        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("InitContainerPorts")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts> initContainerPorts;

        /**
         * <p>Indicates whether the mount path is read-only.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("InitContainerVolumeMounts")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts> initContainerVolumeMounts;

        /**
         * <p>Details of the environment variables.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>Details of the environment variables.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The container startup commands.</p>
         */
        @NameInMap("SecurityContextCapabilityAdds")
        public java.util.List<String> securityContextCapabilityAdds;

        /**
         * <p>The working directory.</p>
         */
        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        public Boolean securityContextReadOnlyRootFilesystem;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("SecurityContextRunAsUser")
        public String securityContextRunAsUser;

        /**
         * <p>The container image.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setInitContainerArgs(java.util.List<String> initContainerArgs) {
            this.initContainerArgs = initContainerArgs;
            return this;
        }
        public java.util.List<String> getInitContainerArgs() {
            return this.initContainerArgs;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setInitContainerCommands(java.util.List<String> initContainerCommands) {
            this.initContainerCommands = initContainerCommands;
            return this;
        }
        public java.util.List<String> getInitContainerCommands() {
            return this.initContainerCommands;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setInitContainerEnvironmentVars(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars) {
            this.initContainerEnvironmentVars = initContainerEnvironmentVars;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars> getInitContainerEnvironmentVars() {
            return this.initContainerEnvironmentVars;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setInitContainerPorts(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts> initContainerPorts) {
            this.initContainerPorts = initContainerPorts;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts> getInitContainerPorts() {
            return this.initContainerPorts;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setInitContainerVolumeMounts(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts> initContainerVolumeMounts) {
            this.initContainerVolumeMounts = initContainerVolumeMounts;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts> getInitContainerVolumeMounts() {
            return this.initContainerVolumeMounts;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setSecurityContextCapabilityAdds(java.util.List<String> securityContextCapabilityAdds) {
            this.securityContextCapabilityAdds = securityContextCapabilityAdds;
            return this;
        }
        public java.util.List<String> getSecurityContextCapabilityAdds() {
            return this.securityContextCapabilityAdds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
            this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
            return this;
        }
        public Boolean getSecurityContextReadOnlyRootFilesystem() {
            return this.securityContextReadOnlyRootFilesystem;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setSecurityContextRunAsUser(String securityContextRunAsUser) {
            this.securityContextRunAsUser = securityContextRunAsUser;
            return this;
        }
        public String getSecurityContextRunAsUser() {
            return this.securityContextRunAsUser;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls extends TeaModel {
        /**
         * <p>Details of the Container Registry Enterprise Edition instances.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Details of the Container Registry Enterprise Edition instances.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags extends TeaModel {
        /**
         * <p>Details of the volumes.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Details of the volumes.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths extends TeaModel {
        /**
         * <p>The information about the image repository.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The information about the image repository.</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The content of the configuration file (32 KB).</p>
         */
        @NameInMap("Path")
        public String path;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes extends TeaModel {
        /**
         * <p>The relative path to the configuration file.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        /**
         * <p>The FlexVolume options. Each option is a key-value pair in a JSON string.</p>
         * <br>
         * <p>For example, when you use FlexVolume to mount a disk, the format of options is `{"volumeId":"d-2zehdahrwoa7srg****","performanceLevel": "PL2"}`.</p>
         */
        @NameInMap("ConfigFileVolumeDefaultMode")
        public Integer configFileVolumeDefaultMode;

        /**
         * <p>The storage medium of EmptyDirVolume. If this parameter is left empty, the file system that backs the node is used as the storage medium. If this parameter is set to memory, the memory is used as the storage medium.</p>
         */
        @NameInMap("DiskVolumeDiskId")
        public String diskVolumeDiskId;

        /**
         * <p>The file system type of the volume. The default value is determined by the script of FlexVolume.</p>
         */
        @NameInMap("DiskVolumeDiskSize")
        public Integer diskVolumeDiskSize;

        /**
         * <p>The path to the Network File System (NFS) volume.</p>
         */
        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        /**
         * <p>The storage size of a disk volume. Unit: GiB.</p>
         */
        @NameInMap("EmptyDirVolumeMedium")
        public String emptyDirVolumeMedium;

        @NameInMap("EmptyDirVolumeSizeLimit")
        public String emptyDirVolumeSizeLimit;

        /**
         * <p>The endpoint of the NFS server.</p>
         */
        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        /**
         * <p>The FlexVolume driver name of the volume.</p>
         */
        @NameInMap("FlexVolumeFsType")
        public String flexVolumeFsType;

        /**
         * <p>The name of the volume.</p>
         */
        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        @NameInMap("HostPathVolumePath")
        public String hostPathVolumePath;

        @NameInMap("HostPathVolumeType")
        public String hostPathVolumeType;

        /**
         * <p>Indicates whether the NFS volume is read-only.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("NFSVolumePath")
        public String NFSVolumePath;

        /**
         * <p>The default permissions on the ConfigFile volume.</p>
         */
        @NameInMap("NFSVolumeReadOnly")
        public Boolean NFSVolumeReadOnly;

        /**
         * <p>The paths to configuration files.</p>
         */
        @NameInMap("NFSVolumeServer")
        public String NFSVolumeServer;

        /**
         * <p>The paths to configuration files.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The file system type of a disk volume.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setConfigFileVolumeConfigFileToPaths(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
            this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setConfigFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
            this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
            return this;
        }
        public Integer getConfigFileVolumeDefaultMode() {
            return this.configFileVolumeDefaultMode;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setDiskVolumeDiskId(String diskVolumeDiskId) {
            this.diskVolumeDiskId = diskVolumeDiskId;
            return this;
        }
        public String getDiskVolumeDiskId() {
            return this.diskVolumeDiskId;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setDiskVolumeDiskSize(Integer diskVolumeDiskSize) {
            this.diskVolumeDiskSize = diskVolumeDiskSize;
            return this;
        }
        public Integer getDiskVolumeDiskSize() {
            return this.diskVolumeDiskSize;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setDiskVolumeFsType(String diskVolumeFsType) {
            this.diskVolumeFsType = diskVolumeFsType;
            return this;
        }
        public String getDiskVolumeFsType() {
            return this.diskVolumeFsType;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
            this.emptyDirVolumeMedium = emptyDirVolumeMedium;
            return this;
        }
        public String getEmptyDirVolumeMedium() {
            return this.emptyDirVolumeMedium;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
            this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
            return this;
        }
        public String getEmptyDirVolumeSizeLimit() {
            return this.emptyDirVolumeSizeLimit;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setFlexVolumeDriver(String flexVolumeDriver) {
            this.flexVolumeDriver = flexVolumeDriver;
            return this;
        }
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setFlexVolumeFsType(String flexVolumeFsType) {
            this.flexVolumeFsType = flexVolumeFsType;
            return this;
        }
        public String getFlexVolumeFsType() {
            return this.flexVolumeFsType;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setFlexVolumeOptions(String flexVolumeOptions) {
            this.flexVolumeOptions = flexVolumeOptions;
            return this;
        }
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setHostPathVolumePath(String hostPathVolumePath) {
            this.hostPathVolumePath = hostPathVolumePath;
            return this;
        }
        public String getHostPathVolumePath() {
            return this.hostPathVolumePath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setHostPathVolumeType(String hostPathVolumeType) {
            this.hostPathVolumeType = hostPathVolumeType;
            return this;
        }
        public String getHostPathVolumeType() {
            return this.hostPathVolumeType;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setNFSVolumePath(String NFSVolumePath) {
            this.NFSVolumePath = NFSVolumePath;
            return this;
        }
        public String getNFSVolumePath() {
            return this.NFSVolumePath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setNFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
            this.NFSVolumeReadOnly = NFSVolumeReadOnly;
            return this;
        }
        public Boolean getNFSVolumeReadOnly() {
            return this.NFSVolumeReadOnly;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setNFSVolumeServer(String NFSVolumeServer) {
            this.NFSVolumeServer = NFSVolumeServer;
            return this;
        }
        public String getNFSVolumeServer() {
            return this.NFSVolumeServer;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeEciScalingConfigurationsResponseBodyScalingConfigurations extends TeaModel {
        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("AcrRegistryInfos")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos> acrRegistryInfos;

        /**
         * <p>Indicates whether an elastic IP address (EIP) is automatically created, and then bound to the elastic container instance.</p>
         */
        @NameInMap("ActiveDeadlineSeconds")
        public Integer activeDeadlineSeconds;

        /**
         * <p>The size of the temporary storage space. Unit: GiB.</p>
         */
        @NameInMap("AutoCreateEip")
        public Boolean autoCreateEip;

        /**
         * <p>The name of the elastic container instance.</p>
         */
        @NameInMap("AutoMatchImageCache")
        public Boolean autoMatchImageCache;

        /**
         * <p>The number of physical CPU cores. This parameter can be specified for only some instance types. For more information, see [Specify custom CPU options](~~197781~~).</p>
         */
        @NameInMap("ContainerGroupName")
        public String containerGroupName;

        /**
         * <p>The path to which the system sends an HTTP GET request for a probe.</p>
         */
        @NameInMap("Containers")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers> containers;

        /**
         * <p>auditing</p>
         */
        @NameInMap("CostOptimization")
        public Boolean costOptimization;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The containers in the elastic container instance.</p>
         */
        @NameInMap("CpuOptionsCore")
        public Integer cpuOptionsCore;

        /**
         * <p>The weight of the elastic container instance as a backend server. Valid values: 1 to 100.</p>
         */
        @NameInMap("CpuOptionsThreadsPerCore")
        public Integer cpuOptionsThreadsPerCore;

        /**
         * <p>The ID of the security group with which the elastic container instance is associated. Elastic container instances that are associated with the same security group can access each other.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DataCacheBucket")
        public String dataCacheBucket;

        @NameInMap("DataCacheBurstingEnabled")
        public Boolean dataCacheBurstingEnabled;

        @NameInMap("DataCachePL")
        public String dataCachePL;

        @NameInMap("DataCacheProvisionedIops")
        public Integer dataCacheProvisionedIops;

        /**
         * <p>The ID of the image cache snapshot.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The DNS lookup domains.</p>
         */
        @NameInMap("DnsConfigNameServers")
        public java.util.List<String> dnsConfigNameServers;

        /**
         * <p>The variable name of the option.</p>
         */
        @NameInMap("DnsConfigOptions")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions> dnsConfigOptions;

        /**
         * <p>The domain names of the Network Time Protocol (NTP) servers.</p>
         */
        @NameInMap("DnsConfigSearches")
        public java.util.List<String> dnsConfigSearches;

        /**
         * <p>The maximum outbound bandwidth. Unit: bytes.</p>
         */
        @NameInMap("DnsPolicy")
        public String dnsPolicy;

        /**
         * <p>The name of the instance RAM role. You can use an instance RAM role to access both elastic container instances and Elastic Compute Service (ECS) instances. For more information, see [Use the instance RAM role by calling APIs](~~61178~~).</p>
         */
        @NameInMap("EgressBandwidth")
        public Long egressBandwidth;

        /**
         * <p>The size of the memory.</p>
         * <br>
         * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set the Cpu parameter to 2 and the Memory parameter to 16 to specify the instance types that have 2 vCPUs and 16 GiB of memory. If you specify the Cpu and Memory parameters, Auto Scaling determines available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances of the instance type that is provided at the lowest price.</p>
         * <br>
         * <p>> You can specify CPU and memory specifications to determine the range of instance types only if the Scaling Policy parameter is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
         */
        @NameInMap("EipBandwidth")
        public Integer eipBandwidth;

        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("EphemeralStorage")
        public Integer ephemeralStorage;

        /**
         * <p>The IP address that is added.</p>
         */
        @NameInMap("HostAliases")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases> hostAliases;

        /**
         * <p>The region ID of the elastic container instance.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The password that is used to access the image repository.</p>
         */
        @NameInMap("ImageRegistryCredentials")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials> imageRegistryCredentials;

        /**
         * <p>The restart policy of the elastic container instance. Valid values:</p>
         * <br>
         * <p>*   Never: never restarts the elastic container instance.</p>
         * <p>*   Always: always restarts the elastic container instance.</p>
         * <p>*   OnFailure: restarts the elastic container instance upon failures.</p>
         */
        @NameInMap("ImageSnapshotId")
        public String imageSnapshotId;

        /**
         * <p>The buffer time in which the program handles operations before the program stops.</p>
         */
        @NameInMap("IngressBandwidth")
        public Long ingressBandwidth;

        /**
         * <p>Indicates whether the root file system is read-only. The only valid value is true.</p>
         */
        @NameInMap("InitContainers")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers> initContainers;

        /**
         * <p>5292</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The bandwidth of the EIP. Default value: 5 Mbit/s.</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The instance family level, which is used to filter the range of instance types that meet the requirements. This parameter takes effect when the `CostOptimization` parameter is set to true. Valid values:</p>
         * <br>
         * <p>*   EntryLevel: shared instance type. Instances of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instances of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).</p>
         * <p>*   EnterpriseLevel: Instances of this level provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see [Instance family](~~25378~~).</p>
         * <p>*   CreditEntryLevel: This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see [Overview](~~59977~~) of burstable instances.</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The hostname.</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The maximum hourly price for the preemptible instance.</p>
         * <br>
         * <p>This parameter is returned only if you set the SpotStrategy parameter to SpotWithPriceLimit.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The state of the scaling configuration in the scaling group. Valid values:</p>
         * <br>
         * <p>*   Active: The scaling configuration is active in the scaling group. Auto Scaling uses active scaling configurations to automatically create ECS instances.</p>
         * <p>*   Inactive: The scaling configuration is inactive in the scaling group. Auto Scaling does not use inactive scaling configurations to automatically create ECS instances. Inactive scaling configurations are retained in the scaling group.</p>
         */
        @NameInMap("NtpServers")
        public java.util.List<String> ntpServers;

        /**
         * <p>Indicates whether the image cache is automatically matched. Default value: false.</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The number of vCPUs of the elastic container instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the scaling configuration.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The maximum inbound bandwidth. Unit: bit/s.</p>
         */
        @NameInMap("RestartPolicy")
        public String restartPolicy;

        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        /**
         * <p>The validity period. Unit: seconds.</p>
         */
        @NameInMap("ScalingConfigurationName")
        public String scalingConfigurationName;

        /**
         * <p>The number of IPv6 addresses.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The name of the security context in which the elastic container instance runs.</p>
         */
        @NameInMap("SecurityContextSysCtls")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls> securityContextSysCtls;

        /**
         * <p>The preemption policy of the instance. Valid values:</p>
         * <br>
         * <p>*   NoSpot: The instance is created as a regular pay-as-you-go instance.</p>
         * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The containers in the elastic container instance.</p>
         */
        @NameInMap("SlsEnable")
        public Boolean slsEnable;

        /**
         * <p>The number of threads per core. This parameter can be specified for only some instance types. If you set this parameter to 1, Hyper-Threading is disabled. For more information, see [Specify custom CPU options](~~197781~~).</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The scaling group ID of the scaling configuration.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags> tags;

        /**
         * <p>The Domain Name System (DNS) policy.</p>
         */
        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        /**
         * <p>The type of the volume. Valid values:</p>
         * <br>
         * <p>*   EmptyDirVolume</p>
         * <p>*   NFSVolume</p>
         * <p>*   ConfigFileVolume</p>
         * <p>*   FlexVolume</p>
         */
        @NameInMap("Volumes")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes> volumes;

        public static DescribeEciScalingConfigurationsResponseBodyScalingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationsResponseBodyScalingConfigurations self = new DescribeEciScalingConfigurationsResponseBodyScalingConfigurations();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setAcrRegistryInfos(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos> acrRegistryInfos) {
            this.acrRegistryInfos = acrRegistryInfos;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos> getAcrRegistryInfos() {
            return this.acrRegistryInfos;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }
        public Integer getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setAutoCreateEip(Boolean autoCreateEip) {
            this.autoCreateEip = autoCreateEip;
            return this;
        }
        public Boolean getAutoCreateEip() {
            return this.autoCreateEip;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setAutoMatchImageCache(Boolean autoMatchImageCache) {
            this.autoMatchImageCache = autoMatchImageCache;
            return this;
        }
        public Boolean getAutoMatchImageCache() {
            return this.autoMatchImageCache;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setContainerGroupName(String containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }
        public String getContainerGroupName() {
            return this.containerGroupName;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setContainers(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers> getContainers() {
            return this.containers;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setCostOptimization(Boolean costOptimization) {
            this.costOptimization = costOptimization;
            return this;
        }
        public Boolean getCostOptimization() {
            return this.costOptimization;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setCpuOptionsCore(Integer cpuOptionsCore) {
            this.cpuOptionsCore = cpuOptionsCore;
            return this;
        }
        public Integer getCpuOptionsCore() {
            return this.cpuOptionsCore;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
            this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
            return this;
        }
        public Integer getCpuOptionsThreadsPerCore() {
            return this.cpuOptionsThreadsPerCore;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDataCacheBucket(String dataCacheBucket) {
            this.dataCacheBucket = dataCacheBucket;
            return this;
        }
        public String getDataCacheBucket() {
            return this.dataCacheBucket;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
            this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
            return this;
        }
        public Boolean getDataCacheBurstingEnabled() {
            return this.dataCacheBurstingEnabled;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDataCachePL(String dataCachePL) {
            this.dataCachePL = dataCachePL;
            return this;
        }
        public String getDataCachePL() {
            return this.dataCachePL;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
            this.dataCacheProvisionedIops = dataCacheProvisionedIops;
            return this;
        }
        public Integer getDataCacheProvisionedIops() {
            return this.dataCacheProvisionedIops;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDnsConfigNameServers(java.util.List<String> dnsConfigNameServers) {
            this.dnsConfigNameServers = dnsConfigNameServers;
            return this;
        }
        public java.util.List<String> getDnsConfigNameServers() {
            return this.dnsConfigNameServers;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDnsConfigOptions(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions> dnsConfigOptions) {
            this.dnsConfigOptions = dnsConfigOptions;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions> getDnsConfigOptions() {
            return this.dnsConfigOptions;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDnsConfigSearches(java.util.List<String> dnsConfigSearches) {
            this.dnsConfigSearches = dnsConfigSearches;
            return this;
        }
        public java.util.List<String> getDnsConfigSearches() {
            return this.dnsConfigSearches;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setDnsPolicy(String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }
        public String getDnsPolicy() {
            return this.dnsPolicy;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setEgressBandwidth(Long egressBandwidth) {
            this.egressBandwidth = egressBandwidth;
            return this;
        }
        public Long getEgressBandwidth() {
            return this.egressBandwidth;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setEipBandwidth(Integer eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setEphemeralStorage(Integer ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Integer getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setHostAliases(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases> getHostAliases() {
            return this.hostAliases;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setImageRegistryCredentials(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials> imageRegistryCredentials) {
            this.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials> getImageRegistryCredentials() {
            return this.imageRegistryCredentials;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setImageSnapshotId(String imageSnapshotId) {
            this.imageSnapshotId = imageSnapshotId;
            return this;
        }
        public String getImageSnapshotId() {
            return this.imageSnapshotId;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setIngressBandwidth(Long ingressBandwidth) {
            this.ingressBandwidth = ingressBandwidth;
            return this;
        }
        public Long getIngressBandwidth() {
            return this.ingressBandwidth;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setInitContainers(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers> initContainers) {
            this.initContainers = initContainers;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers> getInitContainers() {
            return this.initContainers;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setLoadBalancerWeight(Integer loadBalancerWeight) {
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setNtpServers(java.util.List<String> ntpServers) {
            this.ntpServers = ntpServers;
            return this;
        }
        public java.util.List<String> getNtpServers() {
            return this.ntpServers;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setScalingConfigurationName(String scalingConfigurationName) {
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }
        public String getScalingConfigurationName() {
            return this.scalingConfigurationName;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setSecurityContextSysCtls(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls> securityContextSysCtls) {
            this.securityContextSysCtls = securityContextSysCtls;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls> getSecurityContextSysCtls() {
            return this.securityContextSysCtls;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setSlsEnable(Boolean slsEnable) {
            this.slsEnable = slsEnable;
            return this;
        }
        public Boolean getSlsEnable() {
            return this.slsEnable;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setTags(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags> getTags() {
            return this.tags;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }
        public Integer getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurations setVolumes(java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes> volumes) {
            this.volumes = volumes;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumes> getVolumes() {
            return this.volumes;
        }

    }

}
