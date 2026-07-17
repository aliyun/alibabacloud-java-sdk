// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterRequest extends TeaModel {
    /**
     * <p>The access control list for the registered cluster API Server SLB.</p>
     */
    @NameInMap("access_control_list")
    @Deprecated
    public java.util.List<String> accessControlList;

    /**
     * <p>The custom API Server certificate Subject Alternative Name (SAN). This parameter adds custom IP addresses or domain names to the SAN field of the cluster API Server certificate for client access control.</p>
     * <p>Only managed clusters support this parameter.</p>
     */
    @NameInMap("api_server_custom_cert_sans")
    public ModifyClusterRequestApiServerCustomCertSans apiServerCustomCertSans;

    /**
     * <p>Indicates whether an Elastic IP Address (EIP) is attached to the cluster for public network access to the API server. Valid values:</p>
     * <ul>
     * <li><code>true</code>: An EIP is attached to the cluster.</li>
     * <li><code>false</code>: No EIP is attached to the cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("api_server_eip")
    public Boolean apiServerEip;

    /**
     * <p>The instance ID of the EIP attached to the cluster API Server. This parameter takes effect only when <code>api_server_eip</code> is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-wz9fnasl6dsfhmvci****</p>
     */
    @NameInMap("api_server_eip_id")
    public String apiServerEipId;

    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>af31042c-6355-495b-b6e3-exxb9669</p>
     */
    @NameInMap("client_token")
    public String clientToken;

    /**
     * <p>The custom cluster name. The name can contain digits, Chinese characters, letters, and hyphens (-). It must be 1 to 63 characters in length and cannot start with a hyphen (-).</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-new-name</p>
     */
    @NameInMap("cluster_name")
    public String clusterName;

    /**
     * <p>The cluster specification when <code>cluster_type</code> is set to <code>ManagedKubernetes</code> and <code>profile</code> is configured. Valid values:</p>
     * <ul>
     * <li><code>ack.pro.small</code>: Pro</li>
     * <li><code>ack.pro.xlarge</code>: Pro XL</li>
     * <li><code>ack.pro.2xlarge</code>: Pro 2XL</li>
     * <li><code>ack.pro.4xlarge</code>: Pro 4XL (contact customer service to be added to the whitelist)</li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>. By pre-allocating and dedicating control plane resources, these tiers ensure that API concurrency and pod scheduling capabilities remain at a consistently high level. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For information about the cluster management fees for Pro and provisioned control plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The dedicated cluster control plane configuration.</p>
     */
    @NameInMap("control_plane_config")
    public ModifyClusterRequestControlPlaneConfig controlPlaneConfig;

    /**
     * <p>The cluster connection configuration.</p>
     */
    @NameInMap("control_plane_endpoints_config")
    public ModifyClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster to prevent accidental deletion through the console or API. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enables cluster deletion protection. The cluster cannot be deleted through the console or API.</li>
     * <li><code>false</code>: Disables cluster deletion protection. The cluster can be deleted through the console or API.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to enable or disable the RAM Roles for Service Accounts (RRSA) feature. Only managed clusters support this parameter. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enabled.</li>
     * <li><code>false</code>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable_rrsa")
    public Boolean enableRrsa;

    /**
     * <p>Specifies whether to rebind the cluster test domain name. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Rebinds the cluster test domain name.</li>
     * <li><code>false</code>: Does not rebind the cluster test domain name.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ingress_domain_rebinding")
    @Deprecated
    public Boolean ingressDomainRebinding;

    /**
     * <p>The SLB instance ID of the cluster to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-wz97kes8tnndkpodw****</p>
     */
    @NameInMap("ingress_loadbalancer_id")
    @Deprecated
    public String ingressLoadbalancerId;

    /**
     * <p>Specifies whether to enable instance deletion protection to prevent accidental deletion of nodes through the console or API. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Nodes cannot be accidentally deleted through the console or API.</li>
     * <li><code>false</code>: Nodes can be accidentally deleted through the console or API.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("instance_deletion_protection")
    @Deprecated
    public Boolean instanceDeletionProtection;

    /**
     * <p>The maintenance window configuration for the cluster. This feature takes effect only for ACK Pro clusters.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p>The cluster automatic O&amp;M policy.</p>
     */
    @NameInMap("operation_policy")
    public ModifyClusterRequestOperationPolicy operationPolicy;

    /**
     * <p>The resource group ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyvw3wjm****</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>The control plane security group ID.</p>
     * <ul>
     * <li>If you have configured blocking rules in the security group, ensure that the security group rules allow the protocols and ports required by the cluster. For information about recommended security group rules, see <a href="https://help.aliyun.com/document_detail/353191.html">Configure and manage cluster security groups</a>.</li>
     * <li>For non-ACK dedicated clusters, the cluster control plane and installed managed components (such as terway-controlplane) briefly restart during the procedure. Perform this operation during off-peak hours. After the control plane security group is changed, the network interface controllers (NICs) used by the cluster control plane and installed managed components are automatically added to the new security group.</li>
     * <li>For ACK dedicated clusters, after the control plane security group is changed, newly scaled-out master nodes automatically use the new control plane security group. Existing control plane nodes are not affected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1h6rk3pgct2a08***</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p>The system event storage configuration.</p>
     */
    @NameInMap("system_events_logging")
    public ModifyClusterRequestSystemEventsLogging systemEventsLogging;

    /**
     * <p>The cluster time zone. See <a href="https://help.aliyun.com/document_detail/354879.html">Supported time zones</a>.</p>
     * <ul>
     * <li><p>After the time zone is changed, the cluster inspection configuration uses the new time zone settings.</p>
     * </li>
     * <li><p>For managed clusters, the cluster control plane and installed managed components (such as terway-controlplane) briefly restart during the change. Perform this operation during off-peak hours. After the time zone is changed, newly scaled-out nodes automatically use the new time zone settings. Existing nodes are not affected. You can use the node pool node reset feature to apply the new settings to existing nodes.</p>
     * </li>
     * <li><p>For dedicated clusters, after the time zone is changed, newly scaled-out nodes (including control plane nodes) automatically use the new time zone settings. Existing nodes (including control plane nodes) are not affected. You can use the node pool node reset feature to apply the new settings to existing nodes. For control plane nodes, scale out and then scale in to apply the new settings to all control plane nodes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The vSwitches for the cluster control plane. For dedicated clusters, the change applies to newly scaled-out control plane nodes. When changing control plane vSwitches for managed clusters, note the following:</p>
     * <ul>
     * <li>This parameter performs a full overwrite. Specify the complete list of target vSwitches.</li>
     * <li>Control plane components briefly restart during the change. Proceed with caution.</li>
     * <li>Ensure that all security groups of the cluster (including the control plane security group, security groups of all node pools, and security groups used by the container network) allow inbound and outbound traffic for the IP CIDR blocks of the new vSwitches to prevent nodes and containers from losing connectivity to the API server.</li>
     * <li>If the new control plane vSwitches have ACL rules configured, ensure that the ACL rules allow communication with the CIDR blocks of cluster nodes and the container network.</li>
     * </ul>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    public static ModifyClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterRequest self = new ModifyClusterRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public ModifyClusterRequest setAccessControlList(java.util.List<String> accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }
    public java.util.List<String> getAccessControlList() {
        return this.accessControlList;
    }

    public ModifyClusterRequest setApiServerCustomCertSans(ModifyClusterRequestApiServerCustomCertSans apiServerCustomCertSans) {
        this.apiServerCustomCertSans = apiServerCustomCertSans;
        return this;
    }
    public ModifyClusterRequestApiServerCustomCertSans getApiServerCustomCertSans() {
        return this.apiServerCustomCertSans;
    }

    public ModifyClusterRequest setApiServerEip(Boolean apiServerEip) {
        this.apiServerEip = apiServerEip;
        return this;
    }
    public Boolean getApiServerEip() {
        return this.apiServerEip;
    }

    public ModifyClusterRequest setApiServerEipId(String apiServerEipId) {
        this.apiServerEipId = apiServerEipId;
        return this;
    }
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    public ModifyClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ModifyClusterRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public ModifyClusterRequest setControlPlaneConfig(ModifyClusterRequestControlPlaneConfig controlPlaneConfig) {
        this.controlPlaneConfig = controlPlaneConfig;
        return this;
    }
    public ModifyClusterRequestControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
    }

    public ModifyClusterRequest setControlPlaneEndpointsConfig(ModifyClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig) {
        this.controlPlaneEndpointsConfig = controlPlaneEndpointsConfig;
        return this;
    }
    public ModifyClusterRequestControlPlaneEndpointsConfig getControlPlaneEndpointsConfig() {
        return this.controlPlaneEndpointsConfig;
    }

    public ModifyClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyClusterRequest setEnableRrsa(Boolean enableRrsa) {
        this.enableRrsa = enableRrsa;
        return this;
    }
    public Boolean getEnableRrsa() {
        return this.enableRrsa;
    }

    @Deprecated
    public ModifyClusterRequest setIngressDomainRebinding(Boolean ingressDomainRebinding) {
        this.ingressDomainRebinding = ingressDomainRebinding;
        return this;
    }
    public Boolean getIngressDomainRebinding() {
        return this.ingressDomainRebinding;
    }

    @Deprecated
    public ModifyClusterRequest setIngressLoadbalancerId(String ingressLoadbalancerId) {
        this.ingressLoadbalancerId = ingressLoadbalancerId;
        return this;
    }
    public String getIngressLoadbalancerId() {
        return this.ingressLoadbalancerId;
    }

    @Deprecated
    public ModifyClusterRequest setInstanceDeletionProtection(Boolean instanceDeletionProtection) {
        this.instanceDeletionProtection = instanceDeletionProtection;
        return this;
    }
    public Boolean getInstanceDeletionProtection() {
        return this.instanceDeletionProtection;
    }

    public ModifyClusterRequest setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }
    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public ModifyClusterRequest setOperationPolicy(ModifyClusterRequestOperationPolicy operationPolicy) {
        this.operationPolicy = operationPolicy;
        return this;
    }
    public ModifyClusterRequestOperationPolicy getOperationPolicy() {
        return this.operationPolicy;
    }

    public ModifyClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyClusterRequest setSystemEventsLogging(ModifyClusterRequestSystemEventsLogging systemEventsLogging) {
        this.systemEventsLogging = systemEventsLogging;
        return this;
    }
    public ModifyClusterRequestSystemEventsLogging getSystemEventsLogging() {
        return this.systemEventsLogging;
    }

    public ModifyClusterRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public ModifyClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public static class ModifyClusterRequestApiServerCustomCertSans extends TeaModel {
        /**
         * <p>Specifies whether to overwrite or append the SAN configuration. Valid values:</p>
         * <ul>
         * <li>overwrite: overwrites the existing configuration.</li>
         * <li>append: appends to the existing configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>append</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The SAN list.</p>
         */
        @NameInMap("subject_alternative_names")
        public java.util.List<String> subjectAlternativeNames;

        public static ModifyClusterRequestApiServerCustomCertSans build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterRequestApiServerCustomCertSans self = new ModifyClusterRequestApiServerCustomCertSans();
            return TeaModel.build(map, self);
        }

        public ModifyClusterRequestApiServerCustomCertSans setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ModifyClusterRequestApiServerCustomCertSans setSubjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public java.util.List<String> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

    }

    public static class ModifyClusterRequestControlPlaneConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal for control plane node instances. This parameter takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables auto-renewal.</li>
         * <li><code>false</code>: Disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal duration for each renewal cycle of control plane node instances.</p>
         * <p>Valid values: {1, 2, 3, 6, 12}. Unit: months.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>The billing method for control plane node instances. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: subscription.</li>
         * <li><code>PostPaid</code>: pay-as-you-go.</li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("charge_type")
        public String chargeType;

        /**
         * <p>Specifies whether to install the CloudMonitor agent on control plane nodes. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Installs the CloudMonitor agent.</li>
         * <li><code>false</code>: Does not install the CloudMonitor agent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cloud_monitor_flags")
        public Boolean cloudMonitorFlags;

        /**
         * <p>The node CPU management policy. The following policies are supported for clusters running version 1.12.6 or later:</p>
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
         * <p>The custom image ID. Specify this parameter when using a custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20240819.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The operating system image type. Valid values:</p>
         * <ul>
         * <li><code>AliyunLinux3</code>: Alinux3 image.</li>
         * <li><code>Custom</code>: custom image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The instance types. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The key pair name. Mutually exclusive with <code>login_password</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The SSH logon password. Mutually exclusive with <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. To use password-based logon, specify this parameter during scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>Ack@2000.</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The node service port range. Available port range: [30000, 65535].</p>
         * <p>Default value: 30000-32767.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>The subscription duration for control plane node instances. This parameter takes effect and is required only when <code>charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>When <code>period_unit=Month</code>, valid values are {1, 2, 3, 6, 12, 24, 36, 48, 60}.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle unit for control plane node instances. This parameter takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p><code>Month</code>: The billing cycle is measured in months. Currently, only months are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The container runtime name. Valid values:</p>
         * <ul>
         * <li><code>containerd</code>: Recommended. Supported by all cluster versions.</li>
         * </ul>
         * <p>Default value: containerd.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>Specifies whether to enable Alibaba Cloud OS security hardening. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables Alibaba Cloud OS security hardening.</li>
         * <li><code>false</code>: Disables Alibaba Cloud OS security hardening.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("security_hardening_os")
        public Boolean securityHardeningOs;

        /**
         * <p>The number of control plane nodes. To scale out the control plane of a dedicated cluster, set this parameter to the target number of control plane nodes, which must be greater than the current number.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>Specifies whether to enable MLPS 2.0 security hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">ACK MLPS 2.0 security hardening</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables MLPS 2.0 security hardening.</li>
         * <li><code>false</code>: Disables MLPS 2.0 security hardening.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Specifies whether to enable burst (performance burst) for the node system cloud disk. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.</li>
         * </ul>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The node system cloud disk type. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra cloud disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * <li><code>cloud_essd</code>: Enterprise SSD (ESSD).</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL cloud disk.</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry cloud disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The performance level of the node system cloud disk. This parameter takes effect only for ESSD cloud disks. The performance level varies based on the cloud disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">standard SSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS for the node system cloud disk. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50000}.</p>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The node system cloud disk size. Valid values: [40, 500]. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The ID of the automatic snapshot policy applied to the node system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-2zej1nogjvovnz4z****</p>
         */
        @NameInMap("system_disk_snapshot_policy_id")
        public String systemDiskSnapshotPolicyId;

        public static ModifyClusterRequestControlPlaneConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterRequestControlPlaneConfig self = new ModifyClusterRequestControlPlaneConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterRequestControlPlaneConfig setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ModifyClusterRequestControlPlaneConfig setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public ModifyClusterRequestControlPlaneConfig setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ModifyClusterRequestControlPlaneConfig setCloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }
        public Boolean getCloudMonitorFlags() {
            return this.cloudMonitorFlags;
        }

        public ModifyClusterRequestControlPlaneConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public ModifyClusterRequestControlPlaneConfig setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public ModifyClusterRequestControlPlaneConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ModifyClusterRequestControlPlaneConfig setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public ModifyClusterRequestControlPlaneConfig setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public ModifyClusterRequestControlPlaneConfig setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public ModifyClusterRequestControlPlaneConfig setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ModifyClusterRequestControlPlaneConfig setNodePortRange(String nodePortRange) {
            this.nodePortRange = nodePortRange;
            return this;
        }
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        public ModifyClusterRequestControlPlaneConfig setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public ModifyClusterRequestControlPlaneConfig setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ModifyClusterRequestControlPlaneConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ModifyClusterRequestControlPlaneConfig setSecurityHardeningOs(Boolean securityHardeningOs) {
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        public ModifyClusterRequestControlPlaneConfig setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ModifyClusterRequestControlPlaneConfig setSocEnabled(Boolean socEnabled) {
            this.socEnabled = socEnabled;
            return this;
        }
        public Boolean getSocEnabled() {
            return this.socEnabled;
        }

        public ModifyClusterRequestControlPlaneConfig setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public ModifyClusterRequestControlPlaneConfig setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public ModifyClusterRequestControlPlaneConfig setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public ModifyClusterRequestControlPlaneConfig setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public ModifyClusterRequestControlPlaneConfig setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ModifyClusterRequestControlPlaneConfig setSystemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
            this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
        }

    }

    public static class ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig extends TeaModel {
        /**
         * <p>The VPCs where the internal domain name resolution takes effect.</p>
         */
        @NameInMap("bind_vpcs")
        public java.util.List<String> bindVpcs;

        /**
         * <p>Specifies whether to enable internal domain name access for the cluster. Valid values:</p>
         * <ul>
         * <li>true: Enables internal domain name access. Node-side components (kubelet, kube-proxy) access the API Server through the internal domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig self = new ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig setBindVpcs(java.util.List<String> bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }
        public java.util.List<String> getBindVpcs() {
            return this.bindVpcs;
        }

        public ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig extends TeaModel {
        /**
         * <p>The endpoint type.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("endpoint_type")
        public String endpointType;

        /**
         * <p>The SLB instance associated with the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-xxxx</p>
         */
        @NameInMap("load_balancer_id")
        public String loadBalancerId;

        public static ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig self = new ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class ModifyClusterRequestControlPlaneEndpointsConfig extends TeaModel {
        /**
         * <p>The internal DNS configuration for the cluster. Applicable to ACK managed clusters. The internal domain name is used by node-side system components such as kubelet and kube-proxy to access the API Server. When internal domain name access is not enabled, node-side system components access the API Server through the CLB IP address.</p>
         */
        @NameInMap("internal_dns_config")
        public ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig;

        /**
         * <p>The cluster access load balancing configuration.</p>
         */
        @NameInMap("load_balancers_config")
        public java.util.List<ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig> loadBalancersConfig;

        public static ModifyClusterRequestControlPlaneEndpointsConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterRequestControlPlaneEndpointsConfig self = new ModifyClusterRequestControlPlaneEndpointsConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterRequestControlPlaneEndpointsConfig setInternalDnsConfig(ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig) {
            this.internalDnsConfig = internalDnsConfig;
            return this;
        }
        public ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig getInternalDnsConfig() {
            return this.internalDnsConfig;
        }

        public ModifyClusterRequestControlPlaneEndpointsConfig setLoadBalancersConfig(java.util.List<ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig> loadBalancersConfig) {
            this.loadBalancersConfig = loadBalancersConfig;
            return this;
        }
        public java.util.List<ModifyClusterRequestControlPlaneEndpointsConfigLoadBalancersConfig> getLoadBalancersConfig() {
            return this.loadBalancersConfig;
        }

    }

    public static class ModifyClusterRequestOperationPolicyClusterAutoUpgrade extends TeaModel {
        /**
         * <p>The cluster auto upgrade frequency. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Upgrade frequency</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>patch: latest patch version.</li>
         * <li>stable: second-latest minor version.</li>
         * <li>rapid: latest minor version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>patch</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Specifies whether to enable cluster auto upgrade.</p>
         * <ul>
         * <li><p>true: Enables auto upgrade.</p>
         * </li>
         * <li><p>false: Disables auto upgrade.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static ModifyClusterRequestOperationPolicyClusterAutoUpgrade build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterRequestOperationPolicyClusterAutoUpgrade self = new ModifyClusterRequestOperationPolicyClusterAutoUpgrade();
            return TeaModel.build(map, self);
        }

        public ModifyClusterRequestOperationPolicyClusterAutoUpgrade setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ModifyClusterRequestOperationPolicyClusterAutoUpgrade setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class ModifyClusterRequestOperationPolicy extends TeaModel {
        /**
         * <p>The cluster auto upgrade configuration.</p>
         */
        @NameInMap("cluster_auto_upgrade")
        public ModifyClusterRequestOperationPolicyClusterAutoUpgrade clusterAutoUpgrade;

        public static ModifyClusterRequestOperationPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterRequestOperationPolicy self = new ModifyClusterRequestOperationPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyClusterRequestOperationPolicy setClusterAutoUpgrade(ModifyClusterRequestOperationPolicyClusterAutoUpgrade clusterAutoUpgrade) {
            this.clusterAutoUpgrade = clusterAutoUpgrade;
            return this;
        }
        public ModifyClusterRequestOperationPolicyClusterAutoUpgrade getClusterAutoUpgrade() {
            return this.clusterAutoUpgrade;
        }

    }

    public static class ModifyClusterRequestSystemEventsLogging extends TeaModel {
        /**
         * <p>Specifies whether to enable system event storage.</p>
         * <ul>
         * <li><p>true: Enables system event storage.</p>
         * </li>
         * <li><p>false: Disables system event storage.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The name of the LogProject used for system event storage.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-cb95aa626a47740afbf6aa099b65****</p>
         */
        @NameInMap("logging_project")
        public String loggingProject;

        public static ModifyClusterRequestSystemEventsLogging build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterRequestSystemEventsLogging self = new ModifyClusterRequestSystemEventsLogging();
            return TeaModel.build(map, self);
        }

        public ModifyClusterRequestSystemEventsLogging setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyClusterRequestSystemEventsLogging setLoggingProject(String loggingProject) {
            this.loggingProject = loggingProject;
            return this;
        }
        public String getLoggingProject() {
            return this.loggingProject;
        }

    }

}
