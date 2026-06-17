// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteTrFirewallV2Request extends TeaModel {
    /**
     * <p>The ID of the VPC firewall for the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-99bc4f0fc88b4d00****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
