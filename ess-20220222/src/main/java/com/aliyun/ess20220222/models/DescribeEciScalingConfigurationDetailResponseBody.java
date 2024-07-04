// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeEciScalingConfigurationDetailResponseBody extends TeaModel {
    /**
     * <p>The YAML output of the scaling configuration.</p>
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
     * <p>The information about the scaling configuration.</p>
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
         * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. Multiple domain names are separated by commas (,).</p>
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
         * <p> This parameter is not available for use.</p>
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
         * <p>The directory in which the container mounts the volume.</p>
         * <blockquote>
         * <p> Data in this directory is overwritten by the data on the volume. Proceed with caution if you specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/pod/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation enables volumes mounted on one container to be shared among other containers within the same pod or across distinct pods residing on the same node. Valid values:</p>
         * <ul>
         * <li>None: Subsequent mounts executed either on the volume itself or its subdirectories do not propagate to the already established volume mount.</li>
         * <li>HostToCotainer: Subsequent mounts executed either on the volume itself or its subdirectories propagate to the already established volume mount.</li>
         * <li>Bidirectional: This value is similar to HostToCotainer. Subsequent mounts executed either on the volume itself or its subdirectories propagate to the already established volume mount. In addition, any volume mounts executed on the container not only propagate back to the underlying host but also to all containers across every pod that uses the same volume.</li>
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
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the volume is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The arguments that are passed to the container startup commands.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The container startup commands.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs that are allocated to the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variables.</p>
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
         * <p>The image pulling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The commands that are run by using a CLI for configuring the postStart callback function within the container.</p>
         */
        @NameInMap("LifecyclePostStartHandlerExecs")
        public java.util.List<String> lifecyclePostStartHandlerExecs;

        /**
         * <p>The IP address of the host to the HTTP GET requests for configuring the postStart callback function are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <p>The path to the HTTP GET requests for configuring the postStart callback function are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <p>The port over which the HTTP GET requests for configuring the postStart callback function are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <p>The protocol type of the HTTP Get requests that are used for configuring the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        /**
         * <p>The IP address of the host detected by the TCP sockets that are used for configuring the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <p>The port detected by the TCP sockets that are used for configuring the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        /**
         * <p>The commands that are run by using a CLI for configuring the preStop callback function within the container.</p>
         */
        @NameInMap("LifecyclePreStopHandlerExecs")
        public java.util.List<String> lifecyclePreStopHandlerExecs;

        /**
         * <p>The IP address of the host to which the HTTP GET requests for configuring the preStop callback function are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <p>The path to which the HTTP GET requests for configuring the preStop callback function are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <p>The port over which the HTTP GET requests for configuring the preStop callback function are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <p>The protocol type of the HTTP Get requests that are used for configuring the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        /**
         * <p>The IP address of the host detected by the TCP sockets that are used for configuring the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <p>The port detected by the TCP sockets that are used for configuring the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The commands that are run in the container when you use a CLI to perform liveness probes.</p>
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
         * <p>The path to which HTTP Get requests are sent when you use the HTTP requests to perform liveness probes.</p>
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
         * <p>8080</p>
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
         * <p>The number of seconds that elapses from the startup of the container to the start time of a liveness probe.</p>
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
         * <p>The timeout period of a liveness probe. Default value: 1. Minimum value: 1. Unit: seconds.</p>
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
         * <p>The container name.</p>
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
         * <p>The commands that are run in the container when you use a CLI to perform readiness probes.</p>
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
         * <p>80</p>
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
         * <p>The number of seconds that elapses from the startup of the container to the start time of a readiness probe.</p>
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
         * <p>5</p>
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
         * <p>80</p>
         */
        @NameInMap("ReadinessProbeTcpSocketPort")
        public Integer readinessProbeTcpSocketPort;

        /**
         * <p>The timeout period of a readiness probe. Default value: 1. Minimum value: 1. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadinessProbeTimeoutSeconds")
        public Integer readinessProbeTimeoutSeconds;

        /**
         * <p>The permissions that are granted to the processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
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
         * <p>Indicates whether the container allocates buffer resources to standard input streams when the container is running. If this parameter is not specified, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Indicates whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected among multiple sessions.</p>
         * <p>If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Specifies whether to enable the Interaction feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>If the command is a /bin/bash command, the value of this parameter is true.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>The volumes that are mounted to the container.</p>
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
         * <p>The added hostnames.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The added IP address.</p>
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
         * <p>The directory to which the init container mounts the volume.</p>
         * <blockquote>
         * <p> Data in this directory is overwritten by the data on the volume. Proceed with caution if you specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation enables volumes mounted on one container to be shared among other containers within the same pod or across distinct pods residing on the same node. Valid values:</p>
         * <ul>
         * <li>None: Subsequent mounts executed either on the volume itself or its subdirectories do not propagate to the already established volume mount.</li>
         * <li>HostToCotainer: Subsequent mounts executed either on the volume itself or its subdirectories propagate to the already established volume mount.</li>
         * <li>Bidirectional: This value is similar to HostToCotainer. Subsequent mounts executed either on the volume itself or its subdirectories propagate to the already established volume mount. In addition, any volume mounts executed on the container not only propagate back to the underlying host but also to all containers across every pod that uses the same volume.</li>
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
         * <p>The subdirectory of the volume.</p>
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
         * <p>registry-vpc.cn-hongkong.aliyuncs.com/eci_open/nginx:alpine</p>
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
         * <p>The arguments that are passed to the startup commands of the init container.</p>
         */
        @NameInMap("InitContainerArgs")
        public java.util.List<String> initContainerArgs;

        /**
         * <p>The commands that are used to start the init container.</p>
         */
        @NameInMap("InitContainerCommands")
        public java.util.List<String> initContainerCommands;

        /**
         * <p>The environment variables of the init container.</p>
         */
        @NameInMap("InitContainerEnvironmentVars")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars;

        /**
         * <p>The ports of the init container.</p>
         */
        @NameInMap("InitContainerPorts")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerPorts> initContainerPorts;

        /**
         * <p>The volume mounts of the init container.</p>
         */
        @NameInMap("InitContainerVolumeMounts")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainersInitContainerVolumeMounts> initContainerVolumeMounts;

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
         */
        @NameInMap("SecurityContextCapabilityAdds")
        public java.util.List<String> securityContextCapabilityAdds;

        /**
         * <p>Indicates whether the root file system on which the init container runs is read-only. Valid value: true.</p>
         */
        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        public Boolean securityContextReadOnlyRootFilesystem;

        /**
         * <p>The ID of the user that runs the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SecurityContextRunAsUser")
        public String securityContextRunAsUser;

        /**
         * <p>The working directory of the init container.</p>
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
         * <p>The permissions on the ConfigFile volume.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The path to the configuration file.</p>
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
         * <p>The paths to the configuration files.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        /**
         * <p>The default permissions on the ConfigFile volume.</p>
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
         * <p>The system type of the disk volume.</p>
         * 
         * <strong>example:</strong>
         * <p>xfs</p>
         */
        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        /**
         * <p>The storage medium of the emptyDir volume. If you do not specify a storage medium for the emptyDir volume, the volume stores data in the file system of the node by default. We recommend that you set this parameter to memory. In this case, the emptyDir volume stores data in the specified memory.</p>
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
         * <p>The FlexVolume options.</p>
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
         * <p>The information about the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("AcrRegistryInfos")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationAcrRegistryInfos> acrRegistryInfos;

        /**
         * <p>The validity period of the scaling configuration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
         * <p>true</p>
         */
        @NameInMap("AutoMatchImageCache")
        public Boolean autoMatchImageCache;

        /**
         * <p>The computing power types. A value of economy indicates that economic instance types are returned.</p>
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
         * <p>The containers in the elastic container instance.</p>
         */
        @NameInMap("Containers")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationContainers> containers;

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
         * <p>The number of physical CPU cores. You can specify this parameter for only specific instance types.</p>
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
         * <p>The time when the scaling configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-10T02:39:15Z</p>
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
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> For more information about ESSD AutoPL disks, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD AutoPL disks</a>.</p>
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
         * <li>PL0: An ESSD can provide up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can provide up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can provide up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</li>
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
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk that caches data. Valid values: 0 to min{50,000, 1,000 x <em>Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50</em> x Capacity, 50,000}.</p>
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
         * <p>The IP addresses of DNS servers.</p>
         */
        @NameInMap("DnsConfigNameServers")
        public java.util.List<String> dnsConfigNameServers;

        /**
         * <p>The DNS options.</p>
         */
        @NameInMap("DnsConfigOptions")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationDnsConfigOptions> dnsConfigOptions;

        /**
         * <p>The search domains of the DNS servers.</p>
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
         * <p>10485760</p>
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
         * <p>The bound EIP bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1rxai1z4b1an454xl8m</p>
         */
        @NameInMap("EipCommonBandwidthPackage")
        public String eipCommonBandwidthPackage;

        /**
         * <p>The line type of the EIP. Valid values:</p>
         * <ul>
         * <li>BGP: BGP (Multi-ISP) lines</li>
         * <li>BGP_PRO: BGP (Multi-ISP) Pro</li>
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
         * <p>The size of the temporary storage space. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EphemeralStorage")
        public Integer ephemeralStorage;

        /**
         * <p>The custom hostname mappings of a container in the elastic container instance.</p>
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
         * <p>The image repositories.</p>
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
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationInitContainers> initContainers;

        /**
         * <p>The level of the instance family, which is used to filter instance types that meet the specified criteria. This parameter takes effect only if <code>CostOptimization</code> is set to true. Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry level (shared instance types). Instance types of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instance types of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * <li>CreditEntryLevel: credit entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a> of burstable instances.</li>
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
         * <p>The weight of an elastic container instance as a Server Load Balancer (SLB) backend server. Valid values: 1 to 100.</p>
         * <p>Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The memory size. Unit: GiB.</p>
         * <p>You can specify CPU and Memory to define the range of instance types. For example, if you set CPU to 2 and Memory to 16, the instance types that have 2 vCPUs and 16 GiB are returned. If you specify CPU and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones and preferentially creates instances by using the lowest-priced instance type.</p>
         * <blockquote>
         * <p> You can specify CPU and Memory to define instance types only when you set Scaling Policy to Cost Optimization and no instance type is specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The endpoints of the Network Time Protocol (NTP) servers.</p>
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
         * <p>The region ID of the scaling group to which the scaling configuration belongs.</p>
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
         * <p>The restart policy of the container group. Valid values:</p>
         * <ul>
         * <li>Never: The container group is never restarted.</li>
         * <li>Always: The container group is always restarted.</li>
         * <li>OnFailure: The container group is restarted upon failures.</li>
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
         * <p>The system information of the security context in which the elastic container instance is run.</p>
         */
        @NameInMap("SecurityContextSysCtls")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationSecurityContextSysCtls> securityContextSysCtls;

        /**
         * <p>The ID of the security group with which the elastic container instance is associated. Elastic container instances that are associated with the same security group can access each other.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp18kz60mefs****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>Indicates whether user logs are collected. Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SlsEnable")
        public Boolean slsEnable;

        /**
         * <p>The maximum hourly price for the preemptible instance.</p>
         * <p>This parameter is returned only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The preemption policy of the instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is created as a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The tags of the elastic container instance. Tags are specified in the key-value format.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEciScalingConfigurationDetailResponseBodyScalingConfigurationTags> tags;

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
