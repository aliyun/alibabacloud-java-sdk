// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenManualConfigureResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B14757D0-4640-4B44-AC67-7F558F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>vfw-m5e7dbc4y****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static CreateVpcFirewallCenManualConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallCenManualConfigureResponseBody self = new CreateVpcFirewallCenManualConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallCenManualConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcFirewallCenManualConfigureResponseBody setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
