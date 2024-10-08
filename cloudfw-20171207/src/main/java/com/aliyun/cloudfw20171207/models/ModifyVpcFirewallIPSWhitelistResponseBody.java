// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallIPSWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F2E8D49A-E5AA-5FF8-8822-25282DCF4BE8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcFirewallIPSWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallIPSWhitelistResponseBody self = new ModifyVpcFirewallIPSWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallIPSWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
