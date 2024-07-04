// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeEciScalingConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scaling configurations.</p>
     */
    @NameInMap("ScalingConfigurations")
    public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurations> scalingConfigurations;

    /**
     * <p>The total number of scaling configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the Container Registry Enterprise Edition instance are displayed. Multiple domain names are separated by commas (,).</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-nwj395hgf6f3****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <blockquote>
         * <p> This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>path</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/</p>
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
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
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
         * <p>The directory to which the container mounts the volume.</p>
         * <blockquote>
         * <p> Data under this directory is overwritten by data on the volume. Specify this parameter with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/pod/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are performed on the volume or on the subdirectories of the volume.</li>
         * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on the volume or on the subdirectories of the volume.</li>
         * <li>Bidirectional: The volume mount behaves the same as the HostToContainer mount. The volume mount receives subsequent mounts that are performed on the volume or on the subdirectories of the volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The volume name. The value of this parameter is the same as the value of Volume.N.Name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the volume is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>data2/</p>
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
         * <p>The container startup arguments. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The container startup commands. You can specify up to 20 commands. Each command contains up to 256 characters.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs that are allocated to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <ul>
         * <li>Always: Each time instances are created, image pulling is performed.</li>
         * <li>IfNotPresent: Image pulling is performed as needed. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("LifecyclePostStartHandlerExecs")
        public java.util.List<String> lifecyclePostStartHandlerExecs;

        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        @NameInMap("LifecyclePreStopHandlerExecs")
        public java.util.List<String> lifecyclePreStopHandlerExecs;

        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The commands that are run in the container when you use the CLI to perform liveness probes.</p>
         */
        @NameInMap("LivenessProbeExecCommands")
        public java.util.List<String> livenessProbeExecCommands;

        /**
         * <p>The minimum number of consecutive failures before a successful liveness probe is considered failed.</p>
         * <p>Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LivenessProbeFailureThreshold")
        public Integer livenessProbeFailureThreshold;

        /**
         * <p>The path to which HTTP Get requests are sent when you use the HTTP Get requests to perform liveness probes.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/nginx/</p>
         */
        @NameInMap("LivenessProbeHttpGetPath")
        public String livenessProbeHttpGetPath;

        /**
         * <p>The port detected by HTTP Get requests when you use the HTTP requests to perform liveness probes.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LivenessProbeHttpGetPort")
        public Integer livenessProbeHttpGetPort;

        /**
         * <p>The protocol type of HTTP GET requests when you use the HTTP requests to perform liveness probes. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LivenessProbeHttpGetScheme")
        public String livenessProbeHttpGetScheme;

        /**
         * <p>The number of seconds that elapse from the startup of the container to the start time of a liveness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LivenessProbeInitialDelaySeconds")
        public Integer livenessProbeInitialDelaySeconds;

        /**
         * <p>The interval at which liveness probes are performed. Unit: seconds. Default value: 10. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("LivenessProbePeriodSeconds")
        public Integer livenessProbePeriodSeconds;

        /**
         * <p>The minimum number of consecutive successes before a failed liveness probe is considered successful. Default value: 1. Valid value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LivenessProbeSuccessThreshold")
        public Integer livenessProbeSuccessThreshold;

        /**
         * <p>The port detected by TCP sockets when you use the TCP sockets to perform liveness probes.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LivenessProbeTcpSocketPort")
        public Integer livenessProbeTcpSocketPort;

        /**
         * <p>The timeout period of the liveness probe. Default value: 1. Minimum value: 1. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LivenessProbeTimeoutSeconds")
        public Integer livenessProbeTimeoutSeconds;

        /**
         * <p>The memory size of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The exposed ports and protocols of the container.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersPorts> ports;

        /**
         * <p>The commands that are run in the container when you use the CLI to perform readiness probes.</p>
         */
        @NameInMap("ReadinessProbeExecCommands")
        public java.util.List<String> readinessProbeExecCommands;

        /**
         * <p>The minimum number of consecutive failures before a successful readiness probe is considered failed.</p>
         * <p>Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReadinessProbeFailureThreshold")
        public Integer readinessProbeFailureThreshold;

        /**
         * <p>The path to which HTTP Get requests are sent when you use the HTTP requests to perform readiness probes.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local</p>
         */
        @NameInMap("ReadinessProbeHttpGetPath")
        public String readinessProbeHttpGetPath;

        /**
         * <p>The path to which HTTP Get requests are sent when you use the HTTP Get requests to perform readiness probes.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/nginx/</p>
         */
        @NameInMap("ReadinessProbeHttpGetPort")
        public Integer readinessProbeHttpGetPort;

        /**
         * <p>The protocol type of HTTP GET requests when you use the HTTP requests to perform readiness probes. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ReadinessProbeHttpGetScheme")
        public String readinessProbeHttpGetScheme;

        /**
         * <p>The number of seconds that elapse from the startup of the container to the start time of a readiness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadinessProbeInitialDelaySeconds")
        public Integer readinessProbeInitialDelaySeconds;

        /**
         * <p>The interval at which readiness probes are performed. Unit: seconds. Default value: 10. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadinessProbePeriodSeconds")
        public Integer readinessProbePeriodSeconds;

        /**
         * <p>The minimum number of consecutive successes before a failed readiness probe is considered successful. Default value: 1. Valid value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadinessProbeSuccessThreshold")
        public Integer readinessProbeSuccessThreshold;

        /**
         * <p>The port detected by TCP sockets when you use the TCP sockets to perform readiness probes.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        @NameInMap("ReadinessProbeTcpSocketPort")
        public Integer readinessProbeTcpSocketPort;

        /**
         * <p>The timeout period of the readiness probe. Default value: 1. Minimum value: 1. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadinessProbeTimeoutSeconds")
        public Integer readinessProbeTimeoutSeconds;

        /**
         * <p>The permissions that are granted to the processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
         * <blockquote>
         * <p> To use NET_RAW, you must submit a ticket.</p>
         * </blockquote>
         */
        @NameInMap("SecurityContextCapabilityAdds")
        public java.util.List<String> securityContextCapabilityAdds;

        /**
         * <p>Indicates whether the root file system on which the container runs is read-only. Valid value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        public Boolean securityContextReadOnlyRootFilesystem;

        /**
         * <p>The ID of the user that runs the entry point of the container process.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SecurityContextRunAsUser")
        public Long securityContextRunAsUser;

        /**
         * <p>Indicates whether the container allocates buffer resources to standard input streams when the container is run. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Indicates whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected among multiple sessions.</p>
         * <p>If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container is restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Indicates whether interaction is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>If the command is a /bin/bash command, the value of this parameter is true.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>The volumes that are mounted to the container.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/nginx</p>
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

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePostStartHandlerExecs(java.util.List<String> lifecyclePostStartHandlerExecs) {
            this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExecs() {
            return this.lifecyclePostStartHandlerExecs;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePreStopHandlerExecs(java.util.List<String> lifecyclePreStopHandlerExecs) {
            this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExecs() {
            return this.lifecyclePreStopHandlerExecs;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
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
         * <p>The variable name of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
         * <p>The hostnames that were added.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The IP address that was added.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
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
         * <p>The password of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>yourpaasword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The domain name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>yourusername</p>
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
         * <blockquote>
         * <p> This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>path</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
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
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
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
         * <p>The directory to which the volume is mounted. Data under this directory is overwritten by the data on the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are performed on the volume or on the subdirectories of the volume.</li>
         * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on the volume or on the subdirectories of the volume.</li>
         * <li>Bidirectional: The volume mount behaves the same as the HostToContainer mount. The volume mount receives subsequent mounts that are performed on the volume or on the subdirectories of the volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The volume name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-empty</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the mount directory is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume. A pod can mount different directories of the same volume to different subdirectories of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sub/</p>
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
         * <p>The number of vCPUs that are allocated to the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The number of GPUs that are allocated to the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The startup arguments of the init container.</p>
         */
        @NameInMap("InitContainerArgs")
        public java.util.List<String> initContainerArgs;

        /**
         * <p>The startup commands of the init container.</p>
         */
        @NameInMap("InitContainerCommands")
        public java.util.List<String> initContainerCommands;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("InitContainerEnvironmentVars")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars;

        /**
         * <p>The ports of the init container.</p>
         */
        @NameInMap("InitContainerPorts")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerPorts> initContainerPorts;

        /**
         * <p>The volumes that are mounted on the init container.</p>
         */
        @NameInMap("InitContainerVolumeMounts")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainersInitContainerVolumeMounts> initContainerVolumeMounts;

        /**
         * <p>The memory size of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>test-init</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The permissions that are granted to the processes in the init container. Valid values: NET_ADMIN and NET_RAW.</p>
         * <blockquote>
         * <p> To use NET_RAW, you must submit a ticket.</p>
         * </blockquote>
         */
        @NameInMap("SecurityContextCapabilityAdds")
        public java.util.List<String> securityContextCapabilityAdds;

        /**
         * <p>Indicates whether the root file system is read-only. Valid value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        public Boolean securityContextReadOnlyRootFilesystem;

        /**
         * <p>The ID of the user that runs the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>587</p>
         */
        @NameInMap("SecurityContextRunAsUser")
        public String securityContextRunAsUser;

        /**
         * <p>The working directory of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local</p>
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
         * <p>The system name of the security context in which the elastic container instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel.msgmax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the security context in which the elastic container instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
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
         * <p>The tag key of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The content of the configuration file (32 KB).</p>
         * 
         * <strong>example:</strong>
         * <p>bGl1bWk=</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The permissions on the ConfigFile volume.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The relative path to the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/</p>
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
         * <p>The paths to configuration files.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        /**
         * <p>The default permissions on the ConfigFile volume.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("ConfigFileVolumeDefaultMode")
        public Integer configFileVolumeDefaultMode;

        /**
         * <p>The size of the disk volume. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DiskVolumeDiskId")
        public String diskVolumeDiskId;

        /**
         * <p>The size of the disk volume. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DiskVolumeDiskSize")
        public Integer diskVolumeDiskSize;

        /**
         * <p>The system type of the disk volume.</p>
         * 
         * <strong>example:</strong>
         * <p>xfs</p>
         */
        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        /**
         * <p>The storage medium of the emptyDir volume. If you do not specify a storage medium for the emptyDir volume, the volume stores data in the file system of a node by default. We recommend that you set this parameter to memory. In this case, the emptyDir volume stores data in the specified memory.</p>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("EmptyDirVolumeMedium")
        public String emptyDirVolumeMedium;

        /**
         * <p>The storage size of the emptyDir volume.</p>
         * 
         * <strong>example:</strong>
         * <p>256Mi</p>
         */
        @NameInMap("EmptyDirVolumeSizeLimit")
        public String emptyDirVolumeSizeLimit;

        /**
         * <p>The name of the FlexVolume driver.</p>
         * 
         * <strong>example:</strong>
         * <p>flexvolume</p>
         */
        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        /**
         * <p>The type of the mounted file system. The default value is determined by the script of FlexVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>ext4</p>
         */
        @NameInMap("FlexVolumeFsType")
        public String flexVolumeFsType;

        /**
         * <p>The options of the FlexVolume object. Each option is a key-value pair in a JSON string.</p>
         * <p>For example, if you use FlexVolume to mount a disk, the format of Options is <code>{&quot;volumeId&quot;:&quot;d-2zehdahrwoa7srg****&quot;,&quot;performanceLevel&quot;: &quot;PL2&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;volumeId&quot;:&quot;d-2zehdahrwoa7srg****&quot;,&quot;performanceLevel&quot;: &quot;PL2&quot;}</p>
         */
        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        /**
         * <p>The path to the HostPath volume on the host.</p>
         * 
         * <strong>example:</strong>
         * <p>/pod/data</p>
         */
        @NameInMap("HostPathVolumePath")
        public String hostPathVolumePath;

        /**
         * <p>The type of the HostPath volume.</p>
         * 
         * <strong>example:</strong>
         * <p>Directory</p>
         */
        @NameInMap("HostPathVolumeType")
        public String hostPathVolumeType;

        /**
         * <p>The path to the Network File System (NFS) volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/share</p>
         */
        @NameInMap("NFSVolumePath")
        public String NFSVolumePath;

        /**
         * <p>Indicates whether the NFS volume is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NFSVolumeReadOnly")
        public Boolean NFSVolumeReadOnly;

        /**
         * <p>The endpoint of the NFS server.</p>
         * 
         * <strong>example:</strong>
         * <p>3f9cd4a596-naw76.cn-shanghai.nas.aliyuncs.com</p>
         */
        @NameInMap("NFSVolumeServer")
        public String NFSVolumeServer;

        /**
         * <p>The volume name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The volume type. Valid values:</p>
         * <ul>
         * <li>EmptyDirVolume</li>
         * <li>NFSVolume</li>
         * <li>ConfigFileVolume</li>
         * <li>FlexVolume</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EmptyDirVolume</p>
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
         * <p>The Container Registry Enterprise Edition instances.</p>
         */
        @NameInMap("AcrRegistryInfos")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsAcrRegistryInfos> acrRegistryInfos;

        /**
         * <p>The validity period of the scaling configuration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ActiveDeadlineSeconds")
        public Integer activeDeadlineSeconds;

        /**
         * <p>Indicates whether an elastic IP address (EIP) is automatically created and bound to the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoCreateEip")
        public Boolean autoCreateEip;

        /**
         * <p>Indicates whether the image cache is automatically matched. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoMatchImageCache")
        public Boolean autoMatchImageCache;

        /**
         * <p>The name of the elastic container instance or the name of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContainerGroupName")
        public String containerGroupName;

        /**
         * <p>The containers in the elastic container instance.</p>
         */
        @NameInMap("Containers")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsContainers> containers;

        /**
         * <p>Indicates whether the Cost Optimization feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CostOptimization")
        public Boolean costOptimization;

        /**
         * <p>The number of vCPUs that are allocated to the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The number of physical CPU cores. You can specify this parameter for only specific instance types. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Specify CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuOptionsCore")
        public Integer cpuOptionsCore;

        /**
         * <p>The number of threads per core. You can specify this parameter for only specific instance types. A value of 1 indicates that Hyper-Threading is disabled. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Specify CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuOptionsThreadsPerCore")
        public Integer cpuOptionsThreadsPerCore;

        /**
         * <p>The time at which the scaling configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-14T10:58Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The bucket that caches data.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DataCacheBucket")
        public String dataCacheBucket;

        /**
         * <p>Indicates whether the Performance Burst feature is enabled for the ESSD AutoPL disk that caches data. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> For more information about ESSD AutoPL disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DataCacheBurstingEnabled")
        public Boolean dataCacheBurstingEnabled;

        /**
         * <p>The performance level (PL) of the cloud disk that caches data. We recommend that you use enhanced SSDs (ESSDs). Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about ESSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("DataCachePL")
        public String dataCachePL;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk that caches data. Valid values: 0 to min{50,000, 1000 x <em>Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50</em> x Capacity, 50,000}.</p>
         * <blockquote>
         * <p> For more information about ESSD AutoPL disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("DataCacheProvisionedIops")
        public Integer dataCacheProvisionedIops;

        /**
         * <blockquote>
         * <p> This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This is an example.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IP addresses of the Domain Name Service (DNS) server.</p>
         */
        @NameInMap("DnsConfigNameServers")
        public java.util.List<String> dnsConfigNameServers;

        /**
         * <p>The objects. Each object is a name-value pair. The value is optional.</p>
         */
        @NameInMap("DnsConfigOptions")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsDnsConfigOptions> dnsConfigOptions;

        /**
         * <p>The search domains of the DNS server.</p>
         */
        @NameInMap("DnsConfigSearches")
        public java.util.List<String> dnsConfigSearches;

        /**
         * <p>The Domain Name System (DNS) policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("DnsPolicy")
        public String dnsPolicy;

        /**
         * <p>The maximum outbound bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("EgressBandwidth")
        public Long egressBandwidth;

        /**
         * <p>The bandwidth of the EIP. Default value: 5. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("EipBandwidth")
        public Integer eipBandwidth;

        /**
         * <p>The size of the temporary storage space. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EphemeralStorage")
        public Integer ephemeralStorage;

        /**
         * <p>The hostname aliases in a container.</p>
         */
        @NameInMap("HostAliases")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsHostAliases> hostAliases;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;hehe.com\&quot;, \&quot;haha.com\&quot;]</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The image repositories.</p>
         */
        @NameInMap("ImageRegistryCredentials")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsImageRegistryCredentials> imageRegistryCredentials;

        /**
         * <p>The ID of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-2zebxkiifuyzzlhl****</p>
         */
        @NameInMap("ImageSnapshotId")
        public String imageSnapshotId;

        /**
         * <p>The maximum inbound bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("IngressBandwidth")
        public Long ingressBandwidth;

        /**
         * <p>The init containers.</p>
         */
        @NameInMap("InitContainers")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsInitContainers> initContainers;

        /**
         * <p>The level of the instance family, which is used to filter instance types that meet the specified criteria. This parameter takes effect only if <code>CostOptimization</code> is set to true. Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry level (shared instance types) Instance types of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. This level is suitable for business scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * <li>CreditEntryLevel: credit entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The specified ECS instance types. You can specify up to five instance types.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The number of IPv6 addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The status of the scaling configuration in the scaling group. Valid values:</p>
         * <ul>
         * <li>Active: The scaling configuration is active in the scaling group. Auto Scaling uses the active scaling configuration to automatically create elastic container instances.</li>
         * <li>Inactive: The scaling configuration is inactive in the scaling group. Inactive scaling configurations are retained in scaling groups. However, Auto Scaling does not use inactive scaling groups to create elastic container instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The weight of the elastic container instance as a backend server. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The memory size.</p>
         * <p>You can specify CPU and Memory at the same time to filter instance types. For example, if you set CPU to 2 and Memory to 16, all instance types that have 2 vCPUs and 16 GiB memory are returned. Then, Auto Scaling determines the available instance types based on factors such as the I/O optimization requirements and zones and preferentially uses the lowest-priced instance type to create instances.</p>
         * <blockquote>
         * <p> You can specify CPU and Memory to filter instance types only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The endpoints of the Network Time Protocol (NTP) server.</p>
         */
        @NameInMap("NtpServers")
        public java.util.List<String> ntpServers;

        /**
         * <p>The Resource Access Management (RAM) role of the elastic container instance. Elastic container instances and Elastic Compute Service (ECS) instances can share the same RAM role. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use the instance RAM role by calling APIs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ram:PassRole</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The region ID of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-8db03793gfrz****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The restart policy of the elastic container instance. Valid values:</p>
         * <ul>
         * <li>Never: The elastic container instance is never restarted.</li>
         * <li>Always: The elastic container instance is always restarted.</li>
         * <li>OnFailure: The elastic container instance is restarted upon failures.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Never</p>
         */
        @NameInMap("RestartPolicy")
        public String restartPolicy;

        /**
         * <p>The ID of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp1ezrfgoyn5kijl****</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        /**
         * <p>The name of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>scalingconfi****</p>
         */
        @NameInMap("ScalingConfigurationName")
        public String scalingConfigurationName;

        /**
         * <p>The region ID of the scaling group to which the scaling configuration belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp17pelvl720x3v7****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The system information of the security context in which the elastic container instance runs.</p>
         */
        @NameInMap("SecurityContextSysCtls")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsSecurityContextSysCtls> securityContextSysCtls;

        /**
         * <p>The ID of the security group with which the elastic container instance is associated. Elastic container instances that are associated with the same security group can access each other.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp18kz60mefs****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <blockquote>
         * <p> This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("SlsEnable")
        public Boolean slsEnable;

        /**
         * <p>The maximum hourly price for the preemptible elastic container instance.</p>
         * <p>This parameter is returned only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The bidding policy for the instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is created as a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The tags of the elastic container instance. The tags are specified in the key-value format.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEciScalingConfigurationsResponseBodyScalingConfigurationsTags> tags;

        /**
         * <p>The buffer time during which a program handles operations before the program stops.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        /**
         * <p>The volumes.</p>
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
