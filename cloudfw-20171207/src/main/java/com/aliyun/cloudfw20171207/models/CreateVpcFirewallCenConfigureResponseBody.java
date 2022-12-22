// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenConfigureResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The instance ID of the VPC firewall.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static CreateVpcFirewallCenConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallCenConfigureResponseBody self = new CreateVpcFirewallCenConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallCenConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcFirewallCenConfigureResponseBody setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
