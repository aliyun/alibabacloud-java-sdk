// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2ResponseBody extends TeaModel {
    /**
     * <p>The instance ID of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-37e22bf0d9b34870****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>822B9125-6E1A-551C-8EAF-6E7AE7444B00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTrFirewallV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrFirewallV2ResponseBody self = new CreateTrFirewallV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrFirewallV2ResponseBody setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public CreateTrFirewallV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
