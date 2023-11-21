// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallConfigureResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static CreateVpcFirewallConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallConfigureResponseBody self = new CreateVpcFirewallConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcFirewallConfigureResponseBody setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
