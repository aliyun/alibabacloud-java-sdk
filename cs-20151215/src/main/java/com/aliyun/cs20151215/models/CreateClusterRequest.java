// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>【<strong>该字段已废弃</strong>】注册集群 API Server SLB 访问控制列表。</p>
     */
    @NameInMap("access_control_list")
    @Deprecated
    public java.util.List<String> accessControlList;

    /**
     * <p>The list of cluster components. Specify the components to install when creating a cluster using <code>addons</code>.</p>
     * <p><strong>Network component</strong>: Required. Choose between Flannel and Terway network types:</p>
     * <ul>
     * <li>Flannel network: [{&quot;name&quot;:&quot;flannel&quot;,&quot;config&quot;:&quot;&quot;}\].</li>
     * <li>Terway network: [{&quot;name&quot;: &quot;terway-eniip&quot;,&quot;config&quot;: &quot;&quot;}\].</li>
     * </ul>
     * <p><strong>Storage component</strong>: Optional. Only the <code>csi</code> type is supported:</p>
     * <p><code>csi</code>: [{&quot;name&quot;:&quot;csi-plugin&quot;,&quot;config&quot;: &quot;&quot;},{&quot;name&quot;: &quot;csi-provisioner&quot;,&quot;config&quot;: &quot;&quot;}\].</p>
     * <p><strong>Log component</strong>: Optional. We recommend that you enable this component. If the log service is not enabled, the cluster audit feature is unavailable.</p>
     * <ul>
     * <li>Use an existing <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;,\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}\].</li>
     * <li>Create a new <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;}&quot;}\].</li>
     * </ul>
     * <p><strong>Ingress component</strong>: Optional. ACK dedicated clusters install the Ingress component <code>nginx-ingress-controller</code> by default.</p>
     * <ul>
     * <li>Install Ingress with public network access: [{&quot;name&quot;:&quot;nginx-ingress-controller&quot;,&quot;config&quot;:&quot;{\&quot;IngressSlbNetworkType\&quot;:\&quot;internet\&quot;}&quot;}\].</li>
     * <li>Disable default Ingress installation: [{&quot;name&quot;: &quot;nginx-ingress-controller&quot;,&quot;config&quot;: &quot;&quot;,&quot;disabled&quot;: true}\].</li>
     * </ul>
     * <p><strong>Event Center</strong>: Optional. Enabled by default.</p>
     * <p>The Event Center provides storage, query, and alerting capabilities for Kubernetes events. The Logstore associated with the Kubernetes Event Center is free for 90 days. For more information about the free policy, see <a href="https://help.aliyun.com/document_detail/150476.html">Create and use the Kubernetes event center</a>.</p>
     * <p>Example of enabling the Event Center: [{&quot;name&quot;:&quot;ack-node-problem-detector&quot;,&quot;config&quot;:&quot;{\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}\].</p>
     */
    @NameInMap("addons")
    public java.util.List<Addon> addons;

    /**
     * <p>A ServiceAccount is the access credential for communication between a Pod and the cluster API Server. The <code>api-audiences</code> is the valid request <code>token</code> identity, used by the <code>apiserver</code> to authenticate whether a request <code>token</code> is valid. Multiple <code>audiences</code> are supported, separated by commas (,).</p>
     * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Deploy service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("api_audiences")
    public String apiAudiences;

    /**
     * <p>The cluster audit log configuration.</p>
     */
    @NameInMap("audit_log_config")
    public CreateClusterRequestAuditLogConfig auditLogConfig;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/2938898.html">intelligent managed mode</a> configuration.</p>
     */
    @NameInMap("auto_mode")
    public CreateClusterRequestAutoMode autoMode;

    /**
     * <p>【<strong>该字段已废弃</strong>】</p>
     * <p>是否开启自动续费，当<code>charge_type</code>取值为<code>PrePaid</code>时才生效。取值：</p>
     * <ul>
     * <li><code>true</code>：自动续费。</li>
     * <li><code>false</code>：不自动续费。</li>
     * </ul>
     * <p>默认值：<code>false</code>。</p>
     * <p>该字段于2024年10月15日存在变更，更多信息，请参见<a href="https://help.aliyun.com/document_detail/2849194.html">关于集群创建接口CreateCluster参数行为变更的公告</a>。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_renew")
    @Deprecated
    public Boolean autoRenew;

    /**
     * <p>【<strong>该字段已废弃</strong>】</p>
     * <p>自动续费周期，当选择预付费和自动续费时才生效。当<code>PeriodUnit=Month</code>时，取值范围：{1, 2, 3, 6, 12}。</p>
     * <p>默认值：1。</p>
     * <p>该字段于2024年10月15日存在变更，更多信息，请参见<a href="https://help.aliyun.com/document_detail/2849194.html">关于集群创建接口CreateCluster参数行为变更的公告</a>。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("auto_renew_period")
    @Deprecated
    public Long autoRenewPeriod;

    /**
     * <p>【<strong>该字段已废弃</strong>】</p>
     * <p>API Server所使用的CLB实例的付费类型，默认值为PostPaid。取值：</p>
     * <ul>
     * <li>PostPaid：按量付费。</li>
     * <li>PrePaid：包年包月，新建CLB付费类型已不支持，存量不影响。</li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>该字段于2024年10月15日存在变更，更多信息，请参见<a href="https://help.aliyun.com/document_detail/2849194.html">关于集群创建接口CreateCluster参数行为变更的公告</a>。</li>
     * <li>自2024年12月01日起，新创建的CLB实例不再支持包年包月付费类型，同时将新增收取实例费。</notice>
     * <props="china">详细信息请参见[【产品公告】关于取消新增集群API Server负载均衡CLB包年包月付费的公告](https://help.aliyun.com/document_detail/2851191.html)、[传统型负载均衡CLB计费项调整公告](https://help.aliyun.com/document_detail/2839797.html)。
     * <props="intl">详细信息请参见[传统型负载均衡CLB计费项调整公告](https://help.aliyun.com/document_detail/2839797.html)。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("charge_type")
    @Deprecated
    public String chargeType;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cis_enabled")
    @Deprecated
    public Boolean cisEnabled;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane node configurations, use the <code>cloud_monitor_flags</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>cms_enabled</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * <p>Specifies whether to install the CloudMonitor agent on the cluster. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Installs the CloudMonitor agent.</li>
     * <li><code>false</code>: Does not install the CloudMonitor agent.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cloud_monitor_flags")
    @Deprecated
    public Boolean cloudMonitorFlags;

    /**
     * <p>The cluster local domain.</p>
     * <p>Naming rules: The domain consists of one or more parts separated by periods (.). Each part can be up to 63 characters in length and can contain lowercase letters, digits, and hyphens (-). Each part must start and end with a lowercase letter or digit.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster.local</p>
     */
    @NameInMap("cluster_domain")
    public String clusterDomain;

    /**
     * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure <code>profile</code>, you can further specify the cluster specification. Valid values:</p>
     * <ul>
     * <li><code>ack.standard</code>: Basic (selected by default when the value is empty)</li>
     * <li><code>ack.pro.small</code>: Pro</li>
     * <li><code>ack.pro.xlarge</code>: Pro XL</li>
     * <li><code>ack.pro.2xlarge</code>: Pro 2XL</li>
     * <li><code>ack.pro.4xlarge</code>: Pro 4XL (requires contacting customer service to enable the whitelist)</li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>. By pre-allocating and fixing control plane resources, they ensure that API concurrency and Pod scheduling capabilities remain at a deterministic high level, suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For information about the management fees for Pro and Provisioned Control Plane clusters, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fee</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fee</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster types, including ACK managed clusters (Pro and Basic), ACK Serverless clusters (Pro and Basic), ACK Edge clusters (Pro and Basic), and ACK Lingjun clusters (Pro).</li>
     * <li><code>ExternalKubernetes</code>: registered cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The Pod network CIDR block. It must be a valid private CIDR block, specifically the following CIDR blocks and their subnets: 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16. It cannot overlap with the VPC CIDR block or CIDR blocks used by existing Kubernetes clusters in the VPC. It cannot be modified after creation.</p>
     * <p>For information about cluster network planning, see <a href="https://help.aliyun.com/document_detail/86500.html">ACK managed cluster network planning</a>.</p>
     * <blockquote>
     * <p>This field is required for Flannel clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("container_cidr")
    public String containerCidr;

    /**
     * <p>The ACK dedicated cluster control plane configuration.</p>
     */
    @NameInMap("control_plane_config")
    public CreateClusterRequestControlPlaneConfig controlPlaneConfig;

    /**
     * <p>The cluster endpoint configuration.</p>
     */
    @NameInMap("control_plane_endpoints_config")
    public CreateClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>The list of component names that specifies which control plane components to collect logs from.</p>
     * <p>By default, logs are collected from kube-apiserver, kube-controller-manager, kube-scheduler, and cloud-controller-manager.</p>
     */
    @NameInMap("controlplane_log_components")
    public java.util.List<String> controlplaneLogComponents;

    /**
     * <p>The Simple Log Service project for control plane component logs. You can use an existing project for log storage or have the system automatically create a project. If you choose automatic creation, a Simple Log Service project named <code>k8s-log-{ClusterID}</code> is created.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-log-xxx</p>
     */
    @NameInMap("controlplane_log_project")
    public String controlplaneLogProject;

    /**
     * <p>The number of days for log retention of control plane component logs.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("controlplane_log_ttl")
    public String controlplaneLogTtl;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>cpu_policy</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>cpu_policy</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * <p>The node CPU management policy. The following policies are supported for cluster versions 1.12.6 and later:</p>
     * <ul>
     * <li><code>static</code>: Allows pods with certain resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
     * <li><code>none</code>: Uses the existing default CPU affinity scheme.</li>
     * </ul>
     * <p>Default value: <code>none</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("cpu_policy")
    @Deprecated
    public String cpuPolicy;

    /**
     * <p><strong>This field is deprecated.</strong> Use the <code>extra_sans</code> parameter instead.</p>
     * <p>The custom certificate Subject Alternative Name (SAN). Separate multiple IP addresses or domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cs.aliyun.com</p>
     */
    @NameInMap("custom_san")
    @Deprecated
    public String customSan;

    /**
     * <p>Specifies whether to enable cluster deletion protection, which prevents the cluster from being accidentally deleted through the console or API. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enable cluster deletion protection. The cluster cannot be deleted through the console or API.</li>
     * <li><code>false</code>: Do not enable cluster deletion protection. The cluster can be deleted through the console or API.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>【<strong>该字段已废弃</strong>】集群创建失败时默认不会进行回滚，您需要自行清理创建失败的集群。</p>
     * <p>集群创建失败是否回滚。取值：</p>
     * <ul>
     * <li><code>true</code>：当集群创建失败时，进行回滚操作。</li>
     * <li><code>false</code>：当集群创建失败时，不进行回滚操作。</li>
     * </ul>
     * <p>默认值：<code>true</code>。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("disable_rollback")
    @Deprecated
    public Boolean disableRollback;

    /**
     * <p>【<strong>该字段已废弃</strong>】请使用参数<code>rrsa_config</code>代替。</p>
     * <p>是否启用RRSA功能。</p>
     * <ul>
     * <li><p>true：开启。</p>
     * </li>
     * <li><p>false：不开启。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_rrsa")
    @Deprecated
    public Boolean enableRrsa;

    /**
     * <p>The KMS key ID used to encrypt data disks. For more information, see <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service</a>.</p>
     * <blockquote>
     * <p>This feature only takes effect in ACK Pro managed clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0fe64791-55eb-4fc7-84c5-c6c7cdca****</p>
     */
    @NameInMap("encryption_provider_key")
    public String encryptionProviderKey;

    /**
     * <p>Specifies whether to public network access. Exposes the API Server through an EIP to public network access to the cluster.</p>
     * <ul>
     * <li><code>true</code>: Public network access.</li>
     * <li><code>false</code>: Do not public network access. If not enabled, the cluster API Server cannot be accessed from the Internet.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("endpoint_public_access")
    public Boolean endpointPublicAccess;

    /**
     * <p>The custom API Server certificate SAN (Subject Alternative Name).</p>
     */
    @NameInMap("extra_sans")
    public java.util.List<String> extraSans;

    /**
     * <p>【<strong>该字段已废弃</strong>】创建集群时不支持选择已有节点，如需添加已有节点到集群，请先创建节点池，并调用<a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a>接口操作。</p>
     * <p>使用已有实例创建集群时，是否对实例进行数据盘挂载，取值：</p>
     * <ul>
     * <li><p><code>true</code>：将容器和镜像存储在数据盘，数据盘内原有数据将丢失，请注意备份数据。</p>
     * </li>
     * <li><p><code>false</code>：不将容器和镜像存储在数据盘。</p>
     * </li>
     * </ul>
     * <p>默认值：<code>false</code>。</p>
     * <p>数据盘挂载规则：</p>
     * <ul>
     * <li>如果ECS已挂载数据盘，且最后一块数据盘的文件系统未初始化，系统会自动将该数据盘格式化为ext4，用来存放内容/var/lib/docker、/var/lib/kubelet。</li>
     * <li>如果ECS未挂载数据盘，则不会挂载新的数据盘。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    @Deprecated
    public Boolean formatDisk;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>image_id</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>image_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The custom node image. The system image is used by default. When a custom image is selected, it replaces the default system image. For more information, see <a href="https://help.aliyun.com/document_detail/146647.html">Custom images</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp16z7xko3vvv8gt****</p>
     */
    @NameInMap("image_id")
    @Deprecated
    public String imageId;

    /**
     * <p>【<strong>该字段已废弃</strong>】集群控制面配置请使用<code>control_plane_config</code>下的<code>image_type</code>参数代替；节点池配置请使用<code>nodepool</code>中<code>scaling_group</code>下的<code>image_type</code>参数代替。</p>
     * <p>操作系统发行版类型，推荐使用该字段指定节点操作系统。取值：</p>
     * <ul>
     * <li>CentOS</li>
     * <li>AliyunLinux</li>
     * <li>AliyunLinux Qboot</li>
     * <li>AliyunLinuxUEFI</li>
     * <li>AliyunLinux3</li>
     * <li>Windows</li>
     * <li>WindowsCore</li>
     * <li>AliyunLinux3Arm64</li>
     * <li>ContainerOS</li>
     * </ul>
     * <p>默认值：<code>CentOS</code>。</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunLinux</p>
     */
    @NameInMap("image_type")
    @Deprecated
    public String imageType;

    /**
     * <p>【<strong>该字段已废弃</strong>】创建集群时不支持选择已有节点，如需添加已有节点到集群，请先创建节点池，并调用<a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a>接口操作。</p>
     * <p>使用已有节点创建集群时，需要指定ECS实例列表，该实例会作为Worker节点加入集群。</p>
     * <blockquote>
     * <p>使用已有实例创建集群时，该字段必填。</p>
     * </blockquote>
     */
    @NameInMap("instances")
    @Deprecated
    public java.util.List<String> instances;

    /**
     * <p>The IP protocol stack of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>可选值：
     * ipv4（单栈）
     * dual（双栈），默认值为ipv4。</p>
     */
    @NameInMap("ip_stack")
    public String ipStack;

    /**
     * <p>Specifies whether to use automatic creation of an advanced security group. Takes effect when <code>security_group_id</code> is empty.</p>
     * <blockquote>
     * <p>When using a basic security group, the total number of nodes and Terway Pods in the cluster cannot exceed 2000. Therefore, when creating a Terway network type cluster, we recommend using an advanced security group.</p>
     * </blockquote>
     * <ul>
     * <li><code>true</code>: Create and use an advanced security group.</li>
     * <li><code>false</code>: Use a basic security group.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_enterprise_security_group")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>【<strong>该字段已废弃</strong>】创建集群时不支持选择已有节点，如需添加已有节点到集群，请先创建节点池，并调用<a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a>接口操作。</p>
     * <p>使用已有实例创建集群时，是否保留实例名称。</p>
     * <ul>
     * <li><code>true</code>：保留。</li>
     * <li><code>false</code>：不保留，会用系统规则进行替换。</li>
     * </ul>
     * <p>默认值：<code>true</code>。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    @Deprecated
    public Boolean keepInstanceName;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>key_pair</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>key_pair</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The key pair name. Mutually exclusive with <code>login_password</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>security-key</p>
     */
    @NameInMap("key_pair")
    @Deprecated
    public String keyPair;

    /**
     * <p>The cluster version, which is consistent with the Kubernetes community baseline version. We recommend that you select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
     * <p>You can create clusters of the latest three versions. Call the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> operation to query supported cluster versions.</p>
     * <p>For more information about Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Kubernetes version release overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>The CLB instance ID for API Server access. When this parameter is specified, automatic creation of the API Server CLB is not performed.</p>
     * <blockquote>
     * <p>Ensure that the CLB instance has no other dependencies (such as listeners or backend servers). Shared and Internet-facing CLB instances are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-wz9t256gqa3vbouk****</p>
     */
    @NameInMap("load_balancer_id")
    public String loadBalancerId;

    /**
     * <p>【<strong>该参数已废弃</strong>】CLB按使用量计费，该参数不生效。</p>
     * <p>负载均衡规格，取值：</p>
     * <ul>
     * <li>slb.s1.small</li>
     * <li>slb.s2.small</li>
     * <li>slb.s2.medium</li>
     * <li>slb.s3.small</li>
     * <li>slb.s3.medium</li>
     * <li>slb.s3.large</li>
     * </ul>
     * <p>默认值：<code>slb.s2.small</code>。</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s2.small</p>
     */
    @NameInMap("load_balancer_spec")
    @Deprecated
    public String loadBalancerSpec;

    /**
     * <p>【<strong>该字段已废弃</strong>】集群开启日志服务，只针对ACK Serverless集群生效，且取值必须是<code>SLS</code>。</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("logging_type")
    @Deprecated
    public String loggingType;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>login_password</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>login_password</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The SSH logon password. Mutually exclusive with <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("login_password")
    @Deprecated
    public String loginPassword;

    /**
     * <p>The cluster maintenance window.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>auto_renew</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Specifies whether to enable auto-renewal for master nodes. This parameter takes effect only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enables auto-renewal.</li>
     * <li><code>false</code>: Disables auto-renewal.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("master_auto_renew")
    @Deprecated
    public Boolean masterAutoRenew;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>auto_renew_period</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The auto-renewal period for master nodes. This parameter takes effect and is required when the subscription billing method is selected.</p>
     * <p>Valid values: {1, 2, 3, 6, 12}.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("master_auto_renew_period")
    @Deprecated
    public Long masterAutoRenewPeriod;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>size</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The number of master nodes. Valid values: <code>3</code> or <code>5</code>.</p>
     * <p>Default value: <code>3</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("master_count")
    @Deprecated
    public Long masterCount;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>instance_charge_type</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The billing method for master nodes. Valid values:</p>
     * <ul>
     * <li><code>PrePaid</code>: subscription.</li>
     * <li><code>PostPaid</code>: pay-as-you-go.</li>
     * </ul>
     * <p>Default value: <code>PostPaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("master_instance_charge_type")
    @Deprecated
    public String masterInstanceChargeType;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>instance_types</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The instance types for master nodes. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     */
    @NameInMap("master_instance_types")
    @Deprecated
    public java.util.List<String> masterInstanceTypes;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>unit</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The subscription duration for master nodes. This parameter takes effect and is required only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
     * <p>Valid values: {1, 2, 3, 6, 12, 24, 36, 48, 60}.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("master_period")
    @Deprecated
    public Long masterPeriod;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>period_unit</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The billing period unit for master nodes. This parameter is required when the billing method is <code>PrePaid</code>.</p>
     * <p>Valid values: <code>Month</code>. Only monthly billing is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("master_period_unit")
    @Deprecated
    public String masterPeriodUnit;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>system_disk_category</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The system cloud disk type for master nodes. Valid values:</p>
     * <ul>
     * <li><code>cloud_efficiency</code>: ultra cloud disk.</li>
     * <li><code>cloud_ssd</code>: standard SSD.</li>
     * <li><code>cloud_essd</code>: ESSD.</li>
     * </ul>
     * <p>Default value: <code>cloud_ssd</code>. The default value may vary by zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("master_system_disk_category")
    @Deprecated
    public String masterSystemDiskCategory;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>system_disk_performance_level</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The performance level of the system cloud disk for cluster master nodes. This parameter takes effect only for ESSD cloud disks. The performance level varies based on the cloud disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("master_system_disk_performance_level")
    @Deprecated
    public String masterSystemDiskPerformanceLevel;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>system_disk_size</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The system cloud disk size for master nodes. Valid values: [40,500\]. Unit: GiB.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("master_system_disk_size")
    @Deprecated
    public Long masterSystemDiskSize;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>system_disk_snapshot_policy_id</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>The automatic snapshot policy ID for the master node system cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("master_system_disk_snapshot_policy_id")
    @Deprecated
    public String masterSystemDiskSnapshotPolicyId;

    /**
     * <p><strong>This field is deprecated.</strong> Use the <code>vswitch_ids</code> parameter instead.</p>
     * <p>The list of vSwitch IDs for master nodes. The number of vSwitches ranges from [1,3\]. To ensure high availability, select three vSwitches distributed across different zones.</p>
     * <p>The number of specified instance types must match the value of <code>master_count</code> and correspond one-to-one with the elements in <code>master_vswitch_ids</code>.</p>
     */
    @NameInMap("master_vswitch_ids")
    @Deprecated
    public java.util.List<String> masterVswitchIds;

    /**
     * <p>The custom cluster name. The name must be 1 to 63 characters in length and can contain digits, Chinese characters, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>【<strong>该字段已废弃</strong>】请使用参数<code>snat_entry</code>代替。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nat_gateway")
    @Deprecated
    public Boolean natGateway;

    /**
     * <p>The number of IP addresses per node, determined by specifying the network CIDR mask. Only takes effect for Flannel network type clusters.</p>
     * <p>Default value: <code>26</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>node_name_mode</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("node_name_mode")
    @Deprecated
    public String nodeNameMode;

    /**
     * <p>The node service port range. Valid values: [30000,65535\].</p>
     * <p>Default value: <code>30000-32767</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>30000~32767</p>
     */
    @NameInMap("node_port_range")
    @Deprecated
    public String nodePortRange;

    /**
     * <p>The list of node pools.</p>
     */
    @NameInMap("nodepools")
    public java.util.List<Nodepool> nodepools;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>desired_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The number of worker nodes. Valid values: [0, 100\].</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("num_of_nodes")
    @Deprecated
    public Long numOfNodes;

    /**
     * <p>The cluster automatic O&amp;M policy.</p>
     */
    @NameInMap("operation_policy")
    public CreateClusterRequestOperationPolicy operationPolicy;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane node configurations, use the <code>image_type</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The operating system platform type. Valid values:</p>
     * <ul>
     * <li>Windows</li>
     * <li>Linux</li>
     * </ul>
     * <p>Default value: <code>Linux</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("os_type")
    @Deprecated
    public String osType;

    /**
     * <p>【<strong>该字段已废弃</strong>】</p>
     * <p>购买时长。包年包月时长，当charge_type取值为PrePaid时才生效，且为必选值。</p>
     * <p>取值范围：{1, 2, 3, 6, 12, 24, 36, 48, 60}。</p>
     * <p>默认值：1。</p>
     * <p>该字段于2024年10月15日存在变更，更多信息，请参见<a href="https://help.aliyun.com/document_detail/2849194.html">关于集群创建接口CreateCluster参数行为变更的公告</a>。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Deprecated
    public Long period;

    /**
     * <p>【<strong>该字段已废弃</strong>】</p>
     * <p>付费周期，当付费类型为PrePaid的时候，需要指定周期。</p>
     * <p>取值：Month，当前仅支持以月为周期。</p>
     * <p>该字段于2024年10月15日存在变更，更多信息，请参见<a href="https://help.aliyun.com/document_detail/2849194.html">关于集群创建接口CreateCluster参数行为变更的公告</a>。</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("period_unit")
    @Deprecated
    public String periodUnit;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>platform</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The operating system distribution. Valid values:</p>
     * <ul>
     * <li>CentOS</li>
     * <li>AliyunLinux</li>
     * <li>QbootAliyunLinux</li>
     * <li>Qboot</li>
     * <li>Windows</li>
     * <li>WindowsCore</li>
     * </ul>
     * <p>Default value: <code>CentOS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS</p>
     */
    @NameInMap("platform")
    @Deprecated
    public String platform;

    /**
     * <p><strong>This field is deprecated.</strong> When you select Terway as the network plugin, you must assign vSwitches for Pod IP allocation. Each Pod vSwitch corresponds to a worker node vSwitch, and the Pod vSwitch and the worker node vSwitch must be in the same zone.</p>
     * <blockquote>
     * <p>The CIDR block mask of the Pod vSwitch should not exceed 19 and must not exceed 25. Otherwise, the number of Pod IP addresses available in the cluster network is very limited, which affects normal cluster usage.</p>
     * </blockquote>
     */
    @NameInMap("pod_vswitch_ids")
    @Deprecated
    public java.util.List<String> podVswitchIds;

    /**
     * <p>When you set <code>cluster_type</code> to <code>ManagedKubernetes</code> (ACK managed cluster types), you can further specify the cluster subtype.</p>
     * <ul>
     * <li><code>Default</code>: ACK managed cluster, including ACK clusters (Pro and Basic).</li>
     * <li><code>Edge</code>: ACK Edge cluster, including ACK Edge clusters (Pro and Basic).</li>
     * <li><code>Serverless</code>: ACK Serverless cluster, including ACK Serverless clusters (Pro and Basic).</li>
     * <li><code>Lingjun</code>: ACK Lingjun cluster, available in Pro.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The kube-proxy mode.</p>
     * <ul>
     * <li><code>iptables</code>: A mature and stable kube-proxy mode. Service discovery and load balancing for Kubernetes Services are configured using iptables rules. However, performance is average and significantly affected by scale. Suitable for clusters with a small number of Services.</li>
     * <li><code>ipvs</code>: A high-performance kube-proxy mode. Service discovery and load balancing for Kubernetes Services are configured using the Linux IPVS module. Suitable for clusters with a large number of Services that require high-performance load balancing.</li>
     * <li><code>nftables</code>: A next-generation kube-proxy mode that implements Service discovery and load balancing based on Linux nftables, serving as a modern replacement for iptables. Compared to iptables, nftables offers better network performance, more efficient rule updates, and improved behavior in large-scale Service scenarios.<br>Only supported for clusters running version 1.35 or later. The Kubernetes community deprecated IPVS starting from version 1.35. For new clusters, use nftables for longer-term community support.</li>
     * </ul>
     * <p>Default value: <code>ipvs</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>rds_instances</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The list of RDS instances. Select the RDS instances that you want to add to the whitelist. Go to the RDS console to add the container pod CIDR block and node CIDR block. Configuring RDS instances may fail if the instances are not in the running state.</p>
     */
    @NameInMap("rds_instances")
    @Deprecated
    public java.util.List<String> rdsInstances;

    /**
     * <p>The region ID of the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/216938.html">Regions supported by Container Service</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The resource group ID of the cluster, used to isolate different resources.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3mkrure****</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>The RRSA configuration.</p>
     */
    @NameInMap("rrsa_config")
    public CreateClusterRequestRrsaConfig rrsaConfig;

    /**
     * <p>The container runtime of the cluster. Supported runtimes include containerd, sandboxed containers, and Docker.</p>
     * <blockquote>
     * <p>Kubernetes 1.24 no longer supports Docker as a built-in container runtime.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/160313.html">Comparison among Docker, containerd, and sandboxed container runtimes</a>.</p>
     */
    @NameInMap("runtime")
    @Deprecated
    public Runtime runtime;

    /**
     * <p>The security group ID. Specify this parameter when creating a cluster with an existing security group. Mutually exclusive with <code>is_enterprise_security_group</code>. Cluster nodes are automatically added to this security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1bdue0qc1g7k****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane configurations, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Alibaba Cloud OS security hardening. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enables Alibaba Cloud OS security hardening.</li>
     * <li><code>false</code>: Does not enable Alibaba Cloud OS security hardening.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("security_hardening_os")
    @Deprecated
    public Boolean securityHardeningOs;

    /**
     * <p>A ServiceAccount is the access credential for communication between a Pod and the cluster API Server. The <code>service-account-issuer</code> is the issuer identity in the <code>serviceaccount token</code>, which is the <code>iss</code> field in the <code>token payload</code>.</p>
     * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Deploy service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("service_account_issuer")
    public String serviceAccountIssuer;

    /**
     * <p>The Service network CIDR block. Valid ranges: 10.0.0.0/16-24, 172.16-31.0.0/16-24, 192.168.0.0/16-24. It cannot overlap with the VPC CIDR block 10.1.0.0/21 or CIDR blocks used by existing Kubernetes clusters in the VPC. It cannot be modified after creation.</p>
     * <p>Default value: 172.19.0.0/20.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.0.0/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p>【<strong>该字段已废弃</strong>】集群内服务发现类型，用于在<code>ACK Serverless</code>集群中指定服务发现方式。</p>
     * <ul>
     * <li><code>CoreDNS</code>：使用Kubernetes原生标准服务发现组件CoreDNS，需要在集群部署一组容器用于DNS解析。默认采用两个0.25 Core 512 MiB规格的ECI实例。</li>
     * <li><code>PrivateZone</code>：使用阿里云PrivateZone产品提供服务发现能力，需要开启PrivateZone服务。</li>
     * </ul>
     * <p>默认值：不开启。</p>
     */
    @NameInMap("service_discovery_types")
    @Deprecated
    public java.util.List<String> serviceDiscoveryTypes;

    /**
     * <p>Settings for configuring SNAT for the VPC. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Use automatic creation of a NAT gateway and configure SNAT rules. Set this to <code>true</code> if nodes and applications in the cluster need to access the Internet.</li>
     * <li><code>false</code>: Do not create a NAT gateway or SNAT rules. Nodes and applications in the cluster cannot access the Internet.</li>
     * </ul>
     * <blockquote>
     * <p>If this is not enabled during cluster creation and Internet access is needed later, you can <a href="https://help.aliyun.com/document_detail/178480.html">manually enable it</a>.</p>
     * </blockquote>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    /**
     * <p><strong>This field is deprecated.</strong> For control plane node configurations, use the <code>soc_enabled</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>soc_enabled</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>MLPS 2.0 security hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">ACK MLPS 2.0 security hardening usage instructions</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enables MLPS 2.0 security hardening.</li>
     * <li><code>false</code>: Does not enable MLPS 2.0 security hardening.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("soc_enabled")
    @Deprecated
    public Boolean socEnabled;

    /**
     * <p>Specifies whether to enable public SSH logon. Used to log on to the master nodes of ACK dedicated clusters. This parameter does not take effect for managed clusters.</p>
     * <ul>
     * <li><code>true</code>: Enable.</li>
     * <li><code>false</code>: Do not enable.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    /**
     * <p>The node tags. Tag definition rules:</p>
     * <ul>
     * <li>Tags are composed of case-sensitive key-value pairs. You can set up to 20 tags.</li>
     * <li>Tag keys cannot be duplicated and can be up to 64 characters in length. Tag values can be empty and can be up to 128 characters in length. Tag keys and tag values cannot start with &quot;aliyun&quot;, &quot;acs:&quot;, &quot;https://&quot;, or &quot;http://&quot;. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
     * </ul>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>taints</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * <p>The node taint information. Taints and tolerations work together to prevent pods from being scheduled to inappropriate nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
     */
    @NameInMap("taints")
    @Deprecated
    public java.util.List<Taint> taints;

    /**
     * <p>【<strong>该字段已废弃</strong>】集群创建失败时默认不会进行回滚，您需要自行清理创建失败的集群。</p>
     * <p>集群创建超时时间，单位分钟。</p>
     * <p>默认值：<code>60</code>。</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout_mins")
    @Deprecated
    public Long timeoutMins;

    /**
     * <p>The time zone used by the cluster. See <a href="https://help.aliyun.com/document_detail/354879.html">Supported time zones</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The custom cluster CA.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----****</p>
     */
    @NameInMap("user_ca")
    public String userCa;

    /**
     * <p><strong>This field is deprecated.</strong> The custom node data.</p>
     * 
     * <strong>example:</strong>
     * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFD****</p>
     */
    @NameInMap("user_data")
    @Deprecated
    public String userData;

    /**
     * <p>The VPC used by the cluster. You must provide a VPC when creating a cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zeik9h3ahvv2zz95****</p>
     */
    @NameInMap("vpcid")
    public String vpcid;

    /**
     * <p>The vSwitches for cluster nodes. This field is required when creating a zero-node managed cluster.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>【<strong>该字段已废弃</strong>】节点池配置请使用<code>nodepool</code>中<code>scaling_group</code>下的<code>auto_renew</code>参数代替。</p>
     * <p>Worker节点是否开启自动续费，当<code>worker_instance_charge_type</code>取值为<code>PrePaid</code>时才生效，取值：</p>
     * <ul>
     * <li><code>true</code>：自动续费。</li>
     * <li><code>false</code>：不自动续费。</li>
     * </ul>
     * <p>默认值：<code>true</code>。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("worker_auto_renew")
    @Deprecated
    public Boolean workerAutoRenew;

    /**
     * <p>【<strong>该字段已废弃</strong>】节点池配置请使用<code>nodepool</code>中<code>scaling_group</code>下的<code>auto_renew_period</code>参数代替。</p>
     * <p>Worker节点自动续费周期，当选择包年包月付费类型时才生效，且为必选值。</p>
     * <p>取值范围：{1, 2, 3, 6, 12}。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_auto_renew_period")
    @Deprecated
    public Long workerAutoRenewPeriod;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>data_disks</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The data cloud disk type, size, and other configurations for worker nodes.</p>
     */
    @NameInMap("worker_data_disks")
    @Deprecated
    public java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>instance_charge_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The billing method for worker nodes. Valid values:</p>
     * <ul>
     * <li><code>PrePaid</code>: subscription.</li>
     * <li><code>PostPaid</code>: pay-as-you-go.</li>
     * </ul>
     * <p>Default value: pay-as-you-go.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("worker_instance_charge_type")
    @Deprecated
    public String workerInstanceChargeType;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>instance_types</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The instance configuration for worker nodes.</p>
     */
    @NameInMap("worker_instance_types")
    @Deprecated
    public java.util.List<String> workerInstanceTypes;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>period</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The subscription duration for worker nodes. This parameter takes effect and is required only when `worker_</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_period")
    @Deprecated
    public Long workerPeriod;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>period_unit</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The billing period unit for worker nodes. This parameter is required when the billing method is <code>PrePaid</code>.</p>
     * <p>Valid values: <code>Month</code>. Only monthly billing is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("worker_period_unit")
    @Deprecated
    public String workerPeriodUnit;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>system_disk_category</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The system cloud disk type for worker nodes. For more information, see <a href="https://help.aliyun.com/document_detail/63136.html">Block storage overview</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>cloud_efficiency</code>: ultra cloud disk.</li>
     * <li><code>cloud_ssd</code>: standard SSD.</li>
     * </ul>
     * <p>Default value: <code>cloud_ssd</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("worker_system_disk_category")
    @Deprecated
    public String workerSystemDiskCategory;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>system_disk_performance_level</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>When the system cloud disk is an ESSD, you can set the performance level (PL) of the ESSD. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PL0</li>
     * <li>PL1</li>
     * <li>PL2</li>
     * <li>PL3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("worker_system_disk_performance_level")
    @Deprecated
    public String workerSystemDiskPerformanceLevel;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>system_disk_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The system cloud disk size for worker nodes. Unit: GiB.</p>
     * <p>Valid values: [40,500\].</p>
     * <p>The value must be greater than or equal to max{40, ImageSize}.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("worker_system_disk_size")
    @Deprecated
    public Long workerSystemDiskSize;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>system_disk_snapshot_policy_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The automatic snapshot policy ID for the worker node system cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    public String workerSystemDiskSnapshotPolicyId;

    /**
     * <p><strong>This field is deprecated.</strong> For node pool configurations, use the <code>vswitch_ids</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The list of vSwitches used by cluster nodes. Each node corresponds to one value.</p>
     * <p>When creating a zero-node managed cluster, the <code>worker_vswitch_ids</code> field is not required, but you must provide <code>vswitch_ids</code>.</p>
     */
    @NameInMap("worker_vswitch_ids")
    @Deprecated
    public java.util.List<String> workerVswitchIds;

    /**
     * <p>【<strong>该字段已废弃</strong>】请使用<code>zone_ids</code>参数代替。</p>
     * <p>集群所属地域的可用区ID。此参数为ACK托管类的集群特有参数。</p>
     * <p>当创建ACK托管类的集群时，如果未指定<code>vpc_id</code>和<code>vswitch_ids</code>，必须为集群指定<code>zone_id</code>，用于自动在该可用区创建VPC网络资源；指定<code>vpc_id</code>和<code>vswitch_ids</code>时，该参数无效。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beiji****</p>
     */
    @NameInMap("zone_id")
    @Deprecated
    public String zoneId;

    /**
     * <p>The zone IDs of the region where the cluster resides. This parameter is specific to ACK managed cluster types.</p>
     */
    @NameInMap("zone_ids")
    public java.util.List<String> zoneIds;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public CreateClusterRequest setAccessControlList(java.util.List<String> accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }
    public java.util.List<String> getAccessControlList() {
        return this.accessControlList;
    }

    public CreateClusterRequest setAddons(java.util.List<Addon> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<Addon> getAddons() {
        return this.addons;
    }

    public CreateClusterRequest setApiAudiences(String apiAudiences) {
        this.apiAudiences = apiAudiences;
        return this;
    }
    public String getApiAudiences() {
        return this.apiAudiences;
    }

    public CreateClusterRequest setAuditLogConfig(CreateClusterRequestAuditLogConfig auditLogConfig) {
        this.auditLogConfig = auditLogConfig;
        return this;
    }
    public CreateClusterRequestAuditLogConfig getAuditLogConfig() {
        return this.auditLogConfig;
    }

    public CreateClusterRequest setAutoMode(CreateClusterRequestAutoMode autoMode) {
        this.autoMode = autoMode;
        return this;
    }
    public CreateClusterRequestAutoMode getAutoMode() {
        return this.autoMode;
    }

    @Deprecated
    public CreateClusterRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    @Deprecated
    public CreateClusterRequest setAutoRenewPeriod(Long autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    @Deprecated
    public CreateClusterRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    @Deprecated
    public CreateClusterRequest setCisEnabled(Boolean cisEnabled) {
        this.cisEnabled = cisEnabled;
        return this;
    }
    public Boolean getCisEnabled() {
        return this.cisEnabled;
    }

    @Deprecated
    public CreateClusterRequest setCloudMonitorFlags(Boolean cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public CreateClusterRequest setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
        return this;
    }
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    public CreateClusterRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public CreateClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterRequest setContainerCidr(String containerCidr) {
        this.containerCidr = containerCidr;
        return this;
    }
    public String getContainerCidr() {
        return this.containerCidr;
    }

    public CreateClusterRequest setControlPlaneConfig(CreateClusterRequestControlPlaneConfig controlPlaneConfig) {
        this.controlPlaneConfig = controlPlaneConfig;
        return this;
    }
    public CreateClusterRequestControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
    }

    public CreateClusterRequest setControlPlaneEndpointsConfig(CreateClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig) {
        this.controlPlaneEndpointsConfig = controlPlaneEndpointsConfig;
        return this;
    }
    public CreateClusterRequestControlPlaneEndpointsConfig getControlPlaneEndpointsConfig() {
        return this.controlPlaneEndpointsConfig;
    }

    public CreateClusterRequest setControlplaneLogComponents(java.util.List<String> controlplaneLogComponents) {
        this.controlplaneLogComponents = controlplaneLogComponents;
        return this;
    }
    public java.util.List<String> getControlplaneLogComponents() {
        return this.controlplaneLogComponents;
    }

    public CreateClusterRequest setControlplaneLogProject(String controlplaneLogProject) {
        this.controlplaneLogProject = controlplaneLogProject;
        return this;
    }
    public String getControlplaneLogProject() {
        return this.controlplaneLogProject;
    }

    public CreateClusterRequest setControlplaneLogTtl(String controlplaneLogTtl) {
        this.controlplaneLogTtl = controlplaneLogTtl;
        return this;
    }
    public String getControlplaneLogTtl() {
        return this.controlplaneLogTtl;
    }

    @Deprecated
    public CreateClusterRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    @Deprecated
    public CreateClusterRequest setCustomSan(String customSan) {
        this.customSan = customSan;
        return this;
    }
    public String getCustomSan() {
        return this.customSan;
    }

    public CreateClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    @Deprecated
    public CreateClusterRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    @Deprecated
    public CreateClusterRequest setEnableRrsa(Boolean enableRrsa) {
        this.enableRrsa = enableRrsa;
        return this;
    }
    public Boolean getEnableRrsa() {
        return this.enableRrsa;
    }

    public CreateClusterRequest setEncryptionProviderKey(String encryptionProviderKey) {
        this.encryptionProviderKey = encryptionProviderKey;
        return this;
    }
    public String getEncryptionProviderKey() {
        return this.encryptionProviderKey;
    }

    public CreateClusterRequest setEndpointPublicAccess(Boolean endpointPublicAccess) {
        this.endpointPublicAccess = endpointPublicAccess;
        return this;
    }
    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    public CreateClusterRequest setExtraSans(java.util.List<String> extraSans) {
        this.extraSans = extraSans;
        return this;
    }
    public java.util.List<String> getExtraSans() {
        return this.extraSans;
    }

    @Deprecated
    public CreateClusterRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    @Deprecated
    public CreateClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    @Deprecated
    public CreateClusterRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    @Deprecated
    public CreateClusterRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public CreateClusterRequest setIpStack(String ipStack) {
        this.ipStack = ipStack;
        return this;
    }
    public String getIpStack() {
        return this.ipStack;
    }

    public CreateClusterRequest setIsEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
        this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
        return this;
    }
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    @Deprecated
    public CreateClusterRequest setKeepInstanceName(Boolean keepInstanceName) {
        this.keepInstanceName = keepInstanceName;
        return this;
    }
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    @Deprecated
    public CreateClusterRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public CreateClusterRequest setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public CreateClusterRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    @Deprecated
    public CreateClusterRequest setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    @Deprecated
    public CreateClusterRequest setLoggingType(String loggingType) {
        this.loggingType = loggingType;
        return this;
    }
    public String getLoggingType() {
        return this.loggingType;
    }

    @Deprecated
    public CreateClusterRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public CreateClusterRequest setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }
    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    @Deprecated
    public CreateClusterRequest setMasterAutoRenew(Boolean masterAutoRenew) {
        this.masterAutoRenew = masterAutoRenew;
        return this;
    }
    public Boolean getMasterAutoRenew() {
        return this.masterAutoRenew;
    }

    @Deprecated
    public CreateClusterRequest setMasterAutoRenewPeriod(Long masterAutoRenewPeriod) {
        this.masterAutoRenewPeriod = masterAutoRenewPeriod;
        return this;
    }
    public Long getMasterAutoRenewPeriod() {
        return this.masterAutoRenewPeriod;
    }

    @Deprecated
    public CreateClusterRequest setMasterCount(Long masterCount) {
        this.masterCount = masterCount;
        return this;
    }
    public Long getMasterCount() {
        return this.masterCount;
    }

    @Deprecated
    public CreateClusterRequest setMasterInstanceChargeType(String masterInstanceChargeType) {
        this.masterInstanceChargeType = masterInstanceChargeType;
        return this;
    }
    public String getMasterInstanceChargeType() {
        return this.masterInstanceChargeType;
    }

    @Deprecated
    public CreateClusterRequest setMasterInstanceTypes(java.util.List<String> masterInstanceTypes) {
        this.masterInstanceTypes = masterInstanceTypes;
        return this;
    }
    public java.util.List<String> getMasterInstanceTypes() {
        return this.masterInstanceTypes;
    }

    @Deprecated
    public CreateClusterRequest setMasterPeriod(Long masterPeriod) {
        this.masterPeriod = masterPeriod;
        return this;
    }
    public Long getMasterPeriod() {
        return this.masterPeriod;
    }

    @Deprecated
    public CreateClusterRequest setMasterPeriodUnit(String masterPeriodUnit) {
        this.masterPeriodUnit = masterPeriodUnit;
        return this;
    }
    public String getMasterPeriodUnit() {
        return this.masterPeriodUnit;
    }

    @Deprecated
    public CreateClusterRequest setMasterSystemDiskCategory(String masterSystemDiskCategory) {
        this.masterSystemDiskCategory = masterSystemDiskCategory;
        return this;
    }
    public String getMasterSystemDiskCategory() {
        return this.masterSystemDiskCategory;
    }

    @Deprecated
    public CreateClusterRequest setMasterSystemDiskPerformanceLevel(String masterSystemDiskPerformanceLevel) {
        this.masterSystemDiskPerformanceLevel = masterSystemDiskPerformanceLevel;
        return this;
    }
    public String getMasterSystemDiskPerformanceLevel() {
        return this.masterSystemDiskPerformanceLevel;
    }

    @Deprecated
    public CreateClusterRequest setMasterSystemDiskSize(Long masterSystemDiskSize) {
        this.masterSystemDiskSize = masterSystemDiskSize;
        return this;
    }
    public Long getMasterSystemDiskSize() {
        return this.masterSystemDiskSize;
    }

    @Deprecated
    public CreateClusterRequest setMasterSystemDiskSnapshotPolicyId(String masterSystemDiskSnapshotPolicyId) {
        this.masterSystemDiskSnapshotPolicyId = masterSystemDiskSnapshotPolicyId;
        return this;
    }
    public String getMasterSystemDiskSnapshotPolicyId() {
        return this.masterSystemDiskSnapshotPolicyId;
    }

    @Deprecated
    public CreateClusterRequest setMasterVswitchIds(java.util.List<String> masterVswitchIds) {
        this.masterVswitchIds = masterVswitchIds;
        return this;
    }
    public java.util.List<String> getMasterVswitchIds() {
        return this.masterVswitchIds;
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    @Deprecated
    public CreateClusterRequest setNatGateway(Boolean natGateway) {
        this.natGateway = natGateway;
        return this;
    }
    public Boolean getNatGateway() {
        return this.natGateway;
    }

    public CreateClusterRequest setNodeCidrMask(String nodeCidrMask) {
        this.nodeCidrMask = nodeCidrMask;
        return this;
    }
    public String getNodeCidrMask() {
        return this.nodeCidrMask;
    }

    @Deprecated
    public CreateClusterRequest setNodeNameMode(String nodeNameMode) {
        this.nodeNameMode = nodeNameMode;
        return this;
    }
    public String getNodeNameMode() {
        return this.nodeNameMode;
    }

    @Deprecated
    public CreateClusterRequest setNodePortRange(String nodePortRange) {
        this.nodePortRange = nodePortRange;
        return this;
    }
    public String getNodePortRange() {
        return this.nodePortRange;
    }

    public CreateClusterRequest setNodepools(java.util.List<Nodepool> nodepools) {
        this.nodepools = nodepools;
        return this;
    }
    public java.util.List<Nodepool> getNodepools() {
        return this.nodepools;
    }

    @Deprecated
    public CreateClusterRequest setNumOfNodes(Long numOfNodes) {
        this.numOfNodes = numOfNodes;
        return this;
    }
    public Long getNumOfNodes() {
        return this.numOfNodes;
    }

    public CreateClusterRequest setOperationPolicy(CreateClusterRequestOperationPolicy operationPolicy) {
        this.operationPolicy = operationPolicy;
        return this;
    }
    public CreateClusterRequestOperationPolicy getOperationPolicy() {
        return this.operationPolicy;
    }

    @Deprecated
    public CreateClusterRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    @Deprecated
    public CreateClusterRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    @Deprecated
    public CreateClusterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    @Deprecated
    public CreateClusterRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    @Deprecated
    public CreateClusterRequest setPodVswitchIds(java.util.List<String> podVswitchIds) {
        this.podVswitchIds = podVswitchIds;
        return this;
    }
    public java.util.List<String> getPodVswitchIds() {
        return this.podVswitchIds;
    }

    public CreateClusterRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public CreateClusterRequest setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    @Deprecated
    public CreateClusterRequest setRdsInstances(java.util.List<String> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public CreateClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterRequest setRrsaConfig(CreateClusterRequestRrsaConfig rrsaConfig) {
        this.rrsaConfig = rrsaConfig;
        return this;
    }
    public CreateClusterRequestRrsaConfig getRrsaConfig() {
        return this.rrsaConfig;
    }

    @Deprecated
    public CreateClusterRequest setRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }
    public Runtime getRuntime() {
        return this.runtime;
    }

    public CreateClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    @Deprecated
    public CreateClusterRequest setSecurityHardeningOs(Boolean securityHardeningOs) {
        this.securityHardeningOs = securityHardeningOs;
        return this;
    }
    public Boolean getSecurityHardeningOs() {
        return this.securityHardeningOs;
    }

    public CreateClusterRequest setServiceAccountIssuer(String serviceAccountIssuer) {
        this.serviceAccountIssuer = serviceAccountIssuer;
        return this;
    }
    public String getServiceAccountIssuer() {
        return this.serviceAccountIssuer;
    }

    public CreateClusterRequest setServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    @Deprecated
    public CreateClusterRequest setServiceDiscoveryTypes(java.util.List<String> serviceDiscoveryTypes) {
        this.serviceDiscoveryTypes = serviceDiscoveryTypes;
        return this;
    }
    public java.util.List<String> getServiceDiscoveryTypes() {
        return this.serviceDiscoveryTypes;
    }

    public CreateClusterRequest setSnatEntry(Boolean snatEntry) {
        this.snatEntry = snatEntry;
        return this;
    }
    public Boolean getSnatEntry() {
        return this.snatEntry;
    }

    @Deprecated
    public CreateClusterRequest setSocEnabled(Boolean socEnabled) {
        this.socEnabled = socEnabled;
        return this;
    }
    public Boolean getSocEnabled() {
        return this.socEnabled;
    }

    public CreateClusterRequest setSshFlags(Boolean sshFlags) {
        this.sshFlags = sshFlags;
        return this;
    }
    public Boolean getSshFlags() {
        return this.sshFlags;
    }

    public CreateClusterRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    @Deprecated
    public CreateClusterRequest setTaints(java.util.List<Taint> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<Taint> getTaints() {
        return this.taints;
    }

    @Deprecated
    public CreateClusterRequest setTimeoutMins(Long timeoutMins) {
        this.timeoutMins = timeoutMins;
        return this;
    }
    public Long getTimeoutMins() {
        return this.timeoutMins;
    }

    public CreateClusterRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateClusterRequest setUserCa(String userCa) {
        this.userCa = userCa;
        return this;
    }
    public String getUserCa() {
        return this.userCa;
    }

    @Deprecated
    public CreateClusterRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateClusterRequest setVpcid(String vpcid) {
        this.vpcid = vpcid;
        return this;
    }
    public String getVpcid() {
        return this.vpcid;
    }

    public CreateClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    @Deprecated
    public CreateClusterRequest setWorkerAutoRenew(Boolean workerAutoRenew) {
        this.workerAutoRenew = workerAutoRenew;
        return this;
    }
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    @Deprecated
    public CreateClusterRequest setWorkerAutoRenewPeriod(Long workerAutoRenewPeriod) {
        this.workerAutoRenewPeriod = workerAutoRenewPeriod;
        return this;
    }
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    @Deprecated
    public CreateClusterRequest setWorkerDataDisks(java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<CreateClusterRequestWorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    @Deprecated
    public CreateClusterRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    @Deprecated
    public CreateClusterRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    @Deprecated
    public CreateClusterRequest setWorkerPeriod(Long workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    @Deprecated
    public CreateClusterRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    @Deprecated
    public CreateClusterRequest setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        this.workerSystemDiskCategory = workerSystemDiskCategory;
        return this;
    }
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    @Deprecated
    public CreateClusterRequest setWorkerSystemDiskPerformanceLevel(String workerSystemDiskPerformanceLevel) {
        this.workerSystemDiskPerformanceLevel = workerSystemDiskPerformanceLevel;
        return this;
    }
    public String getWorkerSystemDiskPerformanceLevel() {
        return this.workerSystemDiskPerformanceLevel;
    }

    @Deprecated
    public CreateClusterRequest setWorkerSystemDiskSize(Long workerSystemDiskSize) {
        this.workerSystemDiskSize = workerSystemDiskSize;
        return this;
    }
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    @Deprecated
    public CreateClusterRequest setWorkerSystemDiskSnapshotPolicyId(String workerSystemDiskSnapshotPolicyId) {
        this.workerSystemDiskSnapshotPolicyId = workerSystemDiskSnapshotPolicyId;
        return this;
    }
    public String getWorkerSystemDiskSnapshotPolicyId() {
        return this.workerSystemDiskSnapshotPolicyId;
    }

    @Deprecated
    public CreateClusterRequest setWorkerVswitchIds(java.util.List<String> workerVswitchIds) {
        this.workerVswitchIds = workerVswitchIds;
        return this;
    }
    public java.util.List<String> getWorkerVswitchIds() {
        return this.workerVswitchIds;
    }

    @Deprecated
    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateClusterRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static class CreateClusterRequestAuditLogConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the cluster audit log feature.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Do not enable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">SLS Project</a> that contains the cluster audit log <a href="https://help.aliyun.com/document_detail/48873.html">Logstore</a>.</p>
         * <ul>
         * <li><p>Default value: <code>k8s-log-{clusterid}</code>.</p>
         * </li>
         * <li><p>After the cluster audit log feature is enabled, a Logstore for cluster audit logs is created in the specified SLS Project.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-c2345xxxxxxxxxxxx</p>
         */
        @NameInMap("sls_project_name")
        public String slsProjectName;

        public static CreateClusterRequestAuditLogConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestAuditLogConfig self = new CreateClusterRequestAuditLogConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestAuditLogConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateClusterRequestAuditLogConfig setSlsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }
        public String getSlsProjectName() {
            return this.slsProjectName;
        }

    }

    public static class CreateClusterRequestAutoMode extends TeaModel {
        /**
         * <p>Specifies whether to enable intelligent managed mode.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Do not enable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static CreateClusterRequestAutoMode build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestAutoMode self = new CreateClusterRequestAutoMode();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestAutoMode setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class CreateClusterRequestControlPlaneConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal for control plane nodes. Takes effect when the billing method is <code>PrePaid</code>.</p>
         * <ul>
         * <li>true: Enable auto-renewal.</li>
         * <li>false: Do not enable auto-renewal.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period of control plane nodes.</p>
         * <p>Valid values: {1, 2, 3, 6, 12}. Unit: months.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>The billing method of control plane nodes.</p>
         * <ul>
         * <li><code>PrePaid</code>: Subscription.</li>
         * <li><code>PostPaid</code>: Pay-as-you-go.</li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("charge_type")
        public String chargeType;

        /**
         * <p>Specifies whether to install CloudMonitor on nodes.</p>
         * <ul>
         * <li><p>true: Installs the CloudMonitor agent.</p>
         * </li>
         * <li><p>false: Does not install the CloudMonitor agent.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cloud_monitor_flags")
        public Boolean cloudMonitorFlags;

        /**
         * <p>The node CPU management policy.</p>
         * <ul>
         * <li><p>static: Allows pods with certain resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</p>
         * </li>
         * <li><p>none: Uses the existing default CPU affinity scheme.</p>
         * </li>
         * </ul>
         * <p>Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp10b35imuam5amw****</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20240819.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The operating system image type.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The instance metadata access configuration for ECS instances.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The node instance types.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The key pair name. Mutually exclusive with login_password.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The SSH logon password. Must be 8 to 30 characters in length and contain at least three of the following: uppercase letters, lowercase letters, digits, and special characters. Mutually exclusive with key_pair.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p><strong>This field is deprecated.</strong> The node service port range.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>The subscription duration of control plane nodes. Valid and required when the billing method is <code>PrePaid</code>.</p>
         * <p>Valid values: {1, 2, 3, 6, 12, 24, 36, 48, 60}. Unit: months.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The subscription period unit of control plane nodes. Valid and required when the billing method is <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>. Currently, only monthly periods are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p><strong>This field is deprecated.</strong> The container runtime for control plane nodes. Valid values:</p>
         * <p>containerd: The Containerd runtime, which supports all cluster versions.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>Specifies whether to enable Alibaba Cloud OS security hardening.</p>
         * <ul>
         * <li><p>true: Enables Alibaba Cloud OS security hardening.</p>
         * </li>
         * <li><p>false: Does not enable Alibaba Cloud OS security hardening.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("security_hardening_os")
        public Boolean securityHardeningOs;

        /**
         * <p>The number of control plane nodes.</p>
         * <p>Valid values: <code>3</code> or <code>5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>Specifies whether to enable MLPS 2.0 security hardening.</p>
         * <ul>
         * <li><p>true: Enables MLPS 2.0 security hardening.</p>
         * </li>
         * <li><p>false: Does not enable MLPS 2.0 security hardening.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Specifies whether to enable burst (performance burst) for the node system cloud disk.</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The node system disk type.</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: Ultra disk.</li>
         * <li><code>cloud_ssd</code>: Standard SSD.</li>
         * <li><code>cloud_essd</code>: ESSD.</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL.</li>
         * <li>`cloud_essd</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The performance level of the node system cloud disk. This parameter takes effect only for ESSD cloud disks.</p>
         * <p>The performance level varies based on the cloud disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS for the node system cloud disk.</p>
         * <p>Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50000}.</p>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the node system cloud disk.</p>
         * <p>Valid values: [40,500\]. Unit: GiB.</p>
         * <p>Default value: <code>120</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The automatic snapshot backup policy for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-2zej1nogjvovnz4z****</p>
         */
        @NameInMap("system_disk_snapshot_policy_id")
        public String systemDiskSnapshotPolicyId;

        public static CreateClusterRequestControlPlaneConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestControlPlaneConfig self = new CreateClusterRequestControlPlaneConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestControlPlaneConfig setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateClusterRequestControlPlaneConfig setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public CreateClusterRequestControlPlaneConfig setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateClusterRequestControlPlaneConfig setCloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }
        public Boolean getCloudMonitorFlags() {
            return this.cloudMonitorFlags;
        }

        public CreateClusterRequestControlPlaneConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public CreateClusterRequestControlPlaneConfig setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public CreateClusterRequestControlPlaneConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateClusterRequestControlPlaneConfig setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public CreateClusterRequestControlPlaneConfig setInstanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
            this.instanceMetadataOptions = instanceMetadataOptions;
            return this;
        }
        public InstanceMetadataOptions getInstanceMetadataOptions() {
            return this.instanceMetadataOptions;
        }

        public CreateClusterRequestControlPlaneConfig setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateClusterRequestControlPlaneConfig setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public CreateClusterRequestControlPlaneConfig setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public CreateClusterRequestControlPlaneConfig setNodePortRange(String nodePortRange) {
            this.nodePortRange = nodePortRange;
            return this;
        }
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        public CreateClusterRequestControlPlaneConfig setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public CreateClusterRequestControlPlaneConfig setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreateClusterRequestControlPlaneConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public CreateClusterRequestControlPlaneConfig setSecurityHardeningOs(Boolean securityHardeningOs) {
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        public CreateClusterRequestControlPlaneConfig setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public CreateClusterRequestControlPlaneConfig setSocEnabled(Boolean socEnabled) {
            this.socEnabled = socEnabled;
            return this;
        }
        public Boolean getSocEnabled() {
            return this.socEnabled;
        }

        public CreateClusterRequestControlPlaneConfig setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public CreateClusterRequestControlPlaneConfig setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateClusterRequestControlPlaneConfig setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public CreateClusterRequestControlPlaneConfig setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public CreateClusterRequestControlPlaneConfig setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateClusterRequestControlPlaneConfig setSystemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
            this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
        }

    }

    public static class CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig extends TeaModel {
        /**
         * <p>The VPCs where the internal domain name record resolution takes effect.</p>
         */
        @NameInMap("bind_vpcs")
        public java.util.List<String> bindVpcs;

        public static CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig self = new CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig setBindVpcs(java.util.List<String> bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }
        public java.util.List<String> getBindVpcs() {
            return this.bindVpcs;
        }

    }

    public static class CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig extends TeaModel {
        /**
         * <p>The endpoint type.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("endpoint_type")
        public String endpointType;

        /**
         * <p>The NLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-0ogk9aaxxxxxxx</p>
         */
        @NameInMap("load_balancer_id")
        public String loadBalancerId;

        public static CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig self = new CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class CreateClusterRequestControlPlaneEndpointsConfig extends TeaModel {
        /**
         * <p>The internal DNS configuration for the cluster. Applicable to ACK managed clusters. The internal domain name is used by node-side system components such as kubelet and kube-proxy to access the API Server. When internal domain name access is not enabled, node-side system components access the API Server through the CLB IP address.</p>
         */
        @NameInMap("internal_dns_config")
        public CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig;

        /**
         * <p>The cluster endpoint configuration. When this field is specified, the endpoint_public_access and load_balancer_id parameters do not take effect. ACK only supports automatic creation of NLB instances. To specify a CLB/NLB, use load_balancers_config to specify the instance ID.</p>
         */
        @NameInMap("load_balancers_config")
        public java.util.List<CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig> loadBalancersConfig;

        public static CreateClusterRequestControlPlaneEndpointsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestControlPlaneEndpointsConfig self = new CreateClusterRequestControlPlaneEndpointsConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestControlPlaneEndpointsConfig setInternalDnsConfig(CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig) {
            this.internalDnsConfig = internalDnsConfig;
            return this;
        }
        public CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig getInternalDnsConfig() {
            return this.internalDnsConfig;
        }

        public CreateClusterRequestControlPlaneEndpointsConfig setLoadBalancersConfig(java.util.List<CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig> loadBalancersConfig) {
            this.loadBalancersConfig = loadBalancersConfig;
            return this;
        }
        public java.util.List<CreateClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig> getLoadBalancersConfig() {
            return this.loadBalancersConfig;
        }

    }

    public static class CreateClusterRequestOperationPolicyClusterAutoUpgrade extends TeaModel {
        /**
         * <p>The cluster auto-upgrade frequency. Valid values:</p>
         * <ul>
         * <li>patch: Automatically upgrades to the available patch version of the current minor version. The new Kubernetes version does not contain breaking changes.</li>
         * <li>stable: Automatically upgrades to the latest patch version of the second-latest minor version. The new Kubernetes version may involve API and feature changes, but its stability has been widely validated.</li>
         * <li>rapid: Automatically upgrades to the latest patch version of the latest minor version to gain access to new Kubernetes community features faster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stable</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Specifies whether to enable cluster auto-upgrade.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Do not enable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateClusterRequestOperationPolicyClusterAutoUpgrade build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestOperationPolicyClusterAutoUpgrade self = new CreateClusterRequestOperationPolicyClusterAutoUpgrade();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestOperationPolicyClusterAutoUpgrade setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreateClusterRequestOperationPolicyClusterAutoUpgrade setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateClusterRequestOperationPolicy extends TeaModel {
        /**
         * <p>The cluster auto-upgrade configuration.</p>
         */
        @NameInMap("cluster_auto_upgrade")
        public CreateClusterRequestOperationPolicyClusterAutoUpgrade clusterAutoUpgrade;

        public static CreateClusterRequestOperationPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestOperationPolicy self = new CreateClusterRequestOperationPolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestOperationPolicy setClusterAutoUpgrade(CreateClusterRequestOperationPolicyClusterAutoUpgrade clusterAutoUpgrade) {
            this.clusterAutoUpgrade = clusterAutoUpgrade;
            return this;
        }
        public CreateClusterRequestOperationPolicyClusterAutoUpgrade getClusterAutoUpgrade() {
            return this.clusterAutoUpgrade;
        }

    }

    public static class CreateClusterRequestRrsaConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable RRSA.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Do not enable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateClusterRequestRrsaConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestRrsaConfig self = new CreateClusterRequestRrsaConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestRrsaConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateClusterRequestWorkerDataDisks extends TeaModel {
        /**
         * <p>The data cloud disk type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Specifies whether to encrypt the data cloud disk. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Encrypts the data cloud disk.</li>
         * <li><code>false</code>: Does not encrypt the data cloud disk.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("encrypted")
        public String encrypted;

        /**
         * <p>The performance level of the node data cloud disk. This parameter takes effect only for <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performance_level")
        public String performanceLevel;

        /**
         * <p>The data cloud disk size. Valid values: 40 to 32767. Unit: GiB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("size")
        public String size;

        public static CreateClusterRequestWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestWorkerDataDisks self = new CreateClusterRequestWorkerDataDisks();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestWorkerDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateClusterRequestWorkerDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateClusterRequestWorkerDataDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateClusterRequestWorkerDataDisks setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
