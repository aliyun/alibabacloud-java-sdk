// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> The access control list for the API Server SLB of the registered cluster.</p>
     */
    @NameInMap("access_control_list")
    @Deprecated
    public java.util.List<String> accessControlList;

    /**
     * <p>The list of cluster components. When you create a cluster, specify the components to install by using <code>addons</code>.</p>
     * <p><strong>Network component</strong>: Required. Two network types are available: Flannel and Terway. Select one when you create a cluster:</p>
     * <ul>
     * <li>Flannel network: [{&quot;name&quot;:&quot;flannel&quot;,&quot;config&quot;:&quot;&quot;}\].</li>
     * <li>Terway network: [{&quot;name&quot;: &quot;terway-eniip&quot;,&quot;config&quot;: &quot;&quot;}\].</li>
     * </ul>
     * <p><strong>Storage component</strong>: Optional. Only the <code>csi</code> type is supported:</p>
     * <p><code>csi</code>: [{&quot;name&quot;:&quot;csi-plugin&quot;,&quot;config&quot;: &quot;&quot;},{&quot;name&quot;: &quot;csi-provisioner&quot;,&quot;config&quot;: &quot;&quot;}\].</p>
     * <p><strong>Log component</strong>: Optional. We recommend that you enable this component. If you do not enable the log service, the cluster audit feature is unavailable.</p>
     * <ul>
     * <li>Use an existing <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;,\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}\].</li>
     * <li>Create a new <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;}&quot;}\].</li>
     * </ul>
     * <p><strong>Ingress component</strong>: Optional. ACK dedicated clusters install the Ingress component <code>nginx-ingress-controller</code> by default.</p>
     * <ul>
     * <li>Install Ingress and enable Internet access: [{&quot;name&quot;:&quot;nginx-ingress-controller&quot;,&quot;config&quot;:&quot;{\&quot;IngressSlbNetworkType\&quot;:\&quot;internet\&quot;}&quot;}\].</li>
     * <li>Do not install Ingress by default: [{&quot;name&quot;: &quot;nginx-ingress-controller&quot;,&quot;config&quot;: &quot;&quot;,&quot;disabled&quot;: true}\].</li>
     * </ul>
     * <p><strong>Event center</strong>: Optional. Enabled by default.</p>
     * <p>The event center provides capabilities such as storage, query, and alerting for Kubernetes events. The Logstore associated with the Kubernetes event center is free of charge for 90 days. For more information about the free policy, see <a href="https://help.aliyun.com/document_detail/150476.html">Create and use a Kubernetes event center</a>.</p>
     * <p>Example of enabling the event center: [{&quot;name&quot;:&quot;ack-node-problem-detector&quot;,&quot;config&quot;:&quot;{\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}\].</p>
     */
    @NameInMap("addons")
    public java.util.List<Addon> addons;

    /**
     * <p>A ServiceAccount is the access credential for communication between a pod and the cluster API server. The <code>api-audiences</code> parameter specifies the valid request <code>token</code> identities used by the <code>apiserver</code> to authenticate whether a request <code>token</code> is valid. You can configure multiple <code>audience</code> values separated by commas (,).</p>
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
     * <p><strong>[Deprecated]</strong></p>
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when charge_type is set to PrePaid. Valid values:</p>
     * <ul>
     * <li>true: Auto-renewal is enabled.</li>
     * <li>false: Auto-renewal is not enabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Notice on behavior changes of the CreateCluster parameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_renew")
    @Deprecated
    public Boolean autoRenew;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>The auto-renewal period. This parameter takes effect only when the subscription billing method and auto-renewal are selected. When <code>PeriodUnit=Month</code>, valid values: {1, 2, 3, 6, 12}.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Notice on behavior changes of the CreateCluster parameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("auto_renew_period")
    @Deprecated
    public Long autoRenewPeriod;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>The billing method of the Classic Load Balancer (CLB) instance used by the API server. Default value: PostPaid. Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go.</li>
     * <li>PrePaid: subscription. This billing method is no longer supported for new CLB instances. Existing instances are not affected.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Notice on behavior changes of the CreateCluster parameter</a>.</li>
     * <li>Starting from December 1, 2024, the subscription billing method is no longer supported for newly created CLB instances, and an instance fee is charged.</notice>
     * <props="china">For more information, see [Notice on canceling subscription billing for API server CLB instances in new clusters](https://help.aliyun.com/document_detail/2851191.html) and [Notice on billing item changes for CLB](https://help.aliyun.com/document_detail/2839797.html).
     * <props="intl">For more information, see [Notice on billing item changes for CLB](https://help.aliyun.com/document_detail/2839797.html).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("charge_type")
    @Deprecated
    public String chargeType;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cis_enabled")
    @Deprecated
    public Boolean cisEnabled;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane node configuration, use the <code>cloud_monitor_flags</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>cms_enabled</code> parameter under <code>kubernetes_config</code> in the nodepool instead.</p>
     * <p>Specifies whether to install the CloudMonitor agent on the cluster. Valid values:</p>
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
     * <p>The cluster local domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster.local</p>
     */
    @NameInMap("cluster_domain")
    public String clusterDomain;

    /**
     * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure <code>profile</code>, you can further specify the cluster specification. Valid values:</p>
     * <ul>
     * <li><code>ack.standard</code>: Basic Edition (selected by default if the value is left empty)</li>
     * <li><code>ack.pro.small</code>: Pro Edition</li>
     * <li><code>ack.pro.xlarge</code>: Pro XL</li>
     * <li><code>ack.pro.2xlarge</code>: Pro 2XL</li>
     * <li><code>ack.pro.4xlarge</code>: Pro 4XL (contact customer service to be added to the whitelist)</li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>. These tiers pre-allocate and lock control plane resources to ensure that API concurrency and pod scheduling capabilities remain at a deterministic high level. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For information about cluster management fees for Pro Edition and Provisioned Control Plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The pod CIDR block. The value must be a valid private CIDR block, which includes the following CIDR blocks and their subnets: 10.0.0.0/8, 172.16-31.0.0/12-16, and 192.168.0.0/16. The pod CIDR block cannot overlap with the CIDR block of the VPC or the CIDR blocks used by existing Kubernetes clusters in the VPC. You cannot modify the pod CIDR block after the cluster is created.</p>
     * <p>For more information about cluster network planning, see <a href="https://help.aliyun.com/document_detail/86500.html">Network planning for ACK managed clusters</a>.</p>
     * <blockquote>
     * <p>This parameter is required for Flannel clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("container_cidr")
    public String containerCidr;

    /**
     * <p>The control plane configuration for ACK dedicated clusters.</p>
     */
    @NameInMap("control_plane_config")
    public CreateClusterRequestControlPlaneConfig controlPlaneConfig;

    /**
     * <p>The cluster connection configuration.</p>
     */
    @NameInMap("control_plane_endpoints_config")
    public CreateClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>The list of component names that specifies which control plane components to collect logs from.</p>
     */
    @NameInMap("controlplane_log_components")
    public java.util.List<String> controlplaneLogComponents;

    /**
     * <p>The Simple Log Service project for control plane component logs. You can use an existing project for log storage or allow the system to use automatic creation of a project. If you choose automatic creation, a Simple Log Service project named <code>k8s-log-{ClusterID}</code> is created.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-log-xxx</p>
     */
    @NameInMap("controlplane_log_project")
    public String controlplaneLogProject;

    /**
     * <p>The number of days for control plane component log retention.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("controlplane_log_ttl")
    public String controlplaneLogTtl;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>cpu_policy</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>cpu_policy</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("cpu_policy")
    @Deprecated
    public String cpuPolicy;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>extra_sans</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>cs.aliyun.com</p>
     */
    @NameInMap("custom_san")
    @Deprecated
    public String customSan;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster. Deletion protection prevents the cluster from being accidentally deleted in the console or by calling API operations. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enables deletion protection. The cluster cannot be deleted in the console or by calling API operations.</li>
     * <li><code>false</code>: Disables deletion protection. The cluster can be deleted in the console or by calling API operations.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p><strong>[Deprecated]</strong> When cluster creation fails, rollback is not performed by default. You must manually clean up the failed cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("disable_rollback")
    @Deprecated
    public Boolean disableRollback;

    /**
     * <p><strong>[Deprecated]</strong> Use the rrsa_config parameter instead.</p>
     * <p>Specifies whether to enable the China RRSA feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Enable RRSA.</li>
     * <li>false: Do not enable RRSA.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_rrsa")
    @Deprecated
    public Boolean enableRrsa;

    /**
     * <p>The KMS key ID. This key is used to encrypt data cloud disks. For more information, see <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service</a>.</p>
     * <blockquote>
     * <p>This feature takes effect only in ACK Pro clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0fe64791-55eb-4fc7-84c5-c6c7cdca****</p>
     */
    @NameInMap("encryption_provider_key")
    public String encryptionProviderKey;

    /**
     * <p>Specifies whether to public network access. The API Server is exposed through an EIP to public network access to the cluster.</p>
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
     * <p><strong>[Deprecated]</strong> Selecting existing nodes during cluster creation is not supported. To add existing nodes to a cluster, create a node pool first and call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    @Deprecated
    public Boolean formatDisk;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>image_id</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>image_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp16z7xko3vvv8gt****</p>
     */
    @NameInMap("image_id")
    @Deprecated
    public String imageId;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>image_type</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The operating system distribution type. We recommend that you use this field to specify the node operating system. Valid values:</p>
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
     * <p><strong>[Deprecated]</strong> Creating a cluster with existing nodes is not supported. To add existing nodes to a cluster, create a node pool first, and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
     * <p>The list of ECS instances to use as worker nodes when creating a cluster with existing nodes.</p>
     * <blockquote>
     * <p>This parameter is required when you create a cluster with existing instances.</p>
     * </blockquote>
     */
    @NameInMap("instances")
    @Deprecated
    public java.util.List<String> instances;

    /**
     * <p>The IP protocol stack of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Valid values:</p>
     */
    @NameInMap("ip_stack")
    public String ipStack;

    /**
     * <p>Specifies whether to enable automatic creation of an advanced security group. This parameter takes effect when <code>security_group_id</code> is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_enterprise_security_group")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p><strong>[Deprecated]</strong> Selecting existing nodes during cluster creation is not supported. To add existing nodes to a cluster, create a node pool first and call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    @Deprecated
    public Boolean keepInstanceName;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>key_pair</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>key_pair</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The name of the key pair. You must specify one of this parameter or <code>login_password</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>security-key</p>
     */
    @NameInMap("key_pair")
    @Deprecated
    public String keyPair;

    /**
     * <p>The cluster version, which is consistent with the Kubernetes community baseline version. We recommend that you select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>The CLB instance ID used for API Server access. When this parameter is specified, automatic creation of the API Server CLB is skipped.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-wz9t256gqa3vbouk****</p>
     */
    @NameInMap("load_balancer_id")
    public String loadBalancerId;

    /**
     * <p><strong>[Deprecated]</strong> CLB is billed on a pay-by-usage basis. This parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s2.small</p>
     */
    @NameInMap("load_balancer_spec")
    @Deprecated
    public String loadBalancerSpec;

    /**
     * <p><strong>[Deprecated]</strong> Enables the log service for the cluster. This parameter takes effect only for ACK Serverless clusters, and the value must be <code>SLS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("logging_type")
    @Deprecated
    public String loggingType;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>login_password</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>login_password</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>The SSH logon password. You must specify this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
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
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>auto_renew</code> parameter under <code>control_plane_config</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("master_auto_renew")
    @Deprecated
    public Boolean masterAutoRenew;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>auto_renew_period</code> parameter under <code>control_plane_config</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("master_auto_renew_period")
    @Deprecated
    public Long masterAutoRenewPeriod;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>size</code> parameter under <code>control_plane_config</code> instead to configure the cluster control plane.</p>
     * <p>The number of master nodes. Valid values:</p>
     * <ul>
     * <li>3</li>
     * <li>5</li>
     * </ul>
     * <p>Default value: <code>3</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("master_count")
    @Deprecated
    public Long masterCount;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>instance_charge_type</code> parameter under <code>control_plane_config</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("master_instance_charge_type")
    @Deprecated
    public String masterInstanceChargeType;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>instance_types</code> parameter under <code>control_plane_config</code> for cluster control plane configuration instead.</p>
     * <p>The instance types of master nodes. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     */
    @NameInMap("master_instance_types")
    @Deprecated
    public java.util.List<String> masterInstanceTypes;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>unit</code> parameter under <code>control_plane_config</code> for cluster control plane configuration instead.</p>
     * <p>The subscription duration of master nodes. This parameter takes effect and is required only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
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
     * <p><strong>[Deprecated]</strong> Use the <code>period_unit</code> parameter under <code>control_plane_config</code> for cluster control plane configuration instead.</p>
     * <p>The billing cycle of master nodes. This parameter is required when the billing method is set to <code>PrePaid</code>.</p>
     * <p>Valid values: <code>Month</code>. Currently, only monthly billing cycles are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("master_period_unit")
    @Deprecated
    public String masterPeriodUnit;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>system_disk_category</code> parameter under <code>control_plane_config</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("master_system_disk_category")
    @Deprecated
    public String masterSystemDiskCategory;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>system_disk_performance_level</code> parameter under <code>control_plane_config</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("master_system_disk_performance_level")
    @Deprecated
    public String masterSystemDiskPerformanceLevel;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>system_disk_size</code> parameter under <code>control_plane_config</code> for cluster control plane configuration instead.</p>
     * <p>The system disk size of master nodes. Valid values: [40,500\]. Unit: GiB.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("master_system_disk_size")
    @Deprecated
    public Long masterSystemDiskSize;

    /**
     * <p><strong>[Deprecated]</strong> Use the system_disk_snapshot_policy_id parameter under control_plane_config for cluster control plane configuration instead.</p>
     * <p>The ID of the automatic snapshot policy used by the system cloud disks of master nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("master_system_disk_snapshot_policy_id")
    @Deprecated
    public String masterSystemDiskSnapshotPolicyId;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>vswitch_ids</code> parameter instead.</p>
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
     * <p><strong>[Deprecated]</strong> Use the <code>snat_entry</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nat_gateway")
    @Deprecated
    public Boolean natGateway;

    /**
     * <p>The number of node IP addresses, determined by specifying the network CIDR block. This parameter takes effect only for Flannel network type clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>node_name_mode</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("node_name_mode")
    @Deprecated
    public String nodeNameMode;

    /**
     * <p>The node service port range. Valid port range: [30000,65535\].</p>
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
     * <p><strong>[Deprecated]</strong> Use the desired_size parameter under scaling_group in nodepool instead.</p>
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
     * <p><strong>[Deprecated]</strong> For cluster control plane node configuration, use the <code>image_type</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
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
     * <p><strong>[Deprecated]</strong></p>
     * <p>The subscription duration. This parameter takes effect and is required only when charge_type is set to PrePaid.</p>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Notice on the behavior changes of parameters in the CreateCluster operation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Deprecated
    public Long period;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>The billing cycle unit. This parameter is required when the billing type is set to PrePaid.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Month: Currently, only monthly billing cycles are supported.</li>
     * </ul>
     * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Notice on behavior changes of the CreateCluster parameter in the cluster creation operation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("period_unit")
    @Deprecated
    public String periodUnit;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>platform</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead for node pool configuration.</p>
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
     * <p><strong>[Deprecated]</strong> The vSwitches that are used to assign IP addresses to pods when the Terway network plugin is selected. Each pod vSwitch corresponds to a vSwitch of a worker node. The pod vSwitch and the worker node vSwitch must be in the same zone.</p>
     * <blockquote>
     * <p>The subnet mask of the pod vSwitch CIDR block must be no longer than 19 bits and no longer than 25 bits. Otherwise, the number of Pod IP addresses available in the cluster network is very limited, which affects the normal use of the cluster.</p>
     * </blockquote>
     */
    @NameInMap("pod_vswitch_ids")
    @Deprecated
    public java.util.List<String> podVswitchIds;

    /**
     * <p>If you set <code>cluster_type</code> to <code>ManagedKubernetes</code>, which indicates an ACK managed cluster, you can further specify the cluster subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The kube-proxy proxy mode.</p>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configurations, use the rds_instances parameter under scaling_group in nodepool instead.</p>
     * <p>The list of ApsaraDB RDS instances to which you want to add whitelist entries. We recommend that you add the container pod CIDR block and node CIDR block in the ApsaraDB RDS console. If you specify RDS instances here, the configuration may fail because the instances are not in the Running state.</p>
     */
    @NameInMap("rds_instances")
    @Deprecated
    public java.util.List<String> rdsInstances;

    /**
     * <p>The region ID of the cluster. For details, see <a href="https://help.aliyun.com/document_detail/216938.html">Regions supported by container service</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The resource group ID of the cluster, which is used to isolate different resources.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3mkrure****</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>The RAM Roles for Service Accounts (RRSA) feature configuration.</p>
     */
    @NameInMap("rrsa_config")
    public CreateClusterRequestRrsaConfig rrsaConfig;

    /**
     * <p>The container runtime of the cluster. Supported runtimes include containerd, sandboxed containers, and Docker.</p>
     */
    @NameInMap("runtime")
    @Deprecated
    public Runtime runtime;

    /**
     * <p>The security group ID. Specify this parameter when you use an existing security group to create a cluster. This parameter is mutually exclusive with <code>is_enterprise_security_group</code>. Cluster nodes are automatically added to this security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1bdue0qc1g7k****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane configuration, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("security_hardening_os")
    @Deprecated
    public Boolean securityHardeningOs;

    /**
     * <p>A ServiceAccount is the access credential for communication between a pod and the cluster API server. The <code>service-account-issuer</code> is the issuer identity in the <code>serviceaccount token</code>, which is the <code>iss</code> field in the <code>token payload</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("service_account_issuer")
    public String serviceAccountIssuer;

    /**
     * <p>The Service network CIDR block. Valid ranges: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.0.0/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p><strong>[Deprecated]</strong> The type of service discovery within the cluster. This parameter is used to specify the service discovery method in <code>ACK Serverless</code> clusters.</p>
     * <ul>
     * <li><code>CoreDNS</code>: Uses the Kubernetes-native standard service discovery component CoreDNS. A group of containers must be deployed in the cluster for DNS resolution. By default, two ECI instances with 0.25 Core and 512 MiB specifications are used.</li>
     * <li><code>PrivateZone</code>: Uses Alibaba Cloud PrivateZone to provide service discovery capabilities. The PrivateZone service must be enabled.</li>
     * </ul>
     * <p>Default value: disabled.</p>
     */
    @NameInMap("service_discovery_types")
    @Deprecated
    public java.util.List<String> serviceDiscoveryTypes;

    /**
     * <p>Specifies whether to configure SNAT for the VPC. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Automatically creates a NAT gateway and configures SNAT rules. Set this to <code>true</code> if nodes and applications in the cluster need to access the Internet.</li>
     * <li><code>false</code>: Does not create a NAT gateway or SNAT rules. Nodes and applications in the cluster cannot access the Internet.</li>
     * </ul>
     * <blockquote>
     * <p>If this feature is not enabled during cluster creation and Internet access is required later, you can <a href="https://help.aliyun.com/document_detail/178480.html">manually enable it</a>.</p>
     * </blockquote>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    /**
     * <p><strong>[Deprecated]</strong> For cluster control plane node configuration, use the <code>soc_enabled</code> parameter under <code>control_plane_config</code> instead. For node pool configuration, use the <code>soc_enabled</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>MLPS 2.0 security hardening. For more information, see [China Chinese China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China China</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("soc_enabled")
    @Deprecated
    public Boolean socEnabled;

    /**
     * <p>Specifies whether to enable public SSH logon. This parameter is used to log on to master nodes of ACK dedicated clusters. This parameter does not take effect for managed clusters.</p>
     * <ul>
     * <li><code>true</code>: Enabled.</li>
     * <li><code>false</code>: Disabled.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    /**
     * <p>The node labels. Label rules:</p>
     * <ul>
     * <li>Labels are case-sensitive key-value pairs. You can add up to 20 labels.</li>
     * <li>Label keys must be unique and can be up to 64 characters in length. Label values can be empty and can be up to 128 characters in length. Label keys and values cannot start with &quot;aliyun&quot;, &quot;acs:&quot;, &quot;https://&quot;, or &quot;http://&quot;. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
     * </ul>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>taints</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
     */
    @NameInMap("taints")
    @Deprecated
    public java.util.List<Taint> taints;

    /**
     * <p><strong>[Deprecated]</strong> If a cluster fails to be created, the system does not roll back the cluster by default. You must manually clean up the failed cluster.</p>
     * <p>The timeout period for creating a cluster. Unit: minutes.</p>
     * <p>Default value: <code>60</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout_mins")
    @Deprecated
    public Long timeoutMins;

    /**
     * <p>The time zone used by the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/354879.html">Supported time zones</a>.</p>
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
     * <p><strong>[Deprecated]</strong> The custom node data.</p>
     * 
     * <strong>example:</strong>
     * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFD****</p>
     */
    @NameInMap("user_data")
    @Deprecated
    public String userData;

    /**
     * <p>The VPC used by the cluster. You must provide a VPC when you create a cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zeik9h3ahvv2zz95****</p>
     */
    @NameInMap("vpcid")
    public String vpcid;

    /**
     * <p>The vSwitches for cluster nodes. This field is required when you create a managed cluster with zero nodes.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>auto_renew</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("worker_auto_renew")
    @Deprecated
    public Boolean workerAutoRenew;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>auto_renew_period</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_auto_renew_period")
    @Deprecated
    public Long workerAutoRenewPeriod;

    /**
     * <p><strong>[Deprecated]</strong> Use the data_disks parameter in scaling_group under nodepool instead.</p>
     * <p>The configurations of data cloud disks for worker nodes, including the disk type and size.</p>
     */
    @NameInMap("worker_data_disks")
    @Deprecated
    public java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>instance_charge_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("worker_instance_charge_type")
    @Deprecated
    public String workerInstanceChargeType;

    /**
     * <p><strong>[Deprecated]</strong> Use the instance_types parameter in scaling_group under nodepool instead.</p>
     * <p>The instance types of worker nodes.</p>
     */
    @NameInMap("worker_instance_types")
    @Deprecated
    public java.util.List<String> workerInstanceTypes;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>period</code> parameter in <code>scaling_group</code> under <code>nodepool</code> for node pool configuration instead.</p>
     * <p>The subscription duration of worker nodes. This parameter takes effect and is required only when <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_period")
    @Deprecated
    public Long workerPeriod;

    /**
     * <p><strong>[Deprecated]</strong> Use the period_unit parameter in scaling_group under nodepool instead.</p>
     * <p>The billing cycle of worker nodes. This parameter is required when the billing method is set to <code>PrePaid</code>.</p>
     * <p>Valid values: <code>Month</code>. Only monthly billing cycles are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("worker_period_unit")
    @Deprecated
    public String workerPeriodUnit;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>system_disk_category</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("worker_system_disk_category")
    @Deprecated
    public String workerSystemDiskCategory;

    /**
     * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>system_disk_performance_level</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * <p>When the system cloud disk is an ESSD, you can set the performance level (PL) of the ESSD. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
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
     * <p><strong>[Deprecated]</strong> For node pool configuration, use the <code>system_disk_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("worker_system_disk_size")
    @Deprecated
    public Long workerSystemDiskSize;

    /**
     * <p><strong>[Deprecated]</strong> Use the system_disk_snapshot_policy_id parameter in scaling_group under nodepool instead.</p>
     * <p>The ID of the automatic snapshot policy used by the system cloud disk of worker nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    public String workerSystemDiskSnapshotPolicyId;

    /**
     * <p><strong>[Deprecated]</strong> Use the vswitch_ids parameter in the scaling_group section of the nodepool configuration instead.</p>
     * <p>The list of vSwitches used by cluster nodes. Each node corresponds to one value.</p>
     * <p>When you create a managed cluster with zero nodes, the worker_vswitch_ids parameter is not required, but you must specify vswitch_ids.</p>
     */
    @NameInMap("worker_vswitch_ids")
    @Deprecated
    public java.util.List<String> workerVswitchIds;

    /**
     * <p><strong>[Deprecated]</strong> Use the <code>zone_ids</code> parameter instead.</p>
     * <p>The zone ID of the region where the cluster resides. This parameter is specific to ACK managed clusters.</p>
     * <p>When you create an ACK managed cluster, if <code>vpc_id</code> and <code>vswitch_ids</code> are not specified, you must specify <code>zone_id</code> for the cluster so that VPC network resources are automatically created in the specified zone. If <code>vpc_id</code> and <code>vswitch_ids</code> are specified, this parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beiji****</p>
     */
    @NameInMap("zone_id")
    @Deprecated
    public String zoneId;

    /**
     * <p>The zone IDs of the cluster region. This parameter is specific to ACK managed clusters.</p>
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">SLS Project</a> that contains the <a href="https://help.aliyun.com/document_detail/48873.html">Logstore</a> for cluster audit logs.</p>
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
         * <p>Specifies whether to enable auto-renewal for control plane nodes. This parameter takes effect only when the billing method is set to <code>PrePaid</code>.</p>
         * <p>Valid values:</p>
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
         * <p>The auto-renewal duration of control plane nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>The billing method of control plane nodes.</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * <p>Default value: PostPaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("charge_type")
        public String chargeType;

        /**
         * <p>Specifies whether to install CloudMonitor on nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cloud_monitor_flags")
        public Boolean cloudMonitorFlags;

        /**
         * <p>The CPU management policy for the node.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>static: Allows pods with certain resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
         * <li>none: The existing default CPU affinity scheme is enabled.</li>
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
         * <p>The name of the key pair. Specify either this parameter or login_password.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The SSH logon password. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Specify either this parameter or key_pair.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p><strong>[Deprecated]</strong> The node service port range.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>The subscription duration of control plane nodes. This parameter is valid and required only when the billing method is set to <code>PrePaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The unit of the subscription duration of control plane nodes. This parameter is valid and required only when the billing method is set to <code>PrePaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p><strong>[Deprecated]</strong> The runtime name of control plane nodes. Valid values:</p>
         * <p>containerd: Containerd runtime. Supported by all cluster versions.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>Specifies whether to enable Alibaba Cloud OS security hardening.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("security_hardening_os")
        public Boolean securityHardeningOs;

        /**
         * <p>The number of control plane nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>Specifies whether to enable MLPS security hardening.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Specifies whether to enable burst (performance burst) for the node system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The system cloud disk type of the node.</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra cloud disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * <li><code>cloud_essd</code>: ESSD.</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL cloud disk.</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry disk.</li>
         * </ul>
         * <p>Default value: <code>cloud_ssd</code>. The default value may vary based on the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The performance level of the node system cloud disk. This parameter takes effect only for ESSD cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the node system cloud disk.</p>
         * <p>Valid values: 0 to min{50,000, 1000\*capacity-baseline performance}. Baseline performance=min{1,800+50\*capacity, 50000}.</p>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The system cloud disk size of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The automatic snapshot policy for nodes.</p>
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
         * <p>The VPCs in which the internal domain name record resolution takes effect.</p>
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
         * <p>The internal DNS configuration for the cluster. Applicable to ACK managed clusters. The internal domain name is used by node-side system components such as kubelet and kube-proxy to access the API Server. If the internal domain name access is not enabled, node-side system components access the API Server through the CLB IP address.</p>
         */
        @NameInMap("internal_dns_config")
        public CreateClusterRequestControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig;

        /**
         * <p>The cluster connection configuration. When this field is specified, the endpoint_public_access and load_balancer_id parameters do not take effect.
         * ACK supports only automatic creation of NLB instances. To specify a CLB or NLB instance, use load_balancers_config to specify the corresponding instance ID.</p>
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
         * <p>The frequency of automatic cluster upgrades. Valid values:</p>
         * <ul>
         * <li>patch: automatically upgrades to the latest patch version within the current minor version when available. New Kubernetes versions do not contain breaking changes.</li>
         * <li>stable: automatically upgrades to the latest patch version of the second-latest minor version. New Kubernetes versions may involve changes to APIs and features, but their stability has been extensively validated.</li>
         * <li>rapid: automatically upgrades to the latest patch version of the latest minor version to obtain new Kubernetes community features more quickly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stable</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Specifies whether to enable cluster auto-upgrade.</p>
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
         * <p>Specifies whether to enable the RRSA feature.</p>
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
         * <p>The data disk type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Specifies whether to encrypt data cloud disks. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Encrypts data cloud disks.</li>
         * <li><code>false</code>: Does not encrypt data cloud disks.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("encrypted")
        public String encrypted;

        /**
         * <p>The performance level of the node data cloud disk. This parameter takes effect only for <a href="https://help.aliyun.com/document_detail/122389.html">standard SSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performance_level")
        public String performanceLevel;

        /**
         * <p>The data disk size. Valid values: 40 to 32767. Unit: GiB.</p>
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
