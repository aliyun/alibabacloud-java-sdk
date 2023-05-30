// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2ResponseBody extends TeaModel {
    @NameInMap("FirewallId")
    public String firewallId;

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
