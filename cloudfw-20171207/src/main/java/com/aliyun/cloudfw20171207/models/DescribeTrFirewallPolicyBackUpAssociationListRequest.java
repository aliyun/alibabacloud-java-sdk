// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallPolicyBackUpAssociationListRequest extends TeaModel {
    /**
     * <p>The instance ID of the VPC firewall.</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the routing policy.</p>
     */
    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    public static DescribeTrFirewallPolicyBackUpAssociationListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallPolicyBackUpAssociationListRequest self = new DescribeTrFirewallPolicyBackUpAssociationListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallPolicyBackUpAssociationListRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTrFirewallPolicyBackUpAssociationListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTrFirewallPolicyBackUpAssociationListRequest setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
        this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
        return this;
    }
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

}
