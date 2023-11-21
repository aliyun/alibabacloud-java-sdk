// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteTrFirewallV2Request extends TeaModel {
    /**
     * <p>The instance ID of the VPC firewall.</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteTrFirewallV2Request build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrFirewallV2Request self = new DeleteTrFirewallV2Request();
        return TeaModel.build(map, self);
    }

    public DeleteTrFirewallV2Request setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DeleteTrFirewallV2Request setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
