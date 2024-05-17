// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertK8sApplicationRequest extends TeaModel {
    /**
     * <p>The annotation of an application pod.</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The application configuration when the application template is used. Set this parameter to a JSON array.</p>
     */
    @NameInMap("AppConfig")
    public String appConfig;

    /**
     * <p>The name of the application. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 36 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The name of the template used to create the application. If you specify an application template when you create an application, the application template and the AppConfig parameter are used to configure the application. Other configurations are ignored.</p>
     */
    @NameInMap("AppTemplateName")
    public String appTemplateName;

    /**
     * <p>The description of the application.</p>
     */
    @NameInMap("ApplicationDescription")
    public String applicationDescription;

    /**
     * <p>The version of `EDAS Container`. The value of this parameter conflicts with that of the `EdasContainerVersion` parameter. We recommend that you use the `EdasContainerVersion` parameter.</p>
     */
    @NameInMap("BuildPackId")
    public String buildPackId;

    /**
     * <p>The ID of the cluster. You can call the ListCluster operation to query the cluster ID. For more information, see [ListCluster](https://help.aliyun.com/document_detail/154995.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The application startup command. If you specify this parameter, the value of this parameter will replace the startup command in the image.</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments in the command. The parameter value is a JSON array of strings. An example is `[{"argument":"-c"},{"argument":"test"}]`, where `-c` and `test` are two arguments that can be set.</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

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
     * <p>The ID of the repository used to build the image repository. If this parameter is left empty, the default repository provided by EDAS is used. Only the default repository provided by EDAS is supported.</p>
     */
    @NameInMap("ContainerRegistryId")
    public String containerRegistryId;

    /**
     * <p>The ID of the cluster. This parameter is required only when you create the application in a cluster that has not been imported.</p>
     */
    @NameInMap("CsClusterId")
    public String csClusterId;

    /**
     * <p>The custom affinity.</p>
     */
    @NameInMap("CustomAffinity")
    public String customAffinity;

    @NameInMap("CustomAgentVersion")
    public String customAgentVersion;

    /**
     * <p>The custom tolerances.</p>
     */
    @NameInMap("CustomTolerations")
    public String customTolerations;

    /**
     * <p>Specifies whether to distribute application instances across nodes. Value `true` indicates that application instances are distributed across nodes. Other values indicate that application instances are not distributed across nodes.</p>
     */
    @NameInMap("DeployAcrossNodes")
    public String deployAcrossNodes;

    /**
     * <p>Specifies whether to distribute application instances across zones. Value `true` indicates that application instances are distributed across zones. Other values indicate that application instances are not distributed across zones.</p>
     */
    @NameInMap("DeployAcrossZones")
    public String deployAcrossZones;

    /**
     * <p>The version of `EDAS Container` on which the deployment package of the application depends.</p>
     * <br>
     * <p>> This parameter is unavailable if you deploy applications by using images.</p>
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
     * <p>Specifies whether to enable access to Application High Availability Service (AHAS). Valid values:</p>
     * <br>
     * <p>*   true: enables access to AHAS.</p>
     * <p>*   false: does not enable access to AHAS.</p>
     */
    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    /**
     * <p>Specifies whether to activate Alibaba Cloud Service Mesh (ASM). Set this parameter to true only when you create the application in a cluster that has not been imported and you need to use ASM.</p>
     */
    @NameInMap("EnableAsm")
    public Boolean enableAsm;

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
     * <p>The following parameters are included in the configuration:</p>
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
     * <p>The environment variables that are used to deploy the application. The value must be a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, or Kubernetes Secret environment variables. Specify regular environment variables in the following format:</p>
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
     * <p>>  If you want to cancel this configuration, set this parameter to an empty JSON array in the format of "[]".</p>
     */
    @NameInMap("Envs")
    public String envs;

    @NameInMap("FeatureConfig")
    public String featureConfig;

    /**
     * <p>Mirror the target platform architecture, which is effective when deployed using war or jar. Enter an example:</p>
     * <br>
     * <p>- Specify x86 64 architecture: Linux/amd64</p>
     * <p>- Specify ARM 64 architecture: Linux/arm64</p>
     * <p>- Specify the construction of dual architecture images: Linux/amd64, Linux/arm64</p>
     * <p>- Do not input: default schema</p>
     */
    @NameInMap("ImagePlatforms")
    public String imagePlatforms;

    /**
     * <p>The URL of the image. This parameter is required if you set the `PackageType` parameter to `Image`.</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Set the initialization container for the application Pod. Support setting the format YAML for container configuration, which is the value of Init container YAML configured with base64 encoding.</p>
     */
    @NameInMap("InitContainers")
    public String initContainers;

    /**
     * <p>The ID of the Internet-facing SLB instance. If you do not specify this parameter, EDAS automatically purchases a new SLB instance for you.</p>
     */
    @NameInMap("InternetSlbId")
    public String internetSlbId;

    /**
     * <p>The frontend port of the Internet-facing SLB instance. Valid values: 1 to 65535.</p>
     */
    @NameInMap("InternetSlbPort")
    public Integer internetSlbPort;

    /**
     * <p>The protocol used by the Internet-facing SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
     */
    @NameInMap("InternetSlbProtocol")
    public String internetSlbProtocol;

    /**
     * <p>The backend port of the internal-facing SLB instance. This port also serves as the service port of the application. Valid values: 1 to 65535.</p>
     */
    @NameInMap("InternetTargetPort")
    public Integer internetTargetPort;

    /**
     * <p>The ID of the internal-facing SLB instance. If you do not specify this parameter, Enterprise Distributed Application Service (EDAS) automatically purchases a new SLB instance for you.</p>
     */
    @NameInMap("IntranetSlbId")
    public String intranetSlbId;

    /**
     * <p>The frontend port of the internal-facing SLB instance. Valid values: 1 to 65535.</p>
     */
    @NameInMap("IntranetSlbPort")
    public Integer intranetSlbPort;

    /**
     * <p>The protocol used by the internal-facing SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
     */
    @NameInMap("IntranetSlbProtocol")
    public String intranetSlbProtocol;

    /**
     * <p>The backend port of the internal-facing Server Load Balancer (SLB) instance. This port also serves as the service port of the application. Valid values: 1 to 65535.</p>
     */
    @NameInMap("IntranetTargetPort")
    public Integer intranetTargetPort;

    /**
     * <p>Specifies whether the application is a multi-language application.</p>
     */
    @NameInMap("IsMultilingualApp")
    public Boolean isMultilingualApp;

    /**
     * <p>The version of the Java Development Kit (JDK) on which the deployment package of the application depends. Valid values: Open JDK 7 and Open JDK 8. This parameter is unavailable if you deploy applications by using images.</p>
     */
    @NameInMap("JDK")
    public String JDK;

    /**
     * <p>The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Appropriate parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering `""` or `"{}"`. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   InitialHeapSize: the initial size of the heap memory.</p>
     * <p>*   MaxHeapSize: the maximum size of the heap memory.</p>
     * <p>*   CustomParams: the custom parameters, such as JVM -D parameters.</p>
     * <p>*   Other parameters: You can view the JSON structure submitted by the frontend.</p>
     */
    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    /**
     * <p>The label of an application pod.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: cores. If the LimitmCpu parameter is specified, you can ignore this parameter.</p>
     */
    @NameInMap("LimitCpu")
    public Integer limitCpu;

    /**
     * <p>The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
     */
    @NameInMap("LimitEphemeralStorage")
    public Integer limitEphemeralStorage;

    /**
     * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value of LimitMem must be greater than that of RequestsMem.</p>
     */
    @NameInMap("LimitMem")
    public Integer limitMem;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: millicores. Value 0 indicates that no limit is set on CPU cores.</p>
     */
    @NameInMap("LimitmCpu")
    public Integer limitmCpu;

    /**
     * <p>The configuration for the liveness check on the container. Example: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"tcpSocket":{"host":"", "port":8080}}`.</p>
     * <br>
     * <p>If you want to cancel this configuration, leave the parameter value empty by entering `""` or `{}`. If you do not specify this parameter, this configuration is ignored.</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The configurations that are used when the host files are mounted to the container on which the application is running. Example: `[{"type":"","nodePath":"/localfiles","mountPath":"/app/files"},{"type":"Directory","nodePath":"/mnt","mountPath":"/app/storage"}\\]`. Description:</p>
     * <br>
     * <p>*   `nodePath`: the host path.</p>
     * <p>*   `mountPath`: the path in the container.</p>
     * <p>*   `type`: the mounting type.</p>
     */
    @NameInMap("LocalVolume")
    public String localVolume;

    /**
     * <p>The ID of the EDAS namespace. This parameter is required for a non-default namespace.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>Specifies whether to enable the graceful rolling deployment mode and ensure that the service is registered before the readiness check. Valid values:</p>
     * <br>
     * <p>*   true: provides port 55199 and the /health path for the health check in a non-intrusive manner. When the service is registered, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**If you set both the `LosslessRuleRelated` parameter and this parameter to `true`, the operation checks whether the service prefetching is complete.</p>
     * <br>
     * <p>*   false: does not check whether the service is registered.</p>
     */
    @NameInMap("LosslessRuleAligned")
    public Boolean losslessRuleAligned;

    /**
     * <p>The delay of service registration. Valid values: 0 to 86400. Unit: seconds.</p>
     */
    @NameInMap("LosslessRuleDelayTime")
    public Integer losslessRuleDelayTime;

    /**
     * <p>The number of prefetching curves. Valid values: 0 to 20. The default value is 2, which is suitable for common prefetching scenarios. This value indicates that the received traffic of the provider during prefetching is displayed as a quadratic curve.</p>
     */
    @NameInMap("LosslessRuleFuncType")
    public Integer losslessRuleFuncType;

    /**
     * <p>Specifies whether to enable the graceful rolling deployment mode and ensure that the service prefetching is complete before the readiness check. Valid values:</p>
     * <br>
     * <p>*   true: provides port 55199 and the /health path for the health check in a non-intrusive manner. When the service prefetching is complete, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</p>
     * <p>*   false: does not check whether the service prefetching is complete.</p>
     */
    @NameInMap("LosslessRuleRelated")
    public Boolean losslessRuleRelated;

    /**
     * <p>The service prefetching duration. Valid values: 0 to 86400. Unit: seconds.</p>
     */
    @NameInMap("LosslessRuleWarmupTime")
    public Integer losslessRuleWarmupTime;

    /**
     * <p>The description of the NAS mounting configuration. Set this parameter to a serialized JSON string. Example: `[{"nasPath": "/k8s","mountPath": "/mnt"},{"nasPath": "/files","mountPath": "/app/files"}\\]`. The `nasPath` parameter specifies the file storage path, and the `mountPath` parameter specifies the path to mount the file system to the container where the application is running.</p>
     */
    @NameInMap("MountDescs")
    public String mountDescs;

    /**
     * <p>The namespace of the Kubernetes cluster. This parameter specifies the Kubernetes namespace in which your application is deployed. By default, the default namespace is used.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the Network Attached Storage (NAS) file system that you want to mount to the application. If you do not specify this parameter but specify the MountDescs parameter, a NAS file system is automatically purchased and mounted to the vSwitch in the VPC.</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The type of the deployment package. Valid values: FatJar, WAR, and Image.</p>
     */
    @NameInMap("PackageType")
    public String packageType;

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
     * <p>The post-start script. Example: `{"exec":{"command":["cat","/etc/group"\\]}}`.</p>
     * <br>
     * <p>If you want to cancel this configuration, leave this parameter empty by setting it to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The pre-stop script. Example: `{"tcpSocket":{"host":"", "port":8080}}`.</p>
     * <br>
     * <p>If you want to cancel this configuration, leave this parameter empty by setting it to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC) volume to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   pvcName: the name of the PVC volume. Make sure that the PVC volume is an existing volume and is in the Bound state.</p>
     * <br>
     * <p>*   mountPaths: the directory to which you want to mount the PVC volume. You can configure multiple directories. You can set the following two parameters for each mount directory:</p>
     * <br>
     * <p>    *   mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</p>
     * <p>    *   readOnly: the mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.</p>
     */
    @NameInMap("PvcMountDescs")
    public String pvcMountDescs;

    /**
     * <p>The configuration for the readiness check on the container. If the check fails, the traffic that passes through the Kubernetes Service is not transmitted to the container. Example: \\`{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"httpGet": {"path": "/consumer","port": 8080,"scheme": "HTTP","httpHeaders": \[{"name": "test","value": "testvalue"}\\\\]}}\\`.``</p>
     * <br>
     * <p>If you want to cancel this configuration, leave the parameter value empty by entering `""` or `{}`. If you do not specify this parameter, this configuration is ignored.</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    /**
     * <p>The number of application instances.</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The ID of the image repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is created. Unit: cores. Value 0 indicates that no limit is set on CPU cores. If the RequestsmCpu parameter is specified, the value of the RequestsmCpu parameter is used. You can ignore this parameter.</p>
     */
    @NameInMap("RequestsCpu")
    public Integer requestsCpu;

    /**
     * <p>The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
     */
    @NameInMap("RequestsEphemeralStorage")
    public Integer requestsEphemeralStorage;

    /**
     * <p>The maximum size of memory allowed for each application instance when the application is created. Unit: MB. Value 0 indicates that no limit is set on the memory size. The value of RequestsMem cannot be greater than that of LimitMem.</p>
     */
    @NameInMap("RequestsMem")
    public Integer requestsMem;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is created. Unit: millicores.</p>
     */
    @NameInMap("RequestsmCpu")
    public Integer requestsmCpu;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the container runtime. This parameter is applicable only to clusters that use sandboxed containers.</p>
     */
    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    /**
     * <p>The name of the credential that is used to pull the images specified by the user. You must configure the Secret.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The configurations of services in a Kubernetes cluster.</p>
     */
    @NameInMap("ServiceConfigs")
    public String serviceConfigs;

    /**
     * <p>Set up a Sidecar container for the application Pod. Support setting the format YAML for container configuration, which is the value of Sidecar container YAML configured with base64 encoding.</p>
     */
    @NameInMap("Sidecars")
    public String sidecars;

    /**
     * <p>The Logstore configuration. To delete this configuration, leave the parameter value empty by entering `""` or `"{}"`.</p>
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
     * <p>    *   LogDir: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (\\*) are supported. The collection path must match the following regular expression: `^/(.+)/(.*)^/$`.</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>The startup probe can be used to detect the viability of slow start containers, avoiding them from being killed before startup. The format is as follows: {"FailureThreshold": 3, "initialDelaySeconds": 5, "SuccessThreshold": 1, "timeoutSeconds": 1, "https Get": {"path": "/consumer", "port": 8080, "scheme": "HTTP", "https Headers": [{"name": "test", "value": "testvalue"}]}.</p>
     * <br>
     * <p>If set to "" or {}, it means delete, and if not set, it means ignore.</p>
     */
    @NameInMap("Startup")
    public String startup;

    /**
     * <p>The storage type of the NAS file system.</p>
     * <br>
     * <p>*   Valid values for General-purpose NAS file systems: Capacity and Performance.</p>
     * <p>*   Valid values for Extreme NAS file systems: Standard and Advance.</p>
     * <br>
     * <p>You can set this parameter only to Performance.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>Set the grace stop timeout for the application. Unit: seconds.</p>
     */
    @NameInMap("TerminateGracePeriod")
    public Integer terminateGracePeriod;

    /**
     * <p>The timeout period of the change process. Valid values: 1 to 1800. Unit: seconds. If you do not specify this Unidentifiedparameter, the default value 1800 is used.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

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

    /**
     * <p>When using custom JDK runtime, it is necessary to configure the basic image address. The address needs to be publicly accessible, and the EDAS server will pull the image to build the application image.</p>
     */
    @NameInMap("UserBaseImageUrl")
    public String userBaseImageUrl;

    /**
     * <p>The version of the Tomcat container on which the deployment package of the application depends. This parameter is applicable to Spring Cloud and Dubbo applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.</p>
     */
    @NameInMap("WebContainer")
    public String webContainer;

    /**
     * <p>The configuration of the Tomcat container. If you want to cancel this configuration, set this parameter to "" or "{}". The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   useDefaultConfig: specifies whether to use the default configuration. Value true indicates that the default configuration is used. Value false indicates that the custom configuration is used. If the default configuration is used, the following parameters do not take effect:</p>
     * <br>
     * <p>*   contextInputType: the type of the access path for the application. Valid values:</p>
     * <br>
     * <p>    *   war: The access path is the name of the WAR package. You do not need to specify a custom path.</p>
     * <p>    *   root: The access path for the application is `/`. You do not need to specify a custom path.</p>
     * <p>    *   custom: If you select this option, you must specify a custom path for the contextPath parameter.</p>
     * <br>
     * <p>*   contextPath: the custom access path for the application. This parameter is required only when you set the contextInputType parameter to custom.</p>
     * <br>
     * <p>*   httpPort: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is less than 1024. Enter a value that ranges from 1024 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.</p>
     * <br>
     * <p>*   maxThreads: the maximum number of connections in the connection pool. Default value: 400.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**This parameter significantly affects application performance. We recommend that you consult with technical support before you set this parameter.</p>
     * <br>
     * <p>*   uriEncoding: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not specify this parameter, the default value ISO-8859-1 is used.</p>
     * <br>
     * <p>*   useBodyEncoding: specifies whether to use the encoding scheme specified in the request body for URI query parameters.</p>
     * <br>
     * <p>*   useAdvancedServerXml: specifies whether to use advanced configurations to customize the server.xml file. If the preceding parameter types and specific parameters cannot meet your requirements, you can use advanced configurations to customize the server.xml file of Tomcat.</p>
     * <br>
     * <p>*   serverXml: the content of the server.xml file customized by using advanced configurations. This parameter takes effect only when you set the useAdvancedServerXml parameter to true.</p>
     */
    @NameInMap("WebContainerConfig")
    public String webContainerConfig;

    /**
     * <p>The type of Workload when creating an application is currently only supported for the Deployment type.</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    public static InsertK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertK8sApplicationRequest self = new InsertK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public InsertK8sApplicationRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public InsertK8sApplicationRequest setAppConfig(String appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public String getAppConfig() {
        return this.appConfig;
    }

    public InsertK8sApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public InsertK8sApplicationRequest setAppTemplateName(String appTemplateName) {
        this.appTemplateName = appTemplateName;
        return this;
    }
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    public InsertK8sApplicationRequest setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
        return this;
    }
    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    public InsertK8sApplicationRequest setBuildPackId(String buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public String getBuildPackId() {
        return this.buildPackId;
    }

    public InsertK8sApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InsertK8sApplicationRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public InsertK8sApplicationRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public InsertK8sApplicationRequest setConfigMountDescs(String configMountDescs) {
        this.configMountDescs = configMountDescs;
        return this;
    }
    public String getConfigMountDescs() {
        return this.configMountDescs;
    }

    public InsertK8sApplicationRequest setContainerRegistryId(String containerRegistryId) {
        this.containerRegistryId = containerRegistryId;
        return this;
    }
    public String getContainerRegistryId() {
        return this.containerRegistryId;
    }

    public InsertK8sApplicationRequest setCsClusterId(String csClusterId) {
        this.csClusterId = csClusterId;
        return this;
    }
    public String getCsClusterId() {
        return this.csClusterId;
    }

    public InsertK8sApplicationRequest setCustomAffinity(String customAffinity) {
        this.customAffinity = customAffinity;
        return this;
    }
    public String getCustomAffinity() {
        return this.customAffinity;
    }

    public InsertK8sApplicationRequest setCustomAgentVersion(String customAgentVersion) {
        this.customAgentVersion = customAgentVersion;
        return this;
    }
    public String getCustomAgentVersion() {
        return this.customAgentVersion;
    }

    public InsertK8sApplicationRequest setCustomTolerations(String customTolerations) {
        this.customTolerations = customTolerations;
        return this;
    }
    public String getCustomTolerations() {
        return this.customTolerations;
    }

    public InsertK8sApplicationRequest setDeployAcrossNodes(String deployAcrossNodes) {
        this.deployAcrossNodes = deployAcrossNodes;
        return this;
    }
    public String getDeployAcrossNodes() {
        return this.deployAcrossNodes;
    }

    public InsertK8sApplicationRequest setDeployAcrossZones(String deployAcrossZones) {
        this.deployAcrossZones = deployAcrossZones;
        return this;
    }
    public String getDeployAcrossZones() {
        return this.deployAcrossZones;
    }

    public InsertK8sApplicationRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public InsertK8sApplicationRequest setEmptyDirs(String emptyDirs) {
        this.emptyDirs = emptyDirs;
        return this;
    }
    public String getEmptyDirs() {
        return this.emptyDirs;
    }

    public InsertK8sApplicationRequest setEnableAhas(Boolean enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    public InsertK8sApplicationRequest setEnableAsm(Boolean enableAsm) {
        this.enableAsm = enableAsm;
        return this;
    }
    public Boolean getEnableAsm() {
        return this.enableAsm;
    }

    public InsertK8sApplicationRequest setEnableEmptyPushReject(Boolean enableEmptyPushReject) {
        this.enableEmptyPushReject = enableEmptyPushReject;
        return this;
    }
    public Boolean getEnableEmptyPushReject() {
        return this.enableEmptyPushReject;
    }

    public InsertK8sApplicationRequest setEnableLosslessRule(Boolean enableLosslessRule) {
        this.enableLosslessRule = enableLosslessRule;
        return this;
    }
    public Boolean getEnableLosslessRule() {
        return this.enableLosslessRule;
    }

    public InsertK8sApplicationRequest setEnvFroms(String envFroms) {
        this.envFroms = envFroms;
        return this;
    }
    public String getEnvFroms() {
        return this.envFroms;
    }

    public InsertK8sApplicationRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public InsertK8sApplicationRequest setFeatureConfig(String featureConfig) {
        this.featureConfig = featureConfig;
        return this;
    }
    public String getFeatureConfig() {
        return this.featureConfig;
    }

    public InsertK8sApplicationRequest setImagePlatforms(String imagePlatforms) {
        this.imagePlatforms = imagePlatforms;
        return this;
    }
    public String getImagePlatforms() {
        return this.imagePlatforms;
    }

    public InsertK8sApplicationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public InsertK8sApplicationRequest setInitContainers(String initContainers) {
        this.initContainers = initContainers;
        return this;
    }
    public String getInitContainers() {
        return this.initContainers;
    }

    public InsertK8sApplicationRequest setInternetSlbId(String internetSlbId) {
        this.internetSlbId = internetSlbId;
        return this;
    }
    public String getInternetSlbId() {
        return this.internetSlbId;
    }

    public InsertK8sApplicationRequest setInternetSlbPort(Integer internetSlbPort) {
        this.internetSlbPort = internetSlbPort;
        return this;
    }
    public Integer getInternetSlbPort() {
        return this.internetSlbPort;
    }

    public InsertK8sApplicationRequest setInternetSlbProtocol(String internetSlbProtocol) {
        this.internetSlbProtocol = internetSlbProtocol;
        return this;
    }
    public String getInternetSlbProtocol() {
        return this.internetSlbProtocol;
    }

    public InsertK8sApplicationRequest setInternetTargetPort(Integer internetTargetPort) {
        this.internetTargetPort = internetTargetPort;
        return this;
    }
    public Integer getInternetTargetPort() {
        return this.internetTargetPort;
    }

    public InsertK8sApplicationRequest setIntranetSlbId(String intranetSlbId) {
        this.intranetSlbId = intranetSlbId;
        return this;
    }
    public String getIntranetSlbId() {
        return this.intranetSlbId;
    }

    public InsertK8sApplicationRequest setIntranetSlbPort(Integer intranetSlbPort) {
        this.intranetSlbPort = intranetSlbPort;
        return this;
    }
    public Integer getIntranetSlbPort() {
        return this.intranetSlbPort;
    }

    public InsertK8sApplicationRequest setIntranetSlbProtocol(String intranetSlbProtocol) {
        this.intranetSlbProtocol = intranetSlbProtocol;
        return this;
    }
    public String getIntranetSlbProtocol() {
        return this.intranetSlbProtocol;
    }

    public InsertK8sApplicationRequest setIntranetTargetPort(Integer intranetTargetPort) {
        this.intranetTargetPort = intranetTargetPort;
        return this;
    }
    public Integer getIntranetTargetPort() {
        return this.intranetTargetPort;
    }

    public InsertK8sApplicationRequest setIsMultilingualApp(Boolean isMultilingualApp) {
        this.isMultilingualApp = isMultilingualApp;
        return this;
    }
    public Boolean getIsMultilingualApp() {
        return this.isMultilingualApp;
    }

    public InsertK8sApplicationRequest setJDK(String JDK) {
        this.JDK = JDK;
        return this;
    }
    public String getJDK() {
        return this.JDK;
    }

    public InsertK8sApplicationRequest setJavaStartUpConfig(String javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public InsertK8sApplicationRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public InsertK8sApplicationRequest setLimitCpu(Integer limitCpu) {
        this.limitCpu = limitCpu;
        return this;
    }
    public Integer getLimitCpu() {
        return this.limitCpu;
    }

    public InsertK8sApplicationRequest setLimitEphemeralStorage(Integer limitEphemeralStorage) {
        this.limitEphemeralStorage = limitEphemeralStorage;
        return this;
    }
    public Integer getLimitEphemeralStorage() {
        return this.limitEphemeralStorage;
    }

    public InsertK8sApplicationRequest setLimitMem(Integer limitMem) {
        this.limitMem = limitMem;
        return this;
    }
    public Integer getLimitMem() {
        return this.limitMem;
    }

    public InsertK8sApplicationRequest setLimitmCpu(Integer limitmCpu) {
        this.limitmCpu = limitmCpu;
        return this;
    }
    public Integer getLimitmCpu() {
        return this.limitmCpu;
    }

    public InsertK8sApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public InsertK8sApplicationRequest setLocalVolume(String localVolume) {
        this.localVolume = localVolume;
        return this;
    }
    public String getLocalVolume() {
        return this.localVolume;
    }

    public InsertK8sApplicationRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertK8sApplicationRequest setLosslessRuleAligned(Boolean losslessRuleAligned) {
        this.losslessRuleAligned = losslessRuleAligned;
        return this;
    }
    public Boolean getLosslessRuleAligned() {
        return this.losslessRuleAligned;
    }

    public InsertK8sApplicationRequest setLosslessRuleDelayTime(Integer losslessRuleDelayTime) {
        this.losslessRuleDelayTime = losslessRuleDelayTime;
        return this;
    }
    public Integer getLosslessRuleDelayTime() {
        return this.losslessRuleDelayTime;
    }

    public InsertK8sApplicationRequest setLosslessRuleFuncType(Integer losslessRuleFuncType) {
        this.losslessRuleFuncType = losslessRuleFuncType;
        return this;
    }
    public Integer getLosslessRuleFuncType() {
        return this.losslessRuleFuncType;
    }

    public InsertK8sApplicationRequest setLosslessRuleRelated(Boolean losslessRuleRelated) {
        this.losslessRuleRelated = losslessRuleRelated;
        return this;
    }
    public Boolean getLosslessRuleRelated() {
        return this.losslessRuleRelated;
    }

    public InsertK8sApplicationRequest setLosslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
        this.losslessRuleWarmupTime = losslessRuleWarmupTime;
        return this;
    }
    public Integer getLosslessRuleWarmupTime() {
        return this.losslessRuleWarmupTime;
    }

    public InsertK8sApplicationRequest setMountDescs(String mountDescs) {
        this.mountDescs = mountDescs;
        return this;
    }
    public String getMountDescs() {
        return this.mountDescs;
    }

    public InsertK8sApplicationRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public InsertK8sApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public InsertK8sApplicationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public InsertK8sApplicationRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public InsertK8sApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public InsertK8sApplicationRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public InsertK8sApplicationRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public InsertK8sApplicationRequest setPvcMountDescs(String pvcMountDescs) {
        this.pvcMountDescs = pvcMountDescs;
        return this;
    }
    public String getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    public InsertK8sApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public InsertK8sApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public InsertK8sApplicationRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public InsertK8sApplicationRequest setRequestsCpu(Integer requestsCpu) {
        this.requestsCpu = requestsCpu;
        return this;
    }
    public Integer getRequestsCpu() {
        return this.requestsCpu;
    }

    public InsertK8sApplicationRequest setRequestsEphemeralStorage(Integer requestsEphemeralStorage) {
        this.requestsEphemeralStorage = requestsEphemeralStorage;
        return this;
    }
    public Integer getRequestsEphemeralStorage() {
        return this.requestsEphemeralStorage;
    }

    public InsertK8sApplicationRequest setRequestsMem(Integer requestsMem) {
        this.requestsMem = requestsMem;
        return this;
    }
    public Integer getRequestsMem() {
        return this.requestsMem;
    }

    public InsertK8sApplicationRequest setRequestsmCpu(Integer requestsmCpu) {
        this.requestsmCpu = requestsmCpu;
        return this;
    }
    public Integer getRequestsmCpu() {
        return this.requestsmCpu;
    }

    public InsertK8sApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public InsertK8sApplicationRequest setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
        return this;
    }
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    public InsertK8sApplicationRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public InsertK8sApplicationRequest setServiceConfigs(String serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public String getServiceConfigs() {
        return this.serviceConfigs;
    }

    public InsertK8sApplicationRequest setSidecars(String sidecars) {
        this.sidecars = sidecars;
        return this;
    }
    public String getSidecars() {
        return this.sidecars;
    }

    public InsertK8sApplicationRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public InsertK8sApplicationRequest setStartup(String startup) {
        this.startup = startup;
        return this;
    }
    public String getStartup() {
        return this.startup;
    }

    public InsertK8sApplicationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public InsertK8sApplicationRequest setTerminateGracePeriod(Integer terminateGracePeriod) {
        this.terminateGracePeriod = terminateGracePeriod;
        return this;
    }
    public Integer getTerminateGracePeriod() {
        return this.terminateGracePeriod;
    }

    public InsertK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public InsertK8sApplicationRequest setUriEncoding(String uriEncoding) {
        this.uriEncoding = uriEncoding;
        return this;
    }
    public String getUriEncoding() {
        return this.uriEncoding;
    }

    public InsertK8sApplicationRequest setUseBodyEncoding(Boolean useBodyEncoding) {
        this.useBodyEncoding = useBodyEncoding;
        return this;
    }
    public Boolean getUseBodyEncoding() {
        return this.useBodyEncoding;
    }

    public InsertK8sApplicationRequest setUserBaseImageUrl(String userBaseImageUrl) {
        this.userBaseImageUrl = userBaseImageUrl;
        return this;
    }
    public String getUserBaseImageUrl() {
        return this.userBaseImageUrl;
    }

    public InsertK8sApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public InsertK8sApplicationRequest setWebContainerConfig(String webContainerConfig) {
        this.webContainerConfig = webContainerConfig;
        return this;
    }
    public String getWebContainerConfig() {
        return this.webContainerConfig;
    }

    public InsertK8sApplicationRequest setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

}
