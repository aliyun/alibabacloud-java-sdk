// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The network access control list (ACL) of the SLB instance associated with the API server if the cluster is a registered cluster.</p>
     */
    @NameInMap("access_control_list")
    public java.util.List<String> accessControlList;

    /**
     * <p>The components that you want to install in the cluster. When you create a cluster, you can set the `addons` parameter to install specific components.</p>
     * <br>
     * <p>**Network plug-in**: required. The Flannel and Terway plug-ins are supported. Select one of the plug-ins for the cluster.</p>
     * <br>
     * <p>*   Specify the Flannel plug-in in the following format: \[{"name":"flannel","config":""}].</p>
     * <p>*   If you want to use the Terway component, specify the value in the \[{"Name": "terway-eniip","Config": ""}] format.</p>
     * <br>
     * <p>**Volume plug-in**: required. The `CSI` and `FlexVolume` volume plug-ins are supported.</p>
     * <br>
     * <p>*   Specify the `CSI` plug-in in the following format: \[{"name":"csi-plugin","config": ""},{"name": "csi-provisioner","config": ""}].</p>
     * <p>*   Specify the `FlexVolume` plug-in in the following format: \[{"name": "flexvolume","config": ""}].</p>
     * <br>
     * <p>**Simple Log Service component**: optional. We recommend that you enable Simple Log Service. If Simple Log Service is disabled, you cannot use the cluster auditing feature.</p>
     * <br>
     * <p>*   Use an existing `Simple Log Service project`: \[{"name": "logtail-ds","config": "{"IngressDashboardEnabled":"true","sls_project_name":"your_sls_project_name"}"}].</p>
     * <p>*   To create a `Simple Log Service project`, specify the component in the following format: \[{"name": "logtail-ds","config": "{"IngressDashboardEnabled":"true"}"}].</p>
     * <br>
     * <p>**Ingress controller**`: optional. By default, the nginx-ingress-controller component is installed in ACK dedicated clusters.`</p>
     * <br>
     * <p>*   To install nginx-ingress-controller and enable Internet access, specify the Ingress controller in the following format: \[{"name":"nginx-ingress-controller","config":"{"IngressSlbNetworkType":"internet"}"}].</p>
     * <p>*   To disable the system to automatically install nginx-ingress-controller, specify the component in the following format: \[{"name": "nginx-ingress-controller","config": "","disabled": true}].</p>
     * <br>
     * <p>**Event center**: optional. By default, the event center feature is enabled.</p>
     * <br>
     * <p>You can use Kubernetes event centers to store and query events and configure alerts. You can use the Logstores that are associated with Kubernetes event centers free of charge within 90 days. For more information, see [Create and use a Kubernetes event center](~~150476~~).</p>
     * <br>
     * <p>Enable the ack-node-problem-detector component in the following format: \[{"name":"ack-node-problem-detector","config":"{"sls_project_name":"your_sls_project_name"}"}].</p>
     */
    @NameInMap("addons")
    public java.util.List<Addon> addons;

    /**
     * <p>Service accounts provide identities for pods when pods communicate with the `API server` of the cluster. `api-audiences` are used by the `API server` to check whether the `tokens` of requests are legitimate.`` Separate multiple `audiences` with commas (,).</p>
     * <br>
     * <p>For more information about `ServiceAccount`, see [Enable service account token volume projection](~~160384~~).</p>
     */
    @NameInMap("api_audiences")
    public String apiAudiences;

    /**
     * <p>The billing method of the cluster. The following resources are billed on a subscription basis:</p>
     * <br>
     * <p>Elastic Compute Service (ECS) instances in node pools.</p>
     * <br>
     * <p>The internal-facing SLB instance used by the API server.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>PrePaid: subscription.</p>
     * <br>
     * <p>PostPaid: pay-as-you-go.</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("charge_type")
    public String chargeType;

    /**
     * <p>Specifies whether to enable Center for Internet Security (CIS) reinforcement. For more information, see [CIS reinforcement](~~223744~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   `true`: enables CIS reinforcement.</p>
     * <p>*   `false`: disables CIS reinforcement.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("cis_enabled")
    @Deprecated
    public Boolean cisEnabled;

    /**
     * <p>Specifies whether to install the CloudMonitor agent. Valid values:</p>
     * <br>
     * <p>*   `true`: installs the CloudMonitor agent.</p>
     * <p>*   `false`: does not install the CloudMonitor agent.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    /**
     * <p>The domain name of the cluster.</p>
     * <br>
     * <p>The domain name can contain one or more parts that are separated by periods (.). Each part cannot exceed 63 characters in length, and can contain lowercase letters, digits, and hyphens (-). Each part must start and end with a lowercase letter or digit.</p>
     */
    @NameInMap("cluster_domain")
    public String clusterDomain;

    /**
     * <p>After you set `cluster_type` to `ManagedKubernetes` and configure the `profile` parameter, you can further specify the edition of the cluster. Valid values:</p>
     * <br>
     * <p>*   `ack.pro.small`: Pro.</p>
     * <p>*   `ack.standard`: Basic. If you leave the parameter empty, the Basic edition is selected.</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>*   `Kubernetes`: ACK dedicated cluster.</p>
     * <p>*   `ManagedKubernetes`: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless clusters (Basic and Pro), ACK Edge clusters (Basic and Pro), and ACK Lingjun clusters (Pro).</p>
     * <p>*   `ExternalKubernetes`: registered cluster.</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The CIDR block of pods. You can specify 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16, or their subnets as the CIDR block of pods. The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.</p>
     * <br>
     * <p>For more information about subnetting for ACK clusters, see [Plan CIDR blocks for an ACK cluster that is deployed in a VPC](~~86500~~).</p>
     * <br>
     * <p>>  This parameter is required if the cluster uses the Flannel plug-in.</p>
     */
    @NameInMap("container_cidr")
    public String containerCidr;

    /**
     * <p>The list of control plane components for which you want to enable log collection.</p>
     * <br>
     * <p>By default, the log of kube-apiserver, kube-controller-manager, and kube-scheduler is collected.</p>
     */
    @NameInMap("controlplane_log_components")
    public java.util.List<String> controlplaneLogComponents;

    /**
     * <p>The Simple Log Service project that is used to store the logs of control plane components. You can use an existing project or create one. If you choose to create a Simple Log Service project, the created project is named in the `k8s-log-{ClusterID}` format.</p>
     */
    @NameInMap("controlplane_log_project")
    public String controlplaneLogProject;

    /**
     * <p>The retention period of control plane logs in days.</p>
     */
    @NameInMap("controlplane_log_ttl")
    public String controlplaneLogTtl;

    /**
     * <p>The CPU management policy of the nodes in the node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:</p>
     * <br>
     * <p>*   `static`: allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.</p>
     * <p>*   `none`: specifies that the default CPU affinity is used.</p>
     * <br>
     * <p>Default value: `none`.</p>
     */
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    /**
     * <p>Specifies custom subject alternative names (SANs) for the API server certificate to accept requests from specified IP addresses or domain names. Multiple IP addresses and domain names are separated by commas (,).</p>
     */
    @NameInMap("custom_san")
    public String customSan;

    /**
     * <p>Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the console or by calling API operations. Valid values:</p>
     * <br>
     * <p>*   `true`: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the Container Service console or by calling API operations.</p>
     * <p>*   `false`: disables deletion protection for the cluster. This way, the cluster can be deleted in the Container Service console or by calling API operations.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform a rollback if the cluster fails to be created. Valid values:</p>
     * <br>
     * <p>*   `true`: performs a rollback if the system fails to create the cluster.</p>
     * <p>*   `false`: does not perform a rollback if the system fails to create the cluster.</p>
     * <br>
     * <p>Default value: `true`.</p>
     */
    @NameInMap("disable_rollback")
    @Deprecated
    public Boolean disableRollback;

    /**
     * <p>Specifies whether to enable the RAM Roles for Service Accounts (RRSA) feature.</p>
     */
    @NameInMap("enable_rrsa")
    public Boolean enableRrsa;

    /**
     * <p>The ID of a key that is managed by Key Management Service (KMS). The key is used to encrypt data disks. For more information, see [KMS](~~28935~~).</p>
     * <br>
     * <p>>  The key can be used only in ACK Pro clusters.</p>
     */
    @NameInMap("encryption_provider_key")
    public String encryptionProviderKey;

    /**
     * <p>Specifies whether to enable Internet access for the cluster. You can use an elastic IP address (EIP) to expose the API server. This way, you can access the cluster over the Internet. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Internet access.</p>
     * <p>*   `false`: disables Internet access. If you set this parameter to false, the API server cannot be accessed over the Internet.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("endpoint_public_access")
    public Boolean endpointPublicAccess;

    /**
     * <p>Specifies whether to mount a data disk to a node that is created based on an existing ECS instance. Valid values:</p>
     * <br>
     * <p>*   `true`: stores the data of containers and images on a data disk. Back up the existing data on the data disk first.</p>
     * <p>*   `false`: does not store the data of containers and images on a data disk.</p>
     * <br>
     * <p>Default value: `false`.</p>
     * <br>
     * <p>How to mount a data disk:</p>
     * <br>
     * <p>*   If an ECS instance has data disks mounted and the file system of the last data disk is not initialized, the system automatically formats the data disk to ext4. Then, the system mounts the data disk to /var/lib/docker and /var/lib/kubelet.</p>
     * <p>*   If no data disk is mounted to the ECS instance, the system does not purchase a new data disk.</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>Specifies a custom image for nodes. By default, the image provided by ACK is used. You can select a custom image to replace the default image. For more information, see [Custom images](~~146647~~).</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The type of OS distribution that you want to use. To specify the node OS, we recommend that you use this parameter. Valid values:</p>
     * <br>
     * <p>*   CentOS</p>
     * <p>*   AliyunLinux</p>
     * <p>*   AliyunLinux Qboot</p>
     * <p>*   AliyunLinuxUEFI</p>
     * <p>*   AliyunLinux3</p>
     * <p>*   Windows</p>
     * <p>*   WindowsCore</p>
     * <p>*   AliyunLinux3Arm64</p>
     * <p>*   ContainerOS</p>
     * <br>
     * <p>Default value: `CentOS`.</p>
     */
    @NameInMap("image_type")
    public String imageType;

    /**
     * <p>The list of existing ECS instances that are specified as worker nodes for the cluster.</p>
     * <br>
     * <p>>  This parameter is required when you create worker nodes on existing ECS instances.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    /**
     * <p>The cluster ip_stack.</p>
     */
    @NameInMap("ip_stack")
    public String ipStack;

    /**
     * <p>Specifies whether to create an advanced security group. This parameter takes effect only if `security_group_id` is left empty.</p>
     * <br>
     * <p>>  To use a basic security group, make sure that the sum of the number of nodes in the cluster and the number of pods that use Terway does not exceed 2,000. Therefore, we recommend that you specify an advanced security group for a cluster that has Terway installed.</p>
     * <br>
     * <p>*   `true`: creates an advanced security group.</p>
     * <p>*   `false`: does not create an advanced security group.</p>
     * <br>
     * <p>Default value: `true`.</p>
     */
    @NameInMap("is_enterprise_security_group")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>Specifies whether to retain the names of existing ECS instances that are used in the cluster. Valid values:</p>
     * <br>
     * <p>*   `true`: retains the names.</p>
     * <p>*   `false`: does not retain the names. The new names are assigned by the system.</p>
     * <br>
     * <p>Default value: `true`.</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The name of the key pair. You must set this parameter or the `login_password` parameter.</p>
     */
    @NameInMap("key_pair")
    public String keyPair;

    /**
     * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not specify this parameter, the latest Kubernetes version is used.</p>
     * <br>
     * <p>You can create clusters of the latest two Kubernetes versions in the ACK console. If you want to create clusters that run earlier Kubernetes versions, use the API. For more information about the Kubernetes versions supported by ACK, see [Release notes on Kubernetes versions](~~185269~~).</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>The specification of the Server Load Balancer (SLB) instance. Valid values:</p>
     * <br>
     * <p>*   slb.s1.small</p>
     * <p>*   slb.s2.small</p>
     * <p>*   slb.s2.medium</p>
     * <p>*   slb.s3.small</p>
     * <p>*   slb.s3.medium</p>
     * <p>*   slb.s3.large</p>
     * <br>
     * <p>Default value: `slb.s2.small`.</p>
     */
    @NameInMap("load_balancer_spec")
    public String loadBalancerSpec;

    /**
     * <p>Enables Simple Log Service for the cluster. This parameter takes effect only on ACK Serverless clusters. Set the value to `SLS`.</p>
     */
    @NameInMap("logging_type")
    public String loggingType;

    /**
     * <p>The password for SSH logon. You must set this parameter or `key_pair`. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     */
    @NameInMap("login_password")
    public String loginPassword;

    /**
     * <p>Specifies whether to enable auto-renewal for master nodes. This parameter takes effect only if `master_instance_charge_type` is set to `PrePaid`. Valid values:</p>
     * <br>
     * <p>*   `true`: enables auto-renewal.</p>
     * <p>*   `false`: disables auto-renewal.</p>
     * <br>
     * <p>Default value: `true`.</p>
     */
    @NameInMap("master_auto_renew")
    public Boolean masterAutoRenew;

    /**
     * <p>The cycle of auto-renewal. This parameter takes effect and is required only if the subscription billing method is selected for master nodes.</p>
     * <br>
     * <p>Valid values: 1, 2, 3, 6, and 12.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("master_auto_renew_period")
    public Long masterAutoRenewPeriod;

    /**
     * <p>The number of master nodes. Valid values: `3` and `5`.</p>
     * <br>
     * <p>Default value: `3`.</p>
     */
    @NameInMap("master_count")
    public Long masterCount;

    /**
     * <p>The billing method of master nodes. Valid values:</p>
     * <br>
     * <p>*   `PrePaid`: subscription.</p>
     * <p>*   `PostPaid`: pay-as-you-go.</p>
     * <br>
     * <p>Default value: `PostPaid`.</p>
     */
    @NameInMap("master_instance_charge_type")
    public String masterInstanceChargeType;

    /**
     * <p>The instance types of master nodes. For more information, see [Overview of instance families](~~25378~~).</p>
     */
    @NameInMap("master_instance_types")
    public java.util.List<String> masterInstanceTypes;

    /**
     * <p>The subscription duration of master nodes. This parameter takes effect and is required only if `master_instance_charge_type` is set to `PrePaid`.</p>
     * <br>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("master_period")
    public Long masterPeriod;

    /**
     * <p>The billing cycle of master nodes. This parameter is required if master_instance_charge_type is set to `PrePaid`.</p>
     * <br>
     * <p>Set the value to `Month`. Master nodes are billed only on a monthly basis.</p>
     */
    @NameInMap("master_period_unit")
    public String masterPeriodUnit;

    /**
     * <p>The type of system disk that you want to use for the master nodes. Valid values:</p>
     * <br>
     * <p>*   `cloud_efficiency`: ultra disk.</p>
     * <p>*   `cloud_ssd`: standard SSD.</p>
     * <p>*   `cloud_essd`: enhanced SSD (ESSD).</p>
     * <br>
     * <p>Default value: `cloud_ssd`. The default value may vary in different zones.</p>
     */
    @NameInMap("master_system_disk_category")
    public String masterSystemDiskCategory;

    /**
     * <p>The performance level (PL) of the system disk that you want to use for master nodes. This parameter takes effect only for ESSDs. For more information about the relationship between disk PLs and disk sizes, see [ESSDs](~~122389~~).</p>
     */
    @NameInMap("master_system_disk_performance_level")
    public String masterSystemDiskPerformanceLevel;

    /**
     * <p>The size of the system disk that is specified for master nodes. Valid values: 40 to 500. Unit: GiB.</p>
     * <br>
     * <p>Default value: `120`.</p>
     */
    @NameInMap("master_system_disk_size")
    public Long masterSystemDiskSize;

    /**
     * <p>The ID of the automatic snapshot policy that is used by the system disk specified for master nodes.</p>
     */
    @NameInMap("master_system_disk_snapshot_policy_id")
    public String masterSystemDiskSnapshotPolicyId;

    /**
     * <p>The IDs of the vSwitches that are specified for master nodes. You can specify up to three vSwitches. We recommend that you specify three vSwitches in different zones to ensure high availability.</p>
     * <br>
     * <p>The number of vSwitches must be the same as that specified in `master_count` and the same as those specified in `master_vswitch_ids`.</p>
     */
    @NameInMap("master_vswitch_ids")
    public java.util.List<String> masterVswitchIds;

    /**
     * <p>The cluster name.</p>
     * <br>
     * <p>The cluster name must be 1 to 63 characters in length, and can contain digits, letters, and underscores (\_). The cluster name must not start with a hyphen (-).</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether to create a NAT gateway and configure SNAT rules when the system creates the ACK Serverless cluster. Valid values:</p>
     * <br>
     * <p>*   `true`: automatically creates a NAT gateway and configures SNAT rules. This enables Internet access for the VPC in which the cluster is deployed.</p>
     * <p>*   `false`: does not create a NAT gateway or configure SNAT rules. In this case, the cluster in the VPC cannot access the Internet.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("nat_gateway")
    public Boolean natGateway;

    /**
     * <p>The maximum number of IP addresses that can be assigned to nodes. This number is determined by the node CIDR block. This parameter takes effect only if the cluster uses Flannel as the network plug-in.</p>
     * <br>
     * <p>Default value: `26`.</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p>The name of the custom node.</p>
     * <br>
     * <p>A node name consists of a prefix, an IP substring, and a suffix.</p>
     * <br>
     * <p>*   The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-), and must start and end with a lowercase letter or digit.</p>
     * <p>*   The IP substring length specifies the number of digits to be truncated from the end of the node IP address. The IP substring length ranges from 5 to 12.</p>
     * <br>
     * <p>For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.</p>
     */
    @NameInMap("node_name_mode")
    public String nodeNameMode;

    /**
     * <p>The node port range. Valid values: 30000 to 65535.</p>
     * <br>
     * <p>Default value: `30000-32767`.</p>
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
     */
    @NameInMap("num_of_nodes")
    @Deprecated
    public Long numOfNodes;

    /**
     * <p>The type of OS. Valid values:</p>
     * <br>
     * <p>*   Windows</p>
     * <p>*   Linux</p>
     * <br>
     * <p>Default value: `Linux`.</p>
     */
    @NameInMap("os_type")
    public String osType;

    /**
     * <p>The subscription duration. This parameter takes effect and is required only when you set charge_type to PrePaid.</p>
     * <br>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("period")
    public Long period;

    /**
     * <p>The billing cycle. This parameter is required if charge_type is set to PrePaid.</p>
     * <br>
     * <p>Set the value to Month. Master nodes are billed only on a monthly basis.</p>
     */
    @NameInMap("period_unit")
    public String periodUnit;

    /**
     * <p>The OS distribution that is used. Valid values:</p>
     * <br>
     * <p>*   CentOS</p>
     * <p>*   AliyunLinux</p>
     * <p>*   QbootAliyunLinux</p>
     * <p>*   Qboot</p>
     * <p>*   Windows</p>
     * <p>*   WindowsCore</p>
     * <br>
     * <p>Default value: `CentOS`.</p>
     */
    @NameInMap("platform")
    public String platform;

    /**
     * <p>The list of pod vSwitches. You need to specify at least one pod vSwitch for each node vSwitch and the pod vSwitches must not be the same as the node vSwitches (`vswitch`). We recommend that you specify pod vSwitches whose mask lengths are no longer than 19.</p>
     * <br>
     * <p>>  The `pod_vswitch_ids` parameter is required if the cluster uses Terway as the network plug-in.</p>
     */
    @NameInMap("pod_vswitch_ids")
    public java.util.List<String> podVswitchIds;

    /**
     * <p>If you set `cluster_type` to `ManagedKubernetes`, an ACK managed cluster is created. In this case, you can further specify the cluster edition. Valid values:</p>
     * <br>
     * <p>*   `Default`. ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</p>
     * <p>*   `Edge`: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</p>
     * <p>*   `Serverless`: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</p>
     * <p>*   `Lingjun`: ACK Lingjun Pro cluster.</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The kube-proxy mode. Valid values:</p>
     * <br>
     * <p>*   `iptables`: iptables is a kube-proxy mode. It uses iptables rules to conduct Service discovery and load balancing. The performance of this mode is limited by the size of the cluster. This mode is suitable for clusters that run a small number of Services.</p>
     * <p>*   `ipvs`: provides high performance and uses IP Virtual Server (IPVS). This allows you to configure service discovery and load balancing. This mode is suitable for clusters that are required to run a large number of services. We recommend that you use this mode in scenarios when high load balancing performance is required.</p>
     * <br>
     * <p>Default value: `ipvs`.</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p>The list of ApsaraDB RDS instances. Select the ApsaraDB RDS instances that you want to add to the whitelist. We recommend that you add the CIDR block of pods and CIDR block of nodes to the ApsaraDB RDS instances in the ApsaraDB RDS console. When you set the ApsaraDB RDS instances, you cannot scale out the number of nodes because the instances are not in the Running state.</p>
     */
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    /**
     * <p>The ID of the region in which the cluster is deployed.</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the cluster belongs. You can use resource groups to isolate clusters.</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>The container runtime. The default container runtime is Docker. containerd and Sandboxed-Container are also supported.</p>
     * <br>
     * <p>For more information about how to select a proper container runtime, see [How to select between Docker and Sandboxed-Container](~~160313~~).</p>
     */
    @NameInMap("runtime")
    public Runtime runtime;

    /**
     * <p>The ID of an existing security group. You need to choose between this parameter and the `is_enterprise_security_group` parameter. Cluster nodes are automatically added to the security group.</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    @NameInMap("security_hardening_os")
    public Boolean securityHardeningOs;

    /**
     * <p>Service accounts provide identities for pods when pods communicate with the `API server` of the cluster. `service-account-issuer` is the issuer of the `serviceaccount token`, which corresponds to the `iss` field in the `token payload`.</p>
     * <br>
     * <p>For more information about `ServiceAccount`, see [Enable service account token volume projection](~~160384~~).</p>
     */
    @NameInMap("service_account_issuer")
    public String serviceAccountIssuer;

    /**
     * <p>The CIDR block of Services. Valid values: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The CIDR block of Services cannot overlap with the CIDR block of the VPC (10.1.0.0/21) or the CIDR blocks of existing clusters in the VPC. You cannot modify the CIDR block of Services after the cluster is created.</p>
     * <br>
     * <p>By default, the CIDR block of Services is set to 172.19.0.0/20.</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p>The type of service discovery that is implemented in the `ACK Serverless` cluster.</p>
     * <br>
     * <p>*   `CoreDNS`: CoreDNS is a standard service discovery plug-in that is provided by open source Kubernetes. To use DNS resolution, you must provision pods. By default, two elastic container instances are used. The specification of each instance is 0.25 vCores and 512 MiB of memory.</p>
     * <p>*   `PrivateZone`: a DNS resolution service provided by Alibaba Cloud. You must activate Alibaba Cloud DNS PrivateZone before you can use it for service discovery.</p>
     * <br>
     * <p>By default, this parameter is not specified.</p>
     */
    @NameInMap("service_discovery_types")
    public java.util.List<String> serviceDiscoveryTypes;

    /**
     * <p>Specifies whether to configure Source Network Address Translation (SNAT) rules for the VPC where your cluster is deployed. Valid values:</p>
     * <br>
     * <p>*   `true`: automatically creates a NAT gateway and configures SNAT rules. Set this parameter to `true` if nodes and applications in the cluster need to access the Internet.</p>
     * <p>*   `false`: does not create a NAT gateway or configure SNAT rules. In this case, nodes and applications in the cluster cannot access the Internet.</p>
     * <br>
     * <p>>  If this feature is disabled when you create the cluster, you can also manually enable this feature after you create the cluster. For more information, see [Manually create a NAT gateway and configure SNAT rules](~~178480~~).</p>
     * <br>
     * <p>Default value: `true`.</p>
     */
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    /**
     * <p>Specifies whether to enable reinforcement based on Multi-Level Protection Scheme (MLPS). For more information, see [ACK reinforcement based on classified protection](~~196148~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   `true`: enables reinforcement based on MLPS.</p>
     * <p>*   `false`: disables reinforcement based on MLPS.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("soc_enabled")
    public Boolean socEnabled;

    /**
     * <p>Specifies whether to enable SSH logon. If this parameter is set to true, you can log on to master nodes in an ACK dedicated cluster over the Internet. This parameter does not take effect in ACK managed clusters. Valid values:</p>
     * <br>
     * <p>*   `true`: enables SSH logon.</p>
     * <p>*   `false`: disables SSH logon.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    /**
     * <p>The tags to be added to nodes. You must add tags based on the following rules:</p>
     * <br>
     * <p>*   A tag is a case-sensitive key-value pair. You can add up to 20 tags.</p>
     * <p>*   When you add a tag, you must specify a unique key but you can leave the value empty. A key cannot exceed 64 characters in length and a value cannot exceed 128 characters in length. Keys and values cannot start with aliyun, acs:, https://, or http://. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The taints of the nodes in the node pool. Taints can be used together with tolerations to avoid scheduling pods to specified nodes. For more information, see [taint-and-toleration](https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/).</p>
     */
    @NameInMap("taints")
    public java.util.List<Taint> taints;

    /**
     * <p>Specifies the timeout period of cluster creation. Unit: minutes.</p>
     * <br>
     * <p>Default value: `60`.</p>
     */
    @NameInMap("timeout_mins")
    public Long timeoutMins;

    /**
     * <p>The time zone of the cluster.</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The custom Certificate Authority (CA) certificate used by the cluster.</p>
     */
    @NameInMap("user_ca")
    public String userCa;

    /**
     * <p>The user data of nodes.</p>
     */
    @NameInMap("user_data")
    public String userData;

    /**
     * <p>The virtual private cloud (VPC) in which you want to deploy the cluster. This parameter is required.</p>
     */
    @NameInMap("vpcid")
    public String vpcid;

    /**
     * <p>The vSwitches that are specified for nodes in the cluster. This parameter is required when you create an ACK managed cluster that does not contain nodes.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>Specifies whether to enable auto renewal for worker nodes. This parameter takes effect and is required only if `worker_instance_charge_type` is set to `PrePaid`. Valid values:</p>
     * <br>
     * <p>*   `true`: enables auto-renewal.</p>
     * <p>*   `false`: disables auto-renewal.</p>
     * <br>
     * <p>Default value: `true`.</p>
     */
    @NameInMap("worker_auto_renew")
    @Deprecated
    public Boolean workerAutoRenew;

    /**
     * <p>The cycle of auto-renewal. This parameter takes effect and is required only if the subscription billing method is selected for worker nodes.</p>
     * <br>
     * <p>Valid values: 1, 2, 3, 6, and 12.</p>
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
     * <br>
     * <p>*   `PrePaid`: subscription.</p>
     * <p>*   `PostPaid`: pay-as-you-go.</p>
     * <br>
     * <p>Default value: PostPaid.</p>
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
     * <p>The subscription duration of worker nodes. This parameter takes effect and is required only if `worker_instance_charge_type` is set to `PrePaid`.</p>
     * <br>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("worker_period")
    @Deprecated
    public Long workerPeriod;

    /**
     * <p>The billing cycle of worker nodes. This parameter is required if worker_instance_charge_type is set to `PrePaid`.</p>
     * <br>
     * <p>Set the value to `Month`. Worker nodes are billed only on a monthly basis.</p>
     */
    @NameInMap("worker_period_unit")
    @Deprecated
    public String workerPeriodUnit;

    /**
     * <p>The category of the system disks for worker nodes. For more information, see [Elastic Block Storage devices](~~63136~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   `cloud_efficiency`: ultra disk.</p>
     * <p>*   `cloud_ssd`: standard SSD.</p>
     * <br>
     * <p>Default value: `cloud_ssd`.</p>
     */
    @NameInMap("worker_system_disk_category")
    @Deprecated
    public String workerSystemDiskCategory;

    /**
     * <p>If the system disk is an ESSD, you can set the PL of the ESSD. For more information, see [Enhanced SSDs](~~122389~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PL0</p>
     * <p>*   PL1</p>
     * <p>*   PL2</p>
     * <p>*   PL3</p>
     */
    @NameInMap("worker_system_disk_performance_level")
    @Deprecated
    public String workerSystemDiskPerformanceLevel;

    /**
     * <p>The system disk size of worker nodes. Unit: GiB.</p>
     * <br>
     * <p>Valid values: 40 to 500.</p>
     * <br>
     * <p>The value of this parameter must be at least 40 and no less than the image size.</p>
     * <br>
     * <p>Default value: `120`.</p>
     */
    @NameInMap("worker_system_disk_size")
    @Deprecated
    public Long workerSystemDiskSize;

    /**
     * <p>The ID of the automatic snapshot policy that is used by the system disk specified for worker nodes.</p>
     */
    @NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    public String workerSystemDiskSnapshotPolicyId;

    /**
     * <p>The list of vSwitches that are specified for nodes. Each node is allocated a vSwitch.</p>
     * <br>
     * <p>The `worker_vswitch_ids` parameter is optional but the `vswitch_ids` parameter is required when you create an ACK managed cluster that does not contain nodes.</p>
     */
    @NameInMap("worker_vswitch_ids")
    @Deprecated
    public java.util.List<String> workerVswitchIds;

    /**
     * <p>The ID of the zone to which the cluster belongs. This parameter takes effect in only ACK Serverless clusters.</p>
     * <br>
     * <p>When you create an ACK Serverless cluster, you must configure `zone_id` if `vpc_id` and `vswitch_ids` are not configured. This way, the system automatically creates a VPC in the specified zone.</p>
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
         * <p>The data disk type.</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Specifies whether to encrypt a data disk. Valid values:</p>
         * <br>
         * <p>*   `true`: encrypts a data disk.</p>
         * <p>*   `false`: does not encrypt a data disk.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("encrypted")
        public String encrypted;

        /**
         * <p>The PL of a data disk. This parameter takes effect only for ESSDs. You can specify a higher PL if you increase the size of the system disk. For more information, see [Enhanced SSDs](~~122389~~).</p>
         */
        @NameInMap("performance_level")
        public String performanceLevel;

        /**
         * <p>The size of the data disk. Valid values: 40 to 32767.</p>
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
