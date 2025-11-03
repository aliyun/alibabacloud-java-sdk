// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeployK8sApplicationRequest extends TeaModel {
    /**
     * <p>The annotation of an application pod.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;annotation-name-1&quot;:&quot;annotation-value-1&quot;,&quot;annotation-name-2&quot;:&quot;annotation-value-2&quot;}</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e83acea6-****-47e1-96ae-c0e953772cdc</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The argument array in the container start-up command. Set this parameter to a JSON array in the format of <code>[&quot;args1&quot;,&quot;args2&quot;\\]</code>, where each key is set to a string. If you want to cancel this configuration, set this parameter to an empty JSON array in the format of <code>&quot;[\\]&quot;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;args1&quot;,&quot;args2&quot;]</p>
     */
    @NameInMap("Args")
    public String args;

    /**
     * <p>The timeout period for an at-a-time release. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("BatchTimeout")
    public Integer batchTimeout;

    /**
     * <p>The minimum time interval for the phased release of pods. For more information, see <a href="https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds">minReadySeconds</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The build package number of EDAS Container.</p>
     * <ul>
     * <li>You do not need to set the parameter if you do not need to change the EDAS Container version during the deployment.</li>
     * <li>Set the parameter if you need to update the EDAS Container version of the application during the deployment.</li>
     * </ul>
     * <p>You can query the build package number by using one of the following methods:</p>
     * <ul>
     * <li>Call the ListBuildPack operation. For more information, see <a href="https://help.aliyun.com/document_detail/423222.html">ListBuildPack</a>.</li>
     * <li>Obtain the value in the <strong>Build package number</strong> column of the <a href="https://help.aliyun.com/document_detail/92614.html">Release notes for EDAS Container</a> topic. For example, <code>59</code> indicates <code>EDAS Container 3.5.8</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("BuildPackId")
    public String buildPackId;

    /**
     * <strong>example:</strong>
     * <p>a8daf22e-****-968c7ff2ea34</p>
     */
    @NameInMap("CanaryRuleId")
    public String canaryRuleId;

    /**
     * <p>The description of the change process.</p>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("ChangeOrderDesc")
    public String changeOrderDesc;

    /**
     * <p>The commands that you run to start the container.</p>
     * <blockquote>
     * <p>If you want to cancel this configuration, set this parameter to an empty string in the format of <code>&quot;&quot;</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ls</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The configuration for mounting a Kubernetes ConfigMap or Secret to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <ul>
     * <li>name: the name of the Kubernetes ConfigMap or Secret.</li>
     * <li>type: the type of the API object that you want to mount. You can mount a Kubernetes ConfigMap or Secret.</li>
     * <li>mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;name&quot;: &quot;nginx-config&quot;,
     *             &quot;type&quot;: &quot;ConfigMap&quot;,
     *             &quot;mountPath&quot;: &quot;/etc/nginx&quot;
     *       },
     *       {
     *             &quot;name&quot;: &quot;tls-secret&quot;,
     *             &quot;type&quot;: &quot;Secret&quot;,
     *             &quot;mountPath&quot;: &quot;/etc/ssh&quot;
     *       }
     * ]</p>
     */
    @NameInMap("ConfigMountDescs")
    public String configMountDescs;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CpuLimit")
    public Integer cpuLimit;

    /**
     * <p>The number of CPU cores requested for each application instance when the application is running. Unit: cores. We recommend that you set this parameter. Value 0 indicates that no limit is set on CPU cores.</p>
     * <blockquote>
     * <p>You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CpuRequest")
    public Integer cpuRequest;

    /**
     * <p>The affinity configuration of the pod. This parameter takes effect only if both the DeployAcrossNodes and DeployAcrossZones parameters are set to false.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nodeAffinity&quot;:{&quot;requiredDuringSchedulingIgnoredDuringExecution&quot;:{&quot;nodeSelectorTerms&quot;:[{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;beta.kubernetes.io/arch&quot;,&quot;operator&quot;:&quot;NotIn&quot;,&quot;values&quot;:[&quot;arm64&quot;,&quot;arm32&quot;]}]}]},&quot;preferredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;weight&quot;:5,&quot;preference&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;kubernetes.io/os&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;linux&quot;]}]}}]},&quot;podAffinity&quot;:{&quot;requiredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;namespaces&quot;:[&quot;default&quot;],&quot;topologyKey&quot;:&quot;kubernetes.io/hostname&quot;,&quot;labelSelector&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;edas.oam.acname&quot;,&quot;operator&quot;:&quot;NotIn&quot;,&quot;values&quot;:[&quot;edas-test-app&quot;]}]}}]},&quot;podAntiAffinity&quot;:{&quot;preferredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;podAffinityTerm&quot;:{&quot;namespaces&quot;:[&quot;default&quot;],&quot;topologyKey&quot;:&quot;failure-domain.beta.kubernetes.io/zone&quot;,&quot;labelSelector&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;edas.oam.acname&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;edas-test-app-2&quot;]}]}},&quot;weight&quot;:15}]}}</p>
     */
    @NameInMap("CustomAffinity")
    public String customAffinity;

    /**
     * <strong>example:</strong>
     * <p>3.1.4</p>
     */
    @NameInMap("CustomAgentVersion")
    public String customAgentVersion;

    /**
     * <p>The scheduling tolerance configuration of the pod. This parameter takes effect only if both the DeployAcrossNodes and DeployAcrossZones parameters are set to false.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;edas-taint-key2&quot;,&quot;operator&quot;:&quot;Exists&quot;,&quot;effect&quot;:&quot;NoExecute&quot;,&quot;tolerationSeconds&quot;:50},{&quot;key&quot;:&quot;edas-taint-key&quot;,&quot;operator&quot;:&quot;Equal&quot;,&quot;value&quot;:&quot;edas-taint-value&quot;,&quot;effect&quot;:&quot;PreferNoSchedule&quot;}]</p>
     */
    @NameInMap("CustomTolerations")
    public String customTolerations;

    /**
     * <p>Specifies whether to distribute application instances to multiple nodes. Value true indicates that application instances are distrubuted across zones. Other values indicate that application instances are not distributed across zones.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeployAcrossNodes")
    public String deployAcrossNodes;

    /**
     * <p>Specifies whether to distribute application instances across zones. Value true indicates that application instances are distrubuted across zones. Other values indicate that application instances are not distributed across zones.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeployAcrossZones")
    public String deployAcrossZones;

    /**
     * <p>The version of EDAS Container on which the deployment package of the application depends. This parameter is applicable to High-Speed Service Framework (HSF) applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.</p>
     * 
     * <strong>example:</strong>
     * <p>3.5.9</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>The configuration for mounting a Kubernetes emptyDir volume to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <ul>
     * <li>mountPath: The mount path in the container. This parameter is required.</li>
     * <li>readOnly: (Optional) The mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.</li>
     * <li>subPathExpr: (Optional) The regular expression that is used to match the subdirectory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/app-log&quot;,&quot;subPathExpr&quot;:&quot;$(POD_IP)&quot;},{&quot;readOnly&quot;:true,&quot;mountPath&quot;:&quot;/etc/nginx&quot;}]</p>
     */
    @NameInMap("EmptyDirs")
    public String emptyDirs;

    /**
     * <p>Specifies whether to enable access to Application High Availability Service (AHAS).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    /**
     * <p>Specifies whether to enable the empty list protection feature. Valid values:</p>
     * <ul>
     * <li>true: enables the empty list protection feature.</li>
     * <li>false: disables the empty list protection feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableEmptyPushReject")
    public Boolean enableEmptyPushReject;

    /**
     * <p>Specifies whether to enable graceful start rules. Valid values:</p>
     * <ul>
     * <li>true: enables graceful start rules.</li>
     * <li>false: disables graceful start rules.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLosslessRule")
    public Boolean enableLosslessRule;

    /**
     * <p>The Kubernetes environment variables that are configured in EnvFrom mode. A ConfigMap or Secret is mounted to a directory. Each key corresponds to a file in the directory, and the content of the file is the value of the key.</p>
     * <p>This parameter contains the following parameters:</p>
     * <ul>
     * <li><p>configMapRef: the ConfigMap that is referenced. The following parameter is contained:</p>
     * <ul>
     * <li>name: the name of the ConfigMap.</li>
     * </ul>
     * </li>
     * <li><p>secretRef: the Secret that is referenced. The following parameter is contained:</p>
     * <ul>
     * <li>name: the name of the Secret.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;appname&quot;,&quot;valueFrom&quot;:{&quot;configMapKeyRef&quot;:{&quot;name&quot;:&quot;appconf&quot;,&quot;key&quot;:&quot;name&quot;}}}]</p>
     */
    @NameInMap("EnvFroms")
    public String envFroms;

    /**
     * <p>The environment variables that are used to deploy the application. Set this parameter to a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, and Kubernetes Secret environment variables. Specify regular environment variables in the following format:</p>
     * <p><code>{&quot;name&quot;:&quot;x&quot;, &quot;value&quot;: &quot;y&quot;}</code></p>
     * <p>Specify Kubernetes ConfigMap environment variables in the following format to reference values from ConfigMaps:</p>
     * <p><code>{ &quot;name&quot;: &quot;x2&quot;, &quot;valueFrom&quot;: { &quot;configMapKeyRef&quot;: { &quot;name&quot;: &quot;my-config&quot;, &quot;key&quot;: &quot;y2&quot; } } }</code></p>
     * <p>Specify Kubernetes Secret environment variables in the following format to reference values from Secrets:</p>
     * <p><code>{ &quot;name&quot;: &quot;x3&quot;, &quot;valueFrom&quot;: { &quot;secretKeyRef&quot;: { &quot;name&quot;: &quot;my-secret&quot;, &quot;key&quot;: &quot;y3&quot; } } }</code></p>
     * <blockquote>
     * <p> If you want to cancel this configuration, set this parameter to an empty JSON array, which is in the format of &quot;[]&quot;.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;x1&quot;,&quot;value&quot;:&quot;y1&quot;},{&quot;name&quot;:&quot;x2&quot;,&quot;valueFrom&quot;:{&quot;configMapKeyRef&quot;:{&quot;name&quot;:&quot;my-config&quot;,&quot;key&quot;:&quot;y2&quot;}}},{&quot;name&quot;:&quot;x3&quot;,&quot;valueFrom&quot;:{&quot;secretKeyRef&quot;:{&quot;name&quot;:&quot;my-secret&quot;,&quot;key&quot;:&quot;y3&quot;}}}]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The absolute URL of the image. This parameter setting overwrites the setting of the ImageTag parameter.</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The destination image platform. This parameter takes effect only when you deploy applications by using .war or .jar packages.</p>
     * <ul>
     * <li>If you want to specify x86_64, set the value to linux/amd64.</li>
     * <li>If you want to specify ARM64, set the value to linux/arm64.</li>
     * <li>If you want to specify both x86_64 and ARM64, set the value to linux/amd64,linux/arm64.</li>
     * <li>If you leave this parameter empty, the default architecture is used.</li>
     * </ul>
     */
    @NameInMap("ImagePlatforms")
    public String imagePlatforms;

    /**
     * <p>The tag of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;yamlEncoded&quot;: &quot;Y29tbWFuZDoKICAtIHNsZWVwCiAgLSAnNjAnCmltYWdlOiAnYnVzeWJveDpsYXRlc3QnCm5hbWU6IGluaXQtYnVzeWJveAo=&quot;
     *       }
     * ]</p>
     */
    @NameInMap("InitContainers")
    public String initContainers;

    /**
     * <p>The version of the Java Development Kit (JDK) on which the deployment package of the application depends. Open JDK 7 and Open JDK 8 are supported. This parameter is unavailable if you deploy applications by using images.</p>
     * 
     * <strong>example:</strong>
     * <p>Open JDK 8</p>
     */
    @NameInMap("JDK")
    public String JDK;

    /**
     * <p>The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Proper parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;InitialHeapSize&quot;:{&quot;original&quot;:512,&quot;startup&quot;:&quot;-Xms512m&quot;},&quot;MaxHeapSize&quot;:{&quot;original&quot;:1024,&quot;startup&quot;:&quot;-Xmx1024m&quot;}}</p>
     */
    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    /**
     * <p>The label of an application pod.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;label-name-1&quot;:&quot;label-value-1&quot;,&quot;label-name-2&quot;:&quot;label-value-2&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the ephemeral storage space.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LimitEphemeralStorage")
    public Integer limitEphemeralStorage;

    /**
     * <p>The configuration for the liveness check on the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The configurations that are used when the host files are mounted to the container on which the application is running. Example: <code>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}\\]</code>. The nodePath parameter specifies the host path, the mountPath parameter specifies the path within the container, and the type parameter specifies the mounting type.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}]</p>
     */
    @NameInMap("LocalVolume")
    public String localVolume;

    /**
     * <p>Specifies whether to enable Graceful Rolling Release and configure Complete Service Registration before Readiness Probing. Valid values:</p>
     * <ul>
     * <li>true: If you turn on the switch, the system uses the /health path and provides port 55199 for the health check. The system does not intrude into the application. When the service is registered, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</li>
     * </ul>
     * <blockquote>
     * <p>If you set both the LosslessRuleRelated parameter and this parameter to true, the operation checks whether the service prefetching is complete.</p>
     * </blockquote>
     * <ul>
     * <li>false: If you turn off the switch, the system does not provide a port to check whether the service is registered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LosslessRuleAligned")
    public Boolean losslessRuleAligned;

    /**
     * <p>The delay of service registration. Valid values: 0 to 86400. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LosslessRuleDelayTime")
    public Integer losslessRuleDelayTime;

    /**
     * <p>The number of prefetching curves. Valid values: 0 to 20. The default value is 2, which is suitable for common prefetching scenarios. This value indicates that the received traffic amount of the provider during prefetching is displayed as a quadratic curve.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LosslessRuleFuncType")
    public Integer losslessRuleFuncType;

    /**
     * <p>Specifies whether to enable Graceful Rolling Release and configure Complete Service Prefetching before Readiness Probing. Valid values:</p>
     * <ul>
     * <li>true: If you turn on the switch, the system uses the /health path and provides port 55199 for the health check. The system does not intrude into the application. When service prefetching is complete, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</li>
     * <li>false: If you turn off the switch, the system does not provide a port to check whether service prefetching is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LosslessRuleRelated")
    public Boolean losslessRuleRelated;

    /**
     * <p>The service prefetching duration. Valid values: 0 to 86400. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("LosslessRuleWarmupTime")
    public Integer losslessRuleWarmupTime;

    /**
     * <p>The maximum number of CPU cores allowed. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("McpuLimit")
    public Integer mcpuLimit;

    /**
     * <p>The minimum number of CPU cores required. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
     * <blockquote>
     * <p>You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("McpuRequest")
    public Integer mcpuRequest;

    /**
     * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. Value 0 indicates that no limit is set on the memory size.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MemoryLimit")
    public Integer memoryLimit;

    /**
     * <p>The size of memory requested for each application instance when the application is running. Unit: MB. We recommend that you set this parameter. If you do not want to apply for a memory quota, set this parameter to 0.</p>
     * <blockquote>
     * <p>You must set this parameter together with the MemoryLimit parameter. Make sure that the value of this parameter does not exceed that of the MemoryLimit parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MemoryRequest")
    public Integer memoryRequest;

    /**
     * <p>The description of the NAS mounting configuration. Set this parameter to a serialized JSON string. Example: <code>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}\\]</code>. The nasPath parameter specifies the file storage path, and the mountPath parameter specifies the path to mount the file system to the container in which the application is running.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}]</p>
     */
    @NameInMap("MountDescs")
    public String mountDescs;

    /**
     * <p>The ID of the File Storage NAS (NAS) file system mounted to the container in which the application is running. The NAS file system must be in the same region as the cluster. The NAS file system must have an available mount target, or have a mount target on the vSwitch in the virtual private cloud (VPC) in which the application resides. If you do not specify this parameter but specify the MountDescs parameter, a NAS file system is automatically purchased and mounted to the vSwitch in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>dfs23****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.</p>
     * <blockquote>
     * <p>The version of EDAS SDK for Java or Python must be V2.44.0 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar">https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application. You must specify a version.</p>
     * <blockquote>
     * <p>The version of EDAS SDK for Java or Python must be V2.44.0 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20200720</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The version ID of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>2bcc********</p>
     */
    @NameInMap("PackageVersionId")
    public String packageVersionId;

    /**
     * <p>The post-start script. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\\]}}</code>. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;ls\&quot;,\&quot;/\&quot;]}}&quot;</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The pre-stop script. Example: <code>{&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;ls\&quot;,\&quot;/\&quot;]}}&quot;</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC) to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <ul>
     * <li><p>pvcName: the name of the PVC. Make sure that the volume exists and is in the Bound state.</p>
     * </li>
     * <li><p>mountPaths: the directory to which you want to mount the PVC. You can configure multiple directories. You can set the following two parameters for each mount directory:</p>
     * <ul>
     * <li>mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</li>
     * <li>readOnly: the mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;pvcName&quot;:&quot;nas-pvc-1&quot;,&quot;mountPaths&quot;:[{&quot;mountPath&quot;:&quot;/usr/share/nginx/data&quot;},{&quot;mountPath&quot;:&quot;/usr/share/nginx/html&quot;,&quot;readOnly&quot;:true}]}]</p>
     */
    @NameInMap("PvcMountDescs")
    public String pvcMountDescs;

    /**
     * <p>The configuration for the readiness check on the container. If the check fails, the traffic that passes through the Kubernetes service is not transmitted to the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}\\]}}</code>. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    /**
     * <p>The number of application instances. The minimum value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the ephemeral storage space.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RequestsEphemeralStorage")
    public Integer requestsEphemeralStorage;

    /**
     * <p>The type of the container runtime. Valid values:</p>
     * <ul>
     * <li>runc: standard container runtime</li>
     * <li>runv: sandboxed container runtime</li>
     * </ul>
     * <p>This parameter is applicable only to clusters that use sandboxed containers.</p>
     * 
     * <strong>example:</strong>
     * <p>runc</p>
     */
    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    @NameInMap("SecurityContext")
    public String securityContext;

    /**
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;yamlEncoded&quot;: &quot;Y29tbWFuZDoKICAtIHRhaWwKICAtICctZicKICAtIC9kZXYvbnVsbAppbWFnZTogJ2J1c3lib3g6bGF0ZXN0JwpuYW1lOiBidXN5Ym94Cg==&quot;
     *       }
     * ]</p>
     */
    @NameInMap("Sidecars")
    public String sidecars;

    /**
     * <p>The Logstore configuration. If you want to cancel this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>.</p>
     * <ul>
     * <li><p>The following parameters are included in the configuration:</p>
     * <ul>
     * <li><p>type: the collection type. Set this parameter to file to specify the file type. Set this parameter to stdout to specify the standard output type.</p>
     * </li>
     * <li><p>logstore: the name of the Logstore. Make sure that the name of the Logstore is unique in the cluster. The name must comply with the following rules:</p>
     * <ul>
     * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length. If you leave this parameter empty, the system automatically generates a name.</li>
     * </ul>
     * </li>
     * <li><p>logDir: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (\*) are supported. The collection path must match the following regular expression: <code>^/(.+)/(.*)^/$</code>.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logstore&quot;:&quot;thisisanotherfilelog&quot;,&quot;type&quot;:&quot;file&quot;,&quot;logDir&quot;:&quot;/var/log/<em>&quot;},{&quot;logstore&quot;:&quot;&quot;,&quot;type&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;stdout.log&quot;},{&quot;logstore&quot;:&quot;thisisafilelog&quot;,&quot;type&quot;:&quot;file&quot;,&quot;logDir&quot;:&quot;/tmp/log/</em>&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <strong>example:</strong>
     * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
     */
    @NameInMap("Startup")
    public String startup;

    /**
     * <p>The storage type of the NAS file system.</p>
     * <ul>
     * <li>Valid values for General-purpose NAS file systems: Capacity and Performance.</li>
     * <li>Valid values for Extreme NAS file systems: standard and advance.</li>
     * </ul>
     * <p>You can set this parameter only to Performance.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("TerminateGracePeriod")
    public Integer terminateGracePeriod;

    /**
     * <p>The traffic adjustment policy for a canary release.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;http&quot;:{&quot;rules&quot;:[{&quot;conditionType&quot;:&quot;percent&quot;,&quot;percent&quot;:10}]}}</p>
     */
    @NameInMap("TrafficControlStrategy")
    public String trafficControlStrategy;

    /**
     * <p>The phased release policy.</p>
     * <ul>
     * <li>Example 1: One instance for a canary release + Two subsequent batches + Automatic batching + 1-minute batch interval.</li>
     * </ul>
     * <p><code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
     * <ul>
     * <li>Example 2: One instance for a canary release + Two subsequent batches + Manual batching.</li>
     * </ul>
     * <p><code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
     * <ul>
     * <li>Example 3: Two batches + Automatic batching + 0-minute batch interval.</li>
     * </ul>
     * <p><code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
     */
    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    /**
     * <p>The URI encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
     * <blockquote>
     * <p>If you do not specify this parameter in the application configurations, the default URI encoding scheme in the Tomcat container is applied.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>GBK</p>
     */
    @NameInMap("UriEncoding")
    public String uriEncoding;

    /**
     * <p>Specifies whether to use the encoding scheme specified in the request body for URI query parameters.</p>
     * <blockquote>
     * <p>If this parameter is not specified in application configuration, the default value false is applied.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseBodyEncoding")
    public Boolean useBodyEncoding;

    /**
     * <strong>example:</strong>
     * <p>openjdk:8u302</p>
     */
    @NameInMap("UserBaseImageUrl")
    public String userBaseImageUrl;

    /**
     * <p>The data volume.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VolumesStr")
    public String volumesStr;

    /**
     * <p>The version of the Tomcat container on which the deployment package of the application depends. This parameter is applicable to Spring Cloud and Dubbo applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.</p>
     * 
     * <strong>example:</strong>
     * <p>apache-tomcat-7.0.91</p>
     */
    @NameInMap("WebContainer")
    public String webContainer;

    /**
     * <p>The Tomcat container configuration. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>. The following parameters are included in the configuration:</p>
     * <ul>
     * <li><p>useDefaultConfig: specifies whether to use the default configuration. Value true indicates to use the default configuration. Value false indicates to use the custom configuration. If the default configuration is used, the following parameters do not take effect.</p>
     * </li>
     * <li><p>contextInputType: the type of the access path for the application. Valid values:</p>
     * <ul>
     * <li>war: The access path for the application is the name of the WAR package. You do not need to specify a custom path.</li>
     * <li>root: The access path for the application is /. You do not need to specify a custom path.</li>
     * <li>custom: If you select this option, you must specify a custom path for the contextPath parameter.</li>
     * </ul>
     * </li>
     * <li><p>contextPath: the custom access path for the application. This parameter is required only when you set the contextInputType parameter to custom.</p>
     * </li>
     * <li><p>httpPort: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is less than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.</p>
     * </li>
     * <li><p>maxThreads: the maximum number of connections in the connection pool. Default value: 400.</p>
     * <p>**</p>
     * <p><strong>Note</strong>This parameter greatly affects the application performance. We recommend that you set this parameter under professional guidance.</p>
     * </li>
     * <li><p>uriEncoding: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not specify this parameter, the default value ISO-8859-1 is used.</p>
     * </li>
     * <li><p>useBodyEncoding: specifies whether to use the encoding scheme specified in the request body for URI query parameters.</p>
     * </li>
     * <li><p>useAdvancedServerXml: specifies whether to use advanced configurations to customize the <code>server.xml</code> file. If the preceding parameter types and specific parameters cannot meet your requirements, you can use advanced configurations to customize the <code>server.xml</code> file of Tomcat.</p>
     * </li>
     * <li><p>serverXml: the content of the <code>server.xml</code> file customized by using advanced configurations. This parameter takes effect only when you set the useAdvancedServerXml parameter to true.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;useDefaultConfig&quot;:false,&quot;contextInputType&quot;:&quot;custom&quot;,&quot;contextPath&quot;:&quot;hello&quot;,&quot;httpPort&quot;:8088,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;UTF-8&quot;,&quot;useBodyEncoding&quot;:true,&quot;useAdvancedServerXml&quot;:false}</p>
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

    public DeployK8sApplicationRequest setSecurityContext(String securityContext) {
        this.securityContext = securityContext;
        return this;
    }
    public String getSecurityContext() {
        return this.securityContext;
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
