// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> Access control list for the registered cluster API Server SLB.</p>
     */
    @NameInMap("access_control_list")
    @Deprecated
    public java.util.List<String> accessControlList;

    /**
     * <p>List of cluster components. Specify components to install during cluster creation using the <code>addons</code> parameter.</p>
     * <p><strong>Network components</strong>: Required. Choose between Flannel and Terway:</p>
     * <ul>
     * <li><p>Flannel network: [{&quot;name&quot;:&quot;flannel&quot;,&quot;config&quot;:&quot;&quot;}].</p>
     * </li>
     * <li><p>Terway network: [{&quot;name&quot;: &quot;terway-eniip&quot;,&quot;config&quot;: &quot;&quot;}].</p>
     * </li>
     * </ul>
     * <p><strong>Storage components</strong>: Optional. Only <code>csi</code> is supported:</p>
     * <p><code>csi</code>: [{&quot;name&quot;:&quot;csi-plugin&quot;,&quot;config&quot;: &quot;&quot;},{&quot;name&quot;: &quot;csi-provisioner&quot;,&quot;config&quot;: &quot;&quot;}].</p>
     * <p><strong>Logging components</strong>: Optional. We recommend enabling this. Without SLS, you cannot use cluster audit features.</p>
     * <ul>
     * <li><p>Use an existing <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;,&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}&quot;}].</p>
     * </li>
     * <li><p>Create a new <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;}&quot;}].</p>
     * </li>
     * </ul>
     * <p><strong>Ingress components</strong>: Optional. ACK dedicated clusters install the <code>nginx-ingress-controller</code> by default.</p>
     * <ul>
     * <li><p>Install Ingress with public network access: [{&quot;name&quot;:&quot;nginx-ingress-controller&quot;,&quot;config&quot;:&quot;{&quot;IngressSlbNetworkType&quot;:&quot;internet&quot;}&quot;}].</p>
     * </li>
     * <li><p>Disable default Ingress installation: [{&quot;name&quot;: &quot;nginx-ingress-controller&quot;,&quot;config&quot;: &quot;&quot;,&quot;disabled&quot;: true}].</p>
     * </li>
     * </ul>
     * <p><strong>Event Hub</strong>: Optional. Enabled by default.</p>
     * <p>Event Hub provides storage, querying, and alerting for Kubernetes events. The associated Logstore is free for 90 days. For more information about the free policy, see <a href="https://help.aliyun.com/document_detail/150476.html">Create and use Kubernetes Event Hub</a>.</p>
     * <p>Example to enable Event Hub: [{&quot;name&quot;:&quot;ack-node-problem-detector&quot;,&quot;config&quot;:&quot;{&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}&quot;}].</p>
     */
    @NameInMap("addons")
    public java.util.List<Addon> addons;

    /**
     * <p>ServiceAccount is the access credential used by pods to communicate with the cluster API Server. The <code>api-audiences</code> specifies valid <code>token</code> identities for authenticating requests on the <code>apiserver</code> side. You can configure multiple <code>audience</code> values separated by commas (,).</p>
     * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Deploy service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("api_audiences")
    public String apiAudiences;

    /**
     * <p>Cluster audit log configuration.</p>
     */
    @NameInMap("audit_log_config")
    public CreateClusterRequestAuditLogConfig auditLogConfig;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2938898.html">Intelligent Managed Mode</a> configuration.</p>
     */
    @NameInMap("auto_mode")
    public CreateClusterRequestAutoMode autoMode;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>Whether to enable auto-renewal. Valid only when <code>charge_type</code> is <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enable auto-renewal.</p>
     * </li>
     * <li><p><code>false</code>: Disable auto-renewal.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>This parameter changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on Changes to CreateCluster API Parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_renew")
    @Deprecated
    public Boolean autoRenew;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>Auto-renewal period in months. Valid only when prepaid and auto-renewal are enabled. When <code>PeriodUnit=Month</code>, valid values are {1, 2, 3, 6, 12}.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on Changes to CreateCluster API Parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("auto_renew_period")
    @Deprecated
    public Long autoRenewPeriod;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>Billing type for the CLB instance used by the API Server. Default value: PostPaid. Valid values:</p>
     * <ul>
     * <li><p>PostPaid: Pay-as-you-go.</p>
     * </li>
     * <li><p>PrePaid: Subscription. New CLB instances no longer support subscription billing, but existing instances are unaffected.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li><p>This parameter changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on Changes to CreateCluster API Parameters</a>.</p>
     * </li>
     * <li><p>Starting December 1, 2024, new CLB instances will no longer support subscription billing and will incur an instance fee.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;For details, see <a href="~~2851191~~">[Product Announcement] Discontinuation of Subscription Billing for API Server CLB in New Clusters</a> and <a href="https://help.aliyun.com/document_detail/2839797.html">Adjustment of Classic Load Balancer Billing Items</a>.
     * &lt;props=&quot;intl&quot;&gt;For details, see <a href="https://help.aliyun.com/document_detail/2839797.html">Adjustment of Classic Load Balancer Billing Items</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("charge_type")
    @Deprecated
    public String chargeType;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cis_enabled")
    @Deprecated
    public Boolean cisEnabled;

    /**
     * <p><strong>[Deprecated]</strong> For control plane node configuration, use the cloud_monitor_flags parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>cms_enabled</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code>.</p>
     * <p>Whether to install the CloudMonitor agent on the cluster. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Install the CloudMonitor agent.</p>
     * </li>
     * <li><p><code>false</code>: Do not install the CloudMonitor agent.</p>
     * </li>
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
     * <p>Cluster local domain name.</p>
     * <p>Naming rules: The domain name consists of one or more parts separated by dots (.). Each part can be up to 63 characters long and can contain lowercase letters, digits, and hyphens (-). Each part must start and end with a lowercase letter or digit.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster.local</p>
     */
    @NameInMap("cluster_domain")
    public String clusterDomain;

    /**
     * <p>When you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure <code>profile</code>, you can further specify the cluster specification. Valid values:</p>
     * <ul>
     * <li><p><code>ack.standard</code>: Basic Edition (default when this parameter is empty)</p>
     * </li>
     * <li><p><code>ack.pro.small</code>: Pro Edition</p>
     * </li>
     * <li><p><code>ack.pro.xlarge</code>: Pro XL</p>
     * </li>
     * <li><p><code>ack.pro.2xlarge</code>: Pro 2XL</p>
     * </li>
     * <li><p><code>ack.pro.4xlarge</code>: Pro 4XL (requires whitelist approval from customer service)</p>
     * </li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>. These tiers pre-allocate and dedicate control plane resources to ensure consistently high API concurrency and pod scheduling performance. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For cluster management fees for Pro Edition and provisioned control plane clusters, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <ul>
     * <li><p><code>Kubernetes</code>: ACK dedicated cluster.</p>
     * </li>
     * <li><p><code>ManagedKubernetes</code>: ACK managed clusters, including ACK managed clusters (Pro Edition, Basic Edition), ACK serverless clusters (Pro Edition, Basic Edition), ACK Edge clusters (Pro Edition, Basic Edition), and ACK LINGJUN clusters (Pro Edition).</p>
     * </li>
     * <li><p><code>ExternalKubernetes</code>: registered cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>Pod network CIDR block. It must be a valid private CIDR block: 10.0.0.0/8, 172.16.0.0/12 to 172.31.0.0/16, or 192.168.0.0/16. It cannot overlap with the VPC or existing Kubernetes cluster CIDR blocks in the VPC. This cannot be modified after cluster creation.</p>
     * <p>For cluster network planning, see <a href="https://help.aliyun.com/document_detail/86500.html">Network planning for ACK managed clusters</a>.</p>
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
     * <p>Control plane configuration for ACK dedicated clusters.</p>
     */
    @NameInMap("control_plane_config")
    public CreateClusterRequestControlPlaneConfig controlPlaneConfig;

    /**
     * <p>Cluster connection configuration.</p>
     */
    @NameInMap("control_plane_endpoints_config")
    public CreateClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>List of component names specifying which control plane component logs to collect.</p>
     * <p>By default, logs are collected for kube-apiserver, kube-controller-manager, kube-scheduler, and cloud-controller-manager.</p>
     */
    @NameInMap("controlplane_log_components")
    public java.util.List<String> controlplaneLogComponents;

    /**
     * <p>SLS Project for control plane component logs. You can use an existing Project for log storage or let the system automatically create one. If auto-created, the Project name will be <code>k8s-log-{ClusterID}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-log-xxx</p>
     */
    @NameInMap("controlplane_log_project")
    public String controlplaneLogProject;

    /**
     * <p>Number of days to retain control plane component logs.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("controlplane_log_ttl")
    public String controlplaneLogTtl;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>cpu_policy</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>cpu_policy</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code>.</p>
     * <p>Node CPU management policy. Supported for cluster versions 1.12.6 and later:</p>
     * <ul>
     * <li><p><code>static</code>: Enhances CPU affinity and exclusivity for pods with specific resource characteristics on the node.</p>
     * </li>
     * <li><p><code>none</code>: Uses the default CPU affinity scheme.</p>
     * </li>
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
     * <p><strong>[Deprecated]</strong> Use the <code>extra_sans</code> parameter instead.</p>
     * <p>Custom certificate SAN. Separate multiple IP addresses or domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cs.aliyun.com</p>
     */
    @NameInMap("custom_san")
    @Deprecated
    public String customSan;

    /**
     * <p>Cluster deletion protection prevents accidental cluster deletion through the console or API. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enable deletion protection. You cannot delete the cluster through the console or API.</p>
     * </li>
     * <li><p><code>false</code>: Disable deletion protection. You can delete the cluster through the console or API.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p><strong>[Deprecated]</strong> By default, clusters are not rolled back on creation failure. You must manually clean up failed clusters.</p>
     * <p>Whether to roll back on cluster creation failure. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Roll back on failure.</p>
     * </li>
     * <li><p><code>false</code>: Do not roll back on failure.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("disable_rollback")
    @Deprecated
    public Boolean disableRollback;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>rrsa_config</code> parameter instead.</p>
     * <p>Whether to enable RRSA.</p>
     * <ul>
     * <li><p>true: Enable.</p>
     * </li>
     * <li><p>false: Disable.</p>
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
     * <p>KMS key ID used to encrypt data disks. For more information, see <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service</a>.</p>
     * <blockquote>
     * <p>This feature is available only for professional managed clusters (ACK Pro clusters).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0fe64791-55eb-4fc7-84c5-c6c7cdca****</p>
     */
    @NameInMap("encryption_provider_key")
    public String encryptionProviderKey;

    /**
     * <p>Whether to enable public network access. Expose the API Server through an EIP to allow public network access to the cluster.</p>
     * <ul>
     * <li><p><code>true</code>: Enable public network access.</p>
     * </li>
     * <li><p><code>false</code>: Disable public network access. If disabled, you cannot access the cluster API Server from external networks.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("endpoint_public_access")
    public Boolean endpointPublicAccess;

    /**
     * <p>Custom API Server certificate SAN (Subject Alternative Name).</p>
     */
    @NameInMap("extra_sans")
    public java.util.List<String> extraSans;

    /**
     * <p><strong>[Deprecated]</strong> Adding existing nodes during cluster creation is not supported. To add existing nodes to a cluster, first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> API.</p>
     * <p>When using existing instances to create a cluster, whether to mount data disks. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Store containers and images on the data disk. Existing data on the data disk will be lost. Back up your data.</p>
     * </li>
     * <li><p><code>false</code>: Do not store containers and images on the data disk.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>Data disk mounting rules:</p>
     * <ul>
     * <li><p>If the ECS instance has a mounted data disk and the file system of the last data disk is uninitialized, the system automatically formats it as ext4 to store /var/lib/docker and /var/lib/kubelet.</p>
     * </li>
     * <li><p>If the ECS instance has no mounted data disks, no new data disks are mounted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    @Deprecated
    public Boolean formatDisk;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>image_id</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>image_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Custom node image. By default, the system image is used. When you select a custom image, it replaces the default system image. See <a href="https://help.aliyun.com/document_detail/146647.html">Custom images</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp16z7xko3vvv8gt****</p>
     */
    @NameInMap("image_id")
    @Deprecated
    public String imageId;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>image_type</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Operating system distribution type. We recommend using this parameter to specify the node operating system. Valid values:</p>
     * <ul>
     * <li><p>CentOS</p>
     * </li>
     * <li><p>AliyunLinux</p>
     * </li>
     * <li><p>AliyunLinux Qboot</p>
     * </li>
     * <li><p>AliyunLinuxUEFI</p>
     * </li>
     * <li><p>AliyunLinux3</p>
     * </li>
     * <li><p>Windows</p>
     * </li>
     * <li><p>WindowsCore</p>
     * </li>
     * <li><p>AliyunLinux3Arm64</p>
     * </li>
     * <li><p>ContainerOS</p>
     * </li>
     * </ul>
     * <p>Default value: <code>CentOS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunLinux</p>
     */
    @NameInMap("image_type")
    @Deprecated
    public String imageType;

    /**
     * <p><strong>[Deprecated]</strong> Adding existing nodes during cluster creation is not supported. To add existing nodes to a cluster, first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> API.</p>
     * <p>When using existing nodes to create a cluster, specify the ECS instance list. These instances are added as worker nodes to the cluster.</p>
     * <blockquote>
     * <p>This field is required when using existing instances to create a cluster.</p>
     * </blockquote>
     */
    @NameInMap("instances")
    @Deprecated
    public java.util.List<String> instances;

    /**
     * <p>Cluster IP stack.</p>
     * 
     * <strong>example:</strong>
     * <p>可选值：
     * ipv4（单栈）
     * dual（双栈），默认值为ipv4。</p>
     */
    @NameInMap("ip_stack")
    public String ipStack;

    /**
     * <p>Automatically create an advanced security group. This takes effect when <code>security_group_id</code> is empty.</p>
     * <blockquote>
     * <p>With basic security groups, the total number of nodes and Terway pods in a cluster cannot exceed 2,000. We recommend using advanced security groups for Terway network clusters.</p>
     * </blockquote>
     * <ul>
     * <li><p><code>true</code>: Create and use an advanced security group.</p>
     * </li>
     * <li><p><code>false</code>: Use a basic security group.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_enterprise_security_group")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p><strong>[Deprecated]</strong> Adding existing nodes during cluster creation is not supported. To add existing nodes to a cluster, first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> API.</p>
     * <p>When using existing instances to create a cluster, whether to keep the instance names.</p>
     * <ul>
     * <li><p><code>true</code>: Keep.</p>
     * </li>
     * <li><p><code>false</code>: Replace with system-generated names.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    @Deprecated
    public Boolean keepInstanceName;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>key_pair</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>key_pair</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Key pair name. Choose either this parameter or <code>login_password</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>security-key</p>
     */
    @NameInMap("key_pair")
    @Deprecated
    public String keyPair;

    /**
     * <p>Cluster version, aligned with the Kubernetes community baseline version. We recommend selecting the latest version. If not specified, the latest version is used by default.</p>
     * <p>You can create clusters using any of the three most recent versions. Use the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> API to query supported cluster versions.</p>
     * <p>For more information about Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Overview of Kubernetes version releases</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>Specify the CLB instance ID for API Server access. If specified, no new API Server CLB is automatically created.</p>
     * <blockquote>
     * <p>Ensure the CLB instance has no dependencies (such as listeners or backend servers). Shared and public CLB instances are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-wz9t256gqa3vbouk****</p>
     */
    @NameInMap("load_balancer_id")
    public String loadBalancerId;

    /**
     * <p><strong>[Deprecated]</strong> CLB is billed based on usage. This parameter has no effect.</p>
     * <p>Load Balancer specification. Valid values:</p>
     * <ul>
     * <li><p>slb.s1.small</p>
     * </li>
     * <li><p>slb.s2.small</p>
     * </li>
     * <li><p>slb.s2.medium</p>
     * </li>
     * <li><p>slb.s3.small</p>
     * </li>
     * <li><p>slb.s3.medium</p>
     * </li>
     * <li><p>slb.s3.large</p>
     * </li>
     * </ul>
     * <p>Default value: <code>slb.s2.small</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s2.small</p>
     */
    @NameInMap("load_balancer_spec")
    @Deprecated
    public String loadBalancerSpec;

    /**
     * <p><strong>[Deprecated]</strong> Enables SLS for the cluster. Applies only to ACK Serverless clusters and must be set to <code>SLS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("logging_type")
    @Deprecated
    public String loggingType;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>login_password</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>login_password</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>SSH login password. Choose either this parameter or <code>key_pair</code>. Password rules: 8–30 characters, containing at least three of the following: uppercase letters, lowercase letters, digits, and special characters.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("login_password")
    @Deprecated
    public String loginPassword;

    /**
     * <p>Cluster maintenance window.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>auto_renew</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Whether to enable auto-renewal for master nodes. Valid only when <code>master_instance_charge_type</code> is <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enable auto-renewal.</p>
     * </li>
     * <li><p><code>false</code>: Disable auto-renewal.</p>
     * </li>
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
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>auto_renew_period</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Auto-renewal period for master nodes in months. Required and valid only when subscription billing is selected.</p>
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
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>size</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Number of master nodes. Valid values: <code>3</code> or <code>5</code>.</p>
     * <p>Default value: <code>3</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("master_count")
    @Deprecated
    public Long masterCount;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>instance_charge_type</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Master node billing type. Valid values:</p>
     * <ul>
     * <li><p><code>PrePaid</code>: Subscription.</p>
     * </li>
     * <li><p><code>PostPaid</code>: Pay-as-you-go.</p>
     * </li>
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
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>instance_types</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Master node instance types. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     */
    @NameInMap("master_instance_types")
    @Deprecated
    public java.util.List<String> masterInstanceTypes;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>unit</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Subscription duration for master nodes in months. Required and valid only when <code>master_instance_charge_type</code> is <code>PrePaid</code>.</p>
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
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>period_unit</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Master node billing cycle. Required when master_instance_charge_type is <code>PrePaid</code>.</p>
     * <p>Valid value: <code>Month</code>. Only monthly billing is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("master_period_unit")
    @Deprecated
    public String masterPeriodUnit;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>system_disk_category</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Master node system disk type. Valid values:</p>
     * <ul>
     * <li><p><code>cloud_efficiency</code>: Ultra disk.</p>
     * </li>
     * <li><p><code>cloud_ssd</code>: Standard SSD.</p>
     * </li>
     * <li><p><code>cloud_essd</code>: ESSD.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>cloud_ssd</code>. The default may vary by zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("master_system_disk_category")
    @Deprecated
    public String masterSystemDiskCategory;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>system_disk_performance_level</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Performance level for master node system disks. Applies only to ESSD disks. Disk performance levels depend on disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("master_system_disk_performance_level")
    @Deprecated
    public String masterSystemDiskPerformanceLevel;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>system_disk_size</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Valid range: [40,500].</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("master_system_disk_size")
    @Deprecated
    public Long masterSystemDiskSize;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>system_disk_snapshot_policy_id</code> parameter under <code>control_plane_config</code>.</p>
     * <p>Automatic snapshot policy ID for master node system disks.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("master_system_disk_snapshot_policy_id")
    @Deprecated
    public String masterSystemDiskSnapshotPolicyId;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>vswitch_ids</code> parameter instead.</p>
     * <p>List of master node vSwitch IDs. The number of vSwitches must be in the range [1,3]. For high availability, we recommend selecting three vSwitches in different zones.</p>
     * <p>The number of specified instance types must match <code>master_count</code> and correspond one-to-one with elements in <code>master_vswitch_ids</code>.</p>
     */
    @NameInMap("master_vswitch_ids")
    @Deprecated
    public java.util.List<String> masterVswitchIds;

    /**
     * <p>Custom cluster name. It can contain digits, letters, Chinese characters, or hyphens (-). The name must be 1 to 63 characters long and cannot start with a hyphen (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>snat_entry</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nat_gateway")
    @Deprecated
    public Boolean natGateway;

    /**
     * <p>Number of node IP addresses, determined by the specified CIDR mask. This applies only to Flannel network clusters.</p>
     * <p>Default value: <code>26</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>node_name_mode</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("node_name_mode")
    @Deprecated
    public String nodeNameMode;

    /**
     * <p>Node service port range: [30000,65535].</p>
     * <p>Default value: <code>30000-32767</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>30000~32767</p>
     */
    @NameInMap("node_port_range")
    @Deprecated
    public String nodePortRange;

    /**
     * <p>List of node pools.</p>
     */
    @NameInMap("nodepools")
    public java.util.List<Nodepool> nodepools;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>desired_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Number of worker nodes. Range: [0,100].</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("num_of_nodes")
    @Deprecated
    public Long numOfNodes;

    /**
     * <p>Cluster automated operations policy.</p>
     */
    @NameInMap("operation_policy")
    public CreateClusterRequestOperationPolicy operationPolicy;

    /**
     * <p><strong>[Deprecated]</strong> For control plane node configuration, use the <code>image_type</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Operating system platform type. Valid values:</p>
     * <ul>
     * <li><p>Windows</p>
     * </li>
     * <li><p>Linux</p>
     * </li>
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
     * <p><strong>[Deprecated]</strong></p>
     * <p>Subscription duration in months. Required and valid only when charge_type is PrePaid.</p>
     * <p>Valid values: {1, 2, 3, 6, 12, 24, 36, 48, 60}.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on Changes to CreateCluster API Parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Deprecated
    public Long period;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>Billing cycle. Required when the billing type is PrePaid.</p>
     * <p>Valid value: Month. Only monthly billing is supported.</p>
     * <p>This parameter changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on Changes to CreateCluster API Parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("period_unit")
    @Deprecated
    public String periodUnit;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>platform</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Operating system distribution. Valid values:</p>
     * <ul>
     * <li><p>CentOS</p>
     * </li>
     * <li><p>AliyunLinux</p>
     * </li>
     * <li><p>QbootAliyunLinux</p>
     * </li>
     * <li><p>Qboot</p>
     * </li>
     * <li><p>Windows</p>
     * </li>
     * <li><p>WindowsCore</p>
     * </li>
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
     * <p><strong>[Deprecated]</strong> When using the Terway network plugin, specify virtual switches to assign IP addresses to pods. Each pod virtual switch corresponds to a worker node virtual switch, and both must be in the same zone.</p>
     * <blockquote>
     * <p>We recommend that the pod virtual switch CIDR mask not exceed /19 and must not exceed /25. Otherwise, the number of assignable pod IP addresses becomes very limited, affecting normal cluster operation.</p>
     * </blockquote>
     */
    @NameInMap("pod_vswitch_ids")
    @Deprecated
    public java.util.List<String> podVswitchIds;

    /**
     * <p>When you set <code>cluster_type</code> to <code>ManagedKubernetes</code> (ACK managed cluster), you can further specify the cluster subtype.</p>
     * <ul>
     * <li><p><code>Default</code>: ACK managed cluster, including ACK clusters (Pro Edition, Basic Edition).</p>
     * </li>
     * <li><p><code>Edge</code>: ACK Edge cluster, including ACK Edge clusters (Pro Edition, Basic Edition).</p>
     * </li>
     * <li><p><code>Serverless</code>: ACK serverless cluster, including ACK serverless clusters (Pro Edition, Basic Edition).</p>
     * </li>
     * <li><p><code>Lingjun</code>: ACK LINGJUN cluster, available only in Pro Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>kube-proxy proxy mode</p>
     * <ul>
     * <li><p><code>iptables</code>: A mature and stable kube-proxy mode. Kubernetes Service discovery and load balancing use iptables rules. Performance is moderate and scales poorly with large numbers of Services. Suitable for clusters with few Services.</p>
     * </li>
     * <li><p><code>ipvs</code>: A high-performance kube-proxy mode. Kubernetes Service discovery and load balancing use the Linux IPVS module. Suitable for clusters with many Services requiring high-performance load balancing.</p>
     * </li>
     * <li><p><code>nftables</code>: A next-generation kube-proxy mode based on Linux nftables for Service discovery and load balancing. It is the modern replacement for iptables. Compared to iptables, nftables offers better network performance, faster rule updates, and superior scalability for large numbers of Services.<br>
     * Supported only for clusters running Kubernetes version 1.35 or later. The Kubernetes community deprecated IPVS starting in version 1.35. We recommend using nftables for new clusters to ensure long-term community support.<br></p>
     * </li>
     * </ul>
     * <p>Default value: <code>ipvs</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>rds_instances</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>List of RDS instances to add to the whitelist. We recommend adding the pod and node CIDR blocks of your container cluster to the RDS whitelist. Setting RDS instances might fail if they are not in the Running state.</p>
     */
    @NameInMap("rds_instances")
    @Deprecated
    public java.util.List<String> rdsInstances;

    /**
     * <p>The region ID where the cluster is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/216938.html">Regions supported by Container Service for Kubernetes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The resource group ID to which the cluster belongs, used to isolate different resources.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3mkrure****</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>RRSA feature configuration.</p>
     */
    @NameInMap("rrsa_config")
    public CreateClusterRequestRrsaConfig rrsaConfig;

    /**
     * <p>Container runtime for the cluster. Supports containerd, sandboxed containers, and Docker.</p>
     * <blockquote>
     * <p>Kubernetes 1.24 no longer supports Docker as a built-in container runtime.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/160313.html">Comparison of Docker, containerd, and sandboxed container runtimes</a>.</p>
     */
    @NameInMap("runtime")
    @Deprecated
    public Runtime runtime;

    /**
     * <p>Specify an existing security group ID when creating a cluster. Choose either this parameter or <code>is_enterprise_security_group</code>. Cluster nodes are automatically added to this security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1bdue0qc1g7k****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p><strong>[Deprecated]</strong> For control plane configuration, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Alibaba Cloud OS security hardening. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enable Alibaba Cloud OS security hardening.</p>
     * </li>
     * <li><p><code>false</code>: Disable Alibaba Cloud OS security hardening.</p>
     * </li>
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
     * <p>ServiceAccount is the access credential used by pods to communicate with the cluster API Server. The <code>service-account-issuer</code> is the issuer identity in the <code>serviceaccount token</code>, represented by the <code>iss</code> field in the <code>token payload</code>.</p>
     * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Deploy service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("service_account_issuer")
    public String serviceAccountIssuer;

    /**
     * <p>Service network CIDR block. Valid ranges: 10.0.0.0/16-24, 172.16.0.0/16-24 to 172.31.0.0/16-24, 192.168.0.0/16-24.
     * It cannot overlap with the VPC CIDR block 10.1.0.0/21 or existing Kubernetes cluster CIDR blocks in the VPC. This cannot be modified after cluster creation.</p>
     * <p>Default value: 172.19.0.0/20.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.0.0/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p><strong>[Deprecated]</strong> Service discovery type for the cluster, used to specify the service discovery method in <code>ACK Serverless</code> clusters.</p>
     * <ul>
     * <li><p><code>CoreDNS</code>: Uses the standard Kubernetes service discovery component CoreDNS. Requires deploying a set of containers for DNS resolution. Defaults to two ECI instances with 0.25 vCPU and 512 MiB memory each.</p>
     * </li>
     * <li><p><code>PrivateZone</code>: Uses Alibaba Cloud PrivateZone for service discovery. Requires enabling the PrivateZone service.</p>
     * </li>
     * </ul>
     * <p>Default value: Disabled.</p>
     */
    @NameInMap("service_discovery_types")
    @Deprecated
    public java.util.List<String> serviceDiscoveryTypes;

    /**
     * <p>Configure SNAT for the VPC. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Automatically create a NAT Gateway and configure SNAT rules. Set this to <code>true</code> if nodes or applications in the cluster need public network access.</p>
     * </li>
     * <li><p><code>false</code>: Do not create a NAT Gateway or SNAT rules. Nodes and applications in the cluster cannot access the public network.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not enable this during cluster creation but later need public network access, you can <a href="https://help.aliyun.com/document_detail/178480.html">enable it manually</a>.</p>
     * </blockquote>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    /**
     * <p><strong>[Deprecated]</strong> For control plane node configuration, use the <code>soc_enabled</code> parameter under <code>control_plane_config</code>. For node pool configuration, use the <code>soc_enabled</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>MLPS 2.0 security hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">Using MLPS 2.0 security hardening in ACK</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enable MLPS 2.0 security hardening.</p>
     * </li>
     * <li><p><code>false</code>: Disable MLPS 2.0 security hardening.</p>
     * </li>
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
     * <p>Whether to enable public SSH logon. Used to log on to master nodes of ACK dedicated clusters. This parameter does not take effect for managed clusters.</p>
     * <ul>
     * <li><p><code>true</code>: Enable.</p>
     * </li>
     * <li><p><code>false</code>: Disable.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    /**
     * <p>Node labels. Label rules:</p>
     * <ul>
     * <li><p>Labels consist of case-sensitive key-value pairs. You can add up to 20 tags.</p>
     * </li>
     * <li><p>Tag keys must be unique and up to 64 characters long. Tag values can be empty and up to 128 characters long. Neither tag keys nor tag values can start with &quot;aliyun&quot;, &quot;acs:&quot;, &quot;https\://&quot;, or &quot;http\://&quot;. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</p>
     * </li>
     * </ul>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>taints</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code>.</p>
     * <p>Node taint information. Taints and tolerations work together to prevent pods from being scheduled onto unsuitable nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
     */
    @NameInMap("taints")
    @Deprecated
    public java.util.List<Taint> taints;

    /**
     * <p><strong>[Deprecated]</strong> By default, clusters are not rolled back on creation failure. You must manually clean up failed clusters.</p>
     * <p>Cluster creation timeout in minutes.</p>
     * <p>Default value: <code>60</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout_mins")
    @Deprecated
    public Long timeoutMins;

    /**
     * <p>Time zone used by the cluster. See <a href="https://help.aliyun.com/document_detail/354879.html">Supported time zones</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>Custom cluster CA.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----****</p>
     */
    @NameInMap("user_ca")
    public String userCa;

    /**
     * <p><strong>[Deprecated]</strong> Custom node data.</p>
     * 
     * <strong>example:</strong>
     * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFD****</p>
     */
    @NameInMap("user_data")
    @Deprecated
    public String userData;

    /**
     * <p>The VPC used by the cluster. You must provide this when creating a cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zeik9h3ahvv2zz95****</p>
     */
    @NameInMap("vpcid")
    public String vpcid;

    /**
     * <p>Virtual switches for cluster nodes. This field is required when creating a zero-node managed cluster.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>auto_renew</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Whether to enable auto-renewal for worker nodes. Valid only when <code>worker_instance_charge_type</code> is <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enable auto-renewal.</p>
     * </li>
     * <li><p><code>false</code>: Disable auto-renewal.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("worker_auto_renew")
    @Deprecated
    public Boolean workerAutoRenew;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>auto_renew_period</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Auto-renewal period for worker nodes in months. Required and valid only when subscription billing is selected.</p>
     * <p>Valid values: {1, 2, 3, 6, 12}.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_auto_renew_period")
    @Deprecated
    public Long workerAutoRenewPeriod;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>data_disks</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Configuration for worker node data disks, including type and size.</p>
     */
    @NameInMap("worker_data_disks")
    @Deprecated
    public java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>instance_charge_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Worker node billing type. Valid values:</p>
     * <ul>
     * <li><p><code>PrePaid</code>: Subscription.</p>
     * </li>
     * <li><p><code>PostPaid</code>: Pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>Default value: Pay-as-you-go.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("worker_instance_charge_type")
    @Deprecated
    public String workerInstanceChargeType;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>instance_types</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Worker node instance configuration.</p>
     */
    @NameInMap("worker_instance_types")
    @Deprecated
    public java.util.List<String> workerInstanceTypes;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>period</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Subscription duration for worker nodes in months. Required and valid only when <code>worker_instance_charge_type</code> is <code>PrePaid</code>.</p>
     * <p>Valid values: {1, 2, 3, 6, 12, 24, 36, 48, 60}.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_period")
    @Deprecated
    public Long workerPeriod;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>period_unit</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Worker node billing cycle. Required when worker_instance_charge_type is <code>PrePaid</code>.</p>
     * <p>Valid value: <code>Month</code>. Only monthly billing is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("worker_period_unit")
    @Deprecated
    public String workerPeriodUnit;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>system_disk_category</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Worker node system disk type. For more information, see <a href="https://help.aliyun.com/document_detail/63136.html">Overview of Elastic Block Storage</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>cloud_efficiency</code>: Ultra disk.</p>
     * </li>
     * <li><p><code>cloud_ssd</code>: Standard SSD.</p>
     * </li>
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
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>system_disk_performance_level</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>When the system disk is an ESSD, you can set the performance level (PL). For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>PL0</p>
     * </li>
     * <li><p>PL1</p>
     * </li>
     * <li><p>PL2</p>
     * </li>
     * <li><p>PL3</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("worker_system_disk_performance_level")
    @Deprecated
    public String workerSystemDiskPerformanceLevel;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>system_disk_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Worker node system disk size in GiB.</p>
     * <p>Valid range: [40,500].</p>
     * <p>This value must be greater than or equal to max{40, ImageSize}.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("worker_system_disk_size")
    @Deprecated
    public Long workerSystemDiskSize;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>system_disk_snapshot_policy_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>Automatic snapshot policy ID for worker node system disks.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    public String workerSystemDiskSnapshotPolicyId;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>vswitch_ids</code> parameter under <code>scaling_group</code> in <code>nodepool</code>.</p>
     * <p>List of vSwitches used by cluster nodes. One node corresponds to one value.</p>
     * <p>When creating a zero-node managed cluster, <code>worker_vswitch_ids</code> is optional, but you must provide <code>vswitch_ids</code>.</p>
     */
    @NameInMap("worker_vswitch_ids")
    @Deprecated
    public java.util.List<String> workerVswitchIds;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>zone_ids</code> parameter instead.</p>
     * <p>The zone ID in the cluster region. This parameter applies only to ACK managed clusters.</p>
     * <p>When creating an ACK managed cluster, if you do not specify <code>vpc_id</code> and <code>vswitch_ids</code>, you must specify <code>zone_id</code> to automatically create VPC network resources in this zone. This parameter is ignored if you specify <code>vpc_id</code> and <code>vswitch_ids</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beiji****</p>
     */
    @NameInMap("zone_id")
    @Deprecated
    public String zoneId;

    /**
     * <p>A list of zone IDs in the cluster region. This parameter applies only to ACK managed clusters.</p>
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
         * <p>Whether to enable cluster audit logging.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Disable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">SLS Project</a> containing the <a href="https://help.aliyun.com/document_detail/48873.html">Logstore</a> for cluster audit logs.</p>
         * <ul>
         * <li><p>Default value: <code>k8s-log-{clusterid}</code>.</p>
         * </li>
         * <li><p>When audit logging is enabled, a Logstore for audit logs is created in the specified SLS Project.</p>
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
         * <p>Whether to enable Intelligent Managed Mode.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Disable.</p>
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
         * <p>Whether to enable auto-renewal for control plane nodes. Valid only when charge_type is <code>PrePaid</code>.</p>
         * <ul>
         * <li><p>true: Enable auto-renewal.</p>
         * </li>
         * <li><p>false: Disable auto-renewal.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>Auto-renewal duration for control plane nodes in months.</p>
         * <p>Valid values: {1, 2, 3, 6, 12}.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Control plane node billing type.</p>
         * <ul>
         * <li><p><code>PrePaid</code>: Subscription.</p>
         * </li>
         * <li><p><code>PostPaid</code>: Pay-as-you-go.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("charge_type")
        public String chargeType;

        /**
         * <p>Whether to install Cloud Monitor on nodes.</p>
         * <ul>
         * <li><p>true: Install the CloudMonitor agent.</p>
         * </li>
         * <li><p>false: Do not install the CloudMonitor agent.</p>
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
         * <p>Node CPU management policy.</p>
         * <ul>
         * <li><p>static: Enhances CPU affinity and exclusivity for pods with specific resource characteristics on the node.</p>
         * </li>
         * <li><p>none: Uses the default CPU affinity scheme.</p>
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
         * <p>Deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp10b35imuam5amw****</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>Image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20240819.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>Operating system image type.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>ECS instance metadata access configuration.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>Node instance types.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>Key pair name. Choose either this parameter or login_password.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>SSH login password. Password rules: 8–30 characters, containing at least three of the following: uppercase letters, lowercase letters, digits, and special characters. Choose either this parameter or key_pair.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p><strong>[Deprecated]</strong> Node service port range.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>Subscription duration for control plane nodes in months. Required and valid only when charge_type is <code>PrePaid</code>.</p>
         * <p>Valid values: {1, 2, 3, 6, 12, 24, 36, 48, 60}.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>Billing cycle unit for control plane nodes. Required and valid only when charge_type is <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>. Only monthly billing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p><strong>[Deprecated]</strong> Control plane node runtime name. Valid value:</p>
         * <p>containerd: Containerd runtime, supported for all cluster versions.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>Whether to enable Alibaba Cloud OS security hardening.</p>
         * <ul>
         * <li><p>true: Enable Alibaba Cloud OS security hardening.</p>
         * </li>
         * <li><p>false: Disable Alibaba Cloud OS security hardening.</p>
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
         * <p>Number of control plane nodes.</p>
         * <p>Valid values: <code>3</code> or <code>5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>Whether to enable MLPS 2.0 security hardening.</p>
         * <ul>
         * <li><p>true: Enable MLPS 2.0 security hardening.</p>
         * </li>
         * <li><p>false: Disable MLPS 2.0 security hardening.</p>
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
         * <p>Whether to enable performance burst for node system disks.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Disable.</p>
         * </li>
         * </ul>
         * <p>This parameter is supported only when <code>system_disk_category</code> is <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>Node system disk type.</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: Ultra disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: Standard SSD.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: ESSD.</p>
         * </li>
         * <li><p><code>cloud_auto</code>: ESSD AutoPL.</p>
         * </li>
         * <li><p><code>cloud_essd_entry</code>: ESSD Entry.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>cloud_ssd</code>. The default may vary by zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>Node system disk performance level. Applies only to ESSD disks.</p>
         * <p>Disk performance levels depend on disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>Provisioned read/write IOPS for node system disks.</p>
         * <p>Valid range: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
         * <p>This parameter is supported only when <code>system_disk_category</code> is <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>Node system disk size in GiB.</p>
         * <p>Valid range: [40,500].</p>
         * <p>Default value: <code>120</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>Automatic snapshot backup policy for node system disks.</p>
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
         * <p>VPCs where the internal domain name resolution takes effect.</p>
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

    public static class CreateClusterRequestControlPlaneEndpointsConfig extends TeaModel {
        /**
         * <p>Internal domain name configuration for the cluster, applicable to ACK managed clusters. Internal domain names allow node-side system components such as kubelet and kube-proxy to access the API Server. Without internal domain name access, node-side components access the API Server through the CLB IP address.</p>
         */
        @NameInMap("internal_dns_config")
        public CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig;

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

    }

    public static class CreateClusterRequestOperationPolicyClusterAutoUpgrade extends TeaModel {
        /**
         * <p>Cluster automatic upgrade frequency. Valid values:</p>
         * <ul>
         * <li><p>patch: Automatically upgrade to the latest patch version within the current minor version. New Kubernetes versions do not include breaking changes.</p>
         * </li>
         * <li><p>stable: Automatically upgrade to the latest patch version of the second-newest minor version. New Kubernetes versions may include API and feature changes but have undergone extensive stability validation.</p>
         * </li>
         * <li><p>rapid: Automatically upgrade to the latest patch version of the newest minor version to quickly access new Kubernetes community features.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stable</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Whether to enable cluster automatic upgrade.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Disable.</p>
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
         * <p>Cluster automatic upgrade.</p>
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
         * <p>Whether to enable RRSA.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Disable.</p>
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
         * <p>Data disk type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Whether to encrypt the data disk. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Encrypt the data disk.</p>
         * </li>
         * <li><p><code>false</code>: Do not encrypt the data disk.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("encrypted")
        public String encrypted;

        /**
         * <p>Data disk performance level. Applies only to <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performance_level")
        public String performanceLevel;

        /**
         * <p>Data disk size in GiB. Valid range: 40–32767.</p>
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
