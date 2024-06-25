// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterRequest extends TeaModel {
    /**
     * <p>The network access control list (ACL) of the SLB instance associated with the API server if the cluster is a registered cluster.</p>
     */
    @NameInMap("access_control_list")
    public java.util.List<String> accessControlList;

    @NameInMap("api_server_custom_cert_sans")
    public ModifyClusterRequestApiServerCustomCertSans apiServerCustomCertSans;

    /**
     * <p>Specifies whether to associate an elastic IP address (EIP) with the cluster. This EIP is used for accessing the API server over the Internet. Valid values:</p>
     * <ul>
     * <li><code>true</code>: associates an EIP with the cluster.</li>
     * <li><code>false</code>: does not associate an EIP with the cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("api_server_eip")
    public Boolean apiServerEip;

    /**
     * <p>The ID of the EIP that you want to associate with the API server of the cluster. This parameter takes effect when <code>api_server_eip</code> is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-wz9fnasl6dsfhmvci****</p>
     */
    @NameInMap("api_server_eip_id")
    public String apiServerEipId;

    /**
     * <p>The cluster name.</p>
     * <p>The cluster name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (_). The cluster name cannot start with a hyphen (-).</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-new-name</p>
     */
    @NameInMap("cluster_name")
    public String clusterName;

    /**
     * <p>Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the console or by calling API operations. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to enable the RRSA feature. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable_rrsa")
    public Boolean enableRrsa;

    /**
     * <p>Specifies whether to remap the test domain name of the cluster. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ingress_domain_rebinding")
    public Boolean ingressDomainRebinding;

    /**
     * <p>The ID of the Server Load Balancer (SLB) instance of the cluster to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-wz97kes8tnndkpodw****</p>
     */
    @NameInMap("ingress_loadbalancer_id")
    public String ingressLoadbalancerId;

    /**
     * <p>Specifies whether to enable instance deletion protection. If this option is enabled, the instance cannot be deleted in the console or by calling API operations. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("instance_deletion_protection")
    public Boolean instanceDeletionProtection;

    /**
     * <p>The cluster maintenance window. This feature takes effect only for managed Pro clusters.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    @NameInMap("operation_policy")
    public ModifyClusterRequestOperationPolicy operationPolicy;

    /**
     * <p>The ID of the cluster resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyvw3wjm****</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>The storage configurations of system events.</p>
     */
    @NameInMap("system_events_logging")
    public ModifyClusterRequestSystemEventsLogging systemEventsLogging;

    public static ModifyClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterRequest self = new ModifyClusterRequest();
        return TeaModel.build(map, self);
    }

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

    public ModifyClusterRequest setIngressDomainRebinding(Boolean ingressDomainRebinding) {
        this.ingressDomainRebinding = ingressDomainRebinding;
        return this;
    }
    public Boolean getIngressDomainRebinding() {
        return this.ingressDomainRebinding;
    }

    public ModifyClusterRequest setIngressLoadbalancerId(String ingressLoadbalancerId) {
        this.ingressLoadbalancerId = ingressLoadbalancerId;
        return this;
    }
    public String getIngressLoadbalancerId() {
        return this.ingressLoadbalancerId;
    }

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

    public ModifyClusterRequest setSystemEventsLogging(ModifyClusterRequestSystemEventsLogging systemEventsLogging) {
        this.systemEventsLogging = systemEventsLogging;
        return this;
    }
    public ModifyClusterRequestSystemEventsLogging getSystemEventsLogging() {
        return this.systemEventsLogging;
    }

    public static class ModifyClusterRequestApiServerCustomCertSans extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>append</p>
         */
        @NameInMap("action")
        public String action;

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

    public static class ModifyClusterRequestOperationPolicyClusterAutoUpgrade extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>patch</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The name of the LogProject that stores system events.</p>
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
