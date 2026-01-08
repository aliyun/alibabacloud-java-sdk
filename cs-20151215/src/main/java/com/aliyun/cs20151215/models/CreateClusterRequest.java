// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The network access control list (ACL) rule of the SLB instance associated with the API server if the cluster is a registered cluster.</p>
     */
    @NameInMap("access_control_list")
    @Deprecated
    public java.util.List<String> accessControlList;

    /**
     * <p>The components that you want to install in the cluster. When you create a cluster, you can configure the <code>addons</code> parameter to specify the components that you want to install.</p>
     * <p><strong>Network plug-in</strong>: required. The Flannel and Terway plug-ins are supported. Select one of the plug-ins for the cluster.</p>
     * <ul>
     * <li>If you want to use the Terway component, specify the network plug-in in the [{&quot;name&quot;:&quot;flannel&quot;,&quot;config&quot;:&quot;&quot;}] format.</li>
     * <li>If you want to use the Terway component, specify the value network plug-in in the [{&quot;name&quot;: &quot;terway-eniip&quot;,&quot;Config&quot;: &quot;&quot;}] format.</li>
     * </ul>
     * <p><strong>Volume plug-in</strong>: optional. Only the <code>Container Storage Interface (CSI)</code> plug-in is supported.</p>
     * <p>Specify the <code>CSI</code> plug-in in the following format: [{&quot;name&quot;:&quot;csi-plugin&quot;,&quot;config&quot;: &quot;&quot;},{&quot;name&quot;: &quot;csi-provisioner&quot;,&quot;config&quot;: &quot;&quot;}].</p>
     * <p><strong>Simple Log Service component</strong>: optional. We recommend that you enable Simple Log Service. If Simple Log Service is disabled, you cannot use the cluster auditing feature.</p>
     * <ul>
     * <li>Specify an existing <code>Simple Log Service project</code> in the following format: [{&quot;name&quot;: &quot;logtail-ds&quot;,&quot;config&quot;: &quot;{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;,&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}&quot;}].</li>
     * <li>To create a <code>Simple Log Service project</code>, specify the component in the following format: [{&quot;name&quot;: &quot;logtail-ds&quot;,&quot;config&quot;: &quot;{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;}&quot;}].</li>
     * </ul>
     * <p><strong>Ingress controller</strong>: optional. By default, the <code>nginx-ingress-controller</code> component is installed in ACK dedicated clusters.</p>
     * <ul>
     * <li>To install nginx-ingress-controller and enable Internet access, specify the Ingress controller in the following format: [{&quot;name&quot;:&quot;nginx-ingress-controller&quot;,&quot;config&quot;:&quot;{&quot;IngressSlbNetworkType&quot;:&quot;internet&quot;}&quot;}].</li>
     * <li>To disable the automatic installation of nginx-ingress-controller, specify the Ingress controller in the following format: [{&quot;name&quot;: &quot;nginx-ingress-controller&quot;,&quot;config&quot;: &quot;&quot;,&quot;disabled&quot;: true}].</li>
     * </ul>
     * <p><strong>Event center</strong>: optional. By default, the event center feature is enabled.</p>
     * <p>You can use ACK event centers to store and query events and configure alerts. You can use the Logstores that are associated with ACK event centers free of charge within 90 days. For more information, see <a href="https://help.aliyun.com/document_detail/150476.html">Create and use an event center</a>.</p>
     * <p>To enable the event center feature, specify the event center component in the following format: [{&quot;name&quot;:&quot;ack-node-problem-detector&quot;,&quot;config&quot;:&quot;{&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}&quot;}].</p>
     */
    @NameInMap("addons")
    public java.util.List<Addon> addons;

    /**
     * <p>Service accounts provide identities for pods when pods communicate with the <code>API server</code> of the cluster. The <code>api-audiences</code> parameter validates <code>tokens</code> and is used by the <code>API server</code> to check whether the <code>tokens</code> of requests are valid. Separate multiple values with commas (,).``</p>
     * <p>For more information about <code>service accounts</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Enable service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("api_audiences")
    public String apiAudiences;

    @NameInMap("audit_log_config")
    public CreateClusterRequestAuditLogConfig auditLogConfig;

    @NameInMap("auto_mode")
    public CreateClusterRequestAutoMode autoMode;

    /**
     * <p>[<strong>Deprecated</strong>]</p>
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables auto-renewal.</li>
     * <li><code>false</code>: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_renew")
    @Deprecated
    public Boolean autoRenew;

    /**
     * <p>[<strong>Deprecated</strong>]</p>
     * <p>The auto-renewal duration. This parameter takes effect only if charge_type is set to PrePaid and auto_renew is set to true. If you set <code>period_unit</code> to Month, the valid values of auto_renew_period are 1, 2, 3, 6, and 12.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("auto_renew_period")
    @Deprecated
    public Long autoRenewPeriod;

    /**
     * <p>[<strong>Deprecated</strong>]</p>
     * <p>The billing method of the CLB instance that is used by the API server. Default value: PostPaid. Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go.</li>
     * <li>PrePaid: subscription. This billing method is not supported by newly created CLB instances. Existing CLB instances are not affected.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
     * </li>
     * <li><p>Starting from December 1, 2024, newly created CLB instances no longer support the subscription billing method, and an instance fee will be charged for newly created CLB instances</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2839797.html">CLB billing adjustments</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("charge_type")
    @Deprecated
    public String chargeType;

    /**
     * <p>[Deprecated] When you configure the control plane, use the <code>security_hardening_os</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>security_hardening_os</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cis_enabled")
    @Deprecated
    public Boolean cisEnabled;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>cloud_monitor_flags</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>cms_enabled</code> parameter of the <code>kubernetes_config</code> field in the nodepool section instead.</p>
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
    @Deprecated
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
     * <p>If you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and specify <code>profile</code>, you can further specify the edition of the cluster. Valid values:</p>
     * <ul>
     * <li><code>ack.pro.small</code>: Pro Edition.</li>
     * <li><code>ack.standard</code>: Basic Edition. If you leave the parameter empty, an ACK Basic cluster is created.</li>
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
     * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless clusters (Basic Edition and Pro Edition), ACK Edge clusters (Basic Edition and Pro Edition), and ACK Lingjun clusters (Pro Edition).</li>
     * <li><code>ExternalKubernetes</code>: registered cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The pod CIDR block. You can specify 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16, or their subnets as the pod CIDR block. The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.</p>
     * <p>For more information about how to plan the network of an ACK cluster, see <a href="https://help.aliyun.com/document_detail/86500.html">Plan the network of an ACK cluster</a>.</p>
     * <blockquote>
     * <p> This parameter is required if the cluster uses the Flannel plug-in.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("container_cidr")
    public String containerCidr;

    /**
     * <p>The control plane configurations of an ACK dedicated cluster.</p>
     */
    @NameInMap("control_plane_config")
    public CreateClusterRequestControlPlaneConfig controlPlaneConfig;

    @NameInMap("control_plane_endpoints_config")
    public CreateClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>The control plane components for which you want to enable log collection.</p>
     * <p>By default, the logs of kube-apiserver, kube-controller-manager, and kube-scheduler are collected.</p>
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
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>cpu_policy</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>cpu_policy</code> parameter of the <code>kubernetes_config</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The CPU management policy of the node. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:</p>
     * <ul>
     * <li><code>static</code>: allows pods with specific resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
     * <li><code>none</code>: specifies that the default CPU affinity is used.</li>
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
     * <p>The custom subject alternative names (SANs) for the API server certificate to accept requests from specified IP addresses or domain names. Separate multiple IP addresses and domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cs.aliyun.com</p>
     */
    @NameInMap("custom_san")
    @Deprecated
    public String customSan;

    /**
     * <p>Specifies whether to enable cluster deletion protection. If you enable this option, the cluster cannot be deleted in the console or by calling API operations. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables cluster deletion protection.</li>
     * <li><code>false</code>: disables cluster deletion protection.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>[<strong>Deprecated</strong>] By default, the system does not perform a rollback when the cluster fails to be created. You must manually delete the cluster that fails to be created.</p>
     * <p>Specifies whether to perform a rollback when the cluster fails to be created. Valid values:</p>
     * <ul>
     * <li><code>true</code>: performs a rollback when the cluster fails to be created.</li>
     * <li><code>false</code>: does not perform a rollback when the cluster fails to be created.</li>
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
    @Deprecated
    public Boolean enableRrsa;

    /**
     * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the system disk. For more information, see <a href="https://help.aliyun.com/document_detail/28935.html">What is KMS?</a></p>
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
     * <li><code>true</code>: enables Internet access for the cluster.</li>
     * <li><code>false</code>: disables Internet access for the cluster. If you set the value to false, the API server cannot be accessed over the Internet.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("endpoint_public_access")
    public Boolean endpointPublicAccess;

    @NameInMap("extra_sans")
    public java.util.List<String> extraSans;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, you cannot add existing nodes to the cluster. If you want to add existing nodes, you must first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
     * <p>Specifies whether to mount a data disk to a node that is created based on an existing ECS instance. Valid values:</p>
     * <ul>
     * <li><code>true</code>: stores the data of containers and images on a data disk. The existing data stored in the data disk is lost. Back up the existing data first.</li>
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
    @Deprecated
    public Boolean formatDisk;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>image_id</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>image_id</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The custom image for nodes. By default, the image provided by ACK is used. You can select a custom image to replace the default image. For more information, see <a href="https://help.aliyun.com/document_detail/146647.html">Use a custom image to create an ACK cluster</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp16z7xko3vvv8gt****</p>
     */
    @NameInMap("image_id")
    @Deprecated
    public String imageId;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>image_type</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>image_type</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
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
    @Deprecated
    public String imageType;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, you cannot add existing nodes to the cluster. If you want to add existing nodes, you must first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
     * <p>The existing ECS instances that are specified as worker nodes for the cluster.</p>
     * <blockquote>
     * <p> This parameter is required if you create worker nodes on existing ECS instances.</p>
     * </blockquote>
     */
    @NameInMap("instances")
    @Deprecated
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
     * <p> To use a basic security group, make sure that the sum of the number of nodes in the cluster and the number of pods that use Terway does not exceed 2,000. Therefore, we recommend that you specify an advanced security group for a cluster that uses Terway.</p>
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
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, you cannot add existing nodes to the cluster. If you want to add existing nodes, you must first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
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
    @Deprecated
    public Boolean keepInstanceName;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>key_pair</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>key_pair</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The name of the key pair. You must configure this parameter or <code>login_password</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>secrity-key</p>
     */
    @NameInMap("key_pair")
    @Deprecated
    public String keyPair;

    /**
     * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not specify this parameter, the latest Kubernetes version is used.</p>
     * <p>You can create ACK clusters of the latest three Kubernetes versions in the ACK console. If you want to create clusters that run earlier Kubernetes versions, use the ACK API. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Support for Kubernetes versions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.16.9-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>Specifies the ID of the CLB instance for accessing the API server. If this parameter is specified, the system does not automatically create a CLB instance for the API server.</p>
     * <blockquote>
     * <p> Make sure that the CLB instance does not have other dependencies, such as listeners and backend servers. You cannot specify shared-resource or Internet-facing CLB instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-wz9t256gqa3vbouk****</p>
     */
    @NameInMap("load_balancer_id")
    public String loadBalancerId;

    /**
     * <p>[<strong>Deprecated</strong>] The pay-as-you-go billing method is used by Classic Load Balancer (CLB) instances. This parameter does not take effect.</p>
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
    @Deprecated
    public String loadBalancerSpec;

    /**
     * <p>Enables Simple Log Service for the cluster. This parameter takes effect only for ACK Serverless clusters. Set the value to <code>SLS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("logging_type")
    @Deprecated
    public String loggingType;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>login_password</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>login_password</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The password for SSH logon. You must set this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello@1234</p>
     */
    @NameInMap("login_password")
    @Deprecated
    public String loginPassword;

    /**
     * <p>The configurations of the cluster maintenance window.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>auto-renew</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>Specifies whether to enable auto-renewal for master nodes. This parameter takes effect only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
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
    @Deprecated
    public Boolean masterAutoRenew;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>auto-renew_period</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The auto-renewal duration. This parameter takes effect and is required only when the subscription billing method is selected for master nodes.</p>
     * <p>Valid values: 1, 2, 3, 6, and 12.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("master_auto_renew_period")
    @Deprecated
    public Long masterAutoRenewPeriod;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>size</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The number of master nodes. Valid values: <code>3</code> and <code>5</code>.</p>
     * <p>Default value: <code>3</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("master_count")
    @Deprecated
    public Long masterCount;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>instance_charge_type</code> parameter in the <code>control_plane_config</code> section instead.</p>
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
    @Deprecated
    public String masterInstanceChargeType;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>instance_types</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The instance types of master nodes. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
     */
    @NameInMap("master_instance_types")
    @Deprecated
    public java.util.List<String> masterInstanceTypes;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>unit</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The subscription duration of master nodes. This parameter takes effect and is required only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("master_period")
    @Deprecated
    public Long masterPeriod;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>period_unit</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The billing cycle of the master nodes in the cluster. This parameter is required if master_instance_charge_type is set to <code>PrePaid</code>.</p>
     * <p>Valid value: <code>Month</code>, which indicates that master nodes are billed only on a monthly basis.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("master_period_unit")
    @Deprecated
    public String masterPeriodUnit;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>system_disk_category</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The system disk category of master nodes. Valid values:</p>
     * <ul>
     * <li><code>cloud_efficiency</code>: ultra disk.</li>
     * <li><code>cloud_ssd</code>: standard SSD.</li>
     * <li><code>cloud_essd</code>: Enterprise SSD (ESSD).</li>
     * </ul>
     * <p>Default value: <code>cloud_ssd</code>. The default value may vary in different zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("master_system_disk_category")
    @Deprecated
    public String masterSystemDiskCategory;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>system_disk_performance_level</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The performance level (PL) of the system disk that you want to use for master nodes. This parameter takes effect only for ESSDs. For more information about the relationship between disk PLs and disk sizes, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("master_system_disk_performance_level")
    @Deprecated
    public String masterSystemDiskPerformanceLevel;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>system_disk_disk</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The system disk size of master nodes. Valid values: 40 to 500. Unit: GiB.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("master_system_disk_size")
    @Deprecated
    public Long masterSystemDiskSize;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>system_disk_snapshot_policy_id</code> parameter in the <code>control_plane_config</code> section instead.</p>
     * <p>The ID of the automatic snapshot policy that is used by the system disk specified for master nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("master_system_disk_snapshot_policy_id")
    @Deprecated
    public String masterSystemDiskSnapshotPolicyId;

    /**
     * <p>[<strong>Deprecated</strong>] Use the <code>vswitch_ids</code> parameter instead.</p>
     * <p>The IDs of the vSwitches that are specified for master nodes. You can specify up to three vSwitches. We recommend that you specify three vSwitches in different zones to ensure high availability.</p>
     * <p>The number of vSwitches must be the same as the value of the <code>master_count</code> parameter and also the same as the number of vSwitches specified in the <code>master_vswitch_ids</code> parameter.</p>
     */
    @NameInMap("master_vswitch_ids")
    @Deprecated
    public java.util.List<String> masterVswitchIds;

    /**
     * <p>The cluster name.</p>
     * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>[Deprecated] Use the <code>snat_entry</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nat_gateway")
    @Deprecated
    public Boolean natGateway;

    /**
     * <p>The maximum number of IP addresses that can be assigned to each node. This number is determined by the subnet mask of the specified CIDR block. This parameter takes effect only if the cluster uses the Flannel plug-in.</p>
     * <p>Default value: <code>26</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>node_name_mode</code> parameter of the <code>kubernetes_config</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The custom node name.</p>
     * <p>A custom node name consists of a prefix, a node IP address, and a suffix.</p>
     * <ul>
     * <li>The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-), and must start and end with a lowercase letter or digit.</li>
     * <li>The IP substring length specifies the number of digits to be truncated from the end of the node IP address. The IP substring length ranges from 5 to 12.</li>
     * </ul>
     * <p>For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name will aliyun.com00055test.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun.com00055test</p>
     */
    @NameInMap("node_name_mode")
    @Deprecated
    public String nodeNameMode;

    /**
     * <p>The node port range. Valid values: 30000 to 65535.</p>
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
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>desired_size</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The number of worker nodes. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("num_of_nodes")
    @Deprecated
    public Long numOfNodes;

    /**
     * <p>The automatic O\&amp;M policy of the cluster.</p>
     */
    @NameInMap("operation_policy")
    public CreateClusterRequestOperationPolicy operationPolicy;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>image_type</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>image_type</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
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
    @Deprecated
    public String osType;

    /**
     * <p>[<strong>Deprecated</strong>]</p>
     * <p>The subscription duration. This parameter takes effect and is required only when you set charge_type to PrePaid.</p>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>FY2023</p>
     */
    @NameInMap("period")
    @Deprecated
    public Long period;

    /**
     * <p>[<strong>Deprecated</strong>]</p>
     * <p>The billing cycle. This parameter is required if charge_type is set to PrePaid.</p>
     * <p>Valid value: Month, which indicates that resources are billed only on a monthly basis.</p>
     * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("period_unit")
    @Deprecated
    public String periodUnit;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>platform</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The OS distribution that is used. Valid values:</p>
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
     * <p>If you select Terway as the network plug-in, you must allocate vSwitches to pods. For each vSwitch that allocates IP addresses to worker nodes, you must select a vSwitch in the same zone to allocate IP addresses to pods.</p>
     * <blockquote>
     * <p> We recommend that you select pod vSwitches whose subnet masks do not exceed 19 bits in length. The maximum subnet mask length of a pod vSwitch is 25 bits. If you select a pod vSwitch whose subnet mask exceeds 25 bits in length, the IP addresses that can be allocated to pods may be insufficient.</p>
     * </blockquote>
     */
    @NameInMap("pod_vswitch_ids")
    @Deprecated
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
     * <li><code>iptables</code>: a mature and stable mode that uses iptables rules to conduct service discovery and load balancing. The performance of this mode is limited by the size of the cluster. This mode is suitable for clusters that run a small number of Services.</li>
     * <li><code>ipvs</code>: a mode that provides high performance and uses IP Virtual Server (IPVS) to conduct service discovery and load balancing. This mode is suitable for clusters that run a large number of Services. We recommend that you use this mode in scenarios that require high-performance load balancing.</li>
     * </ul>
     * <p>Default value: <code>ipvs</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>rds_instances</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The ApsaraDB RDS instances. The pod CIDR block and node CIDR block are added to the whitelists of the ApsaraDB RDS instances. We recommend that you add the pod CIDR block and node CIDR block to the whitelists of the ApsaraDB RDS instances in the ApsaraDB RDS console. If the RDS instances are not in the Running state, new nodes cannot be added to the cluster.</p>
     */
    @NameInMap("rds_instances")
    @Deprecated
    public java.util.List<String> rdsInstances;

    /**
     * <p>The ID of the region in which the cluster is deployed. For more information about the regions supported by ACK, see <a href="https://help.aliyun.com/document_detail/216938.html">Regions supported by ACK</a>.</p>
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

    @NameInMap("rrsa_config")
    public CreateClusterRequestRrsaConfig rrsaConfig;

    /**
     * <p>The container runtime. The default container runtime is Docker. containerd and Sandboxed-Container are also supported.</p>
     * <p>For more information about how to select a proper container runtime, see <a href="https://help.aliyun.com/document_detail/160313.html">Comparison among Docker, containerd, and Sandboxed-Container</a>.</p>
     */
    @NameInMap("runtime")
    @Deprecated
    public Runtime runtime;

    /**
     * <p>The ID of an existing security group. You must specify this parameter or <code>is_enterprise_security_group</code>. Cluster nodes are automatically added to the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1bdue0qc1g7k****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>security_hardening_os</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>security_hardening_os</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>Specifies whether to enable Alibaba Cloud Linux Security Hardening. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables Alibaba Cloud Linux Security Hardening.</li>
     * <li><code>false</code>: disables Alibaba Cloud Linux Security Hardening.</li>
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
     * <p>Service accounts provide identities for pods when pods communicate with the <code>API server</code> of the cluster. <code>service-account-issuer</code> specifies the issuer of the <code>serviceaccount token</code>, which is specified by using the <code>iss</code> field in the <code>token payload</code>.</p>
     * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Enable service account token volume projection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.default.svc</p>
     */
    @NameInMap("service_account_issuer")
    public String serviceAccountIssuer;

    /**
     * <p>The Service CIDR block. Valid values: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The Service CIDR block cannot overlap with the VPC CIDR block (10.1.0.0/21) or the CIDR blocks of existing clusters in the VPC. You cannot modify the Service CIDR block after the cluster is created.</p>
     * <p>By default, the Service CIDR block is set to 172.19.0.0/20.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.0.0/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p>The methods for implementing service discovery in <code>ACK Serverless</code> clusters.</p>
     * <ul>
     * <li><code>CoreDNS</code>: a standard service discovery plug-in that is provided by open source Kubernetes. To use DNS resolution, you must provision pods. By default, two elastic container instances are used. The specification of each instance is 0.25 vCores and 512 MiB of memory.</li>
     * <li><code>PrivateZone</code>: a DNS resolution service provided by Alibaba Cloud. You must activate Alibaba Cloud DNS PrivateZone before you can use it for service discovery.</li>
     * </ul>
     * <p>By default, this parameter is not specified.</p>
     */
    @NameInMap("service_discovery_types")
    @Deprecated
    public java.util.List<String> serviceDiscoveryTypes;

    /**
     * <p>Specifies whether to configure SNAT rules for the VPC in which your cluster is deployed. Valid values:</p>
     * <ul>
     * <li><code>true</code>: automatically creates a NAT gateway and configures SNAT rules. Set the value to <code>true</code> if nodes and applications in the cluster need to access the Internet.</li>
     * <li><code>false</code>: does not create a NAT gateway or configure SNAT rules. In this case, nodes and applications in the cluster cannot access the Internet.</li>
     * </ul>
     * <blockquote>
     * <p> If this feature is disabled when you create the cluster, you can also manually enable this feature after you create the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/178480.html">Enable an existing ACK cluster to access the Internet</a>.</p>
     * </blockquote>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>soc_enabled</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>soc_enabled</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>Specifies whether to enable Multi-Level Protection Scheme (MLPS) security hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">ACK security hardening based on MLPS</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables MLPS security hardening.</li>
     * <li><code>false</code>: disables MLPS security hardening.</li>
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
     * <li>When you add a label, you must specify a unique key, but you can leave the value empty. A key cannot exceed 64 characters in length, and a value cannot exceed 128 characters in length. Keys and values cannot start with aliyun, acs:, https://, or http://. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
     * </ul>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>taints</code> parameter of the <code>kubernetes_config</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The taints that you want to add to nodes. Taints can be used together with tolerations to avoid scheduling pods to specific nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
     */
    @NameInMap("taints")
    @Deprecated
    public java.util.List<Taint> taints;

    /**
     * <p>[<strong>Deprecated</strong>] By default, the system does not perform a rollback when the cluster fails to be created. You must manually delete the cluster that fails to be created.</p>
     * <p>Specifies the timeout period of cluster creation. Unit: minutes.</p>
     * <p>Default value: <code>60</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout_mins")
    @Deprecated
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
    @Deprecated
    public String userData;

    /**
     * <p>The virtual private cloud (VPC) in which you want to deploy the cluster. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zeik9h3ahvv2zz95****</p>
     */
    @NameInMap("vpcid")
    public String vpcid;

    /**
     * <p>The vSwitches for nodes in the cluster. This parameter is required if you create an ACK managed cluster that does not contain nodes.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>auto_renew</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>Specifies whether to enable auto-renewal for worker nodes. This parameter takes effect and is required only when <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
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
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>auto_renew_period</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The auto-renewal duration of worker nodes. This parameter takes effect and is required only if the subscription billing method is selected for worker nodes.</p>
     * <p>Valid values: 1, 2, 3, 6, and 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_auto_renew_period")
    @Deprecated
    public Long workerAutoRenewPeriod;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>data_disks</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The configurations of the data disks that you want to mount to worker nodes. The configurations include the disk category and disk size.</p>
     */
    @NameInMap("worker_data_disks")
    @Deprecated
    public java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>instance_charge_type</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
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
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>instance_types</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The instance configurations of worker nodes.</p>
     */
    @NameInMap("worker_instance_types")
    @Deprecated
    public java.util.List<String> workerInstanceTypes;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>period</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
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
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>period_unit</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The billing cycle of worker nodes. This parameter is required if worker_instance_charge_type is set to <code>PrePaid</code>.</p>
     * <p>Valid value: <code>Month</code>, which indicates that worker nodes are billed only on a monthly basis.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("worker_period_unit")
    @Deprecated
    public String workerPeriodUnit;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>system_disk_category</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The system disk category of worker nodes. For more information, see <a href="https://help.aliyun.com/document_detail/63136.html">Elastic Block Storage devices</a>.</p>
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
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>system_disk_performance_level</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>If the system disk is an ESSD, you can specify the PL of the ESSD. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
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
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>system_disk_size</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The system disk size of worker nodes. Unit: GiB.</p>
     * <p>Valid values: 40 to 500.</p>
     * <p>The value of this parameter must be at least 40 and greater than or equal to the image size.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("worker_system_disk_size")
    @Deprecated
    public Long workerSystemDiskSize;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>system_disk_snapshot_policy_id</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The ID of the automatic snapshot policy that is used by the system disk specified for worker nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    public String workerSystemDiskSnapshotPolicyId;

    /**
     * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>vswitch_ids</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
     * <p>The vSwitches for worker nodes. Each worker node is allocated a vSwitch.</p>
     * <p><code>worker_vswitch_ids</code> is optional, but <code>vswitch_ids</code> is required if you create an ACK managed cluster that does not contain nodes.</p>
     */
    @NameInMap("worker_vswitch_ids")
    @Deprecated
    public java.util.List<String> workerVswitchIds;

    /**
     * <p>[Deprecated] Use the <code>zone_ids</code> parameter instead.</p>
     * <p>The ID of the zone to which the cluster belongs. This parameter is specific to ACK Serverless clusters.</p>
     * <p>When you create an ACK managed cluster, you must set the <code>zone_id</code> parameter if <code>vpc_id</code> and <code>vswitch_ids</code> are not specified. This way, the system automatically creates a VPC in the specified zone. This parameter is invalid if you specify the <code>vpc_id</code> and <code>vswitch_ids</code> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beiji****</p>
     */
    @NameInMap("zone_id")
    @Deprecated
    public String zoneId;

    /**
     * <p>The IDs of the zone in which the cluster is deployed. This parameter is specific to ACK managed clusters.</p>
     * <p>When you create an ACK managed cluster, you must set the <code>zone_id</code> parameter if <code>vpc_id</code> and <code>vswitch_ids</code> are not specified. This way, the system automatically creates a VPC in the specified zone. This parameter is invalid if you specify the <code>vpc_id</code> and <code>vswitch_ids</code> parameters.</p>
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
        @NameInMap("enabled")
        public Boolean enabled;

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
         * <p>Specifies whether to enable auto-renewal for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal duration for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>The billing method of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("charge_type")
        public String chargeType;

        /**
         * <p>Specifies whether to install CloudMonitor on the node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cloud_monitor_flags")
        public Boolean cloudMonitorFlags;

        /**
         * <p>The CPU management policy of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The ID of the deployment set.</p>
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
         * <p>The type of the OS image.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance types of the nodes.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The name of the key pair. You must set this parameter or login_password.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The SSH logon password. The password must be 8 to 30 characters in length and contain a minimum of three of the following character types: uppercase letters, lowercase letters, digits, and special characters. You must set this parameter or key_pair.</p>
         * 
         * <strong>example:</strong>
         * <p>ack@Test</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The node port range.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>The subscription duration of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The unit of the subscription duration of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The container runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>Specifies whether to enable Alibaba Cloud Linux Security Hardening.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>true</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The system disk category for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The PL of the system disk that you want to use for the node. This parameter takes effect only for ESSDs.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The preset read/write IOPS of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The system disk size of the node. The value must be at least 40 GB.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The automatic snapshot policy of the node.</p>
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
         * <p>The automatic update frequency. Valid values:</p>
         * <ul>
         * <li>patch</li>
         * <li>stable</li>
         * <li>rapid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>patch</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Specifies whether to enable auto cluster update.</p>
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
         * <p>The configurations of auto cluster upgrade.</p>
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
         * <p>The data disk category.</p>
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
         * <p>The PL of the data disk. This parameter takes effect only for ESSDs. You can specify a higher PL if you increase the size of a data disk. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
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
