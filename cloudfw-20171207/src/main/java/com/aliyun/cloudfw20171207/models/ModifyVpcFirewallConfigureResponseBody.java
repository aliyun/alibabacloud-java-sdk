// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallConfigureResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-00090125k6f8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcFirewallConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallConfigureResponseBody self = new ModifyVpcFirewallConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
