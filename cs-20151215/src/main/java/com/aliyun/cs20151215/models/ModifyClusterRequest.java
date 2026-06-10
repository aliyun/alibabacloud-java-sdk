// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterRequest extends TeaModel {
    /**
     * <p>The access control list for the API server SLB of registered clusters.</p>
     */
    @NameInMap("access_control_list")
    @Deprecated
    public java.util.List<String> accessControlList;

    /**
     * <p>This parameter adds custom IP addresses or domain names to the SAN field of the API server certificate to control client access.</p>
     * <p>Only managed clusters support this parameter.</p>
     */
    @NameInMap("api_server_custom_cert_sans")
    public ModifyClusterRequestApiServerCustomCertSans apiServerCustomCertSans;

    /**
     * <p>Specifies whether to bind an EIP to the cluster for public network access to the API server. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Binds an EIP to the cluster.</p>
     * </li>
     * <li><p><code>false</code>: Does not bind an EIP to the cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("api_server_eip")
    public Boolean apiServerEip;

    /**
     * <p>The EIP instance ID bound to the cluster API server. This parameter takes effect only when <code>api_server_eip</code> is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-wz9fnasl6dsfhmvci****</p>
     */
    @NameInMap("api_server_eip_id")
    public String apiServerEipId;

    /**
     * <p>The custom cluster name. The name can contain digits, letters, Chinese characters, and hyphens (-). It must be 1 to 63 characters in length and cannot start with a hyphen (-).</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-new-name</p>
     */
    @NameInMap("cluster_name")
    public String clusterName;

    /**
     * <p>The cluster specification when you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure <code>profile</code>. Valid values:</p>
     * <ul>
     * <li><p><code>ack.pro.small</code>: Pro</p>
     * </li>
     * <li><p><code>ack.pro.xlarge</code>: Pro XL</p>
     * </li>
     * <li><p><code>ack.pro.2xlarge</code>: Pro 2XL</p>
     * </li>
     * <li><p><code>ack.pro.4xlarge</code>: Pro 4XL (requires approval from customer service to enable)</p>
     * </li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. These tiers pre-allocate and dedicate control plane resources to ensure consistent high performance for API concurrency and pod scheduling. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For cluster management fees for Pro and provisioned control plane clusters, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>Control plane configuration for dedicated clusters.</p>
     */
    @NameInMap("control_plane_config")
    public ModifyClusterRequestControlPlaneConfig controlPlaneConfig;

    /**
     * <p>Cluster connection configuration.</p>
     */
    @NameInMap("control_plane_endpoints_config")
    public ModifyClusterRequestControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>Enables or disables cluster deletion protection to prevent accidental cluster deletion from the console or using APIs. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables cluster deletion protection. You cannot delete the cluster from the console or using APIs.</p>
     * </li>
     * <li><p><code>false</code>: Disables cluster deletion protection. You can delete the cluster from the console or using APIs.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>Enables or disables the RRSA feature. Only managed clusters support this parameter. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables RRSA.</p>
     * </li>
     * <li><p><code>false</code>: Disables RRSA.</p>
     * </li>
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
     * <li><p><code>true</code>: Rebinds the cluster test domain name.</p>
     * </li>
     * <li><p><code>false</code>: Does not rebind the cluster test domain name.</p>
     * </li>
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
     * <p>Enables or disables instance deletion protection to prevent accidental release of nodes from the console or using APIs. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Prevents accidental node deletion from the console or using APIs.</p>
     * </li>
     * <li><p><code>false</code>: Allows accidental node deletion from the console or using APIs.</p>
     * </li>
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
     * <p>The maintenance window of the cluster. This feature is available only for ACK managed clusters Pro.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p>Automatic O\&amp;M policy for the cluster.</p>
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
     * <p>The security group ID for the control plane.</p>
     * <ul>
     * <li><p>If you configure blocking rules in the security group, ensure that the security group rules allow the protocols and ports required by the cluster. For recommended security group rules, see <a href="https://help.aliyun.com/document_detail/353191.html">Configure and manage cluster security groups</a>.</p>
     * </li>
     * <li><p>For non-dedicated ACK clusters, the control plane and installed managed components (such as terway-controlplane) restart briefly during the update. Perform this operation during off-peak hours. After you change the control plane security group, the ENIs used by the control plane and managed components are automatically added to the new security group.</p>
     * </li>
     * <li><p>For ACK dedicated clusters, newly scaled-out master nodes automatically apply the new control plane security group. Existing control plane nodes are unaffected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1h6rk3pgct2a08***</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p>System event logging configuration.</p>
     */
    @NameInMap("system_events_logging")
    public ModifyClusterRequestSystemEventsLogging systemEventsLogging;

    /**
     * <p>The cluster time zone. For more information, see <a href="https://help.aliyun.com/document_detail/354879.html">Supported time zones</a>.</p>
     * <ul>
     * <li><p>After you change the time zone, cluster inspection configurations use the new time zone.</p>
     * </li>
     * <li><p>For managed clusters, the control plane and installed managed components (such as terway-controlplane) restart briefly during the update. Perform this operation during off-peak hours. Newly scaled-out nodes automatically apply the new time zone. Existing nodes are unaffected. You can reset nodes in node pools to apply the new time zone to existing nodes.</p>
     * </li>
     * <li><p>For dedicated clusters, newly scaled-out nodes (including control plane nodes) automatically apply the new time zone. Existing nodes (including control plane nodes) are unaffected. You can reset nodes in node pools to apply the new time zone to existing nodes. For control plane nodes, scale out and then scale in to apply the new time zone to all control plane nodes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The vSwitches for the cluster control plane. For dedicated clusters, the change applies only to newly scaled-out control plane nodes. When you change the control plane vSwitches for managed clusters, note the following:</p>
     * <ul>
     * <li><p>This parameter performs an overwrite update. You must specify the complete target vSwitch list.</p>
     * </li>
     * <li><p>Control plane components restart briefly during the update. Proceed with caution.</p>
     * </li>
     * <li><p>Ensure that all security groups (including those for the control plane, all node pools, and container networking) allow inbound and outbound traffic for the IP CIDR blocks of the new vSwitches. Otherwise, nodes and containers cannot connect to the API server.</p>
     * </li>
     * <li><p>If the new control plane vSwitches have ACL rules configured, ensure that these rules allow communication between the vSwitches and the IP CIDR blocks of cluster nodes and container networks.</p>
     * </li>
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
         * <li><p>overwrite: Overwrites the existing configuration.</p>
         * </li>
         * <li><p>append: Appends to the existing configuration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>append</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The list of SANs.</p>
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
         * <li><p><code>true</code>: Enables auto-renewal.</p>
         * </li>
         * <li><p><code>false</code>: Disables auto-renewal.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal duration for each renewal of control plane node instances.</p>
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
         * <p>Specifies whether to install the CloudMonitor agent on control plane nodes. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Installs the CloudMonitor agent.</p>
         * </li>
         * <li><p><code>false</code>: Does not install the CloudMonitor agent.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cloud_monitor_flags")
        public Boolean cloudMonitorFlags;

        /**
         * <p>The CPU management policy for nodes. Clusters of version 1.12.6 or later support the following policies:</p>
         * <ul>
         * <li><p><code>static</code>: Enhances CPU affinity and exclusivity for pods with specific resource characteristics on nodes.</p>
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
         * <p>The custom image ID. Specify this parameter when you use a custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20240819.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The operating system image type. Valid values:</p>
         * <ul>
         * <li><p><code>AliyunLinux3</code>: Alinux3 image.</p>
         * </li>
         * <li><p><code>Custom</code>: Custom image.</p>
         * </li>
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
         * <p>The key pair name. Specify either this parameter or <code>login_password</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The SSH logon password. Specify either this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. To use password-based logon, specify this parameter during scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>Ack@2000.</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>Valid port range: [30000,65535].</p>
         * <p>Default value: 30000-32767.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>The subscription duration for control plane node instances. This parameter is required and takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>When <code>period_unit=Month</code>, valid values are {1, 2, 3, 6, 12, 24, 36, 48, 60}.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle for control plane node instances. This parameter takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p><code>Month</code>: Billing by month. Only monthly billing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The container runtime. Valid values:</p>
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
         * <p>Alibaba Cloud OS security hardening. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables Alibaba Cloud OS security hardening.</p>
         * </li>
         * <li><p><code>false</code>: Disables Alibaba Cloud OS security hardening.</p>
         * </li>
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
         * <p>MLPS 2.0 security hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">Use MLPS 2.0 security hardening for ACK</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables MLPS 2.0 security hardening.</p>
         * </li>
         * <li><p><code>false</code>: Disables MLPS 2.0 security hardening.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Specifies whether to enable performance burst for node system disks. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables performance burst.</p>
         * </li>
         * <li><p><code>false</code>: Disables performance burst.</p>
         * </li>
         * </ul>
         * <p>You can set this parameter only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The system disk category for nodes. Valid values:</p>
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
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The performance level of node system disks. This parameter applies only to ESSDs. The performance level depends on the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS for node system disks. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
         * <p>You can set this parameter only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The system disk size for nodes. Valid values: [40,500]. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The automatic snapshot policy ID for node system disks.</p>
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
         * <p>The VPCs where cluster internal domain name resolution takes effect.</p>
         */
        @NameInMap("bind_vpcs")
        public java.util.List<String> bindVpcs;

        /**
         * <p>Specifies whether to enable cluster internal domain name access. Valid values:</p>
         * <ul>
         * <li>true: Enables cluster internal domain name access. Node-side components (kubelet, kube-proxy) access the API server through the cluster internal domain name.</li>
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

    public static class ModifyClusterRequestControlPlaneEndpointsConfig extends TeaModel {
        /**
         * <p>Internal domain name configuration for the cluster. This feature is available for ACK managed clusters. Cluster internal domain names allow node-side system components such as kubelet and kube-proxy to access the API server. If this feature is disabled, node-side system components access the API server through the CLB IP address.</p>
         */
        @NameInMap("internal_dns_config")
        public ModifyClusterRequestControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig;

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

    }

    public static class ModifyClusterRequestOperationPolicyClusterAutoUpgrade extends TeaModel {
        /**
         * <p>The frequency of automatic cluster upgrades. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Upgrade frequency</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>patch: Latest patch version.</p>
         * </li>
         * <li><p>stable: Second latest minor version.</p>
         * </li>
         * <li><p>rapid: Latest minor version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>patch</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Specifies whether to enable automatic cluster upgrades.</p>
         * <ul>
         * <li><p>true: Enables automatic upgrades.</p>
         * </li>
         * <li><p>false: Disables automatic upgrades.</p>
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
         * <p>Automatic cluster upgrade.</p>
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
         * <p>Specifies whether to enable system event logging.</p>
         * <ul>
         * <li><p>true: Enables system event logging.</p>
         * </li>
         * <li><p>false: Disables system event logging.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The LogProject name for system event logging.</p>
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
