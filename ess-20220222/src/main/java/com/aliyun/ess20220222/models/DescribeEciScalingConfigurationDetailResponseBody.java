// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeEciScalingConfigurationDetailResponseBody extends TeaModel {
    /**
     * <p>The YAML output content of the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: apps/v1
     * kind: Deployment
     * metadata:
     *   name: nginx-deployment
     *   labels:
     *     app: nginx
     *   spec:
     *     replicas: 3
     *     selector:
     *        matchLabels:
     *         app: nginx
     *     template:
     *       metadata:
     *         labels:
     *           app: nginx
     *         annotations:
     *           k8s.aliyun.com/eip-bandwidth: 10
     *           k8s.aliyun.com/eci-with-eip: true
     *         spec:
     *           containers:
     *           - name: nginx
     *             image: nginx:1.14.2
     *             ports:
     *             - containerPort: 80</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF9BFEE-FE07-4627-B8FB-14326FB9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scaling configuration information.</p>
     */
    @NameInMap("ScalingConfiguration")
    public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration scalingConfiguration;

    public static DescribeEciScalingConfigurationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciScalingConfigurationDetailResponseBody self = new DescribeEciScalingConfigurationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEciScalingConfigurationDetailResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public DescribeEciScalingConfigurationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEciScalingConfigurationDetailResponseBody setScalingConfiguration(DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
        return this;
    }
    public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos extends TeaModel {
        /**
         * <p>The domain names of the ACR Enterprise instance. By default, all domain names of the instance are used. You can specify specific domain names and separate multiple domain names with commas (,).</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The instance ID of the ACR Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-nwj395hgf6f3****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ACR Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region to which the ACR Enterprise instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fieldPath</p>
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

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars setFieldRefFieldPath(String fieldRefFieldPath) {
            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8083</p>
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

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts extends TeaModel {
        /**
         * <p>The directory where the data volume is mounted in the container.</p>
         * <blockquote>
         * <p>Notice: The content in the mount directory of the container is directly overwritten by the content of the volume. Use this parameter with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/pod/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the data volume. Mount propagation allows volumes mounted by a container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: the volume does not perceive any subsequent mount operations performed on the volume or its subdirectories.</li>
         * <li>HostToCotainer: the volume perceives subsequent mount operations performed on the volume or its subdirectories.</li>
         * <li>Bidirectional: similar to HostToCotainer, the volume perceives mount operations. Additionally, the volume is propagated back to the host and to all containers of all pods that use the same volume.
         * Default value: None.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the mounted data volume.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the data volume is read-only.
         * Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subpath of the data volume.</p>
         * 
         * <strong>example:</strong>
         * <p>data2/</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers extends TeaModel {
        /**
         * <p>The startup arguments for the container.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup commands for the container.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variable information.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The container image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.aliyuncs.com/eci_open/alpine:3.5</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pull policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The commands executed in the container when the postStart callback function is configured by using the command line.</p>
         */
        @NameInMap("LifecyclePostStartHandlerExecs")
        public java.util.List<String> lifecyclePostStartHandlerExecs;

        /**
         * <p>The host address that receives HTTP GET requests when the postStart callback function is configured by using HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <p>The path checked by HTTP GET requests when the postStart callback function is configured by using HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <p>The port number checked by HTTP GET requests when the postStart callback function is configured by using HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <p>The protocol type used for HTTP GET requests when the postStart callback function is configured by using HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        /**
         * <p>The host address checked by TCP sockets when the postStart callback function is configured by using TCP sockets.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <p>The port checked by TCP sockets when the postStart callback function is configured by using TCP sockets.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        /**
         * <p>The commands executed in the container when the preStop callback function is configured by using the command line.</p>
         */
        @NameInMap("LifecyclePreStopHandlerExecs")
        public java.util.List<String> lifecyclePreStopHandlerExecs;

        /**
         * <p>The host address that receives HTTP GET requests when the preStop callback function is configured by using HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <p>The path checked by HTTP GET requests when the preStop callback function is configured by using HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <p>The port number checked by HTTP GET requests when the preStop callback function is configured by using HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <p>The protocol type used for HTTP GET requests when the preStop callback function is configured by using HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        /**
         * <p>The host address checked by TCP sockets when the preStop callback function is configured by using TCP sockets.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <p>The port checked by TCP sockets when the preStop callback function is configured by using TCP sockets.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The commands executed in the container when command-line health checks are performed.</p>
         */
        @NameInMap("LivenessProbeExecCommands")
        public java.util.List<String> livenessProbeExecCommands;

        /**
         * <p>The minimum consecutive failures for the readiness probe to be considered failed after having succeeded.
         * Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LivenessProbeFailureThreshold")
        public Integer livenessProbeFailureThreshold;

        /**
         * <p>The path for the HTTP GET readiness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/nginx/</p>
         */
        @NameInMap("LivenessProbeHttpGetPath")
        public String livenessProbeHttpGetPath;

        /**
         * <p>The port for the HTTP GET liveness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("LivenessProbeHttpGetPort")
        public Integer livenessProbeHttpGetPort;

        /**
         * <p>The protocol type of the HTTP GET request when HTTP requests are used for health checks. Valid values:</p>
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
         * <p>The delay before the readiness probe is initiated after the container starts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LivenessProbeInitialDelaySeconds")
        public Integer livenessProbeInitialDelaySeconds;

        /**
         * <p>The interval at which the liveness probe is performed. Default value: 10 seconds. Minimum value: 1 second.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("LivenessProbePeriodSeconds")
        public Integer livenessProbePeriodSeconds;

        /**
         * <p>The minimum consecutive successes for the probe to be considered successful after having failed. Default value: 1. The current value must be 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LivenessProbeSuccessThreshold")
        public Integer livenessProbeSuccessThreshold;

        /**
         * <p>The port number for the TCP socket liveness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LivenessProbeTcpSocketPort")
        public Integer livenessProbeTcpSocketPort;

        /**
         * <p>The timeout period for the liveness probe. Default value: 1 second. Minimum value: 1 second.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LivenessProbeTimeoutSeconds")
        public Integer livenessProbeTimeoutSeconds;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The exposed ports and protocols.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts> ports;

        /**
         * <p>The commands executed in the container when command-line health checks are performed.</p>
         */
        @NameInMap("ReadinessProbeExecCommands")
        public java.util.List<String> readinessProbeExecCommands;

        /**
         * <p>The minimum consecutive failures for the readiness probe to be considered failed after having succeeded.
         * Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReadinessProbeFailureThreshold")
        public Integer readinessProbeFailureThreshold;

        /**
         * <p>The path for the HTTP GET readiness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local</p>
         */
        @NameInMap("ReadinessProbeHttpGetPath")
        public String readinessProbeHttpGetPath;

        /**
         * <p>The path for the HTTP GET readiness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ReadinessProbeHttpGetPort")
        public Integer readinessProbeHttpGetPort;

        /**
         * <p>The protocol type of the HTTP GET request when HTTP requests are used for health checks. Valid values:</p>
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
         * <p>The delay before the readiness probe is initiated after the container starts.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadinessProbeInitialDelaySeconds")
        public Integer readinessProbeInitialDelaySeconds;

        /**
         * <p>The interval at which the readiness probe is performed. Default value: 10 seconds. Minimum value: 1 second.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadinessProbePeriodSeconds")
        public Integer readinessProbePeriodSeconds;

        /**
         * <p>The minimum consecutive successes for the probe to be considered successful after having failed. Default value: 1. The current value must be 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadinessProbeSuccessThreshold")
        public Integer readinessProbeSuccessThreshold;

        /**
         * <p>The port number for the TCP socket liveness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ReadinessProbeTcpSocketPort")
        public Integer readinessProbeTcpSocketPort;

        /**
         * <p>The timeout period for the readiness probe. Default value: 1 second. Minimum value: 1 second.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadinessProbeTimeoutSeconds")
        public Integer readinessProbeTimeoutSeconds;

        /**
         * <p>Grants specific permissions to processes in the container. Currently, only NET_ADMIN and NET_RAW are supported.</p>
         */
        @NameInMap("SecurityContextCapabilityAdds")
        public java.util.List<String> securityContextCapabilityAdds;

        /**
         * <p>Specifies whether the root file system is read-only. Only true is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        public Boolean securityContextReadOnlyRootFilesystem;

        /**
         * <p>The UID used to run the entrypoint of the container process.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SecurityContextRunAsUser")
        public Long securityContextRunAsUser;

        /**
         * <p>Specifies whether to allocate a buffer for standard input during container runtime. If this parameter is not set, reading from standard input in the container results in an EOF. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether the standard input stream remains in the enabling status across multiple attached sessions when standard input is set to true.</p>
         * <p>If StdinOnce is set to true, standard input is opened when the container starts, remains empty until the first client attaches to it, and then stays in the enabling status to accept data until the client disconnects. After the client disconnects, standard input enters shutdown and remains in shutdown until the container is restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Specifies whether to enable interaction. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.
         * For example, if Command is set to /bin/bash, set this parameter to true.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>The volume mounts.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory in the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/nginx</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setEnvironmentVars(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePostStartHandlerExecs(java.util.List<String> lifecyclePostStartHandlerExecs) {
            this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExecs() {
            return this.lifecyclePostStartHandlerExecs;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePreStopHandlerExecs(java.util.List<String> lifecyclePreStopHandlerExecs) {
            this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExecs() {
            return this.lifecyclePreStopHandlerExecs;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeExecCommands(java.util.List<String> livenessProbeExecCommands) {
            this.livenessProbeExecCommands = livenessProbeExecCommands;
            return this;
        }
        public java.util.List<String> getLivenessProbeExecCommands() {
            return this.livenessProbeExecCommands;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeFailureThreshold(Integer livenessProbeFailureThreshold) {
            this.livenessProbeFailureThreshold = livenessProbeFailureThreshold;
            return this;
        }
        public Integer getLivenessProbeFailureThreshold() {
            return this.livenessProbeFailureThreshold;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeHttpGetPath(String livenessProbeHttpGetPath) {
            this.livenessProbeHttpGetPath = livenessProbeHttpGetPath;
            return this;
        }
        public String getLivenessProbeHttpGetPath() {
            return this.livenessProbeHttpGetPath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeHttpGetPort(Integer livenessProbeHttpGetPort) {
            this.livenessProbeHttpGetPort = livenessProbeHttpGetPort;
            return this;
        }
        public Integer getLivenessProbeHttpGetPort() {
            return this.livenessProbeHttpGetPort;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeHttpGetScheme(String livenessProbeHttpGetScheme) {
            this.livenessProbeHttpGetScheme = livenessProbeHttpGetScheme;
            return this;
        }
        public String getLivenessProbeHttpGetScheme() {
            return this.livenessProbeHttpGetScheme;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeInitialDelaySeconds(Integer livenessProbeInitialDelaySeconds) {
            this.livenessProbeInitialDelaySeconds = livenessProbeInitialDelaySeconds;
            return this;
        }
        public Integer getLivenessProbeInitialDelaySeconds() {
            return this.livenessProbeInitialDelaySeconds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbePeriodSeconds(Integer livenessProbePeriodSeconds) {
            this.livenessProbePeriodSeconds = livenessProbePeriodSeconds;
            return this;
        }
        public Integer getLivenessProbePeriodSeconds() {
            return this.livenessProbePeriodSeconds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeSuccessThreshold(Integer livenessProbeSuccessThreshold) {
            this.livenessProbeSuccessThreshold = livenessProbeSuccessThreshold;
            return this;
        }
        public Integer getLivenessProbeSuccessThreshold() {
            return this.livenessProbeSuccessThreshold;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeTcpSocketPort(Integer livenessProbeTcpSocketPort) {
            this.livenessProbeTcpSocketPort = livenessProbeTcpSocketPort;
            return this;
        }
        public Integer getLivenessProbeTcpSocketPort() {
            return this.livenessProbeTcpSocketPort;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setLivenessProbeTimeoutSeconds(Integer livenessProbeTimeoutSeconds) {
            this.livenessProbeTimeoutSeconds = livenessProbeTimeoutSeconds;
            return this;
        }
        public Integer getLivenessProbeTimeoutSeconds() {
            return this.livenessProbeTimeoutSeconds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setPorts(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersPorts> getPorts() {
            return this.ports;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeExecCommands(java.util.List<String> readinessProbeExecCommands) {
            this.readinessProbeExecCommands = readinessProbeExecCommands;
            return this;
        }
        public java.util.List<String> getReadinessProbeExecCommands() {
            return this.readinessProbeExecCommands;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeFailureThreshold(Integer readinessProbeFailureThreshold) {
            this.readinessProbeFailureThreshold = readinessProbeFailureThreshold;
            return this;
        }
        public Integer getReadinessProbeFailureThreshold() {
            return this.readinessProbeFailureThreshold;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeHttpGetPath(String readinessProbeHttpGetPath) {
            this.readinessProbeHttpGetPath = readinessProbeHttpGetPath;
            return this;
        }
        public String getReadinessProbeHttpGetPath() {
            return this.readinessProbeHttpGetPath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeHttpGetPort(Integer readinessProbeHttpGetPort) {
            this.readinessProbeHttpGetPort = readinessProbeHttpGetPort;
            return this;
        }
        public Integer getReadinessProbeHttpGetPort() {
            return this.readinessProbeHttpGetPort;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeHttpGetScheme(String readinessProbeHttpGetScheme) {
            this.readinessProbeHttpGetScheme = readinessProbeHttpGetScheme;
            return this;
        }
        public String getReadinessProbeHttpGetScheme() {
            return this.readinessProbeHttpGetScheme;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeInitialDelaySeconds(Integer readinessProbeInitialDelaySeconds) {
            this.readinessProbeInitialDelaySeconds = readinessProbeInitialDelaySeconds;
            return this;
        }
        public Integer getReadinessProbeInitialDelaySeconds() {
            return this.readinessProbeInitialDelaySeconds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbePeriodSeconds(Integer readinessProbePeriodSeconds) {
            this.readinessProbePeriodSeconds = readinessProbePeriodSeconds;
            return this;
        }
        public Integer getReadinessProbePeriodSeconds() {
            return this.readinessProbePeriodSeconds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeSuccessThreshold(Integer readinessProbeSuccessThreshold) {
            this.readinessProbeSuccessThreshold = readinessProbeSuccessThreshold;
            return this;
        }
        public Integer getReadinessProbeSuccessThreshold() {
            return this.readinessProbeSuccessThreshold;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeTcpSocketPort(Integer readinessProbeTcpSocketPort) {
            this.readinessProbeTcpSocketPort = readinessProbeTcpSocketPort;
            return this;
        }
        public Integer getReadinessProbeTcpSocketPort() {
            return this.readinessProbeTcpSocketPort;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setReadinessProbeTimeoutSeconds(Integer readinessProbeTimeoutSeconds) {
            this.readinessProbeTimeoutSeconds = readinessProbeTimeoutSeconds;
            return this;
        }
        public Integer getReadinessProbeTimeoutSeconds() {
            return this.readinessProbeTimeoutSeconds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setSecurityContextCapabilityAdds(java.util.List<String> securityContextCapabilityAdds) {
            this.securityContextCapabilityAdds = securityContextCapabilityAdds;
            return this;
        }
        public java.util.List<String> getSecurityContextCapabilityAdds() {
            return this.securityContextCapabilityAdds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
            this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
            return this;
        }
        public Boolean getSecurityContextReadOnlyRootFilesystem() {
            return this.securityContextReadOnlyRootFilesystem;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setSecurityContextRunAsUser(Long securityContextRunAsUser) {
            this.securityContextRunAsUser = securityContextRunAsUser;
            return this;
        }
        public Long getSecurityContextRunAsUser() {
            return this.securityContextRunAsUser;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setVolumeMounts(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions extends TeaModel {
        /**
         * <p>The variable name of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases extends TeaModel {
        /**
         * <p>The hostnames to add.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The IP address to add.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials extends TeaModel {
        /**
         * <p>The password for the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>yourpaasword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The server address of the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username for the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>yourusername</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
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

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars setFieldRefFieldPath(String fieldRefFieldPath) {
            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
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
         * <p>UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts extends TeaModel {
        /**
         * <p>The directory in the container where the volume is mounted.    </p>
         * <blockquote>
         * <p>The content in the mount directory of the container is directly overwritten by the content of the volume. Use this parameter with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the data volume. Mount propagation allows volumes mounted by a container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: the volume does not perceive any subsequent mount operations performed on the volume or its subdirectories.</li>
         * <li>HostToCotainer: the volume perceives subsequent mount operations performed on the volume or its subdirectories.</li>
         * <li>Bidirectional: similar to HostToCotainer, the volume perceives mount operations. Additionally, the volume is propagated back to the host and to all containers of all pods that use the same volume.
         * Default value: None.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the mounted data volume.</p>
         * 
         * <strong>example:</strong>
         * <p>test-empty</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the mount path is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subpath of the data volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sub/</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers extends TeaModel {
        /**
         * <p>The number of CPU cores for the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

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
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hongkong.aliyuncs.com/eci_open/nginx:alpine</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pull policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The startup arguments for the container.</p>
         */
        @NameInMap("InitContainerArgs")
        public java.util.List<String> initContainerArgs;

        /**
         * <p>The startup commands for the container.</p>
         */
        @NameInMap("InitContainerCommands")
        public java.util.List<String> initContainerCommands;

        /**
         * <p>The environment variables for the init container.</p>
         */
        @NameInMap("InitContainerEnvironmentVars")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars;

        /**
         * <p>The port information for the init container.</p>
         */
        @NameInMap("InitContainerPorts")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts> initContainerPorts;

        /**
         * <p>The array of mount point information for the init container.</p>
         */
        @NameInMap("InitContainerVolumeMounts")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts> initContainerVolumeMounts;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>test-init</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Grants specific permissions to processes in the container. Currently, only NET_ADMIN and NET_RAW are supported.</p>
         */
        @NameInMap("SecurityContextCapabilityAdds")
        public java.util.List<String> securityContextCapabilityAdds;

        /**
         * <p>Specifies whether the root file system is read-only. Only true is supported.</p>
         */
        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        public Boolean securityContextReadOnlyRootFilesystem;

        /**
         * <p>The user ID used to run the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SecurityContextRunAsUser")
        public String securityContextRunAsUser;

        /**
         * <p>The working directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/www</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setInitContainerArgs(java.util.List<String> initContainerArgs) {
            this.initContainerArgs = initContainerArgs;
            return this;
        }
        public java.util.List<String> getInitContainerArgs() {
            return this.initContainerArgs;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setInitContainerCommands(java.util.List<String> initContainerCommands) {
            this.initContainerCommands = initContainerCommands;
            return this;
        }
        public java.util.List<String> getInitContainerCommands() {
            return this.initContainerCommands;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setInitContainerEnvironmentVars(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars) {
            this.initContainerEnvironmentVars = initContainerEnvironmentVars;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars> getInitContainerEnvironmentVars() {
            return this.initContainerEnvironmentVars;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setInitContainerPorts(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts> initContainerPorts) {
            this.initContainerPorts = initContainerPorts;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts> getInitContainerPorts() {
            return this.initContainerPorts;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setInitContainerVolumeMounts(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts> initContainerVolumeMounts) {
            this.initContainerVolumeMounts = initContainerVolumeMounts;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts> getInitContainerVolumeMounts() {
            return this.initContainerVolumeMounts;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setSecurityContextCapabilityAdds(java.util.List<String> securityContextCapabilityAdds) {
            this.securityContextCapabilityAdds = securityContextCapabilityAdds;
            return this;
        }
        public java.util.List<String> getSecurityContextCapabilityAdds() {
            return this.securityContextCapabilityAdds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
            this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
            return this;
        }
        public Boolean getSecurityContextReadOnlyRootFilesystem() {
            return this.securityContextReadOnlyRootFilesystem;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setSecurityContextRunAsUser(String securityContextRunAsUser) {
            this.securityContextRunAsUser = securityContextRunAsUser;
            return this;
        }
        public String getSecurityContextRunAsUser() {
            return this.securityContextRunAsUser;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls extends TeaModel {
        /**
         * <p>The system control parameter name of the security context in which the instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel.msgmax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the contextual security context in which the instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths extends TeaModel {
        /**
         * <p>The content of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>bGl1bWk=</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The directory permissions of the ConfigFileVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/</p>
         */
        @NameInMap("Path")
        public String path;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes extends TeaModel {
        /**
         * <p>The list of configuration file paths.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        /**
         * <p>The default permissions of the ConfigFileVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("ConfigFileVolumeDefaultMode")
        public Integer configFileVolumeDefaultMode;

        /**
         * <p>The ID of the disk volume.</p>
         * 
         * <strong>example:</strong>
         * <p>d-xx</p>
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
         * <p>The file system type of the disk volume.</p>
         * 
         * <strong>example:</strong>
         * <p>xfs</p>
         */
        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        /**
         * <p>The storage medium of the EmptyDirVolume. The default value is empty, which indicates that the node file system is used. If this parameter is set to memory, the memory is used.</p>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("EmptyDirVolumeMedium")
        public String emptyDirVolumeMedium;

        /**
         * <p>The size of the EmptyDir volume.</p>
         * 
         * <strong>example:</strong>
         * <p>256Mi</p>
         */
        @NameInMap("EmptyDirVolumeSizeLimit")
        public String emptyDirVolumeSizeLimit;

        /**
         * <p>The name of the driver used for the FlexVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>flexvolume</p>
         */
        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        /**
         * <p>The mounted file system type. The default value depends on the script of the FlexVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>ext4</p>
         */
        @NameInMap("FlexVolumeFsType")
        public String flexVolumeFsType;

        /**
         * <p>The list of options for the FlexVolume object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;volumeId&quot;:&quot;d-2zehdahrwoa7srg****&quot;,&quot;performanceLevel&quot;: &quot;PL2&quot;}</p>
         */
        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        /**
         * <p>The directory path of the HostPath volume on the host.</p>
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
         * <p>The path of the NFS volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/share</p>
         */
        @NameInMap("NFSVolumePath")
        public String NFSVolumePath;

        /**
         * <p>Specifies whether the NFS volume is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NFSVolumeReadOnly")
        public Boolean NFSVolumeReadOnly;

        /**
         * <p>The address of the NFS server.</p>
         * 
         * <strong>example:</strong>
         * <p>3f9cd4a596-naw76.cn-shanghai.nas.aliyuncs.com</p>
         */
        @NameInMap("NFSVolumeServer")
        public String NFSVolumeServer;

        /**
         * <p>The name of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The volume type. Valid values:</p>
         * <ul>
         * <li>EmptyDirVolume.</li>
         * <li>NFSVolume.</li>
         * <li>ConfigFileVolume.</li>
         * <li>FlexVolume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EmptyDirVolume</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setConfigFileVolumeConfigFileToPaths(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
            this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setConfigFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
            this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
            return this;
        }
        public Integer getConfigFileVolumeDefaultMode() {
            return this.configFileVolumeDefaultMode;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setDiskVolumeDiskId(String diskVolumeDiskId) {
            this.diskVolumeDiskId = diskVolumeDiskId;
            return this;
        }
        public String getDiskVolumeDiskId() {
            return this.diskVolumeDiskId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setDiskVolumeDiskSize(Integer diskVolumeDiskSize) {
            this.diskVolumeDiskSize = diskVolumeDiskSize;
            return this;
        }
        public Integer getDiskVolumeDiskSize() {
            return this.diskVolumeDiskSize;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setDiskVolumeFsType(String diskVolumeFsType) {
            this.diskVolumeFsType = diskVolumeFsType;
            return this;
        }
        public String getDiskVolumeFsType() {
            return this.diskVolumeFsType;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
            this.emptyDirVolumeMedium = emptyDirVolumeMedium;
            return this;
        }
        public String getEmptyDirVolumeMedium() {
            return this.emptyDirVolumeMedium;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
            this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
            return this;
        }
        public String getEmptyDirVolumeSizeLimit() {
            return this.emptyDirVolumeSizeLimit;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setFlexVolumeDriver(String flexVolumeDriver) {
            this.flexVolumeDriver = flexVolumeDriver;
            return this;
        }
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setFlexVolumeFsType(String flexVolumeFsType) {
            this.flexVolumeFsType = flexVolumeFsType;
            return this;
        }
        public String getFlexVolumeFsType() {
            return this.flexVolumeFsType;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setFlexVolumeOptions(String flexVolumeOptions) {
            this.flexVolumeOptions = flexVolumeOptions;
            return this;
        }
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setHostPathVolumePath(String hostPathVolumePath) {
            this.hostPathVolumePath = hostPathVolumePath;
            return this;
        }
        public String getHostPathVolumePath() {
            return this.hostPathVolumePath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setHostPathVolumeType(String hostPathVolumeType) {
            this.hostPathVolumeType = hostPathVolumeType;
            return this;
        }
        public String getHostPathVolumeType() {
            return this.hostPathVolumeType;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setNFSVolumePath(String NFSVolumePath) {
            this.NFSVolumePath = NFSVolumePath;
            return this;
        }
        public String getNFSVolumePath() {
            return this.NFSVolumePath;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setNFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
            this.NFSVolumeReadOnly = NFSVolumeReadOnly;
            return this;
        }
        public Boolean getNFSVolumeReadOnly() {
            return this.NFSVolumeReadOnly;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setNFSVolumeServer(String NFSVolumeServer) {
            this.NFSVolumeServer = NFSVolumeServer;
            return this;
        }
        public String getNFSVolumeServer() {
            return this.NFSVolumeServer;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration extends TeaModel {
        /**
         * <p>The information about the ACR Enterprise instance.</p>
         */
        @NameInMap("AcrRegistryInfos")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos> acrRegistryInfos;

        /**
         * <p>The validity period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ActiveDeadlineSeconds")
        public Integer activeDeadlineSeconds;

        /**
         * <p>Specifies whether the automatic creation of an elastic IP address (EIP) is enabled in order to attach it to the ECI instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoCreateEip")
        public Boolean autoCreateEip;

        /**
         * <p>Specifies whether to automatically match an image cache.
         * Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoMatchImageCache")
        public Boolean autoMatchImageCache;

        /**
         * <p>The computing power category. A value of economy indicates that instances of economy instance types are queried.</p>
         */
        @NameInMap("ComputeCategory")
        public java.util.List<String> computeCategory;

        /**
         * <p>The name of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContainerGroupName")
        public String containerGroupName;

        /**
         * <p>The list of containers included in the instance.</p>
         */
        @NameInMap("Containers")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers> containers;

        /**
         * <p>Specifies whether to enable cost optimization. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CostOptimization")
        public Boolean costOptimization;

        /**
         * <p>The number of vCPUs for the instance. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The number of physical CPU cores. Only specific instance types support custom settings.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuOptionsCore")
        public Integer cpuOptionsCore;

        /**
         * <p>The number of threads per core. Only specific instance types support custom settings. A value of 1 indicates that hyper-threading is disabled. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuOptionsThreadsPerCore")
        public Integer cpuOptionsThreadsPerCore;

        /**
         * <p>The time when the scaling configuration was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-10T02:39:15Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The data cache bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DataCacheBucket")
        public String dataCacheBucket;

        /**
         * <p>Specifies whether to enable the burst feature for the ESSD AutoPL cloud disk used for data caching. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>For more information about ESSD AutoPL cloud disks, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD AutoPL cloud disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DataCacheBurstingEnabled")
        public Boolean dataCacheBurstingEnabled;

        /**
         * <p>The performance level (PL) of the cloud disk used for data caching. We recommend that you use standard SSDs. Valid values for the PL of a standard SSD:</p>
         * <ul>
         * <li>PL0: A single standard SSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single standard SSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single standard SSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single standard SSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about standard SSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">standard SSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("DataCachePL")
        public String dataCachePL;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL cloud disk used for data caching. Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}, where Baseline performance = min{1800 + 50 × Capacity, 50000}.</p>
         * <blockquote>
         * <p>For more information about ESSD AutoPL cloud disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("DataCacheProvisionedIops")
        public Integer dataCacheProvisionedIops;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This is an example.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of IP addresses of the DNS servers.</p>
         */
        @NameInMap("DnsConfigNameServers")
        public java.util.List<String> dnsConfigNameServers;

        /**
         * <p>The DNS configuration options.</p>
         */
        @NameInMap("DnsConfigOptions")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions> dnsConfigOptions;

        /**
         * <p>The list of DNS search domains.</p>
         */
        @NameInMap("DnsConfigSearches")
        public java.util.List<String> dnsConfigSearches;

        /**
         * <p>The DNS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("DnsPolicy")
        public String dnsPolicy;

        /**
         * <p>The outbound bandwidth limit. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10485760</p>
         */
        @NameInMap("EgressBandwidth")
        public Long egressBandwidth;

        /**
         * <p>The bandwidth of the EIP. Default value: 5 Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("EipBandwidth")
        public Integer eipBandwidth;

        /**
         * <p>The existing Internet Shared Bandwidth instance to associate.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1rxai1z4b1an454xl8m</p>
         */
        @NameInMap("EipCommonBandwidthPackage")
        public String eipCommonBandwidthPackage;

        /**
         * <p>The line type of the elastic IP address (EIP). Valid values:</p>
         * <ul>
         * <li>BGP: BGP (Multi-ISP) line. This is the default value.</li>
         * <li>BGP_PRO: BGP (Multi-ISP) Pro line.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("EipISP")
        public String eipISP;

        /**
         * <p>The ID of the IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pippool-bp187arfugi543y1s****</p>
         */
        @NameInMap("EipPublicIpAddressPoolId")
        public String eipPublicIpAddressPoolId;

        /**
         * <p>The size of the ephemeral storage space. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EphemeralStorage")
        public Integer ephemeralStorage;

        /**
         * <p>The custom hostname mappings for a container in the instance.</p>
         */
        @NameInMap("HostAliases")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases> hostAliases;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>hostname</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The image registry information.</p>
         */
        @NameInMap("ImageRegistryCredentials")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials> imageRegistryCredentials;

        /**
         * <p>The ID of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-2zebxkiifuyzzlhl****</p>
         */
        @NameInMap("ImageSnapshotId")
        public String imageSnapshotId;

        /**
         * <p>The inbound bandwidth limit. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("IngressBandwidth")
        public Long ingressBandwidth;

        /**
         * <p>The list of init containers.</p>
         */
        @NameInMap("InitContainers")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers> initContainers;

        /**
         * <p>The instance family level, which is used to filter instance types that meet the requirements. This parameter takes effect only when CostOptimization is enabled. Valid values:</p>
         * <ul>
         * <li>EntryLevel: Entry-level, which refers to shared instance types. This level provides lower costs but cannot guarantee stable computing performance. It is suitable for business scenarios with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: Enterprise-level. This level provides stable performance and dedicated resources, and is suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
         * <li>CreditEntryLevel: Credit-based entry-level, which refers to burstable instances. This level uses CPU credits to maintain computing performance and is suitable for business scenarios with low baseline CPU utilization and occasional CPU usage spikes. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
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
         * <p>The state of the scaling configuration in the scaling group. Valid values:</p>
         * <ul>
         * <li>Active: Active. The scaling group uses active scaling configurations for the automatic creation of Elastic Container Instance (ECI) instances.</li>
         * <li>Inacitve: Inactive. Inactive scaling configurations exist in the scaling group, but the scaling group does not use them for the automatic creation of ECI instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The weight of the ECI instance when it serves as a backend server for load balancing. Valid values: 1 to 100.
         * Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The memory size. Unit: GiB.
         * You can specify both CPU and Memory to define a range of instance types. For example, CPU=2 and Memory=16 defines all instance types that have 2 vCPUs and 16 GiB of memory. Auto Scaling determines the available instance types based on factors such as I/O optimization and zones, and creates the instance with the lowest price.</p>
         * <blockquote>
         * <p>This configuration takes effect only in cost optimization mode and when no instance type is specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The NTP servers.</p>
         */
        @NameInMap("NtpServers")
        public java.util.List<String> ntpServers;

        /**
         * <p>The name of the Resource Access Management (RAM) role for the instance. ECIs and Elastic Compute Service (ECS) instances share the same RAM role. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ram:PassRole</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The region ID of the scaling group to which the scaling rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwozpmmksakq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The restart policy of the pod. Valid values:</p>
         * <ul>
         * <li>Never: no restart.</li>
         * <li>Always: always restart.</li>
         * <li>OnFailure: restart on failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("RestartPolicy")
        public String restartPolicy;

        /**
         * <p>The ID of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-2zec39vg84usxdocme6a</p>
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
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1frlu04fq4zv65b1bh</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The system info of the contextual security context in which the instance runs.</p>
         */
        @NameInMap("SecurityContextSysCtls")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls> securityContextSysCtls;

        /**
         * <p>The ID of the security group to which the Elastic Container Instance (ECI) belongs. ECIs in the same security group can access each other.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp18kz60mefs****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>Specifies whether to enable user log collection. Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SlsEnable")
        public Boolean slsEnable;

        /**
         * <p>The maximum hourly price of the spot instance.
         * This parameter is returned only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The preemption policy of the instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: spot instance with a specified maximum price.</li>
         * <li>SpotAsPriceGo: spot instance whose price is automatically offered by the system based on the current market price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The tag key-value pairs of the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags> tags;

        /**
         * <p>The buffer time for the program to handle operations before shutdown.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        /**
         * <p>The volume information.</p>
         */
        @NameInMap("Volumes")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes> volumes;

        public static DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration self = new DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setAcrRegistryInfos(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos> acrRegistryInfos) {
            this.acrRegistryInfos = acrRegistryInfos;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos> getAcrRegistryInfos() {
            return this.acrRegistryInfos;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }
        public Integer getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setAutoCreateEip(Boolean autoCreateEip) {
            this.autoCreateEip = autoCreateEip;
            return this;
        }
        public Boolean getAutoCreateEip() {
            return this.autoCreateEip;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setAutoMatchImageCache(Boolean autoMatchImageCache) {
            this.autoMatchImageCache = autoMatchImageCache;
            return this;
        }
        public Boolean getAutoMatchImageCache() {
            return this.autoMatchImageCache;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setComputeCategory(java.util.List<String> computeCategory) {
            this.computeCategory = computeCategory;
            return this;
        }
        public java.util.List<String> getComputeCategory() {
            return this.computeCategory;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setContainerGroupName(String containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }
        public String getContainerGroupName() {
            return this.containerGroupName;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setContainers(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers> getContainers() {
            return this.containers;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setCostOptimization(Boolean costOptimization) {
            this.costOptimization = costOptimization;
            return this;
        }
        public Boolean getCostOptimization() {
            return this.costOptimization;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setCpuOptionsCore(Integer cpuOptionsCore) {
            this.cpuOptionsCore = cpuOptionsCore;
            return this;
        }
        public Integer getCpuOptionsCore() {
            return this.cpuOptionsCore;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
            this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
            return this;
        }
        public Integer getCpuOptionsThreadsPerCore() {
            return this.cpuOptionsThreadsPerCore;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDataCacheBucket(String dataCacheBucket) {
            this.dataCacheBucket = dataCacheBucket;
            return this;
        }
        public String getDataCacheBucket() {
            return this.dataCacheBucket;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
            this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
            return this;
        }
        public Boolean getDataCacheBurstingEnabled() {
            return this.dataCacheBurstingEnabled;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDataCachePL(String dataCachePL) {
            this.dataCachePL = dataCachePL;
            return this;
        }
        public String getDataCachePL() {
            return this.dataCachePL;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
            this.dataCacheProvisionedIops = dataCacheProvisionedIops;
            return this;
        }
        public Integer getDataCacheProvisionedIops() {
            return this.dataCacheProvisionedIops;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDnsConfigNameServers(java.util.List<String> dnsConfigNameServers) {
            this.dnsConfigNameServers = dnsConfigNameServers;
            return this;
        }
        public java.util.List<String> getDnsConfigNameServers() {
            return this.dnsConfigNameServers;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDnsConfigOptions(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions> dnsConfigOptions) {
            this.dnsConfigOptions = dnsConfigOptions;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions> getDnsConfigOptions() {
            return this.dnsConfigOptions;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDnsConfigSearches(java.util.List<String> dnsConfigSearches) {
            this.dnsConfigSearches = dnsConfigSearches;
            return this;
        }
        public java.util.List<String> getDnsConfigSearches() {
            return this.dnsConfigSearches;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setDnsPolicy(String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }
        public String getDnsPolicy() {
            return this.dnsPolicy;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setEgressBandwidth(Long egressBandwidth) {
            this.egressBandwidth = egressBandwidth;
            return this;
        }
        public Long getEgressBandwidth() {
            return this.egressBandwidth;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setEipBandwidth(Integer eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setEipCommonBandwidthPackage(String eipCommonBandwidthPackage) {
            this.eipCommonBandwidthPackage = eipCommonBandwidthPackage;
            return this;
        }
        public String getEipCommonBandwidthPackage() {
            return this.eipCommonBandwidthPackage;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setEipISP(String eipISP) {
            this.eipISP = eipISP;
            return this;
        }
        public String getEipISP() {
            return this.eipISP;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setEipPublicIpAddressPoolId(String eipPublicIpAddressPoolId) {
            this.eipPublicIpAddressPoolId = eipPublicIpAddressPoolId;
            return this;
        }
        public String getEipPublicIpAddressPoolId() {
            return this.eipPublicIpAddressPoolId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setEphemeralStorage(Integer ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Integer getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setHostAliases(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationHostAliases> getHostAliases() {
            return this.hostAliases;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setImageRegistryCredentials(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials> imageRegistryCredentials) {
            this.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationImageRegistryCredentials> getImageRegistryCredentials() {
            return this.imageRegistryCredentials;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setImageSnapshotId(String imageSnapshotId) {
            this.imageSnapshotId = imageSnapshotId;
            return this;
        }
        public String getImageSnapshotId() {
            return this.imageSnapshotId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setIngressBandwidth(Long ingressBandwidth) {
            this.ingressBandwidth = ingressBandwidth;
            return this;
        }
        public Long getIngressBandwidth() {
            return this.ingressBandwidth;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setInitContainers(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers> initContainers) {
            this.initContainers = initContainers;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers> getInitContainers() {
            return this.initContainers;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setLoadBalancerWeight(Integer loadBalancerWeight) {
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setNtpServers(java.util.List<String> ntpServers) {
            this.ntpServers = ntpServers;
            return this;
        }
        public java.util.List<String> getNtpServers() {
            return this.ntpServers;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setScalingConfigurationName(String scalingConfigurationName) {
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }
        public String getScalingConfigurationName() {
            return this.scalingConfigurationName;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setSecurityContextSysCtls(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls> securityContextSysCtls) {
            this.securityContextSysCtls = securityContextSysCtls;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls> getSecurityContextSysCtls() {
            return this.securityContextSysCtls;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setSlsEnable(Boolean slsEnable) {
            this.slsEnable = slsEnable;
            return this;
        }
        public Boolean getSlsEnable() {
            return this.slsEnable;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setTags(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags> getTags() {
            return this.tags;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }
        public Integer getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        public DescribeEciScalingConfigurationDetailResponseBodyScalingConfiguration setVolumes(java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes> volumes) {
            this.volumes = volumes;
            return this;
        }
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumes> getVolumes() {
            return this.volumes;
        }

    }

}
