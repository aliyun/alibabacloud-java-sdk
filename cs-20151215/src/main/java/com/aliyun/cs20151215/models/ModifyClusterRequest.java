// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterRequest extends TeaModel {
    // 集群是否开启删除保护。
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    // 集群的Ingress SLB的ID。
    @NameInMap("ingress_loadbalancer_id")
    public String ingressLoadbalancerId;

    // 集群是否开启EIP。
    @NameInMap("api_server_eip")
    public Boolean apiServerEip;

    // 集群的API Server的EIP ID。
    @NameInMap("api_server_eip_id")
    public String apiServerEipId;

    // 集群资源组ID。
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    // 域名是否重新绑定到Ingress的SLB地址。
    @NameInMap("ingress_domain_rebinding")
    public String ingressDomainRebinding;

    public static ModifyClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterRequest self = new ModifyClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyClusterRequest setIngressLoadbalancerId(String ingressLoadbalancerId) {
        this.ingressLoadbalancerId = ingressLoadbalancerId;
        return this;
    }
    public String getIngressLoadbalancerId() {
        return this.ingressLoadbalancerId;
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

    public ModifyClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyClusterRequest setIngressDomainRebinding(String ingressDomainRebinding) {
        this.ingressDomainRebinding = ingressDomainRebinding;
        return this;
    }
    public String getIngressDomainRebinding() {
        return this.ingressDomainRebinding;
    }

}
