// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterRequest extends TeaModel {
    /**
     * <p>注册集群 API Server SLB 访问控制列表。</p>
     */
    @NameInMap("access_control_list")
    public java.util.List<String> accessControlList;

    /**
     * <p>Specifies whether to associate an elastic IP address (EIP) with the cluster API server. This enables Internet access for the cluster. Valid values:</p>
     * <br>
     * <p>*   `true`: associates an EIP with the cluster API server.</p>
     * <p>*   `false`: does not associate an EIP with the cluster API server.</p>
     */
    @NameInMap("api_server_eip")
    public Boolean apiServerEip;

    /**
     * <p>The ID of the EIP that you want to associate with the cluster API server. The parameter takes effect only if `api_server_eip` is set to `true`.</p>
     */
    @NameInMap("api_server_eip_id")
    public String apiServerEipId;

    @NameInMap("cluster_name")
    public String clusterName;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster. If deletion protection is enabled, the cluster cannot be deleted in the ACK console or by calling API operations. Valid values:</p>
     * <br>
     * <p>*   `true`: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the ACK console or by calling API operations.</p>
     * <p>*   `false`: disables deletion protection for the cluster. This way, the cluster can be deleted in the ACK console or by calling API operations.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to enable the RAM Roles for Service Accounts (RRSA) feature. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the RRSA feature.</p>
     * <p>*   `false`: disables the RRSA feature.</p>
     */
    @NameInMap("enable_rrsa")
    public Boolean enableRrsa;

    /**
     * <p>Specifies whether to remap the test domain name of the cluster. Valid values:</p>
     * <br>
     * <p>*   `true`: remaps the test domain name of the cluster.</p>
     * <p>*   `false`: does not remap the test domain name of the cluster.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ingress_domain_rebinding")
    public Boolean ingressDomainRebinding;

    /**
     * <p>The ID of the Server Load Balancer (SLB) instance that is associated with the cluster.</p>
     */
    @NameInMap("ingress_loadbalancer_id")
    public String ingressLoadbalancerId;

    /**
     * <p>Specifies whether to enable deletion protection for the instances in the cluster. If deletion protection is enabled, the instances in the cluster cannot be deleted in the console or by calling the API. Valid values:</p>
     * <br>
     * <p>*   `true`: enables deletion protection for the instances in the cluster. You cannot delete the instances in the cluster in the console or by calling the API.</p>
     * <p>*   `false`: disables deletion protection for the instances in the cluster. You can delete the instances in the cluster in the console or by calling the API.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("instance_deletion_protection")
    public Boolean instanceDeletionProtection;

    /**
     * <p>The maintenance window of the cluster. This parameter takes effect only in ACK Pro clusters.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p>The ID of the resource group to which the cluster belongs.</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

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

    public ModifyClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
