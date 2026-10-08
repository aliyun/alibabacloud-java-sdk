// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertK8sApplicationRequest extends TeaModel {
    /**
     * <p>The annotations of the application pod.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;annotation-name-1&quot;:&quot;annotation-value-1&quot;,&quot;annotation-name-2&quot;:&quot;annotation-value-2&quot;}</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The application configuration when an application template is used. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AppConfig")
    public String appConfig;

    /**
     * <p>The name of the application. The name must start with a letter and can contain digits, letters, and hyphens (-). The name can be up to 36 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The name of the application template that is used to create the application. If you specify an application template when you create the application, the application template and the AppConfig parameter are preferentially used to determine the application configuration. Other configurations are ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>app-template001</p>
     */
    @NameInMap("AppTemplateName")
    public String appTemplateName;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>Production Environment</p>
     */
    @NameInMap("ApplicationDescription")
    public String applicationDescription;

    /**
     * <p>The version of EDAS Container. This parameter conflicts with <code>EdasContainerVersion</code>. Use the <code>EdasContainerVersion</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("BuildPackId")
    public String buildPackId;

    /**
     * <p>The ID of the cluster. You can call the ListCluster operation to query the cluster ID. For more information, see <a href="https://help.aliyun.com/document_detail/154995.html">ListCluster</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c9cd****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The startup command of the application. If you set this parameter, the original startup command of the image is overridden.</p>
     * 
     * <strong>example:</strong>
     * <p>ls</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments for the startup command. The arguments are a JSON array of strings. Example: <code>[{&quot;argument&quot;:&quot;-c&quot;},{&quot;argument&quot;:&quot;test&quot;}]</code>. In this example, <code>-c</code> and <code>test</code> are two arguments.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;argument&quot;:&quot;-lh&quot;}]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The configuration for mounting Kubernetes ConfigMaps and Secrets. You can mount ConfigMaps and Secrets to specified directories in a container. The following parameters are included in ConfigMountDescs:</p>
     * <ul>
     * <li><p>name: The name of the ConfigMap or Secret.</p>
     * </li>
     * <li><p>type: The configuration type. Valid values: ConfigMap and Secret.</p>
     * </li>
     * <li><p>mountPath: The mount path. The path must be an absolute path that starts with a forward slash (/).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;nginx-config&quot;,&quot;type&quot;:&quot;ConfigMap&quot;,&quot;mountPath&quot;:&quot;/etc/nginx&quot;},{&quot;name&quot;:&quot;tls-secret&quot;,&quot;type&quot;:&quot;secret&quot;,&quot;mountPath&quot;:&quot;/etc/ssh&quot;}]</p>
     */
    @NameInMap("ConfigMountDescs")
    public String configMountDescs;

    /**
     * <p>The ID of the repository that is used to build the image repository. If you leave this parameter empty, the default repository provided by EDAS is used. Currently, only the default repository provided by EDAS is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>leave empty</p>
     */
    @NameInMap("ContainerRegistryId")
    public String containerRegistryId;

    /**
     * <p>You must specify CsClusterId only when you create an application in a cluster that has never been imported.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdefg</p>
     */
    @NameInMap("CsClusterId")
    public String csClusterId;

    /**
     * <p>The custom affinity.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("CustomAffinity")
    public String customAffinity;

    /**
     * <p>The version of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>2.8.3,3.2.10,4.3.1</p>
     */
    @NameInMap("CustomAgentVersion")
    public String customAgentVersion;

    /**
     * <p>The custom tolerations.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("CustomTolerations")
    public String customTolerations;

    /**
     * <p>Specifies whether to distribute application instances to multiple nodes. A value of <code>true</code> means yes. Other values mean no.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeployAcrossNodes")
    public String deployAcrossNodes;

    /**
     * <p>Specifies whether to distribute application instances to multiple zones. A value of <code>true</code> means yes. Other values mean no.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeployAcrossZones")
    public String deployAcrossZones;

    /**
     * <p>The version of the <code>EDAS-Container</code> on which the deployment package depends.</p>
     * <blockquote>
     * <p>This parameter is not supported for image-based deployments.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3.5.9</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>The configuration for mounting a Kubernetes emptyDir volume. You can mount an emptyDir volume to a specified directory in a container. The following parameters are included in EmptyDirs:</p>
     * <ul>
     * <li><p>mountPath: The mount path in the container. This parameter is required.</p>
     * </li>
     * <li><p>readOnly: Specifies whether the volume is read-only. This parameter is optional. true specifies read-only. false specifies read and write. Default value: false.</p>
     * </li>
     * <li><p>subPathExpr: The subdirectory expression. This parameter is optional.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/app-log&quot;,&quot;subPathExpr&quot;:&quot;$(POD_IP)&quot;},{&quot;readOnly&quot;:true,&quot;mountPath&quot;:&quot;/etc/nginx&quot;}]</p>
     */
    @NameInMap("EmptyDirs")
    public String emptyDirs;

    /**
     * <p>Specifies whether to enable Application High Availability Service (AHAS):</p>
     * <ul>
     * <li><p>true: Enable AHAS.</p>
     * </li>
     * <li><p>false: Do not enable AHAS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    /**
     * <p>You must set this parameter to true only when you create an application in a cluster that has never been imported and enable Service Mesh (ASM).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAsm")
    public Boolean enableAsm;

    /**
     * <p>Specifies whether to enable protection against empty pushes:</p>
     * <ul>
     * <li><p>true: Enable protection against empty pushes.</p>
     * </li>
     * <li><p>false: Do not enable protection against empty pushes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableEmptyPushReject")
    public Boolean enableEmptyPushReject;

    /**
     * <p>Specifies whether to enable the graceful start rule:</p>
     * <ul>
     * <li><p>true: Enable the graceful start rule.</p>
     * </li>
     * <li><p>false: Do not enable the graceful start rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLosslessRule")
    public Boolean enableLosslessRule;

    /**
     * <p>The configuration for environment variables of the Kubernetes EnvFrom type. You can mount a specified ConfigMap or Secret to a specified directory. Each key corresponds to a file in the directory. The content of the file is the value of the key.</p>
     * <p>The following parameters are included in EnvFroms:</p>
     * <ul>
     * <li><p>configMapRef: The reference to the ConfigMap. This field includes the following parameter:</p>
     * <ul>
     * <li>name: The name of the ConfigMap.</li>
     * </ul>
     * </li>
     * <li><p>secretRef: The reference to the Secret. This field includes the following parameter:</p>
     * <ul>
     * <li>name: The name of the Secret.</li>
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
     * <p>The environment variables for the deployment. The value must be a JSON array of objects. Three types of environment variables are supported: regular environment variables, Kubernetes ConfigMap environment variables, and Kubernetes Secret environment variables. The format of a regular environment variable is as follows:</p>
     * <p><code>{&quot;name&quot;:&quot;x&quot;, &quot;value&quot;: &quot;y&quot;}</code></p>
     * <p>You can use a ConfigMap to inject the value of a specific key into a container\&quot;s environment variable. The format is as follows:</p>
     * <p><code>{ &quot;name&quot;: &quot;x2&quot;, &quot;valueFrom&quot;: { &quot;configMapKeyRef&quot;: { &quot;name&quot;: &quot;my-config&quot;, &quot;key&quot;: &quot;y2&quot; } } }</code></p>
     * <p>You can use a Secret to inject the value of a specific key into a container\&quot;s environment variable. The format is as follows:</p>
     * <p><code>{ &quot;name&quot;: &quot;x3&quot;, &quot;valueFrom&quot;: { &quot;secretKeyRef&quot;: { &quot;name&quot;: &quot;my-secret&quot;, &quot;key&quot;: &quot;y3&quot; } } }</code></p>
     * <blockquote>
     * <p>To clear this configuration, set the value to an empty JSON array ([]).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;x1&quot;,&quot;value&quot;:&quot;y1&quot;},{&quot;name&quot;:&quot;x2&quot;,&quot;valueFrom&quot;:{&quot;configMapKeyRef&quot;:{&quot;name&quot;:&quot;my-config&quot;,&quot;key&quot;:&quot;y2&quot;}}},{&quot;name&quot;:&quot;x3&quot;,&quot;valueFrom&quot;:{&quot;secretKeyRef&quot;:{&quot;name&quot;:&quot;my-secret&quot;,&quot;key&quot;:&quot;y3&quot;}}}]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The configuration of the custom monitoring and administration solution.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;features&quot;:[{&quot;name&quot;:&quot;base.combination.arms&quot;,&quot;enable&quot;:true},{&quot;name&quot;:&quot;base.combination.mse&quot;,&quot;enable&quot;:true}]}</p>
     */
    @NameInMap("FeatureConfig")
    public String featureConfig;

    /**
     * <p>The architecture of the image platform. This parameter is valid when you use a WAR or JAR package for deployment. Examples:</p>
     * <ul>
     * <li><p>To specify the x86-64 architecture, enter linux/amd64.</p>
     * </li>
     * <li><p>To specify the ARM64 architecture, enter linux/arm64.</p>
     * </li>
     * <li><p>To build a dual-architecture image, enter linux/amd64,linux/arm64.</p>
     * </li>
     * <li><p>If you do not enter a value, the default architecture is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linux/arm64,linux/amd64</p>
     */
    @NameInMap("ImagePlatforms")
    public String imagePlatforms;

    /**
     * <p>The address of the image. This parameter is required when you set <code>PackageType</code> to <code>Image</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-beijing.aliyuncs.com/<strong><strong>_test/</strong></strong>-cons****:1.0</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The init containers for the application pod. You can set the container configuration in the YAML format. The value is the Base64-encoded YAML configuration of the init container.</p>
     * 
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
     * <p>The ID of the internet-facing SLB instance. If you do not specify this parameter, EDAS automatically purchases a new SLB instance for you.</p>
     * 
     * <strong>example:</strong>
     * <p>a3d4********</p>
     */
    @NameInMap("InternetSlbId")
    public String internetSlbId;

    /**
     * <p>The frontend port of the internet-facing SLB instance. The value must be in the range of 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("InternetSlbPort")
    public Integer internetSlbPort;

    /**
     * <p>The protocol used by the internet-facing SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("InternetSlbProtocol")
    public String internetSlbProtocol;

    /**
     * <p>The backend port of the internal SLB instance, which also serves as the service port for the application. The port number must be an integer from 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("InternetTargetPort")
    public Integer internetTargetPort;

    /**
     * <p>The ID of the internal-facing SLB instance. If you do not specify this parameter, EDAS automatically purchases a new SLB instance for you.</p>
     * 
     * <strong>example:</strong>
     * <p>ae93********</p>
     */
    @NameInMap("IntranetSlbId")
    public String intranetSlbId;

    /**
     * <p>The frontend port of the internal-facing SLB instance. The value must be in the range of 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("IntranetSlbPort")
    public Integer intranetSlbPort;

    /**
     * <p>The protocol used by the internal-facing SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IntranetSlbProtocol")
    public String intranetSlbProtocol;

    /**
     * <p>The backend port of the internal-facing SLB instance. This is also the service port of the application. The value must be in the range of 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("IntranetTargetPort")
    public Integer intranetTargetPort;

    /**
     * <p>Specifies whether the application is a multilingual application.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMultilingualApp")
    public Boolean isMultilingualApp;

    /**
     * <p>The version of the Java Development Kit (JDK) on which the deployment package depends. Valid values: Open JDK 7, Open JDK 8, and Custom OpenJDK. This parameter is not supported for image-based deployments. If you select Custom OpenJDK, you must also specify the UserBaseImageUrl parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Open JDK 8</p>
     */
    @NameInMap("JDK")
    public String JDK;

    /**
     * <p>The Java startup parameters. You can configure startup parameters for a Java application. You can configure memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom parameters. Proper parameter configuration helps reduce GC overhead, shorten server response time, and improve throughput. The value is a JSON string. original specifies the configuration value, and startup specifies the startup parameter. The system automatically concatenates all startup values as the Java startup parameters for the application. To clear the configuration, set the value to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>. The keys in the JSON string are described as follows:</p>
     * <ul>
     * <li><p>InitialHeapSize: the initial heap size.</p>
     * </li>
     * <li><p>MaxHeapSize: the maximum heap size.</p>
     * </li>
     * <li><p>CustomParams: custom content, such as JVM -D parameters.</p>
     * </li>
     * <li><p>Other keys: You can view the JSON structure submitted by the frontend.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;InitialHeapSize&quot;:{&quot;original&quot;:512,&quot;startup&quot;:&quot;-Xms512m&quot;},&quot;MaxHeapSize&quot;:{&quot;original&quot;:1024,&quot;startup&quot;:&quot;-Xmx1024m&quot;},&quot;CustomParams&quot;:{&quot;original&quot;:&quot;-Dcustom.property.sample=false&quot;,&quot;startup&quot;:&quot;-Dcustom.property.sample=false&quot;}}</p>
     */
    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    /**
     * <p>The labels of the application pod.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;label-name-1&quot;:&quot;label-value-1&quot;,&quot;label-name-2&quot;:&quot;label-value-2&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum number of CPU cores that can be used by an application instance. If you specify LimitmCpu, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LimitCpu")
    public Integer limitCpu;

    /**
     * <p>The maximum ephemeral storage. Unit: GB. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LimitEphemeralStorage")
    public Integer limitEphemeralStorage;

    /**
     * <p>The maximum amount of memory that can be used by an application instance. Unit: MB. The value of LimitMem must be greater than or equal to the value of RequestsMem.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LimitMem")
    public Integer limitMem;

    /**
     * <p>The maximum number of CPU cores that can be used by an application instance. Unit: millicores. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("LimitmCpu")
    public Integer limitmCpu;

    /**
     * <p>The liveness probe of the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>.</p>
     * <p>To clear this configuration, set the value to <code>&quot;&quot;</code> or <code>{}</code>. If you do not set this parameter, it is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The configuration for mounting a host file to a container. Example: <code>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}]</code>. The following parameters are included:</p>
     * <ul>
     * <li><p><code>nodePath</code>: the path on the host.</p>
     * </li>
     * <li><p><code>mountPath</code>: the path in the container.</p>
     * </li>
     * <li><p><code>type</code>: the mount type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}]</p>
     */
    @NameInMap("LocalVolume")
    public String localVolume;

    /**
     * <p>The ID of the EDAS namespace. This parameter is required if you want to use a non-default namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen:beta****</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>Specifies whether to enable the graceful rolling deployment mode in which service registration is complete before the readiness probe is passed:</p>
     * <ul>
     * <li><p>true: A health check URL is provided for the application on port 55199. The path is /health. The URL returns 200 after the service is registered. Otherwise, the URL returns 500.</p>
     * <blockquote>
     * <p>If you also set <code>LosslessRuleRelated</code> to <code>true</code>, this URL is used to check whether the service warm-up is complete.</p>
     * </blockquote>
     * </li>
     * <li><p>false: A URL is not provided for the application to check whether the service is registered.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LosslessRuleAligned")
    public Boolean losslessRuleAligned;

    /**
     * <p>The delay of service registration. Unit: seconds. The value must be in the range of 0 to 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LosslessRuleDelayTime")
    public Integer losslessRuleDelayTime;

    /**
     * <p>The warm-up curve of the service. The value must be in the range of 0 to 20. Default value: 2. This value is suitable for normal warm-up scenarios and indicates that the traffic that the service provider receives follows a quadratic curve during the warm-up period.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LosslessRuleFuncType")
    public Integer losslessRuleFuncType;

    /**
     * <p>Specifies whether to enable the graceful rolling deployment mode in which service warm-up is complete before the readiness probe is passed:</p>
     * <ul>
     * <li><p>true: A health check URL is provided for the application on port 55199. The path is /health. The URL returns 200 after the service warm-up is complete. Otherwise, the URL returns 500.</p>
     * </li>
     * <li><p>false: A URL is not provided for the application to check whether the service warm-up is complete.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LosslessRuleRelated")
    public Boolean losslessRuleRelated;

    /**
     * <p>The warm-up duration of the service. Unit: seconds. The value must be in the range of 0 to 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("LosslessRuleWarmupTime")
    public Integer losslessRuleWarmupTime;

    /**
     * <p>The description of the mount configuration. The value is a serialized JSON string. Example: <code>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}]</code>. <code>nasPath</code> specifies the file storage path. <code>mountPath</code> specifies the path to which the file system is mounted in the container.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}]</p>
     */
    @NameInMap("MountDescs")
    public String mountDescs;

    /**
     * <p>The namespace of the Kubernetes cluster. This parameter determines the Kubernetes namespace in which your application is deployed. The default value is default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the NAS file system that you want to mount. If you do not specify this parameter but mountDescs is specified, a new NAS file system is automatically purchased and mounted to a vSwitch in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>dfs23****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The type of the application package. Valid values: FatJar, WAR, and Image.</p>
     * 
     * <strong>example:</strong>
     * <p>WAR</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The URL of the deployment package. This parameter is required for applications that are deployed using a FatJar or WAR package.</p>
     * <blockquote>
     * <p>The version of the EDAS POP API SDK for Java or Python must be 2.44.0 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar">https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version number of the deployment package. This parameter is required for WAR and FatJar packages. You can define the meaning of the version number.</p>
     * <blockquote>
     * <p>The version of the EDAS POP API SDK for Java or Python must be 2.44.0 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20200720</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The script that is run after the container is started. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code>.</p>
     * <p>To clear this configuration, set the value to <code>&quot;&quot;</code> or <code>{}</code>. If you do not set this parameter, it is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;ls\&quot;,\&quot;/\&quot;]}}&quot;</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script that is run before the container is stopped. Example: <code>{&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>.</p>
     * <p>To clear this configuration, set the value to <code>&quot;&quot;</code> or <code>{}</code>. If you do not set this parameter, it is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;ls\&quot;,\&quot;/\&quot;]}}&quot;</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC). You can mount a Kubernetes PVC volume to a specified directory in a container. The following parameters are included in PvcMountDescs:</p>
     * <ul>
     * <li><p>pvcName: The name of the PVC volume. The PVC volume must exist and be in the Bound state.</p>
     * </li>
     * <li><p>mountPaths: The list of mount directories. You can configure multiple mount directories. Each mount directory supports two parameters.</p>
     * <ul>
     * <li><p>mountPath: The mount path. The path must be an absolute path that starts with a forward slash (/).</p>
     * </li>
     * <li><p>readOnly: The mount mode. true specifies the read-only mode. false specifies the read and write mode. Default value: false.</p>
     * </li>
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
     * <p>The readiness probe of the container. If the check fails, traffic is not routed to the container through the Kubernetes Service. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}</code>.</p>
     * <p>To clear this configuration, set the value to <code>&quot;&quot;</code> or <code>{}</code>. If you do not set this parameter, it is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    /**
     * <p>The number of application instances.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>ced********</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The number of CPU cores requested for an application instance upon creation. Unit: cores. A value of 0 means no limit. If you specify RequestsmCpu, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RequestsCpu")
    public Integer requestsCpu;

    /**
     * <p>The minimum ephemeral storage. Unit: GB. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RequestsEphemeralStorage")
    public Integer requestsEphemeralStorage;

    /**
     * <p>The amount of memory requested for an application instance upon creation. Unit: MB. A value of 0 means no limit. The value of RequestsMem cannot be greater than the value of LimitMem.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RequestsMem")
    public Integer requestsMem;

    /**
     * <p>The number of CPU cores requested for an application instance upon creation. Unit: millicores.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("RequestsmCpu")
    public Integer requestsmCpu;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>461</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the container runtime. This parameter is applicable only to clusters that use sandboxed containers.</p>
     * 
     * <strong>example:</strong>
     * <p>runc</p>
     */
    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    /**
     * <p>The name of the image pull secret. You must create the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>edas-app-01-image-secret</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The SecurityContext attribute for the application pod container. The value is the Base64-encoded YAML configuration of the SecurityContext.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;yamlEncoded&quot;:&quot;cnVuQXNVc2VyOiAwCnJ1bkFzR3JvdXA6IDA=&quot;}</p>
     */
    @NameInMap("SecurityContext")
    public String securityContext;

    /**
     * <p>The configuration of the Kubernetes Service.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;test-svc-create&quot;,&quot;serviceType&quot;:&quot;ClusterIP&quot;,&quot;portMappings&quot;:[{&quot;servicePort&quot;: {&quot;targetPort&quot;:8080,&quot;port&quot;:80,&quot;protocol&quot;:&quot;TCP&quot;}}]}]</p>
     */
    @NameInMap("ServiceConfigs")
    public String serviceConfigs;

    /**
     * <p>The sidecar containers for the application pod. You can set the container configuration in the YAML format. The value is the Base64-encoded YAML configuration of the sidecar container.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;yamlEncoded&quot;:&quot;Y29tbWFuZDoKICAtIHRhaWwKICAtICctZicKICAtIC9kZXYvbnVsbAppbWFnZTogJ2J1c3lib3g6bGF0ZXN0JwpuYW1lOiBidXN5Ym94Cg==&quot;}]</p>
     */
    @NameInMap("Sidecars")
    public String sidecars;

    /**
     * <p>The Logstore configuration. To clear the configuration, set the value to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>:</p>
     * <ul>
     * <li><p>Configs:</p>
     * <ul>
     * <li><p>type: The collection type. file indicates the file type. stdout indicates the standard output type.</p>
     * </li>
     * <li><p>Logstore: The name of the Logstore. Make sure that the Logstore name is unique in the same cluster and meets the following naming conventions:</p>
     * <ul>
     * <li><p>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>The name must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>The name must be 3 to 63 characters in length. If you leave this parameter empty, the system automatically generates a name.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>LogDir: If the collection type is standard output, the collection path is stdout.log. If the collection type is file, the collection path is the path of the file to be collected. Wildcards are supported. The collection path must match the following regular expression: <code>^/(.+)/(.*)^/$</code>.</p>
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
     * <p>The startup probe. You can use a startup probe to check the liveness of a slow-start container and prevent the container from being killed before it is started. Example: {&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}.</p>
     * <p>To clear this configuration, set the value to &quot;&quot; or {}. If you do not set this parameter, it is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
     */
    @NameInMap("Startup")
    public String startup;

    /**
     * <p>The storage type of the NAS file system. Valid values:</p>
     * <ul>
     * <li><p>General-purpose NAS file systems: Capacity and Performance</p>
     * </li>
     * <li><p>Extreme NAS file systems: Standard and Advance</p>
     * </li>
     * </ul>
     * <p>Currently, only the Performance type is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The timeout period for a graceful stop. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("TerminateGracePeriod")
    public Integer terminateGracePeriod;

    /**
     * <p>The timeout period for the change process. Unit: seconds. The value must be in the range of 1 to 1800. If you do not specify this parameter, the default value 1800 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The URI encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
     * <blockquote>
     * <p>If you do not set this parameter for the application, the default value of Tomcat is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>GBK</p>
     */
    @NameInMap("UriEncoding")
    public String uriEncoding;

    /**
     * <p>Specifies whether to enable useBodyEncodingForURI.</p>
     * <blockquote>
     * <p>If you do not set this parameter for the application, the default value false is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseBodyEncoding")
    public Boolean useBodyEncoding;

    /**
     * <p>If you use a custom JDK runtime, you must configure the address of the base image. The address must be accessible over the Internet. The EDAS server pulls the image to build an application image.</p>
     * 
     * <strong>example:</strong>
     * <p>openjdk:8u302</p>
     */
    @NameInMap("UserBaseImageUrl")
    public String userBaseImageUrl;

    /**
     * <p>The version of the Tomcat container on which the deployment package depends. This parameter is applicable to Spring Cloud and Dubbo applications that are deployed using a WAR package. This parameter is not supported for image-based deployments.</p>
     * 
     * <strong>example:</strong>
     * <p>apache-tomcat-7.0.91</p>
     */
    @NameInMap("WebContainer")
    public String webContainer;

    /**
     * <p>The configuration of the Tomcat container. To clear the configuration, set the value to &quot;&quot; or &quot;{}&quot;:</p>
     * <ul>
     * <li><p>useDefaultConfig: Specifies whether to use the default configuration. If you set this parameter to true, the custom configuration is not used. If you set this parameter to false, the custom configuration is used. If you do not use the custom configuration, the following parameter settings do not take effect.</p>
     * </li>
     * <li><p>contextInputType: The access path of the application.</p>
     * <ul>
     * <li><p>war: You do not need to specify a custom path. The access path is the name of the WAR package.</p>
     * </li>
     * <li><p>root: You do not need to specify a custom path. The access path is <code>/</code>.</p>
     * </li>
     * <li><p>custom: You must specify a custom path in the contextPath parameter.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>contextPath: The custom path. This parameter is required only when you set contextInputType to custom.</p>
     * </li>
     * <li><p>httpPort: The port number. The value must be in the range of 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with administrator permissions, specify a port number greater than 1024. If you do not specify this parameter, the default port 8080 is used.</p>
     * </li>
     * <li><p>maxThreads: The maximum number of connections in the connection pool. Default value: 400.</p>
     * <blockquote>
     * <p>This parameter greatly affects application performance. Configure this parameter with the help of a professional.</p>
     * </blockquote>
     * </li>
     * <li><p>uriEncoding: The encoding format for Tomcat. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not specify this parameter, the default value ISO-8859-1 is used.</p>
     * </li>
     * <li><p>useBodyEncoding: Specifies whether to use BodyEncoding for URLs.</p>
     * </li>
     * <li><p>useAdvancedServerXml: Specifies whether to use advanced settings to customize the server.xml file. If the preceding parameter types and specific parameters cannot meet your requirements, you can use advanced settings to directly edit the server.xml file of Tomcat.</p>
     * </li>
     * <li><p>serverXml: The content of the server.xml file that is customized in the advanced settings. This parameter takes effect only when useAdvancedServerXml is set to true.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;useDefaultConfig&quot;:false,&quot;contextInputType&quot;:&quot;custom&quot;,&quot;contextPath&quot;:&quot;hello&quot;,&quot;httpPort&quot;:8088,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;UTF-8&quot;,&quot;useBodyEncoding&quot;:true,&quot;useAdvancedServerXml&quot;:false}</p>
     */
    @NameInMap("WebContainerConfig")
    public String webContainerConfig;

    /**
     * <p>The type of the workload. Currently, only deployments are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Deployment</p>
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

    public InsertK8sApplicationRequest setSecurityContext(String securityContext) {
        this.securityContext = securityContext;
        return this;
    }
    public String getSecurityContext() {
        return this.securityContext;
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
