// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2DetailRequest extends TeaModel {
    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("Lang")
    public String lang;

    public static DescribeTrFirewallsV2DetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2DetailRequest self = new DescribeTrFirewallsV2DetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2DetailRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTrFirewallsV2DetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
