// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterBody extends TeaModel {
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    @NameInMap("ingress_loadbalancer_id")
    public String ingressLoadbalancerId;

    @NameInMap("api_server_eip")
    public Boolean apiServerEip;

    @NameInMap("api_server_eip_id")
    public String apiServerEipId;

    @NameInMap("resource_group_id")
    public String resourceGroupId;

    @NameInMap("ingress_domain_rebinding")
    public String ingressDomainRebinding;

    public static ModifyClusterBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterBody self = new ModifyClusterBody();
        return TeaModel.build(map, self);
    }

}
