// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>[<strong>This field is deprecated</strong>] Registered cluster API Server SLB access control list.</p>
     */
    @NameInMap("access_control_list")
    @Deprecated
    public java.util.List<String> accessControlList;

    /**
     * <p>List of cluster components. Specify the components to install when creating a cluster through <code>addons</code>.</p>
     * <p><strong>Network component</strong>: Required. Choose between Flannel and Terway network types when creating a cluster:</p>
     * <ul>
     * <li>Flannel network: [{&quot;name&quot;:&quot;flannel&quot;,&quot;config&quot;:&quot;&quot;}].</li>
     * <li>Terway network: [{&quot;name&quot;: &quot;terway-eniip&quot;,&quot;config&quot;: &quot;&quot;}] .</li>
     * </ul>
     * <p><strong>Storage component</strong>: Optional. Only the <code>csi</code> type is supported:</p>
     * <p><code>csi</code>: [{&quot;name&quot;:&quot;csi-plugin&quot;,&quot;config&quot;: &quot;&quot;},{&quot;name&quot;: &quot;csi-provisioner&quot;,&quot;config&quot;: &quot;&quot;}].</p>
     * <p><strong>Log component</strong>: Optional. Recommended to enable. If Log Service is not enabled, the cluster audit feature will be unavailable.</p>
     * <ul>
     * <li>Use an existing <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;,\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}] .</li>
     * <li>Create a new <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;}&quot;}] .</li>
     * </ul>
     * <p><strong>Ingress component</strong>: Optional. ACK dedicated clusters install the Ingress component <code>nginx-ingress-controller</code> by default.</p>
     * <ul>
     * <li>Install Ingress with public network access: [{&quot;name&quot;:&quot;nginx-ingress-controller&quot;,&quot;config&quot;:&quot;{\&quot;IngressSlbNetworkType\&quot;:\&quot;internet\&quot;}&quot;}] .</li>
     * <li>Disable default Ingress installation: [{&quot;name&quot;: &quot;nginx-ingress-controller&quot;,&quot;config&quot;: &quot;&quot;,&quot;disabled&quot;: true}] .</li>
     * </ul>
     * <p><strong>Event center</strong>: Optional. Enabled by default.</p>
     * <p>The event center provides capabilities for storing, querying, and alerting on Kubernetes events. The Logstore associated with the Kubernetes event center is free for 90 days. For more information about the free policy, see <a href="https://help.aliyun.com/document_detail/150476.html">Create and use the Kubernetes event center</a>.</p>
     * <p>Example of enabling the event center: [{&quot;name&quot;:&quot;ack-node-problem-detector&quot;,&quot;config&quot;:&quot;{\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}].</p>
     */
    @NameInMap("addons")
    public java.util.List<Addon> addons;

    /**
     * <p>ServiceAccount is the access credential for communication between Pods and the cluster API Server. <code>api-audiences</code> defines the valid request <code>token</code> identities used by the <code>apiserver</code> to verify whether the request <code>token</code> is legitimate. Multiple <code>audience</code> values can be configured, separated by commas (,).</p>
     * <p>For more details about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Deploy service account token volume projection</a>.</p>
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
     * <p><a href="https://help.aliyun.com/document_detail/2938898.html">Intelligent managed mode</a> configuration.</p>
     */
    @NameInMap("auto_mode")
    public CreateClusterRequestAutoMode autoMode;

    /**
     * <p>[<strong>This field is deprecated</strong>]</p>
     * <p>Whether to enable auto-renewal. Only takes effect when <code>charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enable auto-renewal.</li>
     * <li><code>false</code>: Disable auto-renewal.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>This field was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on CreateCluster API parameter behavior changes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_renew")
    @Deprecated
    public Boolean autoRenew;

    /**
     * <p>[<strong>This field is deprecated</strong>]</p>
     * <p>Auto-renewal period. Only takes effect when subscription and auto-renewal are selected. When <code>PeriodUnit=Month</code>, valid values: {1, 2, 3, 6, 12}.</p>
     * <p>Default value: 1.</p>
     * <p>This field was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on CreateCluster API parameter behavior changes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("auto_renew_period")
    @Deprecated
    public Long autoRenewPeriod;

    /**
     * <p>[<strong>This field is deprecated</strong>]</p>
     * <p>Billing type of the CLB instance used by the API Server. Default value: PostPaid. Valid values:</p>
     * <ul>
     * <li>PostPaid: Pay-as-you-go.</li>
     * <li>PrePaid: Subscription. This billing type is no longer supported for newly created CLB instances. Existing instances are not affected.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>This field was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on CreateCluster API parameter behavior changes</a>.</li>
     * <li>Starting from December 1, 2024, newly created CLB instances no longer support the subscription billing type, and instance fees will be charged.</notice>
     * <props="china">For details, see [Product announcement on canceling subscription billing for cluster API Server CLB](https://help.aliyun.com/document_detail/2851191.html) and [CLB billing adjustment announcement](https://help.aliyun.com/document_detail/2839797.html).
     * <props="intl">For details, see [CLB billing adjustment announcement](https://help.aliyun.com/document_detail/2839797.html).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("charge_type")
    @Deprecated
    public String chargeType;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cis_enabled")
    @Deprecated
    public Boolean cisEnabled;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane node configuration, use the <code>cloud_monitor_flags</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>cms_enabled</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * <p>Whether to install the CloudMonitor agent in the cluster. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Install the CloudMonitor agent.</li>
     * <li><code>false</code>: Do not install the CloudMonitor agent.</li>
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
     * <p>Naming rules: The domain name consists of one or more parts separated by periods (.). Each part can be up to 63 characters long and can contain lowercase letters, digits, and hyphens (-). Each part must start and end with a lowercase letter or digit.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster.local</p>
     */
    @NameInMap("cluster_domain")
    public String clusterDomain;

    /**
     * <p>After selecting <code>cluster_type</code> as <code>ManagedKubernetes</code> and configuring <code>profile</code>, you can further specify the cluster specification. Valid values:</p>
     * <ul>
     * <li><code>ack.standard</code>: Basic edition (selected by default when the value is empty)</li>
     * <li><code>ack.pro.small</code>: Pro edition</li>
     * <li><code>ack.pro.xlarge</code>: Pro XL</li>
     * <li><code>ack.pro.2xlarge</code>: Pro 2XL</li>
     * <li><code>ack.pro.4xlarge</code>: Pro 4XL (requires contacting customer service to enable allowlisting)</li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>. They pre-allocate and fix control plane resources to ensure that API concurrency and Pod scheduling capabilities always remain at a determined high level, suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For the cluster management fees of Pro edition and provisioned control plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster types, including ACK managed cluster (Pro and Basic editions), ACK Serverless cluster (Pro and Basic editions), ACK Edge cluster (Pro and Basic editions), and ACK Lingjun cluster (Pro edition).</li>
     * <li><code>ExternalKubernetes</code>: Registered cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>Pod network CIDR block. Must be a valid private CIDR block, specifically the following CIDR blocks and their subnets: 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16. Cannot overlap with the VPC or CIDR blocks used by existing Kubernetes clusters in the VPC. Cannot be modified after creation.</p>
     * <p>For cluster network planning, see <a href="https://help.aliyun.com/document_detail/86500.html">ACK managed cluster network planning</a>.</p>
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
     * <p>ACK dedicated cluster control plane configuration.</p>
     */
    @NameInMap("control_plane_config")
    public CreateClusterRequestControlPlaneConfig controlPlaneConfig;

    /**
     * <p>Cluster connection configuration.</p>
     */
    @NameInMap("control_plane_endpoints_config")
    public CreateClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>List of component names, specifying which control plane components\&quot; logs to collect.</p>
     * <p>By default, logs are collected from kube-apiserver, kube-controller-manager, kube-scheduler, and cloud-controller-manager.</p>
     */
    @NameInMap("controlplane_log_components")
    public java.util.List<String> controlplaneLogComponents;

    /**
     * <p>Log Service project for control plane component logs. You can use an existing project for log storage or let the system automatically create a project. If you choose to auto-create a Log Service project, a project named <code>k8s-log-{ClusterID}</code> will be automatically created.</p>
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
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>cpu_policy</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>cpu_policy</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * <p>Node CPU management policy. The following two policies are supported when the cluster version is 1.12.6 or later:</p>
     * <ul>
     * <li><code>static</code>: Allows enhancing CPU affinity and exclusivity for Pods with certain resource characteristics on the node.</li>
     * <li><code>none</code>: Enables the existing default CPU affinity scheme.</li>
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
     * <p>[<strong>This field is deprecated</strong>] Use the <code>extra_sans</code> parameter instead.</p>
     * <p>Custom certificate SAN. Multiple IPs or domain names are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cs.aliyun.com</p>
     */
    @NameInMap("custom_san")
    @Deprecated
    public String customSan;

    /**
     * <p>Cluster deletion protection, which prevents accidental cluster deletion through the console or API. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enable cluster deletion protection. The cluster cannot be deleted through the console or API.</li>
     * <li><code>false</code>: Disable cluster deletion protection. The cluster can be deleted through the console or API.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>[<strong>This field is deprecated</strong>] By default, no rollback is performed when cluster creation fails. You need to clean up the failed cluster yourself.</p>
     * <p>Whether to roll back when cluster creation fails. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Roll back when cluster creation fails.</li>
     * <li><code>false</code>: Do not roll back when cluster creation fails.</li>
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
     * <p>[<strong>This field is deprecated</strong>] Use the <code>rrsa_config</code> parameter instead.</p>
     * <p>Whether to enable the RRSA feature.</p>
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
     * <p>KMS key ID. This key is used to encrypt data disks. For more details, see <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service</a>.</p>
     * <blockquote>
     * <p>This feature only takes effect in professional managed clusters (ACK Pro clusters).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0fe64791-55eb-4fc7-84c5-c6c7cdca****</p>
     */
    @NameInMap("encryption_provider_key")
    public String encryptionProviderKey;

    /**
     * <p>Whether to enable public access. Expose the API Server through an EIP to enable public access to the cluster.</p>
     * <ul>
     * <li><code>true</code>: Enable public access.</li>
     * <li><code>false</code>: Disable public access. When disabled, the cluster API Server cannot be accessed from the Internet.</li>
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
     * <p>[<strong>This field is deprecated</strong>] Selecting existing nodes when creating a cluster is no longer supported. To add existing nodes to a cluster, create a node pool first and call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> API.</p>
     * <p>Whether to mount data disks on instances when creating a cluster with existing instances. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Store containers and images on the data disk. Existing data on the data disk will be lost. Please back up your data.</p>
     * </li>
     * <li><p><code>false</code>: Do not store containers and images on the data disk.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>Data disk mounting rules:</p>
     * <ul>
     * <li>If the ECS instance already has data disks mounted and the file system of the last data disk is not initialized, the system will automatically format the data disk as ext4 to store /var/lib/docker and /var/lib/kubelet.</li>
     * <li>If the ECS instance has no data disks mounted, no new data disk will be mounted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    @Deprecated
    public Boolean formatDisk;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>image_id</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>image_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Custom node image. The system image is used by default. When a custom image is selected, it replaces the default system image. See <a href="https://help.aliyun.com/document_detail/146647.html">Custom images</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp16z7xko3vvv8gt****</p>
     */
    @NameInMap("image_id")
    @Deprecated
    public String imageId;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>image_type</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>OS distribution type. It is recommended to use this field to specify the node OS. Valid values:</p>
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
     * <p>Default value: <code>CentOS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunLinux</p>
     */
    @NameInMap("image_type")
    @Deprecated
    public String imageType;

    /**
     * <p>[<strong>This field is deprecated</strong>] Selecting existing nodes when creating a cluster is no longer supported. To add existing nodes to a cluster, create a node pool first and call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> API.</p>
     * <p>When creating a cluster with existing nodes, you need to specify a list of ECS instances. These instances will join the cluster as Worker nodes.</p>
     * <blockquote>
     * <p>This field is required when creating a cluster with existing instances.</p>
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
     * <p>Automatically create an enterprise security group. Takes effect when <code>security_group_id</code> is empty.</p>
     * <blockquote>
     * <p>When using a basic security group, the total number of nodes and Terway Pods in the cluster cannot exceed 2000. Therefore, when creating a Terway network type cluster, it is recommended to use an enterprise security group.</p>
     * </blockquote>
     * <ul>
     * <li><code>true</code>: Create and use an enterprise security group.</li>
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
     * <p>[<strong>This field is deprecated</strong>] Selecting existing nodes when creating a cluster is no longer supported. To add existing nodes to a cluster, create a node pool first and call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> API.</p>
     * <p>Whether to retain instance names when creating a cluster with existing instances.</p>
     * <ul>
     * <li><code>true</code>: Retain.</li>
     * <li><code>false</code>: Do not retain. Names will be replaced using system rules.</li>
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
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>key_pair</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>key_pair</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Key pair name. Mutually exclusive with <code>login_password</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>security-key</p>
     */
    @NameInMap("key_pair")
    @Deprecated
    public String keyPair;

    /**
     * <p>Cluster version, consistent with the Kubernetes community baseline version. We recommend selecting the latest version. If not specified, the latest version is used by default.</p>
     * <p>You can create clusters of the three most recent versions. You can query supported cluster versions through the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> API.</p>
     * <p>For Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Kubernetes version release overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>Specify the CLB instance ID for API Server access. When this parameter is specified, an API Server CLB will not be automatically created.</p>
     * <blockquote>
     * <p>Ensure that the CLB instance has no other dependencies (such as listeners or backend servers). Shared and public-network CLB instances are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-wz9t256gqa3vbouk****</p>
     */
    @NameInMap("load_balancer_id")
    public String loadBalancerId;

    /**
     * <p>[<strong>This parameter is deprecated</strong>] CLB is billed by usage. This parameter does not take effect.</p>
     * <p>Load balancer specification. Valid values:</p>
     * <ul>
     * <li>slb.s1.small</li>
     * <li>slb.s2.small</li>
     * <li>slb.s2.medium</li>
     * <li>slb.s3.small</li>
     * <li>slb.s3.medium</li>
     * <li>slb.s3.large</li>
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
     * <p>[<strong>This field is deprecated</strong>] Enable Log Service for the cluster. Only takes effect for ACK Serverless clusters, and the value must be <code>SLS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("logging_type")
    @Deprecated
    public String loggingType;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>login_password</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>login_password</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>SSH login password. Mutually exclusive with <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following: uppercase letters, lowercase letters, digits, and special characters.</p>
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
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>auto_renew</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Whether to enable auto-renewal for Master nodes. Only takes effect when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enable auto-renewal.</li>
     * <li><code>false</code>: Disable auto-renewal.</li>
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
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>auto_renew_period</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Master node auto-renewal period. Only takes effect when subscription billing type is selected, and is a required value.</p>
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
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>size</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Number of Master nodes. Valid values: <code>3</code> or <code>5</code>.</p>
     * <p>Default value: <code>3</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("master_count")
    @Deprecated
    public Long masterCount;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>instance_charge_type</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Master node billing type. Valid values:</p>
     * <ul>
     * <li><code>PrePaid</code>: Subscription.</li>
     * <li><code>PostPaid</code>: Pay-as-you-go.</li>
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
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>instance_types</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Master node instance types. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
     */
    @NameInMap("master_instance_types")
    @Deprecated
    public java.util.List<String> masterInstanceTypes;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>unit</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Master node subscription duration. Valid and required when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
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
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>period_unit</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Master node billing period. Must be specified when the billing type is <code>PrePaid</code>.</p>
     * <p>Valid value: <code>Month</code>. Currently, only month-based periods are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("master_period_unit")
    @Deprecated
    public String masterPeriodUnit;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>system_disk_category</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Master node system disk type. Valid values:</p>
     * <ul>
     * <li><code>cloud_efficiency</code>: Ultra disk.</li>
     * <li><code>cloud_ssd</code>: SSD disk.</li>
     * <li><code>cloud_essd</code>: ESSD disk.</li>
     * </ul>
     * <p>Default value: <code>cloud_ssd</code>. The default value may vary across availability zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("master_system_disk_category")
    @Deprecated
    public String masterSystemDiskCategory;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>system_disk_performance_level</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Cluster Master node system disk performance level. Only takes effect for ESSD disks. The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD disk</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("master_system_disk_performance_level")
    @Deprecated
    public String masterSystemDiskPerformanceLevel;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>system_disk_size</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Master node system disk size. Valid values: [40, 500\]. Unit: GiB.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("master_system_disk_size")
    @Deprecated
    public Long masterSystemDiskSize;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>system_disk_snapshot_policy_id</code> parameter under <code>control_plane_config</code> instead.</p>
     * <p>Automatic snapshot policy ID for the Master node system disk.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("master_system_disk_snapshot_policy_id")
    @Deprecated
    public String masterSystemDiskSnapshotPolicyId;

    /**
     * <p>[<strong>This field is deprecated</strong>] Use the <code>vswitch_ids</code> parameter instead.</p>
     * <p>List of Master node vSwitch IDs. The number of vSwitches ranges from [1, 3\]. To ensure high availability of the cluster, it is recommended to select 3 vSwitches distributed in different availability zones.</p>
     * <p>The number of specified instance types must be consistent with <code>master_count</code> and correspond one-to-one with the elements in <code>master_vswitch_ids</code>.</p>
     */
    @NameInMap("master_vswitch_ids")
    @Deprecated
    public java.util.List<String> masterVswitchIds;

    /**
     * <p>Custom cluster name. Consists of digits, Chinese characters, English characters, or hyphens (-), with a length of 1 to 63 characters, and cannot start with a hyphen (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>[<strong>This field is deprecated</strong>] Use the <code>snat_entry</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nat_gateway")
    @Deprecated
    public Boolean natGateway;

    /**
     * <p>Number of node IPs, determined by specifying the network CIDR. Only takes effect for Flannel network type clusters.</p>
     * <p>Default value: <code>26</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>node_name_mode</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("node_name_mode")
    @Deprecated
    public String nodeNameMode;

    /**
     * <p>Node service ports. Valid port range: [30000, 65535\].</p>
     * <p>Default value: <code>30000-32767</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>30000~32767</p>
     */
    @NameInMap("node_port_range")
    @Deprecated
    public String nodePortRange;

    /**
     * <p>Node pool list.</p>
     */
    @NameInMap("nodepools")
    public java.util.List<Nodepool> nodepools;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>desired_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Number of Worker nodes. Range: [0, 100\].</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("num_of_nodes")
    @Deprecated
    public Long numOfNodes;

    /**
     * <p>Cluster automatic O&amp;M policy.</p>
     */
    @NameInMap("operation_policy")
    public CreateClusterRequestOperationPolicy operationPolicy;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane node configuration, use the <code>image_type</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>OS platform type. Valid values:</p>
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
     * <p>[<strong>This field is deprecated</strong>]</p>
     * <p>Purchase duration. Subscription duration. Valid and required when charge_type is set to PrePaid.</p>
     * <p>Valid values: {1, 2, 3, 6, 12, 24, 36, 48, 60}.</p>
     * <p>Default value: 1.</p>
     * <p>This field was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on CreateCluster API parameter behavior changes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Deprecated
    public Long period;

    /**
     * <p>[<strong>This field is deprecated</strong>]</p>
     * <p>Billing period. Must be specified when the billing type is PrePaid.</p>
     * <p>Valid value: Month. Currently, only month-based periods are supported.</p>
     * <p>This field was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on CreateCluster API parameter behavior changes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("period_unit")
    @Deprecated
    public String periodUnit;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>platform</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>OS distribution. Valid values:</p>
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
     * <p>[<strong>This field is deprecated</strong>] When using the Terway network plugin, you need to specify vSwitches for Pod IP allocation. Each Pod vSwitch corresponds to a Worker node vSwitch, and the availability zones of Pod vSwitches and Worker node vSwitches must be consistent.</p>
     * <blockquote>
     * <p>The CIDR mask of Pod vSwitches should not exceed 19 and must not exceed 25; otherwise, the available Pod IP addresses in the cluster network will be very limited, affecting normal cluster usage.</p>
     * </blockquote>
     */
    @NameInMap("pod_vswitch_ids")
    @Deprecated
    public java.util.List<String> podVswitchIds;

    /**
     * <p>When <code>cluster_type</code> is set to <code>ManagedKubernetes</code>, you can further specify the cluster subtype.</p>
     * <ul>
     * <li><code>Default</code>: ACK managed cluster, including ACK cluster (Pro and Basic editions).</li>
     * <li><code>Edge</code>: ACK Edge cluster, including ACK Edge cluster (Pro and Basic editions).</li>
     * <li><code>Serverless</code>: ACK Serverless cluster, including ACK Serverless cluster (Pro and Basic editions).</li>
     * <li><code>Lingjun</code>: ACK Lingjun cluster, available in Pro edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>kube-proxy mode</p>
     * <ul>
     * <li><code>iptables</code>: A mature and stable kube-proxy mode. Kubernetes Service discovery and load balancing are configured using iptables rules. Performance is average and significantly affected by scale, suitable for clusters with a small number of Services.</li>
     * <li><code>ipvs</code>: A high-performance kube-proxy mode. Kubernetes Service discovery and load balancing are configured using the Linux IPVS module, suitable for clusters with a large number of Services that require high-performance load balancing.</li>
     * <li><code>nftables</code>: Next-generation kube-proxy mode based on Linux nftables for Service discovery and load balancing. It is a modern replacement for iptables. Compared to iptables, nftables performs better in network performance, rule update efficiency, and large-scale Service scenarios.<br>Only supported for clusters of version 1.35 and above. The Kubernetes community deprecated IPVS starting from version 1.35. It is recommended to use nftables for new clusters for longer-term community support.</li>
     * </ul>
     * <p>Default value: <code>ipvs</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>rds_instances</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>List of RDS instances. Select the RDS instances you want to add to the whitelist. It is recommended to add the container Pod CIDR block and Node CIDR block in RDS. Setting RDS instances may fail to pop up due to non-running instance status.</p>
     */
    @NameInMap("rds_instances")
    @Deprecated
    public java.util.List<String> rdsInstances;

    /**
     * <p>The region ID where the cluster is located. For details, see <a href="https://help.aliyun.com/document_detail/216938.html">Regions supported by Container Service</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The resource group ID to which the cluster belongs, used for isolating different resources.</p>
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
     * <p>Container runtime in the cluster. Supports containerd, sandboxed containers, and Docker.</p>
     * <blockquote>
     * <p>Kubernetes 1.24 no longer supports Docker as a built-in container runtime.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/160313.html">Comparison of Docker, containerd, and sandboxed container runtimes</a>.</p>
     */
    @NameInMap("runtime")
    @Deprecated
    public Runtime runtime;

    /**
     * <p>Specify the security group ID when creating a cluster with an existing security group. Mutually exclusive with <code>is_enterprise_security_group</code>. Cluster nodes are automatically added to this security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1bdue0qc1g7k****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane configuration, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Alibaba Cloud OS security hardening. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enable Alibaba Cloud OS security hardening.</li>
     * <li><code>false</code>: Disable Alibaba Cloud OS security hardening.</li>
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
     * <p>ServiceAccount is the access credential for communication between Pods and the cluster API Server. <code>service-account-issuer</code> is the issuer identity in the <code>serviceaccount token</code>, i.e., the <code>iss</code> field in the <code>token payload</code>.</p>
     * <p>For more details about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Deploy service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("service_account_issuer")
    public String serviceAccountIssuer;

    /**
     * <p>Service network CIDR block. Valid ranges: 10.0.0.0/16-24, 172.16-31.0.0/16-24, 192.168.0.0/16-24. Cannot overlap with VPC CIDR block 10.1.0.0/21 or CIDR blocks used by existing Kubernetes clusters in the VPC. Cannot be modified after creation.</p>
     * <p>Default value: 172.19.0.0/20.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.0.0/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p>[<strong>This field is deprecated</strong>] Service discovery type within the cluster, used to specify the service discovery method in <code>ACK Serverless</code> clusters.</p>
     * <ul>
     * <li><code>CoreDNS</code>: Uses the Kubernetes native standard service discovery component CoreDNS. A set of containers needs to be deployed in the cluster for DNS resolution. By default, two ECI instances with 0.25 Core 512 MiB specifications are used.</li>
     * <li><code>PrivateZone</code>: Uses the Alibaba Cloud PrivateZone product for service discovery capabilities. The PrivateZone service needs to be enabled.</li>
     * </ul>
     * <p>Default value: Not enabled.</p>
     */
    @NameInMap("service_discovery_types")
    @Deprecated
    public java.util.List<String> serviceDiscoveryTypes;

    /**
     * <p>Configure SNAT for the VPC. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Automatically create a NAT gateway and configure SNAT rules. Set to <code>true</code> if nodes and applications in the cluster need to access the Internet.</li>
     * <li><code>false</code>: Do not create a NAT gateway or SNAT rules. Nodes and applications in the cluster will not be able to access the Internet.</li>
     * </ul>
     * <blockquote>
     * <p>If not enabled during cluster creation and the business later requires Internet access, you can <a href="https://help.aliyun.com/document_detail/178480.html">manually enable it</a>.</p>
     * </blockquote>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    /**
     * <p>[<strong>This field is deprecated</strong>] For cluster control plane node configuration, use the <code>soc_enabled</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>soc_enabled</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Classified protection hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">ACK classified protection hardening user guide</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enable classified protection hardening.</li>
     * <li><code>false</code>: Disable classified protection hardening.</li>
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
     * <p>Whether to enable public SSH login. Used for logging in to Master nodes of ACK dedicated clusters. This parameter does not take effect in managed clusters.</p>
     * <ul>
     * <li><code>true</code>: Enable.</li>
     * <li><code>false</code>: Disable.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    /**
     * <p>Node tags. Tag definition rules:</p>
     * <ul>
     * <li>Tags consist of case-sensitive key-value pairs. You can set up to 20 tags.</li>
     * <li>Tag keys cannot be duplicated, with a maximum length of 64 characters; tag values can be empty, with a maximum length of 128 characters. Neither tag keys nor tag values can start with “aliyun”, “acs:”, “https://”, or “http://”. For details, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
     * </ul>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>taints</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * <p>Node taint information. Taints and tolerations work together to prevent Pods from being scheduled on inappropriate nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
     */
    @NameInMap("taints")
    @Deprecated
    public java.util.List<Taint> taints;

    /**
     * <p>[<strong>This field is deprecated</strong>] By default, no rollback is performed when cluster creation fails. You need to clean up the failed cluster yourself.</p>
     * <p>Cluster creation timeout. Unit: minutes.</p>
     * <p>Default value: <code>60</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout_mins")
    @Deprecated
    public Long timeoutMins;

    /**
     * <p>The timezone used by the cluster. See <a href="https://help.aliyun.com/document_detail/354879.html">Supported timezones</a>.</p>
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
     * <p>[<strong>This field is deprecated</strong>] Custom node data.</p>
     * 
     * <strong>example:</strong>
     * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFD****</p>
     */
    @NameInMap("user_data")
    @Deprecated
    public String userData;

    /**
     * <p>The VPC used by the cluster. Must be provided when creating a cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zeik9h3ahvv2zz95****</p>
     */
    @NameInMap("vpcid")
    public String vpcid;

    /**
     * <p>vSwitches for cluster nodes. This field is required when creating a zero-node managed cluster.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>auto_renew</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Whether to enable auto-renewal for Worker nodes. Only takes effect when <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enable auto-renewal.</li>
     * <li><code>false</code>: Disable auto-renewal.</li>
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
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>auto_renew_period</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Worker node auto-renewal period. Only takes effect when subscription billing type is selected, and is a required value.</p>
     * <p>Valid values: {1, 2, 3, 6, 12}.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_auto_renew_period")
    @Deprecated
    public Long workerAutoRenewPeriod;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>data_disks</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Combination of Worker node data disk type, size, and other configurations.</p>
     */
    @NameInMap("worker_data_disks")
    @Deprecated
    public java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>instance_charge_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Worker node billing type. Valid values:</p>
     * <ul>
     * <li><code>PrePaid</code>: Subscription.</li>
     * <li><code>PostPaid</code>: Pay-as-you-go.</li>
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
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>instance_types</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Worker node instance configuration.</p>
     */
    @NameInMap("worker_instance_types")
    @Deprecated
    public java.util.List<String> workerInstanceTypes;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>period</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Worker node subscription duration. Valid and required when <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
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
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>period_unit</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Worker node billing period. Must be specified when the billing type is <code>PrePaid</code>.</p>
     * <p>Valid value: <code>Month</code>. Currently, only month-based periods are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("worker_period_unit")
    @Deprecated
    public String workerPeriodUnit;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>system_disk_category</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Worker node system disk type. For more information, see <a href="https://help.aliyun.com/document_detail/63136.html">Block storage overview</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>cloud_efficiency</code>: Ultra disk.</li>
     * <li><code>cloud_ssd</code>: SSD disk.</li>
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
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>system_disk_performance_level</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>When the system disk is an ESSD disk, you can set the Performance Level (PL) of the ESSD disk. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD disk</a>.</p>
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
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>system_disk_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Worker node system disk size. Unit: GiB.</p>
     * <p>Valid values: [40, 500\].</p>
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
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>system_disk_snapshot_policy_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>Automatic snapshot policy ID for the Worker node system disk.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    public String workerSystemDiskSnapshotPolicyId;

    /**
     * <p>[<strong>This field is deprecated</strong>] For node pool configuration, use the <code>vswitch_ids</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>List of vSwitches used by cluster nodes. One node corresponds to one value.</p>
     * <p>When creating a zero-node managed cluster, the <code>worker_vswitch_ids</code> field is not required, but <code>vswitch_ids</code> must be provided.</p>
     */
    @NameInMap("worker_vswitch_ids")
    @Deprecated
    public java.util.List<String> workerVswitchIds;

    /**
     * <p>[<strong>This field is deprecated</strong>] Use the <code>zone_ids</code> parameter instead.</p>
     * <p>Availability zone ID of the region where the cluster is located. This parameter is specific to ACK managed cluster types.</p>
     * <p>When creating an ACK managed cluster, if <code>vpc_id</code> and <code>vswitch_ids</code> are not specified, <code>zone_id</code> must be specified for the cluster to automatically create VPC network resources in this availability zone. This parameter is ignored when <code>vpc_id</code> and <code>vswitch_ids</code> are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beiji****</p>
     */
    @NameInMap("zone_id")
    @Deprecated
    public String zoneId;

    /**
     * <p>Multiple availability zone IDs of the region where the cluster is located. This parameter is specific to ACK managed cluster types.</p>
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
         * <p>Whether to enable the cluster audit log feature.</p>
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
         * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">SLS Project</a> where the cluster audit log <a href="https://help.aliyun.com/document_detail/48873.html">Logstore</a> is located.</p>
         * <ul>
         * <li><p>Default value: <code>k8s-log-{clusterid}</code>.</p>
         * </li>
         * <li><p>After enabling the cluster audit log feature, a corresponding Logstore will be created under the specified SLS Project.</p>
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
         * <p>Whether to enable intelligent managed mode.</p>
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
         * <p>Whether to enable auto-renewal for control plane nodes. Valid when the billing type is <code>PrePaid</code>.</p>
         * <ul>
         * <li>true: Enable auto-renewal.</li>
         * <li>false: Disable auto-renewal.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>Auto-renewal duration for control plane nodes.</p>
         * <p>Valid values: {1, 2, 3, 6, 12}. Unit: months.</p>
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
         * <p>Whether to install CloudMonitor on nodes.</p>
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
         * <li><p>static: Allows enhancing CPU affinity and exclusivity for Pods with certain resource characteristics on the node.</p>
         * </li>
         * <li><p>none: Enables the existing default CPU affinity scheme.</p>
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
         * <p>OS image type.</p>
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
         * <p>Key pair name. Mutually exclusive with login_password.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>SSH login password. The password must be 8 to 30 characters in length and contain at least three of the following: uppercase letters, lowercase letters, digits, and special characters. Mutually exclusive with key_pair.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>[<strong>This field is deprecated</strong>] Node service port range.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>Subscription duration for control plane nodes. Valid and required when the billing type is <code>PrePaid</code>.</p>
         * <p>Valid values: {1, 2, 3, 6, 12, 24, 36, 48, 60}. Unit: months.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>Subscription period unit for control plane nodes. Valid and required when the billing type is <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>. Currently, only month-based periods are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>[<strong>This field is deprecated</strong>] Control plane node runtime name. Valid value:</p>
         * <p>containerd: Containerd runtime, supported by all cluster versions.</p>
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
         * <p>Whether to enable classified protection security hardening.</p>
         * <ul>
         * <li><p>true: Enable classified protection hardening.</p>
         * </li>
         * <li><p>false: Disable classified protection hardening.</p>
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
         * <p>Whether to enable burst (performance burst) for the node system disk.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Disable.</p>
         * </li>
         * </ul>
         * <p>This parameter is only supported when <code>system_disk_category</code> is set to <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>Node system disk type.</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: Ultra disk.</li>
         * <li><code>cloud_ssd</code>: SSD disk.</li>
         * <li><code>cloud_essd</code>: ESSD disk.</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL disk.</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry disk.</li>
         * </ul>
         * <p>Default value: <code>cloud_ssd</code>. The default value may vary across availability zones.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>Node system disk performance level. Only takes effect for ESSD disks.</p>
         * <p>The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD disk</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>Pre-provisioned read/write IOPS for the node system disk.</p>
         * <p>Valid values: 0 to min{50,000, 1000<em>capacity - baseline performance}. Baseline performance = min{1,800 + 50</em>capacity, 50000}.</p>
         * <p>This parameter is only supported when <code>system_disk_category</code> is set to <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>Node system disk size.</p>
         * <p>Valid values: [40, 500\]. Unit: GiB.</p>
         * <p>Default value: <code>120</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>Node automatic snapshot backup policy.</p>
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
         * <p>VPCs where the internal DNS record resolution takes effect.</p>
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
         * <p>Internal DNS configuration for the cluster, applicable to ACK managed clusters. The internal DNS is used by node-side system components such as kubelet and kube-proxy to access the API Server. When internal DNS access is not enabled, node-side system components will access via CLB IP.</p>
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
         * <li>patch: Automatically upgrade to an available patch version of the current minor version. The new Kubernetes version will not contain breaking changes.</li>
         * <li>stable: Automatically upgrade to the latest patch version of the second-newest minor version. The new Kubernetes version may involve API and feature changes, but its stability has been widely verified.</li>
         * <li>rapid: Automatically upgrade to the latest patch version of the latest minor version to get new features from the Kubernetes community faster.</li>
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
         * <p>Whether to enable the RRSA feature.</p>
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
         * <li><code>true</code>: Encrypt the data disk.</li>
         * <li><code>false</code>: Do not encrypt the data disk.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("encrypted")
        public String encrypted;

        /**
         * <p>Node data disk performance level. Only takes effect for <a href="https://help.aliyun.com/document_detail/122389.html">ESSD disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performance_level")
        public String performanceLevel;

        /**
         * <p>Data disk size. Valid values: 40 to 32767. Unit: GiB.</p>
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
