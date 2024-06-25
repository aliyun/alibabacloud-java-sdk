// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The access control list (ACL) rule of the SLB instance associated with the API server if the cluster is a registered cluster.</p>
     */
    @NameInMap("access_control_list")
    public java.util.List<String> accessControlList;

    /**
     * <p>The components that you want to install in the cluster. When you create a cluster, you can configure the <code>addons</code> parameter to install specific components.</p>
     * <p><strong>Network plug-in</strong>: required. The Flannel and Terway plug-ins are supported. Select one of the plug-ins for the cluster.</p>
     * <ul>
     * <li>Specify the Flannel plug-in in the following format: [{&quot;name&quot;:&quot;flannel&quot;,&quot;config&quot;:&quot;&quot;}].</li>
     * <li>Specify the Flannel plug-in in the following format: [{&quot;name&quot;: &quot;terway-eniip&quot;,&quot;config&quot;: &quot;&quot;}].</li>
     * </ul>
     * <p><strong>Volume plug-in</strong>: optional. Only the <code>CSI</code> plug-in is supported.</p>
     * <p>Specify the <code>CSI</code> plug-in in the following format: [{&quot;name&quot;:&quot;csi-plugin&quot;,&quot;config&quot;: &quot;&quot;},{&quot;name&quot;: &quot;csi-provisioner&quot;,&quot;config&quot;: &quot;&quot;}].</p>
     * <p><strong>Simple Log Service component</strong>: optional. We recommend that you enable Simple Log Service. If Simple Log Service is disabled, you cannot use the cluster auditing feature.</p>
     * <ul>
     * <li>To use an existing <code>Simple Log Service project</code>, specify the value in the following format: [{&quot;name&quot;: &quot;logtail-ds&quot;,&quot;config&quot;: &quot;{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;,&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}&quot;}].</li>
     * <li>To create a <code>Simple Log Service project</code>, specify the value in the following format: [{&quot;name&quot;: &quot;logtail-ds&quot;,&quot;config&quot;: &quot;{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;}&quot;}].</li>
     * </ul>
     * <p><strong>Ingress controller</strong>: optional. By default, the <code>nginx-ingress-controller</code> component is installed in ACK dedicated clusters.</p>
     * <ul>
     * <li>To install nginx-ingress-controller and enable Internet access, specify the value in the following format: [{&quot;name&quot;:&quot;nginx-ingress-controller&quot;,&quot;config&quot;:&quot;{&quot;IngressSlbNetworkType&quot;:&quot;internet&quot;}&quot;}].</li>
     * <li>To disable the system to automatically install nginx-ingress-controller, specify the value in the following format: [{&quot;name&quot;: &quot;nginx-ingress-controller&quot;,&quot;config&quot;: &quot;&quot;,&quot;disabled&quot;: true}].</li>
     * </ul>
     * <p><strong>Event center</strong>: optional. By default, the event center feature is enabled.</p>
     * <p>You can use Kubernetes event centers to store and query events and configure alerts. You can use the Logstores that are associated with Kubernetes event centers free of charge within 90 days. For more information, see <a href="https://help.aliyun.com/document_detail/150476.html">Create and use a Kubernetes event center</a>.</p>
     * <p>To enable the ack-node-problem-detector component, specify the value in the following format: [{&quot;name&quot;:&quot;ack-node-problem-detector&quot;,&quot;config&quot;:&quot;{&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}&quot;}].</p>
     */
    @NameInMap("addons")
    public java.util.List<Addon> addons;

    /**
     * <p>Service accounts provide identities for pods when pods communicate with the <code>API server</code> of the cluster. <code>api-audiences</code> are used by the <code>API server</code> to check whether the <code>tokens</code> of requests are legitimate.`` Separate multiple <code>audiences</code> with commas (,).</p>
     * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Enable service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("api_audiences")
    public String apiAudiences;

    /**
     * <p>The billing method of the cluster. The following resources are billed on a subscription basis:</p>
     * <p>ECS instances in node pools.</p>
     * <p>The internal-facing SLB instance used by the API server.</p>
     * <p>Valid values:</p>
     * <p>PrePaid: subscription.</p>
     * <p>PostPaid: pay-as-you-go.</p>
     * <p>Default value: PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("charge_type")
    public String chargeType;

    /**
     * <p>[This parameter is deprecated]</p>
     * <p>Please replace this parameter with security_hardening_os.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cis_enabled")
    @Deprecated
    public Boolean cisEnabled;

    /**
     * <p>Specifies whether to install the CloudMonitor agent. Valid values:</p>
     * <ul>
     * <li><code>true</code>: installs the CloudMonitor agent.</li>
     * <li><code>false</code>: does not install the CloudMonitor agent.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    /**
     * <p>The domain name of the cluster.</p>
     * <p>The domain name can contain one or more parts that are separated by periods (.). Each part cannot exceed 63 characters in length, and can contain lowercase letters, digits, and hyphens (-). Each part must start and end with a lowercase letter or digit.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster.local</p>
     */
    @NameInMap("cluster_domain")
    public String clusterDomain;

    /**
     * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure the <code>profile</code> parameter, you can further specify the edition of the cluster. Valid values:</p>
     * <ul>
     * <li><code>ack.pro.small</code>: Pro.</li>
     * <li><code>ack.standard</code>: Basic. If you leave the parameter empty, the Basic edition is selected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless clusters (Basic and Pro), ACK Edge clusters (Basic and Pro), and ACK Lingjun clusters (Pro).</li>
     * <li><code>ExternalKubernetes</code>: registered cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The CIDR block of pods. You can specify 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16, or their subnets as the CIDR block of pods. The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.</p>
     * <p>For more information about subnetting for ACK clusters, see <a href="https://help.aliyun.com/document_detail/86500.html">Plan CIDR blocks for an ACK cluster that is deployed in a VPC</a>.</p>
     * <blockquote>
     * <p> This parameter is required if the cluster uses Flannel as the network plug-in.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("container_cidr")
    public String containerCidr;

    /**
     * <p>The list of control plane components for which you want to enable log collection.</p>
     * <p>By default, the log of kube-apiserver, kube-controller-manager, and kube-scheduler is collected.</p>
     */
    @NameInMap("controlplane_log_components")
    public java.util.List<String> controlplaneLogComponents;

    /**
     * <p>The Simple Log Service project that is used to store the logs of control plane components. You can use an existing project or create one. If you choose to create a Simple Log Service project, the created project is named in the <code>k8s-log-{ClusterID}</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-log-xxx</p>
     */
    @NameInMap("controlplane_log_project")
    public String controlplaneLogProject;

    /**
     * <p>The retention period of control plane logs in days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("controlplane_log_ttl")
    public String controlplaneLogTtl;

    /**
     * <p>The CPU management policy of the nodes in the node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:</p>
     * <ul>
     * <li><code>static</code>: allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.</li>
     * <li><code>none</code>: specifies that the default CPU affinity is used.</li>
     * </ul>
     * <p>Default value: <code>none</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    /**
     * <p>Specifies custom subject alternative names (SANs) for the API server certificate to accept requests from specified IP addresses or domain names. Separate multiple IP addresses or domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cs.aliyun.com</p>
     */
    @NameInMap("custom_san")
    public String customSan;

    /**
     * <p>Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the console or by calling API operations. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the Container Service console or by calling API operations.</li>
     * <li><code>false</code>: disables deletion protection for the cluster. This way, the cluster can be deleted in the Container Service console or by calling API operations.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform a rollback if the cluster fails to be created. Valid values:</p>
     * <ul>
     * <li><code>true</code>: performs a rollback if the system fails to create the cluster.</li>
     * <li><code>false</code>: does not perform a rollback if the system fails to create the cluster.</li>
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
     * <p>Specifies whether to enable the RAM Roles for Service Accounts (RRSA) feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable_rrsa")
    public Boolean enableRrsa;

    /**
     * <p>The ID of a key that is managed by Key Management Service (KMS). The key is used to encrypt data disks. For more information, see <a href="https://help.aliyun.com/document_detail/28935.html">KMS</a>.</p>
     * <blockquote>
     * <p> The key can be used only in ACK Pro clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0fe64791-55eb-4fc7-84c5-c6c7cdca****</p>
     */
    @NameInMap("encryption_provider_key")
    public String encryptionProviderKey;

    /**
     * <p>Specifies whether to enable Internet access for the cluster. You can use an elastic IP address (EIP) to expose the API server. This way, you can access the cluster over the Internet. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables Internet access.</li>
     * <li><code>false</code>: disables Internet access. If you set this parameter to false, the API server cannot be accessed over the Internet.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("endpoint_public_access")
    public Boolean endpointPublicAccess;

    /**
     * <p>Specifies whether to mount a data disk to a node that is created based on an existing ECS instance. Valid values:</p>
     * <ul>
     * <li><code>true</code>: stores the data of containers and images on a data disk. Back up the existing data on the data disk first.</li>
     * <li><code>false</code>: does not store the data of containers and images on a data disk.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>How data disks are mounted:</p>
     * <ul>
     * <li>If an ECS instance has data disks mounted and the file system of the last data disk is not initialized, the system automatically formats the data disk to ext4. Then, the system mounts the data disk to /var/lib/docker and /var/lib/kubelet.</li>
     * <li>If no data disk is mounted to the ECS instance, the system does not purchase a new data disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>Specifies a custom image for nodes. By default, the image provided by ACK is used. You can select a custom image to replace the default image. For more information, see <a href="https://help.aliyun.com/document_detail/146647.html">Custom images</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp16z7xko3vvv8gt****</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The type of OS distribution that you want to use. To specify the node OS, we recommend that you use this parameter. Valid values:</p>
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
    public String imageType;

    /**
     * <p>The list of existing Elastic Compute Service (ECS) instances that are specified as worker nodes for the cluster.</p>
     * <blockquote>
     * <p> This parameter is required when you create worker nodes based on existing ECS instances.</p>
     * </blockquote>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    /**
     * <p>The IP stack of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Optional value: ipv4 (Single stack) or ipv6 (Dual Stack)
     * Default value: IPV4</p>
     */
    @NameInMap("ip_stack")
    public String ipStack;

    /**
     * <p>Specifies whether to create an advanced security group. This parameter takes effect only if <code>security_group_id</code> is left empty.</p>
     * <blockquote>
     * <p> To use a basic security group, make sure that the sum of the number of nodes in the cluster and the number of pods that use Terway does not exceed 2,000. Therefore, we recommend that you specify an advanced security group for a cluster that has Terway installed.</p>
     * </blockquote>
     * <ul>
     * <li><code>true</code>: creates an advanced security group.</li>
     * <li><code>false</code>: does not create an advanced security group.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_enterprise_security_group")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>Specifies whether to retain the names of existing ECS instances that are used in the cluster. Valid values:</p>
     * <ul>
     * <li><code>true</code>: retains the names.</li>
     * <li><code>false</code>: does not retain the names. The system assigns new names.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The name of the key pair. You must configure this parameter or the <code>login_password</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>secrity-key</p>
     */
    @NameInMap("key_pair")
    public String keyPair;

    /**
     * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not configure this parameter, the latest Kubernetes version is used.</p>
     * <p>You can create clusters of the latest two Kubernetes versions in the ACK console. If you want to create clusters that run earlier Kubernetes versions, use the API. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes on Kubernetes versions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.16.9-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>The specification of the Server Load Balancer (SLB) instance. Valid values:</p>
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
    public String loadBalancerSpec;

    /**
     * <p>Enables Simple Log Service for the cluster. This parameter takes effect only on ACK Serverless clusters. Set the value to <code>SLS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("logging_type")
    public String loggingType;

    /**
     * <p>The password for SSH logon. You must configure this parameter or the <code>key_pair</code> parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello@1234</p>
     */
    @NameInMap("login_password")
    public String loginPassword;

    /**
     * <p>Specifies whether to enable auto-renewal for master nodes. This parameter takes effect only if <code>master_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables auto-renewal.</li>
     * <li><code>false</code>: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("master_auto_renew")
    public Boolean masterAutoRenew;

    /**
     * <p>The cycle of auto-renewal. This parameter takes effect and is required only if the subscription billing method is selected for master nodes.</p>
     * <p>Valid values: 1, 2, 3, 6, and 12.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("master_auto_renew_period")
    public Long masterAutoRenewPeriod;

    /**
     * <p>The number of master nodes. Valid values: <code>3</code> and <code>5</code>.</p>
     * <p>Default value: <code>3</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("master_count")
    public Long masterCount;

    /**
     * <p>The billing method of master nodes. Valid values:</p>
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
    public String masterInstanceChargeType;

    /**
     * <p>The instance types of master nodes. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
     */
    @NameInMap("master_instance_types")
    public java.util.List<String> masterInstanceTypes;

    /**
     * <p>The subscription duration of master nodes. This parameter takes effect and is required only if <code>master_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("master_period")
    public Long masterPeriod;

    /**
     * <p>The billing cycle of master nodes. This parameter is required if master_instance_charge_type is set to <code>PrePaid</code>.</p>
     * <p>Set the value to <code>Month</code>. Master nodes are billed only on a monthly basis.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("master_period_unit")
    public String masterPeriodUnit;

    /**
     * <p>The type of system disk that you want to use for the master nodes. Valid values:</p>
     * <ul>
     * <li><code>cloud_efficiency</code>: ultra disk.</li>
     * <li><code>cloud_ssd</code>: standard SSD.</li>
     * <li><code>cloud_essd</code>: enhanced SSD (ESSD).</li>
     * </ul>
     * <p>Default value: <code>cloud_ssd</code>. The default value may vary in different zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("master_system_disk_category")
    public String masterSystemDiskCategory;

    /**
     * <p>The performance level (PL) of the system disk that you want to use for master nodes. This parameter takes effect only for ESSDs. For more information about the relationship between disk PLs and disk sizes, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("master_system_disk_performance_level")
    public String masterSystemDiskPerformanceLevel;

    /**
     * <p>The size of the system disk that is specified for master nodes. Valid values: 40 to 500. Unit: GiB.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("master_system_disk_size")
    public Long masterSystemDiskSize;

    /**
     * <p>The ID of the automatic snapshot policy that is used by the system disk specified for master nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("master_system_disk_snapshot_policy_id")
    public String masterSystemDiskSnapshotPolicyId;

    /**
     * <p>The IDs of the vSwitches that are specified for master nodes. You can specify up to three vSwitches. We recommend that you specify three vSwitches in different zones to ensure high availability.</p>
     * <p>The number of vSwitches must be the same as that specified in <code>master_count</code> and the same as those specified in <code>master_vswitch_ids</code>.</p>
     */
    @NameInMap("master_vswitch_ids")
    public java.util.List<String> masterVswitchIds;

    /**
     * <p>The name of the cluster.</p>
     * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether to create a NAT gateway and configure SNAT rules when the system creates the ACK Serverless cluster. Valid values:</p>
     * <ul>
     * <li><code>true</code>: automatically creates a NAT gateway and configures SNAT rules. This enables Internet access for the VPC in which the cluster is deployed.</li>
     * <li><code>false</code>: does not create a NAT gateway or configure SNAT rules. In this case, the cluster in the VPC cannot access the Internet.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nat_gateway")
    public Boolean natGateway;

    /**
     * <p>The maximum number of IP addresses that can be assigned to nodes. This number is determined by the node CIDR block. This parameter takes effect only if the cluster uses Flannel as the network plug-in.</p>
     * <p>Default value: <code>26</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p>The name of the custom node.</p>
     * <p>A node name consists of a prefix, an IP substring, and a suffix.</p>
     * <ul>
     * <li>The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-), and must start and end with a lowercase letter or digit.</li>
     * <li>The IP substring length specifies the number of digits to be truncated from the end of the node IP address. The IP substring length ranges from 5 to 12.</li>
     * </ul>
     * <p>For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun.com00055test</p>
     */
    @NameInMap("node_name_mode")
    public String nodeNameMode;

    /**
     * <p>The node port range. Valid values: 30000 to 65535.</p>
     * <p>Default value: <code>30000-32767</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>30000~32767</p>
     */
    @NameInMap("node_port_range")
    public String nodePortRange;

    /**
     * <p>The list of node pools.</p>
     */
    @NameInMap("nodepools")
    public java.util.List<Nodepool> nodepools;

    /**
     * <p>The number of worker nodes. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("num_of_nodes")
    @Deprecated
    public Long numOfNodes;

    /**
     * <p>The type of OS. Valid values:</p>
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
    public String osType;

    /**
     * <p>The subscription duration. This parameter takes effect and is required only if you set charge_type to PrePaid.</p>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>FY2023</p>
     */
    @NameInMap("period")
    public Long period;

    /**
     * <p>The billing cycle. This parameter is required if charge_type is set to PrePaid.</p>
     * <p>Set the value to Month. Master nodes are billed only on a monthly basis.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("period_unit")
    public String periodUnit;

    /**
     * <p>The OS distribution. Valid values:</p>
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
    public String platform;

    /**
     * <p>The list of pod vSwitches. You need to specify at least one pod vSwitch for each node vSwitch, and the pod vSwitches must be different from the node vSwitches (<code>vswitch</code>). We recommend that you specify pod vSwitches whose mask lengths are no longer than 19.</p>
     * <blockquote>
     * <p> The <code>pod_vswitch_ids</code> parameter is required if the cluster uses Terway as the network plug-in.</p>
     * </blockquote>
     */
    @NameInMap("pod_vswitch_ids")
    public java.util.List<String> podVswitchIds;

    /**
     * <p>If you set <code>cluster_type</code> to <code>ManagedKubernetes</code>, an ACK managed cluster is created. In this case, you can further specify the cluster edition. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
     * <li><code>Edge</code>: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
     * <li><code>Serverless</code>: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
     * <li><code>Lingjun</code>: ACK Lingjun Pro cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The kube-proxy mode. Valid values:</p>
     * <ul>
     * <li><code>iptables</code>: iptables is a kube-proxy mode. It uses iptables rules to conduct Service discovery and load balancing. The performance of this mode is limited by the size of the cluster. This mode is suitable for clusters that run a small number of Services.</li>
     * <li><code>ipvs</code>: provides high performance and uses IP Virtual Server (IPVS). This allows you to configure service discovery and load balancing. This mode is suitable for clusters that are required to run a large number of services. We recommend that you use this mode in scenarios when high load balancing performance is required.</li>
     * </ul>
     * <p>Default value: <code>ipvs</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p>The list of ApsaraDB RDS instances. Select the ApsaraDB RDS instances that you want to add to the whitelist. We recommend that you add the CIDR block of pods and CIDR block of nodes to the ApsaraDB RDS instances in the ApsaraDB RDS console. When you set the ApsaraDB RDS instances, you cannot scale out the number of nodes because the instances are not in the Running state.</p>
     */
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    /**
     * <p>The ID of the region in which you want to deploy the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the cluster belongs. You can use resource groups to isolate clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3mkrure****</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>The container runtime. The default container runtime is Docker. containerd and Sandboxed-Container are also supported.</p>
     * <p>For more information about how to select a proper container runtime, see <a href="https://help.aliyun.com/document_detail/160313.html">How to select between Docker and Sandboxed-Container</a>.</p>
     */
    @NameInMap("runtime")
    public Runtime runtime;

    /**
     * <p>The ID of an existing security group. You need to choose between this parameter and the <code>is_enterprise_security_group</code> parameter. Cluster nodes are automatically added to the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1bdue0qc1g7k****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p>Specifies whether to enable Alibaba Cloud Linux Security Hardening. </p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables Alibaba Cloud Linux Security Hardening.</li>
     * <li>false: disables Alibaba Cloud Linux Security Hardening.</li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("security_hardening_os")
    public Boolean securityHardeningOs;

    /**
     * <p>Service accounts provide identities for pods when pods communicate with the <code>API server</code> of the cluster. <code>service-account-issuer</code> is the issuer of the <code>serviceaccount token</code>, which corresponds to the <code>iss</code> field in the <code>token payload</code>.</p>
     * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Enable service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("service_account_issuer")
    public String serviceAccountIssuer;

    /**
     * <p>The CIDR block of Services. Valid values: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The CIDR block of Services cannot overlap with the CIDR block of the VPC (10.1.0.0/21) or the CIDR blocks of existing clusters in the VPC. You cannot modify the CIDR block of Services after the cluster is created.</p>
     * <p>By default, the CIDR block of Services is set to 172.19.0.0/20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.0.0/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p>The type of service discovery that is implemented in the <code>ACK Serverless</code> cluster.</p>
     * <ul>
     * <li><code>CoreDNS</code>: CoreDNS is a standard service discovery plug-in that is provided by open source Kubernetes. To use DNS resolution, you must provision pods. By default, two elastic container instances are used. The specification of each instance is 0.25 vCores and 512 MiB of memory.</li>
     * <li><code>PrivateZone</code>: a DNS resolution service provided by Alibaba Cloud. You must activate Alibaba Cloud DNS PrivateZone before you can use it for service discovery.</li>
     * </ul>
     * <p>By default, this parameter is not specified.</p>
     */
    @NameInMap("service_discovery_types")
    public java.util.List<String> serviceDiscoveryTypes;

    /**
     * <p>Specifies whether to configure Source Network Address Translation (SNAT) rules for the VPC in which the cluster is deployed. Valid values:</p>
     * <ul>
     * <li><code>true</code>: automatically creates a NAT gateway and configures SNAT rules. Set this parameter to <code>true</code> if nodes and applications in the cluster need to access the Internet.</li>
     * <li><code>false</code>: does not create a NAT gateway or configure SNAT rules. In this case, nodes and applications in the cluster cannot access the Internet.</li>
     * </ul>
     * <blockquote>
     * <p> If this feature is disabled when you create the cluster, you can manually enable this feature after you create the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/178480.html">Manually create a NAT gateway and configure SNAT rules</a>.</p>
     * </blockquote>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    /**
     * <p>Specifies whether to enable reinforcement based on Multi-Level Protection Scheme (MLPS). For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">ACK reinforcement based on classified protection</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables reinforcement based on MLPS.</li>
     * <li><code>false</code>: disables reinforcement based on MLPS.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("soc_enabled")
    public Boolean socEnabled;

    /**
     * <p>Specifies whether to enable SSH logon. If this parameter is set to true, you can log on to master nodes in an ACK dedicated cluster over the Internet. This parameter does not take effect for ACK managed clusters. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables SSH logon.</li>
     * <li><code>false</code>: disables SSH logon.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    /**
     * <p>The labels that you want to add to nodes. You must add labels based on the following rules:</p>
     * <ul>
     * <li>A label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
     * <li>When you add a label, you must specify a unique key but you can leave the value empty. A key cannot exceed 64 characters in length and a value cannot exceed 128 characters in length. Keys and values cannot start with aliyun, acs:, https://, or http://. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
     * </ul>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The taints of the nodes in the node pool. Taints can be used together with tolerations to avoid scheduling pods to specified nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
     */
    @NameInMap("taints")
    public java.util.List<Taint> taints;

    /**
     * <p>Specifies the timeout period of cluster creation. Unit: minutes.</p>
     * <p>Default value: <code>60</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout_mins")
    public Long timeoutMins;

    /**
     * <p>The time zone of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The custom Certificate Authority (CA) certificate used by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----****</p>
     */
    @NameInMap("user_ca")
    public String userCa;

    /**
     * <p>The user data of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFD****</p>
     */
    @NameInMap("user_data")
    public String userData;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which you want to deploy the cluster. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zeik9h3ahvv2zz95****</p>
     */
    @NameInMap("vpcid")
    public String vpcid;

    /**
     * <p>The vSwitches that are specified for nodes in the cluster. This parameter is required when you create an ACK managed cluster that does not contain nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>Specifies whether to enable auto-renewal for worker nodes. This parameter takes effect and is required only if <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables auto-renewal.</li>
     * <li><code>false</code>: disables auto-renewal.</li>
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
     * <p>The cycle of auto-renewal. This parameter takes effect and is required only if the subscription billing method is selected for worker nodes.</p>
     * <p>Valid values: 1, 2, 3, 6, and 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_auto_renew_period")
    @Deprecated
    public Long workerAutoRenewPeriod;

    /**
     * <p>The configurations of the data disks that you want to mount to worker nodes. The configurations include the disk type and disk size.</p>
     */
    @NameInMap("worker_data_disks")
    @Deprecated
    public java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks;

    /**
     * <p>The billing method of worker nodes. Valid values:</p>
     * <ul>
     * <li><code>PrePaid</code>: subscription.</li>
     * <li><code>PostPaid</code>: pay-as-you-go.</li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("worker_instance_charge_type")
    @Deprecated
    public String workerInstanceChargeType;

    /**
     * <p>The instance configurations of worker nodes.</p>
     */
    @NameInMap("worker_instance_types")
    @Deprecated
    public java.util.List<String> workerInstanceTypes;

    /**
     * <p>The subscription duration of worker nodes. This parameter takes effect and is required only if <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
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
     * <p>The billing cycle of worker nodes. This parameter is required if worker_instance_charge_type is set to <code>PrePaid</code>.</p>
     * <p>Set the value to <code>Month</code>. Worker nodes are billed only on a monthly basis.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("worker_period_unit")
    @Deprecated
    public String workerPeriodUnit;

    /**
     * <p>The category of the system disks for worker nodes. For more information, see <a href="https://help.aliyun.com/document_detail/63136.html">Elastic Block Storage devices</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>cloud_efficiency</code>: ultra disk.</li>
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
     * <p>If the system disk is an ESSD, you can set the PL of the ESSD. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
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
     * <p>The system disk size of worker nodes. Unit: GiB.</p>
     * <p>Valid values: 40 to 500.</p>
     * <p>The value of this parameter must be at least 40 and no less than the image size.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("worker_system_disk_size")
    @Deprecated
    public Long workerSystemDiskSize;

    /**
     * <p>The ID of the automatic snapshot policy that is used by the system disk specified for worker nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    public String workerSystemDiskSnapshotPolicyId;

    /**
     * <p>The list of vSwitches that are specified for nodes. Each node is allocated a vSwitch.</p>
     * <p>The <code>worker_vswitch_ids</code> parameter is optional but the <code>vswitch_ids</code> parameter is required when you create an ACK managed cluster that does not contain nodes.</p>
     */
    @NameInMap("worker_vswitch_ids")
    @Deprecated
    public java.util.List<String> workerVswitchIds;

    /**
     * <p>The ID of the zone to which the cluster belongs. This parameter takes effect for only ACK Serverless clusters.</p>
     * <p>When you create an ACK Serverless cluster, you must configure <code>zone_id</code> if <code>vpc_id</code> and <code>vswitch_ids</code> are not configured. This way, the system automatically creates a VPC in the specified zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beiji****</p>
     */
    @NameInMap("zone_id")
    public String zoneId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

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

    public CreateClusterRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateClusterRequest setCisEnabled(Boolean cisEnabled) {
        this.cisEnabled = cisEnabled;
        return this;
    }
    public Boolean getCisEnabled() {
        return this.cisEnabled;
    }

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

    public CreateClusterRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

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

    public CreateClusterRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

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

    public CreateClusterRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    public CreateClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateClusterRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

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

    public CreateClusterRequest setKeepInstanceName(Boolean keepInstanceName) {
        this.keepInstanceName = keepInstanceName;
        return this;
    }
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

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

    public CreateClusterRequest setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public CreateClusterRequest setLoggingType(String loggingType) {
        this.loggingType = loggingType;
        return this;
    }
    public String getLoggingType() {
        return this.loggingType;
    }

    public CreateClusterRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public CreateClusterRequest setMasterAutoRenew(Boolean masterAutoRenew) {
        this.masterAutoRenew = masterAutoRenew;
        return this;
    }
    public Boolean getMasterAutoRenew() {
        return this.masterAutoRenew;
    }

    public CreateClusterRequest setMasterAutoRenewPeriod(Long masterAutoRenewPeriod) {
        this.masterAutoRenewPeriod = masterAutoRenewPeriod;
        return this;
    }
    public Long getMasterAutoRenewPeriod() {
        return this.masterAutoRenewPeriod;
    }

    public CreateClusterRequest setMasterCount(Long masterCount) {
        this.masterCount = masterCount;
        return this;
    }
    public Long getMasterCount() {
        return this.masterCount;
    }

    public CreateClusterRequest setMasterInstanceChargeType(String masterInstanceChargeType) {
        this.masterInstanceChargeType = masterInstanceChargeType;
        return this;
    }
    public String getMasterInstanceChargeType() {
        return this.masterInstanceChargeType;
    }

    public CreateClusterRequest setMasterInstanceTypes(java.util.List<String> masterInstanceTypes) {
        this.masterInstanceTypes = masterInstanceTypes;
        return this;
    }
    public java.util.List<String> getMasterInstanceTypes() {
        return this.masterInstanceTypes;
    }

    public CreateClusterRequest setMasterPeriod(Long masterPeriod) {
        this.masterPeriod = masterPeriod;
        return this;
    }
    public Long getMasterPeriod() {
        return this.masterPeriod;
    }

    public CreateClusterRequest setMasterPeriodUnit(String masterPeriodUnit) {
        this.masterPeriodUnit = masterPeriodUnit;
        return this;
    }
    public String getMasterPeriodUnit() {
        return this.masterPeriodUnit;
    }

    public CreateClusterRequest setMasterSystemDiskCategory(String masterSystemDiskCategory) {
        this.masterSystemDiskCategory = masterSystemDiskCategory;
        return this;
    }
    public String getMasterSystemDiskCategory() {
        return this.masterSystemDiskCategory;
    }

    public CreateClusterRequest setMasterSystemDiskPerformanceLevel(String masterSystemDiskPerformanceLevel) {
        this.masterSystemDiskPerformanceLevel = masterSystemDiskPerformanceLevel;
        return this;
    }
    public String getMasterSystemDiskPerformanceLevel() {
        return this.masterSystemDiskPerformanceLevel;
    }

    public CreateClusterRequest setMasterSystemDiskSize(Long masterSystemDiskSize) {
        this.masterSystemDiskSize = masterSystemDiskSize;
        return this;
    }
    public Long getMasterSystemDiskSize() {
        return this.masterSystemDiskSize;
    }

    public CreateClusterRequest setMasterSystemDiskSnapshotPolicyId(String masterSystemDiskSnapshotPolicyId) {
        this.masterSystemDiskSnapshotPolicyId = masterSystemDiskSnapshotPolicyId;
        return this;
    }
    public String getMasterSystemDiskSnapshotPolicyId() {
        return this.masterSystemDiskSnapshotPolicyId;
    }

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

    public CreateClusterRequest setNodeNameMode(String nodeNameMode) {
        this.nodeNameMode = nodeNameMode;
        return this;
    }
    public String getNodeNameMode() {
        return this.nodeNameMode;
    }

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

    public CreateClusterRequest setNumOfNodes(Long numOfNodes) {
        this.numOfNodes = numOfNodes;
        return this;
    }
    public Long getNumOfNodes() {
        return this.numOfNodes;
    }

    public CreateClusterRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateClusterRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public CreateClusterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateClusterRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

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

    public CreateClusterRequest setTaints(java.util.List<Taint> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<Taint> getTaints() {
        return this.taints;
    }

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

    public CreateClusterRequest setWorkerAutoRenew(Boolean workerAutoRenew) {
        this.workerAutoRenew = workerAutoRenew;
        return this;
    }
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    public CreateClusterRequest setWorkerAutoRenewPeriod(Long workerAutoRenewPeriod) {
        this.workerAutoRenewPeriod = workerAutoRenewPeriod;
        return this;
    }
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    public CreateClusterRequest setWorkerDataDisks(java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<CreateClusterRequestWorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    public CreateClusterRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    public CreateClusterRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    public CreateClusterRequest setWorkerPeriod(Long workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    public CreateClusterRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public CreateClusterRequest setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        this.workerSystemDiskCategory = workerSystemDiskCategory;
        return this;
    }
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    public CreateClusterRequest setWorkerSystemDiskPerformanceLevel(String workerSystemDiskPerformanceLevel) {
        this.workerSystemDiskPerformanceLevel = workerSystemDiskPerformanceLevel;
        return this;
    }
    public String getWorkerSystemDiskPerformanceLevel() {
        return this.workerSystemDiskPerformanceLevel;
    }

    public CreateClusterRequest setWorkerSystemDiskSize(Long workerSystemDiskSize) {
        this.workerSystemDiskSize = workerSystemDiskSize;
        return this;
    }
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    public CreateClusterRequest setWorkerSystemDiskSnapshotPolicyId(String workerSystemDiskSnapshotPolicyId) {
        this.workerSystemDiskSnapshotPolicyId = workerSystemDiskSnapshotPolicyId;
        return this;
    }
    public String getWorkerSystemDiskSnapshotPolicyId() {
        return this.workerSystemDiskSnapshotPolicyId;
    }

    public CreateClusterRequest setWorkerVswitchIds(java.util.List<String> workerVswitchIds) {
        this.workerVswitchIds = workerVswitchIds;
        return this;
    }
    public java.util.List<String> getWorkerVswitchIds() {
        return this.workerVswitchIds;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateClusterRequestWorkerDataDisks extends TeaModel {
        /**
         * <p>The type of a data disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <ul>
         * <li><code>true</code>: encrypts the data disk.</li>
         * <li><code>false</code>: does not encrypt the data disk.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("encrypted")
        public String encrypted;

        /**
         * <p>The PL of the data disk. This parameter takes effect only for ESSDs. You can specify a higher PL if you increase the size of a data disk. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performance_level")
        public String performanceLevel;

        /**
         * <p>The size of the data disk. Valid values: 40 to 32767. Unit: GiB.</p>
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
