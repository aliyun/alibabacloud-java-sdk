// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeployK8sApplicationRequest extends TeaModel {
    /**
     * <p>The annotation of an application pod.</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The argument array in the container start-up command. Set this parameter to a JSON array in the format of `["args1","args2"\\]`, where each key is set to a string. If you want to cancel this configuration, set this parameter to an empty JSON array in the format of `"[\\]"`.</p>
     */
    @NameInMap("Args")
    public String args;

    /**
     * <p>The timeout period for an at-a-time release. Unit: seconds.</p>
     */
    @NameInMap("BatchTimeout")
    public Integer batchTimeout;

    /**
     * <p>The minimum time interval for the phased release of pods. For more information, see [minReadySeconds](https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds).</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The build package number of EDAS Container.</p>
     * <br>
     * <p>*   You do not need to set the parameter if you do not need to change the EDAS Container version during the deployment.</p>
     * <p>*   Set the parameter if you need to update the EDAS Container version of the application during the deployment.</p>
     * <br>
     * <p>You can query the build package number by using one of the following methods:</p>
     * <br>
     * <p>*   Call the ListBuildPack operation. For more information, see [ListBuildPack](https://help.aliyun.com/document_detail/423222.html).</p>
     * <p>*   Obtain the value in the **Build package number** column of the [Release notes for EDAS Container](https://help.aliyun.com/document_detail/92614.html) topic. For example, `59` indicates `EDAS Container 3.5.8`.</p>
     */
    @NameInMap("BuildPackId")
    public String buildPackId;

    @NameInMap("CanaryRuleId")
    public String canaryRuleId;

    /**
     * <p>The description of the change process.</p>
     */
    @NameInMap("ChangeOrderDesc")
    public String changeOrderDesc;

    /**
     * <p>The commands that you run to start the container.</p>
     * <br>
     * <p>> If you want to cancel this configuration, set this parameter to an empty string in the format of `""`.</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The configuration for mounting a Kubernetes ConfigMap or Secret to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   name: the name of the Kubernetes ConfigMap or Secret.</p>
     * <p>*   type: the type of the API object that you want to mount. You can mount a Kubernetes ConfigMap or Secret.</p>
     * <p>*   mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</p>
     */
    @NameInMap("ConfigMountDescs")
    public String configMountDescs;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
     */
    @NameInMap("CpuLimit")
    public Integer cpuLimit;

    /**
     * <p>The number of CPU cores requested for each application instance when the application is running. Unit: cores. We recommend that you set this parameter. Value 0 indicates that no limit is set on CPU cores.</p>
     * <br>
     * <p>> You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
     */
    @NameInMap("CpuRequest")
    public Integer cpuRequest;

    /**
     * <p>The affinity configuration of the pod. This parameter takes effect only if both the DeployAcrossNodes and DeployAcrossZones parameters are set to false.</p>
     */
    @NameInMap("CustomAffinity")
    public String customAffinity;

    @NameInMap("CustomAgentVersion")
    public String customAgentVersion;

    /**
     * <p>The scheduling tolerance configuration of the pod. This parameter takes effect only if both the DeployAcrossNodes and DeployAcrossZones parameters are set to false.</p>
     */
    @NameInMap("CustomTolerations")
    public String customTolerations;

    /**
     * <p>Specifies whether to distribute application instances to multiple nodes. Value true indicates that application instances are distrubuted across zones. Other values indicate that application instances are not distributed across zones.</p>
     */
    @NameInMap("DeployAcrossNodes")
    public String deployAcrossNodes;

    /**
     * <p>Specifies whether to distribute application instances across zones. Value true indicates that application instances are distrubuted across zones. Other values indicate that application instances are not distributed across zones.</p>
     */
    @NameInMap("DeployAcrossZones")
    public String deployAcrossZones;

    /**
     * <p>The version of EDAS Container on which the deployment package of the application depends. This parameter is applicable to High-Speed Service Framework (HSF) applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>The configuration for mounting a Kubernetes emptyDir volume to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   mountPath: The mount path in the container. This parameter is required.</p>
     * <p>*   readOnly: (Optional) The mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.</p>
     * <p>*   subPathExpr: (Optional) The regular expression that is used to match the subdirectory.</p>
     */
    @NameInMap("EmptyDirs")
    public String emptyDirs;

    /**
     * <p>Specifies whether to enable access to Application High Availability Service (AHAS).</p>
     */
    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    /**
     * <p>Specifies whether to enable the empty list protection feature. Valid values:</p>
     * <br>
     * <p>*   true: enables the empty list protection feature.</p>
     * <p>*   false: disables the empty list protection feature.</p>
     */
    @NameInMap("EnableEmptyPushReject")
    public Boolean enableEmptyPushReject;

    /**
     * <p>Specifies whether to enable graceful start rules. Valid values:</p>
     * <br>
     * <p>*   true: enables graceful start rules.</p>
     * <p>*   false: disables graceful start rules.</p>
     */
    @NameInMap("EnableLosslessRule")
    public Boolean enableLosslessRule;

    /**
     * <p>The Kubernetes environment variables that are configured in EnvFrom mode. A ConfigMap or Secret is mounted to a directory. Each key corresponds to a file in the directory, and the content of the file is the value of the key.</p>
     * <br>
     * <p>This parameter contains the following parameters:</p>
     * <br>
     * <p>*   configMapRef: the ConfigMap that is referenced. The following parameter is contained:</p>
     * <br>
     * <p>    *   name: the name of the ConfigMap.</p>
     * <br>
     * <p>*   secretRef: the Secret that is referenced. The following parameter is contained:</p>
     * <br>
     * <p>    *   name: the name of the Secret.</p>
     */
    @NameInMap("EnvFroms")
    public String envFroms;

    /**
     * <p>The environment variables that are used to deploy the application. Set this parameter to a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, and Kubernetes Secret environment variables. Specify regular environment variables in the following format:</p>
     * <br>
     * <p>`{"name":"x", "value": "y"}`</p>
     * <br>
     * <p>Specify Kubernetes ConfigMap environment variables in the following format to reference values from ConfigMaps:</p>
     * <br>
     * <p>`{ "name": "x2", "valueFrom": { "configMapKeyRef": { "name": "my-config", "key": "y2" } } }`</p>
     * <br>
     * <p>Specify Kubernetes Secret environment variables in the following format to reference values from Secrets:</p>
     * <br>
     * <p>`{ "name": "x3", "valueFrom": { "secretKeyRef": { "name": "my-secret", "key": "y3" } } }`</p>
     * <br>
     * <p>>  If you want to cancel this configuration, set this parameter to an empty JSON array, which is in the format of "[]".</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The absolute URL of the image. This parameter setting overwrites the setting of the ImageTag parameter.</p>
     */
    @NameInMap("Image")
    public String image;

    @NameInMap("ImagePlatforms")
    public String imagePlatforms;

    /**
     * <p>The tag of the image.</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("InitContainers")
    public String initContainers;

    /**
     * <p>The version of the Java Development Kit (JDK) on which the deployment package of the application depends. Open JDK 7 and Open JDK 8 are supported. This parameter is unavailable if you deploy applications by using images.</p>
     */
    @NameInMap("JDK")
    public String JDK;

    /**
     * <p>The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Proper parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering `""` or `"{}"`.</p>
     */
    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    /**
     * <p>The label of an application pod.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the ephemeral storage space.</p>
     */
    @NameInMap("LimitEphemeralStorage")
    public Integer limitEphemeralStorage;

    /**
     * <p>The configuration for the liveness check on the container. Example: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"tcpSocket":{"host":"", "port":8080}}`. If you want to cancel this configuration, set this parameter to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The configurations that are used when the host files are mounted to the container on which the application is running. Example: `[{"type":"","nodePath":"/localfiles","mountPath":"/app/files"},{"type":"Directory","nodePath":"/mnt","mountPath":"/app/storage"}\\]`. The nodePath parameter specifies the host path, the mountPath parameter specifies the path within the container, and the type parameter specifies the mounting type.</p>
     */
    @NameInMap("LocalVolume")
    public String localVolume;

    /**
     * <p>Specifies whether to enable Graceful Rolling Release and configure Complete Service Registration before Readiness Probing. Valid values:</p>
     * <br>
     * <p>*   true: If you turn on the switch, the system uses the /health path and provides port 55199 for the health check. The system does not intrude into the application. When the service is registered, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</p>
     * <br>
     * <p>> If you set both the LosslessRuleRelated parameter and this parameter to true, the operation checks whether the service prefetching is complete.</p>
     * <br>
     * <p>*   false: If you turn off the switch, the system does not provide a port to check whether the service is registered.</p>
     */
    @NameInMap("LosslessRuleAligned")
    public Boolean losslessRuleAligned;

    /**
     * <p>The delay of service registration. Valid values: 0 to 86400. Unit: seconds.</p>
     */
    @NameInMap("LosslessRuleDelayTime")
    public Integer losslessRuleDelayTime;

    /**
     * <p>The number of prefetching curves. Valid values: 0 to 20. The default value is 2, which is suitable for common prefetching scenarios. This value indicates that the received traffic amount of the provider during prefetching is displayed as a quadratic curve.</p>
     */
    @NameInMap("LosslessRuleFuncType")
    public Integer losslessRuleFuncType;

    /**
     * <p>Specifies whether to enable Graceful Rolling Release and configure Complete Service Prefetching before Readiness Probing. Valid values:</p>
     * <br>
     * <p>*   true: If you turn on the switch, the system uses the /health path and provides port 55199 for the health check. The system does not intrude into the application. When service prefetching is complete, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</p>
     * <p>*   false: If you turn off the switch, the system does not provide a port to check whether service prefetching is complete.</p>
     */
    @NameInMap("LosslessRuleRelated")
    public Boolean losslessRuleRelated;

    /**
     * <p>The service prefetching duration. Valid values: 0 to 86400. Unit: seconds.</p>
     */
    @NameInMap("LosslessRuleWarmupTime")
    public Integer losslessRuleWarmupTime;

    /**
     * <p>The maximum number of CPU cores allowed. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
     */
    @NameInMap("McpuLimit")
    public Integer mcpuLimit;

    /**
     * <p>The minimum number of CPU cores required. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
     * <br>
     * <p>> You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
     */
    @NameInMap("McpuRequest")
    public Integer mcpuRequest;

    /**
     * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. Value 0 indicates that no limit is set on the memory size.</p>
     */
    @NameInMap("MemoryLimit")
    public Integer memoryLimit;

    /**
     * <p>The size of memory requested for each application instance when the application is running. Unit: MB. We recommend that you set this parameter. If you do not want to apply for a memory quota, set this parameter to 0.</p>
     * <br>
     * <p>> You must set this parameter together with the MemoryLimit parameter. Make sure that the value of this parameter does not exceed that of the MemoryLimit parameter.</p>
     */
    @NameInMap("MemoryRequest")
    public Integer memoryRequest;

    /**
     * <p>The description of the NAS mounting configuration. Set this parameter to a serialized JSON string. Example: `[{"nasPath": "/k8s","mountPath": "/mnt"},{"nasPath": "/files","mountPath": "/app/files"}\\]`. The nasPath parameter specifies the file storage path, and the mountPath parameter specifies the path to mount the file system to the container in which the application is running.</p>
     */
    @NameInMap("MountDescs")
    public String mountDescs;

    /**
     * <p>The ID of the Apsara File Storage NAS (NAS) file system mounted to the container in which the application is running. The NAS file system must be in the same region as the cluster. The NAS file system must have an available mount target, or have a mount target on the vSwitch in the virtual private cloud (VPC) in which the application resides. If you do not specify this parameter but specify the MountDescs parameter, a NAS file system is automatically purchased and mounted to the vSwitch in the VPC.</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.</p>
     * <br>
     * <p>> The version of EDAS SDK for Java or Python must be V2.44.0 or later.</p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application. You must specify a version.</p>
     * <br>
     * <p>> The version of EDAS SDK for Java or Python must be V2.44.0 or later.</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The version ID of the deployment package.</p>
     */
    @NameInMap("PackageVersionId")
    public String packageVersionId;

    /**
     * <p>The post-start script. Example: `{"exec":{"command":["cat","/etc/group"\\]}}`. If you want to cancel this configuration, set this parameter to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The pre-stop script. Example: `{"tcpSocket":{"host":"", "port":8080}}`. If you want to cancel this configuration, set this parameter to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC) to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   pvcName: the name of the PVC. Make sure that the volume exists and is in the Bound state.</p>
     * <br>
     * <p>*   mountPaths: the directory to which you want to mount the PVC. You can configure multiple directories. You can set the following two parameters for each mount directory:</p>
     * <br>
     * <p>    *   mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</p>
     * <p>    *   readOnly: the mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.</p>
     */
    @NameInMap("PvcMountDescs")
    public String pvcMountDescs;

    /**
     * <p>The configuration for the readiness check on the container. If the check fails, the traffic that passes through the Kubernetes service is not transmitted to the container. Example: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"httpGet": {"path": "/consumer","port": 8080,"scheme": "HTTP","httpHeaders": [{"name": "test","value": "testvalue"}\\]}}`. If you want to cancel this configuration, set this parameter to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    /**
     * <p>The number of application instances. The minimum value is 0.</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the ephemeral storage space.</p>
     */
    @NameInMap("RequestsEphemeralStorage")
    public Integer requestsEphemeralStorage;

    /**
     * <p>The type of the container runtime. Valid values:</p>
     * <br>
     * <p>*   runc: standard container runtime</p>
     * <p>*   runv: sandboxed container runtime</p>
     * <br>
     * <p>This parameter is applicable only to clusters that use sandboxed containers.</p>
     */
    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    @NameInMap("Sidecars")
    public String sidecars;

    /**
     * <p>The Logstore configuration. If you want to cancel this configuration, leave the parameter value empty by entering `""` or `"{}"`.</p>
     * <br>
     * <p>*   The following parameters are included in the configuration:</p>
     * <br>
     * <p>    *   type: the collection type. Set this parameter to file to specify the file type. Set this parameter to stdout to specify the standard output type.</p>
     * <br>
     * <p>    *   logstore: the name of the Logstore. Make sure that the name of the Logstore is unique in the cluster. The name must comply with the following rules:</p>
     * <br>
     * <p>        *   The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * <p>        *   The name must start and end with a lowercase letter or a digit.</p>
     * <p>        *   The name must be 3 to 63 characters in length. If you leave this parameter empty, the system automatically generates a name.</p>
     * <br>
     * <p>    *   logDir: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (\\*) are supported. The collection path must match the following regular expression: `^/(.+)/(.*)^/$`.</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    @NameInMap("Startup")
    public String startup;

    /**
     * <p>The storage type of the NAS file system.</p>
     * <br>
     * <p>*   Valid values for General-purpose NAS file systems: Capacity and Performance.</p>
     * <p>*   Valid values for Extreme NAS file systems: standard and advance.</p>
     * <br>
     * <p>You can set this parameter only to Performance.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("TerminateGracePeriod")
    public Integer terminateGracePeriod;

    /**
     * <p>The traffic adjustment policy for a canary release.</p>
     */
    @NameInMap("TrafficControlStrategy")
    public String trafficControlStrategy;

    /**
     * <p>The phased release policy.</p>
     * <br>
     * <p>*   Example 1: One instance for a canary release + Two subsequent batches + Automatic batching + 1-minute batch interval.</p>
     * <br>
     * <p>`{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":1},"grayUpdate":{"gray":1}}`</p>
     * <br>
     * <p>*   Example 2: One instance for a canary release + Two subsequent batches + Manual batching.</p>
     * <br>
     * <p>`{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"manual"},"grayUpdate":{"gray":1}}`</p>
     * <br>
     * <p>*   Example 3: Two batches + Automatic batching + 0-minute batch interval.</p>
     * <br>
     * <p>`{"type":"BatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":0}}`</p>
     */
    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    /**
     * <p>The URI encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
     * <br>
     * <p>> If you do not specify this parameter in the application configurations, the default URI encoding scheme in the Tomcat container is applied.</p>
     */
    @NameInMap("UriEncoding")
    public String uriEncoding;

    /**
     * <p>Specifies whether to use the encoding scheme specified in the request body for URI query parameters.</p>
     * <br>
     * <p>> If this parameter is not specified in application configuration, the default value false is applied.</p>
     */
    @NameInMap("UseBodyEncoding")
    public Boolean useBodyEncoding;

    @NameInMap("UserBaseImageUrl")
    public String userBaseImageUrl;

    /**
     * <p>The data volume.</p>
     */
    @NameInMap("VolumesStr")
    public String volumesStr;

    /**
     * <p>The version of the Tomcat container on which the deployment package of the application depends. This parameter is applicable to Spring Cloud and Dubbo applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.</p>
     */
    @NameInMap("WebContainer")
    public String webContainer;

    /**
     * <p>The Tomcat container configuration. If you want to cancel this configuration, set this parameter to `""` or `"{}"`. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   useDefaultConfig: specifies whether to use the default configuration. Value true indicates to use the default configuration. Value false indicates to use the custom configuration. If the default configuration is used, the following parameters do not take effect.</p>
     * <br>
     * <p>*   contextInputType: the type of the access path for the application. Valid values:</p>
     * <br>
     * <p>    *   war: The access path for the application is the name of the WAR package. You do not need to specify a custom path.</p>
     * <p>    *   root: The access path for the application is /. You do not need to specify a custom path.</p>
     * <p>    *   custom: If you select this option, you must specify a custom path for the contextPath parameter.</p>
     * <br>
     * <p>*   contextPath: the custom access path for the application. This parameter is required only when you set the contextInputType parameter to custom.</p>
     * <br>
     * <p>*   httpPort: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is less than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.</p>
     * <br>
     * <p>*   maxThreads: the maximum number of connections in the connection pool. Default value: 400.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**This parameter greatly affects the application performance. We recommend that you set this parameter under professional guidance.</p>
     * <br>
     * <p>*   uriEncoding: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not specify this parameter, the default value ISO-8859-1 is used.</p>
     * <br>
     * <p>*   useBodyEncoding: specifies whether to use the encoding scheme specified in the request body for URI query parameters.</p>
     * <br>
     * <p>*   useAdvancedServerXml: specifies whether to use advanced configurations to customize the `server.xml` file. If the preceding parameter types and specific parameters cannot meet your requirements, you can use advanced configurations to customize the `server.xml` file of Tomcat.</p>
     * <br>
     * <p>*   serverXml: the content of the `server.xml` file customized by using advanced configurations. This parameter takes effect only when you set the useAdvancedServerXml parameter to true.</p>
     */
    @NameInMap("WebContainerConfig")
    public String webContainerConfig;

    public static DeployK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployK8sApplicationRequest self = new DeployK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeployK8sApplicationRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public DeployK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeployK8sApplicationRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public DeployK8sApplicationRequest setBatchTimeout(Integer batchTimeout) {
        this.batchTimeout = batchTimeout;
        return this;
    }
    public Integer getBatchTimeout() {
        return this.batchTimeout;
    }

    public DeployK8sApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public DeployK8sApplicationRequest setBuildPackId(String buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public String getBuildPackId() {
        return this.buildPackId;
    }

    public DeployK8sApplicationRequest setCanaryRuleId(String canaryRuleId) {
        this.canaryRuleId = canaryRuleId;
        return this;
    }
    public String getCanaryRuleId() {
        return this.canaryRuleId;
    }

    public DeployK8sApplicationRequest setChangeOrderDesc(String changeOrderDesc) {
        this.changeOrderDesc = changeOrderDesc;
        return this;
    }
    public String getChangeOrderDesc() {
        return this.changeOrderDesc;
    }

    public DeployK8sApplicationRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public DeployK8sApplicationRequest setConfigMountDescs(String configMountDescs) {
        this.configMountDescs = configMountDescs;
        return this;
    }
    public String getConfigMountDescs() {
        return this.configMountDescs;
    }

    public DeployK8sApplicationRequest setCpuLimit(Integer cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }
    public Integer getCpuLimit() {
        return this.cpuLimit;
    }

    public DeployK8sApplicationRequest setCpuRequest(Integer cpuRequest) {
        this.cpuRequest = cpuRequest;
        return this;
    }
    public Integer getCpuRequest() {
        return this.cpuRequest;
    }

    public DeployK8sApplicationRequest setCustomAffinity(String customAffinity) {
        this.customAffinity = customAffinity;
        return this;
    }
    public String getCustomAffinity() {
        return this.customAffinity;
    }

    public DeployK8sApplicationRequest setCustomAgentVersion(String customAgentVersion) {
        this.customAgentVersion = customAgentVersion;
        return this;
    }
    public String getCustomAgentVersion() {
        return this.customAgentVersion;
    }

    public DeployK8sApplicationRequest setCustomTolerations(String customTolerations) {
        this.customTolerations = customTolerations;
        return this;
    }
    public String getCustomTolerations() {
        return this.customTolerations;
    }

    public DeployK8sApplicationRequest setDeployAcrossNodes(String deployAcrossNodes) {
        this.deployAcrossNodes = deployAcrossNodes;
        return this;
    }
    public String getDeployAcrossNodes() {
        return this.deployAcrossNodes;
    }

    public DeployK8sApplicationRequest setDeployAcrossZones(String deployAcrossZones) {
        this.deployAcrossZones = deployAcrossZones;
        return this;
    }
    public String getDeployAcrossZones() {
        return this.deployAcrossZones;
    }

    public DeployK8sApplicationRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public DeployK8sApplicationRequest setEmptyDirs(String emptyDirs) {
        this.emptyDirs = emptyDirs;
        return this;
    }
    public String getEmptyDirs() {
        return this.emptyDirs;
    }

    public DeployK8sApplicationRequest setEnableAhas(Boolean enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    public DeployK8sApplicationRequest setEnableEmptyPushReject(Boolean enableEmptyPushReject) {
        this.enableEmptyPushReject = enableEmptyPushReject;
        return this;
    }
    public Boolean getEnableEmptyPushReject() {
        return this.enableEmptyPushReject;
    }

    public DeployK8sApplicationRequest setEnableLosslessRule(Boolean enableLosslessRule) {
        this.enableLosslessRule = enableLosslessRule;
        return this;
    }
    public Boolean getEnableLosslessRule() {
        return this.enableLosslessRule;
    }

    public DeployK8sApplicationRequest setEnvFroms(String envFroms) {
        this.envFroms = envFroms;
        return this;
    }
    public String getEnvFroms() {
        return this.envFroms;
    }

    public DeployK8sApplicationRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public DeployK8sApplicationRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public DeployK8sApplicationRequest setImagePlatforms(String imagePlatforms) {
        this.imagePlatforms = imagePlatforms;
        return this;
    }
    public String getImagePlatforms() {
        return this.imagePlatforms;
    }

    public DeployK8sApplicationRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DeployK8sApplicationRequest setInitContainers(String initContainers) {
        this.initContainers = initContainers;
        return this;
    }
    public String getInitContainers() {
        return this.initContainers;
    }

    public DeployK8sApplicationRequest setJDK(String JDK) {
        this.JDK = JDK;
        return this;
    }
    public String getJDK() {
        return this.JDK;
    }

    public DeployK8sApplicationRequest setJavaStartUpConfig(String javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public DeployK8sApplicationRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public DeployK8sApplicationRequest setLimitEphemeralStorage(Integer limitEphemeralStorage) {
        this.limitEphemeralStorage = limitEphemeralStorage;
        return this;
    }
    public Integer getLimitEphemeralStorage() {
        return this.limitEphemeralStorage;
    }

    public DeployK8sApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public DeployK8sApplicationRequest setLocalVolume(String localVolume) {
        this.localVolume = localVolume;
        return this;
    }
    public String getLocalVolume() {
        return this.localVolume;
    }

    public DeployK8sApplicationRequest setLosslessRuleAligned(Boolean losslessRuleAligned) {
        this.losslessRuleAligned = losslessRuleAligned;
        return this;
    }
    public Boolean getLosslessRuleAligned() {
        return this.losslessRuleAligned;
    }

    public DeployK8sApplicationRequest setLosslessRuleDelayTime(Integer losslessRuleDelayTime) {
        this.losslessRuleDelayTime = losslessRuleDelayTime;
        return this;
    }
    public Integer getLosslessRuleDelayTime() {
        return this.losslessRuleDelayTime;
    }

    public DeployK8sApplicationRequest setLosslessRuleFuncType(Integer losslessRuleFuncType) {
        this.losslessRuleFuncType = losslessRuleFuncType;
        return this;
    }
    public Integer getLosslessRuleFuncType() {
        return this.losslessRuleFuncType;
    }

    public DeployK8sApplicationRequest setLosslessRuleRelated(Boolean losslessRuleRelated) {
        this.losslessRuleRelated = losslessRuleRelated;
        return this;
    }
    public Boolean getLosslessRuleRelated() {
        return this.losslessRuleRelated;
    }

    public DeployK8sApplicationRequest setLosslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
        this.losslessRuleWarmupTime = losslessRuleWarmupTime;
        return this;
    }
    public Integer getLosslessRuleWarmupTime() {
        return this.losslessRuleWarmupTime;
    }

    public DeployK8sApplicationRequest setMcpuLimit(Integer mcpuLimit) {
        this.mcpuLimit = mcpuLimit;
        return this;
    }
    public Integer getMcpuLimit() {
        return this.mcpuLimit;
    }

    public DeployK8sApplicationRequest setMcpuRequest(Integer mcpuRequest) {
        this.mcpuRequest = mcpuRequest;
        return this;
    }
    public Integer getMcpuRequest() {
        return this.mcpuRequest;
    }

    public DeployK8sApplicationRequest setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public Integer getMemoryLimit() {
        return this.memoryLimit;
    }

    public DeployK8sApplicationRequest setMemoryRequest(Integer memoryRequest) {
        this.memoryRequest = memoryRequest;
        return this;
    }
    public Integer getMemoryRequest() {
        return this.memoryRequest;
    }

    public DeployK8sApplicationRequest setMountDescs(String mountDescs) {
        this.mountDescs = mountDescs;
        return this;
    }
    public String getMountDescs() {
        return this.mountDescs;
    }

    public DeployK8sApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public DeployK8sApplicationRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public DeployK8sApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public DeployK8sApplicationRequest setPackageVersionId(String packageVersionId) {
        this.packageVersionId = packageVersionId;
        return this;
    }
    public String getPackageVersionId() {
        return this.packageVersionId;
    }

    public DeployK8sApplicationRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public DeployK8sApplicationRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public DeployK8sApplicationRequest setPvcMountDescs(String pvcMountDescs) {
        this.pvcMountDescs = pvcMountDescs;
        return this;
    }
    public String getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    public DeployK8sApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public DeployK8sApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public DeployK8sApplicationRequest setRequestsEphemeralStorage(Integer requestsEphemeralStorage) {
        this.requestsEphemeralStorage = requestsEphemeralStorage;
        return this;
    }
    public Integer getRequestsEphemeralStorage() {
        return this.requestsEphemeralStorage;
    }

    public DeployK8sApplicationRequest setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
        return this;
    }
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    public DeployK8sApplicationRequest setSidecars(String sidecars) {
        this.sidecars = sidecars;
        return this;
    }
    public String getSidecars() {
        return this.sidecars;
    }

    public DeployK8sApplicationRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public DeployK8sApplicationRequest setStartup(String startup) {
        this.startup = startup;
        return this;
    }
    public String getStartup() {
        return this.startup;
    }

    public DeployK8sApplicationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DeployK8sApplicationRequest setTerminateGracePeriod(Integer terminateGracePeriod) {
        this.terminateGracePeriod = terminateGracePeriod;
        return this;
    }
    public Integer getTerminateGracePeriod() {
        return this.terminateGracePeriod;
    }

    public DeployK8sApplicationRequest setTrafficControlStrategy(String trafficControlStrategy) {
        this.trafficControlStrategy = trafficControlStrategy;
        return this;
    }
    public String getTrafficControlStrategy() {
        return this.trafficControlStrategy;
    }

    public DeployK8sApplicationRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public DeployK8sApplicationRequest setUriEncoding(String uriEncoding) {
        this.uriEncoding = uriEncoding;
        return this;
    }
    public String getUriEncoding() {
        return this.uriEncoding;
    }

    public DeployK8sApplicationRequest setUseBodyEncoding(Boolean useBodyEncoding) {
        this.useBodyEncoding = useBodyEncoding;
        return this;
    }
    public Boolean getUseBodyEncoding() {
        return this.useBodyEncoding;
    }

    public DeployK8sApplicationRequest setUserBaseImageUrl(String userBaseImageUrl) {
        this.userBaseImageUrl = userBaseImageUrl;
        return this;
    }
    public String getUserBaseImageUrl() {
        return this.userBaseImageUrl;
    }

    public DeployK8sApplicationRequest setVolumesStr(String volumesStr) {
        this.volumesStr = volumesStr;
        return this;
    }
    public String getVolumesStr() {
        return this.volumesStr;
    }

    public DeployK8sApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public DeployK8sApplicationRequest setWebContainerConfig(String webContainerConfig) {
        this.webContainerConfig = webContainerConfig;
        return this;
    }
    public String getWebContainerConfig() {
        return this.webContainerConfig;
    }

}
