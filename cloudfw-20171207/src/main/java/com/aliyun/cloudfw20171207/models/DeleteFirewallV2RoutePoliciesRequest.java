// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteFirewallV2RoutePoliciesRequest extends TeaModel {
    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    public static DeleteFirewallV2RoutePoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFirewallV2RoutePoliciesRequest self = new DeleteFirewallV2RoutePoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFirewallV2RoutePoliciesRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DeleteFirewallV2RoutePoliciesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteFirewallV2RoutePoliciesRequest setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
        this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
        return this;
    }
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

}
