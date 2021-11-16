// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterRequest extends TeaModel {
    // 集群是否绑定EIP，用于公网访问API Server。 true | false
    @NameInMap("api_server_eip")
    public Boolean apiServerEip;

    // 集群API Server 公网连接端点。
    @NameInMap("api_server_eip_id")
    public String apiServerEipId;

    // 集群是否开启删除保护。默认值false。
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    // 域名是否重新绑定到Ingress的SLB地址。
    @NameInMap("ingress_domain_rebinding")
    public String ingressDomainRebinding;

    // 集群的Ingress SLB的ID。
    @NameInMap("ingress_loadbalancer_id")
    public String ingressLoadbalancerId;

    // 实例删除保护，防止通过控制台或API误删除释放节点。
    @NameInMap("instance_deletion_protection")
    public Boolean instanceDeletionProtection;

    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    // 集群资源组ID。
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    public static ModifyClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterRequest self = new ModifyClusterRequest();
        return TeaModel.build(map, self);
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

    public ModifyClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyClusterRequest setIngressDomainRebinding(String ingressDomainRebinding) {
        this.ingressDomainRebinding = ingressDomainRebinding;
        return this;
    }
    public String getIngressDomainRebinding() {
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
