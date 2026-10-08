// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeployK8sApplicationRequest extends TeaModel {
    /**
     * <p>The annotations for the application pod.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;annotation-name-1&quot;:&quot;annotation-value-1&quot;,&quot;annotation-name-2&quot;:&quot;annotation-value-2&quot;}</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The application ID. Obtain the ID by calling the ListApplication operation. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e83acea6-****-47e1-96ae-c0e953772cdc</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The arguments for the container startup command. The value must be a JSON array of strings, such as <code>[&quot;Argument 1&quot;, &quot;Argument 2&quot;]</code>. To clear the arguments, set the parameter to an empty JSON array <code>&quot;[]&quot;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;args1&quot;,&quot;args2&quot;]</p>
     */
    @NameInMap("Args")
    public String args;

    /**
     * <p>The timeout period for a single batch release. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("BatchTimeout")
    public Integer batchTimeout;

    /**
     * <p>The minimum interval for a phased release of pods. For more information, see <a href="https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds">minReadySeconds</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The build package number for EDAS Container:</p>
     * <ul>
     * <li><p>If you do not need to change the EDAS Container version during deployment, you can leave this parameter unset.</p>
     * </li>
     * <li><p>To update the EDAS Container version of the target application during this deployment, you must set this parameter.</p>
     * </li>
     * </ul>
     * <p>You can obtain the number in two ways:</p>
     * <ul>
     * <li><p>Call the ListBuildPack operation to query the list of container versions. For more information, see <a href="https://help.aliyun.com/document_detail/423222.html">ListBuildPack</a>.</p>
     * </li>
     * <li><p>Obtain it from the <strong>Build Package Number</strong> column in the <a href="https://help.aliyun.com/document_detail/92614.html">Version guide</a> table. For example, <code>59</code> indicates <code>EDAS Container 3.5.8</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("BuildPackId")
    public String buildPackId;

    /**
     * <p>The ID of the canary release rule policy.</p>
     * 
     * <strong>example:</strong>
     * <p>a8daf22e-****-968c7ff2ea34</p>
     */
    @NameInMap("CanaryRuleId")
    public String canaryRuleId;

    /**
     * <p>The description of the change record.</p>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("ChangeOrderDesc")
    public String changeOrderDesc;

    /**
     * <p>The container startup command.</p>
     * <blockquote>
     * <p>To clear this configuration, set the parameter to an empty string <code>&quot;&quot;</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ls</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>Configures Kubernetes ConfigMap and Secret mounts. This lets you mount a ConfigMap or Secret to a specified container directory. The parameters for \<code>ConfigMountDescs\\</code> are as follows:</p>
     * <ul>
     * <li><p>\<code>name\\</code>: The name of the ConfigMap or Secret.</p>
     * </li>
     * <li><p>\<code>type\\</code>: The configuration type. \<code>ConfigMap\\</code> and \<code>Secret\\</code> are supported.</p>
     * </li>
     * <li><p>\<code>mountPath\\</code>: The mount path. An absolute path in the container that starts with a forward slash (/).</p>
     * </li>
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
     * <p>The CPU limit for the application instance during runtime. Unit: cores. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CpuLimit")
    public Integer cpuLimit;

    /**
     * <p>The CPU quota to request for the application instance during runtime. Setting this parameter is recommended.
     * Unit: cores. A value of 0 means no limit.</p>
     * <blockquote>
     * <p>If you set this parameter, also set the CpuLimit parameter. The value of CpuRequest must be less than or equal to the value of CpuLimit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CpuRequest")
    public Integer cpuRequest;

    /**
     * <p>The pod affinity configuration. This takes effect only when both \<code>DeployAcrossNodes\\</code> and \<code>DeployAcrossZones\\</code> are \<code>false\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nodeAffinity&quot;:{&quot;requiredDuringSchedulingIgnoredDuringExecution&quot;:{&quot;nodeSelectorTerms&quot;:[{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;beta.kubernetes.io/arch&quot;,&quot;operator&quot;:&quot;NotIn&quot;,&quot;values&quot;:[&quot;arm64&quot;,&quot;arm32&quot;]}]}]},&quot;preferredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;weight&quot;:5,&quot;preference&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;kubernetes.io/os&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;linux&quot;]}]}}]},&quot;podAffinity&quot;:{&quot;requiredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;namespaces&quot;:[&quot;default&quot;],&quot;topologyKey&quot;:&quot;kubernetes.io/hostname&quot;,&quot;labelSelector&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;edas.oam.acname&quot;,&quot;operator&quot;:&quot;NotIn&quot;,&quot;values&quot;:[&quot;edas-test-app&quot;]}]}}]},&quot;podAntiAffinity&quot;:{&quot;preferredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;podAffinityTerm&quot;:{&quot;namespaces&quot;:[&quot;default&quot;],&quot;topologyKey&quot;:&quot;failure-domain.beta.kubernetes.io/zone&quot;,&quot;labelSelector&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;edas.oam.acname&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;edas-test-app-2&quot;]}]}},&quot;weight&quot;:15}]}}</p>
     */
    @NameInMap("CustomAffinity")
    public String customAffinity;

    /**
     * <p>Sets the version of the custom Application Real-Time Monitoring Service (ARMS) agent to mount to the application.</p>
     * <blockquote>
     * <p>This feature is available only to whitelisted users. To use this feature, submit a ticket to be added to the whitelist.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3.1.4</p>
     */
    @NameInMap("CustomAgentVersion")
    public String customAgentVersion;

    /**
     * <p>The pod scheduling toleration configuration. This takes effect only when both \<code>DeployAcrossNodes\\</code> and \<code>DeployAcrossZones\\</code> are \<code>false\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;edas-taint-key2&quot;,&quot;operator&quot;:&quot;Exists&quot;,&quot;effect&quot;:&quot;NoExecute&quot;,&quot;tolerationSeconds&quot;:50},{&quot;key&quot;:&quot;edas-taint-key&quot;,&quot;operator&quot;:&quot;Equal&quot;,&quot;value&quot;:&quot;edas-taint-value&quot;,&quot;effect&quot;:&quot;PreferNoSchedule&quot;}]</p>
     */
    @NameInMap("CustomTolerations")
    public String customTolerations;

    /**
     * <p>Specifies whether to distribute application instances across multiple nodes. \<code>true\\</code> indicates yes, and other values indicate no.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeployAcrossNodes")
    public String deployAcrossNodes;

    /**
     * <p>Specifies whether to distribute application instances across multiple zones. \<code>true\\</code> indicates yes, and other values indicate no.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeployAcrossZones")
    public String deployAcrossZones;

    /**
     * <p>The EDAS Container version on which the deployment package depends. This parameter applies to HSF applications deployed using WAR packages. It is not supported for image-based deployments.</p>
     * 
     * <strong>example:</strong>
     * <p>3.5.9</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>Configures Kubernetes \<code>emptyDir\\</code> mounts. This lets you mount an \<code>emptyDir\\</code> volume to a specified container directory. The parameters for \<code>EmptyDirs\\</code> are as follows:</p>
     * <ul>
     * <li><p>\<code>mountPath\\</code>: The container mount path. This is required.</p>
     * </li>
     * <li><p>\<code>readOnly\\</code>: Specifies whether the volume is read-only. Optional. \<code>true\\</code> for read-only, \<code>false\\</code> for read-write. The default is \<code>false\\</code>.</p>
     * </li>
     * <li><p>\<code>subPathExpr\\</code>: The subdirectory expression. Optional.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/app-log&quot;,&quot;subPathExpr&quot;:&quot;$(POD_IP)&quot;},{&quot;readOnly&quot;:true,&quot;mountPath&quot;:&quot;/etc/nginx&quot;}]</p>
     */
    @NameInMap("EmptyDirs")
    public String emptyDirs;

    /**
     * <p>Specifies whether to connect to Application High Availability Service (AHAS).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    /**
     * <p>Specifies whether to enable empty push protection:</p>
     * <ul>
     * <li><p>\<code>true\\</code>: Enable empty push protection.</p>
     * </li>
     * <li><p>\<code>false\\</code>: Do not enable empty push protection.</p>
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
     * <li><p>\<code>true\\</code>: Enable the graceful start rule.</p>
     * </li>
     * <li><p>\<code>false\\</code>: Do not enable the graceful start rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLosslessRule")
    public Boolean enableLosslessRule;

    /**
     * <p>Configures environment variables of the Kubernetes \<code>EnvFrom\\</code> type. This mounts a specified ConfigMap or Secret to a directory. Each key corresponds to a file in the directory, and the file content is the value of the key.</p>
     * <p>The parameters for \<code>EnvFroms\\</code> are as follows.</p>
     * <ul>
     * <li><p>\<code>configMapRef\\</code>: A reference to a ConfigMap. This field includes the following parameter:</p>
     * <ul>
     * <li>\<code>name\\</code>: The name of the ConfigMap.</li>
     * </ul>
     * </li>
     * <li><p>\<code>secretRef\\</code>: A reference to a Secret. This field includes the following parameter:</p>
     * <ul>
     * <li>\<code>name\\</code>: The name of the Secret.</li>
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
     * <p>The environment variables for the deployment. The value must be a JSON array of objects. Three types of environment variables are supported: regular, Kubernetes ConfigMap, and Kubernetes Secret. The format for a regular environment variable is as follows:</p>
     * <p><code>{&quot;name&quot;:&quot;x&quot;, &quot;value&quot;: &quot;y&quot;}</code></p>
     * <p>A ConfigMap environment variable injects the value of a specified key from a ConfigMap into the container\&quot;s environment variables. The format is as follows:</p>
     * <p><code>{ &quot;name&quot;: &quot;x2&quot;, &quot;valueFrom&quot;: { &quot;configMapKeyRef&quot;: { &quot;name&quot;: &quot;my-config&quot;, &quot;key&quot;: &quot;y2&quot; } } }</code></p>
     * <p>A Secret environment variable injects the value of a specified key from a Secret into the container\&quot;s environment variables. The format is as follows:</p>
     * <p><code>{ &quot;name&quot;: &quot;x3&quot;, &quot;valueFrom&quot;: { &quot;secretKeyRef&quot;: { &quot;name&quot;: &quot;my-secret&quot;, &quot;key&quot;: &quot;y3&quot; } } }</code></p>
     * <blockquote>
     * <p>To clear this configuration, set the parameter to an empty JSON array \<code>[]\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;x1&quot;,&quot;value&quot;:&quot;y1&quot;},{&quot;name&quot;:&quot;x2&quot;,&quot;valueFrom&quot;:{&quot;configMapKeyRef&quot;:{&quot;name&quot;:&quot;my-config&quot;,&quot;key&quot;:&quot;y2&quot;}}},{&quot;name&quot;:&quot;x3&quot;,&quot;valueFrom&quot;:{&quot;secretKeyRef&quot;:{&quot;name&quot;:&quot;my-secret&quot;,&quot;key&quot;:&quot;y3&quot;}}}]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The full URL of the image. This parameter overwrites the ImageTag parameter.</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The target platform architecture for the image. This is valid when deploying with a WAR or JAR file. Examples:</p>
     * <ul>
     * <li><p>To specify the x86-64 architecture: \<code>linux/amd64\\</code></p>
     * </li>
     * <li><p>To specify the ARM 64 architecture: \<code>linux/arm64\\</code></p>
     * </li>
     * <li><p>To build a dual-architecture image: \<code>linux/amd64,linux/arm64\\</code></p>
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
     * <p>The image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>Sets an init container for the application pod. The container configuration is in YAML format. The value is the base64-encoded YAML configuration of the init container.</p>
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
     * <p>The JDK version on which the deployment package depends. Valid values: Open JDK 7, Open JDK 8, or Custom OpenJDK. This parameter is not supported for image-based deployments. If you use Custom OpenJDK, you must also configure the \<code>UserBaseImageUrl\\</code> field.</p>
     * 
     * <strong>example:</strong>
     * <p>Open JDK 8</p>
     */
    @NameInMap("JDK")
    public String JDK;

    /**
     * <p>The Java startup parameters. You can configure memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom settings. Correctly configuring these parameters helps reduce GC overhead, shorten server response time, and improve throughput. The parameter is a JSON string. \<code>original\\</code> is the configuration value, and \<code>startup\\</code> is the startup parameter. The system automatically concatenates all \<code>startup\\</code> values as the Java startup parameters for the application. Set to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code> to delete the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;InitialHeapSize&quot;:{&quot;original&quot;:512,&quot;startup&quot;:&quot;-Xms512m&quot;},&quot;MaxHeapSize&quot;:{&quot;original&quot;:1024,&quot;startup&quot;:&quot;-Xmx1024m&quot;}}</p>
     */
    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    /**
     * <p>The labels for the application pod.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;label-name-1&quot;:&quot;label-value-1&quot;,&quot;label-name-2&quot;:&quot;label-value-2&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The upper limit of the temporary storage resource requirement. Unit: GB. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LimitEphemeralStorage")
    public Integer limitEphemeralStorage;

    /**
     * <p>The liveness probe for the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>. To delete this configuration, set the parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not set this parameter, the configuration is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The configuration for mounting a host file to a container. Example: <code>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}]</code>. In this example, \<code>nodePath\\</code> is the host path, \<code>mountPath\\</code> is the path in the container, and \<code>type\\</code> is the mount type.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}]</p>
     */
    @NameInMap("LocalVolume")
    public String localVolume;

    /**
     * <p>Specifies whether to enable the graceful rolling deployment mode to complete service registration before the readiness probe succeeds:</p>
     * <ul>
     * <li>\<code>true\\</code>: This switch provides a health check for the application on port 55199 and the \<code>/health\\</code> path without intrusion. When service registration is complete, the interface returns 200. Otherwise, it returns 500.</li>
     * </ul>
     * <blockquote>
     * <p>If \<code>LosslessRuleRelated\\</code> is also set to \<code>true\\</code>, this interface checks whether service prefetch is complete.</p>
     * </blockquote>
     * <ul>
     * <li>\<code>false\\</code>: Does not provide an interface for the application to check if service registration is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LosslessRuleAligned")
    public Boolean losslessRuleAligned;

    /**
     * <p>The service registration latency. Unit: seconds. The value ranges from 0 to 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LosslessRuleDelayTime")
    public Integer losslessRuleDelayTime;

    /**
     * <p>The service prefetch curve. The value ranges from 0 to 20. The default is 2, which is suitable for general prefetch scenarios. This indicates that the traffic receiving curve of the service provider follows a quadratic curve during the prefetch period.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LosslessRuleFuncType")
    public Integer losslessRuleFuncType;

    /**
     * <p>Specifies whether to enable the graceful rolling deployment mode to complete service prefetch before the readiness probe succeeds:</p>
     * <ul>
     * <li><p>\<code>true\\</code>: This switch provides a health check for the application on port 55199 and the \<code>/health\\</code> path without intrusion. When service prefetch is complete, the interface returns 200. Otherwise, it returns 500.</p>
     * </li>
     * <li><p>\<code>false\\</code>: Does not provide an interface for the application to check if service prefetch is complete.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LosslessRuleRelated")
    public Boolean losslessRuleRelated;

    /**
     * <p>The service prefetch duration. Unit: seconds. The value ranges from 0 to 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("LosslessRuleWarmupTime")
    public Integer losslessRuleWarmupTime;

    /**
     * <p>The maximum CPU that can be used. Unit: cores. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("McpuLimit")
    public Integer mcpuLimit;

    /**
     * <p>The minimum CPU resource requirement. Unit: cores. A value of 0 means no limit.</p>
     * <blockquote>
     * <p>If you set this parameter, you must also set the \<code>CpuLimit\\</code> parameter. The value must be less than or equal to the value of \<code>CpuLimit\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("McpuRequest")
    public Integer mcpuRequest;

    /**
     * <p>The memory limit for the application instance during runtime. Unit: MB. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MemoryLimit")
    public Integer memoryLimit;

    /**
     * <p>The memory quota to request for the application instance during runtime. Setting this parameter is recommended. Unit: MB. A value of 0 means no request.</p>
     * <blockquote>
     * <p>If you set this parameter, also set the MemoryLimit parameter. The value of MemoryRequest must be less than or equal to the value of MemoryLimit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MemoryRequest")
    public Integer memoryRequest;

    /**
     * <p>The mount configurations, which are a serialized JSON string. Example: <code>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}]</code>. In this example, \<code>nasPath\\</code> is the file storage path and \<code>mountPath\\</code> is the path in the container to which the file system is mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}]</p>
     */
    @NameInMap("MountDescs")
    public String mountDescs;

    /**
     * <p>The ID of the Apsara File Storage NAS (NAS) file system to mount. The NAS file system must be in the same region as the cluster. It must have an available mount target quota, or its mount target must be on a vSwitch in the VPC. If you do not set this parameter but the \<code>mountDescs\\</code> field exists, a NAS file system is automatically purchased and mounted to a vSwitch in the VPC by default.</p>
     * 
     * <strong>example:</strong>
     * <p>dfs23****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The URL of the deployment package. Configure this parameter for applications deployed using a FatJar or WAR package.</p>
     * <blockquote>
     * <p>The Java or Python SDK for EDAS POP API must be version 2.44.0 or later.</p>
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
     * <p>The Java or Python SDK for EDAS POP API must be version 2.44.0 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20200720</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The ID of the deployment package version.</p>
     * 
     * <strong>example:</strong>
     * <p>2bcc********</p>
     */
    @NameInMap("PackageVersionId")
    public String packageVersionId;

    /**
     * <p>The script to execute after the container starts. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code>. To delete this configuration, set the parameter to <code>{}</code>. If you do not set this parameter, the configuration is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;exec&quot;:{
     *         &quot;command&quot;:[
     *             &quot;ls&quot;,
     *             &quot;/&quot;
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script to execute before stopping the container. Example: <code>{&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>.
     * To delete this configuration, set the parameter to <code>{}</code>. If you do not set this parameter, the configuration is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;exec&quot;:{
     *         &quot;command&quot;:[
     *             &quot;ls&quot;,
     *             &quot;/&quot;
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>Configures Kubernetes PersistentVolumeClaim (PVC) mounts. This lets you mount a Kubernetes PVC volume to a specified container directory. The parameters for \<code>PvcMountDescs\\</code> are as follows:</p>
     * <ul>
     * <li><p>\<code>pvcName\\</code>: The name of the PVC volume. The PVC volume must already exist and be in the Bound state.</p>
     * </li>
     * <li><p>\<code>mountPaths\\</code>: A list of mount directories. You can configure multiple mount directories. Each mount directory supports the following two parameters:</p>
     * <ul>
     * <li><p>\<code>mountPath\\</code>: The mount path. An absolute path in the container that starts with a forward slash (/).</p>
     * </li>
     * <li><p>\<code>readOnly\\</code>: The mount mode. \<code>true\\</code> for read-only, \<code>false\\</code> for read-write. The default is \<code>false\\</code>.</p>
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
     * <p>The readiness probe for the container. If the probe fails, traffic from the Kubernetes service is not routed to the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}</code>. To delete this configuration, set the parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not set this parameter, the configuration is ignored.</p>
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
     * <p>The minimum temporary storage resource requirement. Unit: GB. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RequestsEphemeralStorage")
    public Integer requestsEphemeralStorage;

    /**
     * <p>The container runtime type:</p>
     * <ul>
     * <li><p>\<code>runc\\</code>: regular container runtime.</p>
     * </li>
     * <li><p>\<code>runv\\</code>: sandboxed container.</p>
     * </li>
     * </ul>
     * <p>This parameter applies only to clusters that use sandboxed containers.</p>
     * 
     * <strong>example:</strong>
     * <p>runc</p>
     */
    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    /**
     * <p>Sets the \<code>SecurityContext\\</code> property for the application pod container. The value is the base64-encoded YAML configuration of the \<code>SecurityContext\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;yamlEncoded&quot;:&quot;cnVuQXNVc2VyOiAwCnJ1bkFzR3JvdXA6IDA=&quot;}</p>
     */
    @NameInMap("SecurityContext")
    public String securityContext;

    /**
     * <p>Sets a sidecar container for the application pod. The container configuration is in YAML format. The value is the base64-encoded YAML configuration of the sidecar container.</p>
     * 
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
     * <p>The Logstore configuration. Set to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code> to delete the configuration:</p>
     * <ul>
     * <li><p>\<code>Configs\\</code>:</p>
     * <ul>
     * <li><p>\<code>type\\</code>: The collection type. \<code>file\\</code> for file type, \<code>stdout\\</code> for standard output type.</p>
     * </li>
     * <li><p>\<code>Logstore\\</code>: The name of the Logstore. Make sure the Logstore name is unique within the same cluster. The name must follow these rules:</p>
     * <ul>
     * <li><p>It can only contain lowercase letters, numbers, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>It must start and end with a lowercase letter or a number.</p>
     * </li>
     * <li><p>The name must be 3 to 63 characters long. If left empty, the system generates a name automatically.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>\<code>LogDir\\</code>: If the type is standard output, the collection path is \<code>stdout.log\\</code>. If the type is file, this is the path of the file to collect. Wildcards are supported. The collection path must match the regular expression: <code>^/(.+)/(.*)^/$</code>.</p>
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
     * <p>The startup probe can be used to perform liveness checks on slow-starting containers to prevent them from being killed before they are up and running. Example: {&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}.</p>
     * <p>To delete this configuration, set the parameter to &quot;&quot; or {}. If you do not set this parameter, the configuration is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
     */
    @NameInMap("Startup")
    public String startup;

    /**
     * <p>The storage type of the NAS file system. Valid values:</p>
     * <ul>
     * <li><p>General-purpose NAS: \<code>Capacity\\</code> and \<code>Performance\\</code></p>
     * </li>
     * <li><p>Extreme NAS: \<code>standard\\</code> and \<code>advance\\</code></p>
     * </li>
     * </ul>
     * <p>Currently, only the \<code>Performance\\</code> type is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The graceful stop timeout period for the application. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("TerminateGracePeriod")
    public Integer terminateGracePeriod;

    /**
     * <p>The traffic control policy for phased release.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;http&quot;:{&quot;rules&quot;:[{&quot;conditionType&quot;:&quot;percent&quot;,&quot;percent&quot;:10}]}}</p>
     */
    @NameInMap("TrafficControlStrategy")
    public String trafficControlStrategy;

    /**
     * <p>The phased release policy.</p>
     * <ul>
     * <li><p>Example 1: Phased release with one canary instance, followed by two batches, automatic batching, and a 1-minute interval.
     * <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
     * </li>
     * <li><p>Example 2: Phased release with one canary instance, followed by two batches and manual batching.
     * <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
     * </li>
     * <li><p>Example 3: Phased release in two batches, with automatic batching and a 0-minute interval.
     * <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
     */
    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    /**
     * <p>The URI encoding format. Supported formats: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
     * <blockquote>
     * <p>If you do not set this parameter in the application configuration, the default Tomcat value is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>GBK</p>
     */
    @NameInMap("UriEncoding")
    public String uriEncoding;

    /**
     * <p>Specifies whether to enable \<code>useBodyEncodingForURI\\</code>.</p>
     * <blockquote>
     * <p>If you do not set this parameter in the application configuration, the default value \<code>false\\</code> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseBodyEncoding")
    public Boolean useBodyEncoding;

    /**
     * <p>When using a custom JDK runtime, you must configure the base image address. This address must be publicly accessible. The EDAS server pulls this image to build the application image.</p>
     * 
     * <strong>example:</strong>
     * <p>openjdk:8u302</p>
     */
    @NameInMap("UserBaseImageUrl")
    public String userBaseImageUrl;

    /**
     * <p>The data volumes.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VolumesStr")
    public String volumesStr;

    /**
     * <p>The Tomcat version on which the deployment package depends. This parameter applies to Spring Cloud and Dubbo applications deployed using WAR packages. It is not supported for image-based deployments.</p>
     * 
     * <strong>example:</strong>
     * <p>apache-tomcat-7.0.91</p>
     */
    @NameInMap("WebContainer")
    public String webContainer;

    /**
     * <p>The Tomcat container configuration. Set to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code> to delete the configuration:</p>
     * <ul>
     * <li><p>\<code>useDefaultConfig\\</code>: Specifies whether to use a custom configuration. If \<code>true\\</code>, the custom configuration is not used. If \<code>false\\</code>, the custom configuration is used. If you do not use a custom configuration, the following parameter settings do not take effect.</p>
     * </li>
     * <li><p>\<code>contextInputType\\</code>: The access path of the application.</p>
     * <ul>
     * <li><p>\<code>war\\</code>: You do not need to enter a custom path. The access path is the name of the WAR package.</p>
     * </li>
     * <li><p>\<code>root\\</code>: You do not need to enter a custom path. The access path is \<code>/\\</code>.</p>
     * </li>
     * <li><p>\<code>custom\\</code>: You need to enter a custom path in the \<code>contextPath\\</code> parameter below.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>\<code>contextPath\\</code>: The custom path. This parameter is required only when \<code>contextInputType\\</code> is set to \<code>custom\\</code>.</p>
     * </li>
     * <li><p>\<code>httpPort\\</code>: The port number. The valid range is 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with administrator permissions, specify a port number greater than 1024. If you do not configure this, the default port is 8080.</p>
     * </li>
     * <li><p>\<code>maxThreads\\</code>: The size of the connection pool. The default value is 400.</p>
     * <blockquote>
     * <p>This configuration greatly affects application performance. Configure it under professional guidance.</p>
     * </blockquote>
     * </li>
     * <li><p>\<code>uriEncoding\\</code>: The encoding format for Tomcat. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not set this, the default is ISO-8859-1.</p>
     * </li>
     * <li><p>\<code>useBodyEncoding\\</code>: Specifies whether to use BodyEncoding for URLs.</p>
     * </li>
     * <li><p>\<code>useAdvancedServerXml\\</code>: Specifies whether to use advanced configuration to customize the \<code>server.xml\\</code> file. If the preceding parameter types and values do not meet your needs, you can use the advanced settings to directly edit the Tomcat \<code>Server.xml\\</code> file.</p>
     * </li>
     * <li><p>\<code>serverXml\\</code>: The content of the custom \<code>server.xml\\</code> text file in the advanced configuration. This takes effect when \<code>useAdvancedServerXml\\</code> is \<code>true\\</code>.</p>
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
