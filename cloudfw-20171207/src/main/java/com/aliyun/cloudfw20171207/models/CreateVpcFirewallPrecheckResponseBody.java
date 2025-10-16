// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallPrecheckResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4197</p>
     */
    @NameInMap("PrecheckId")
    public String precheckId;

    /**
     * <strong>example:</strong>
     * <p>C5BE1AA4-934A-5085-89CC-9AD1CAC3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVpcFirewallPrecheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallPrecheckResponseBody self = new CreateVpcFirewallPrecheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallPrecheckResponseBody setPrecheckId(String precheckId) {
        this.precheckId = precheckId;
        return this;
    }
    public String getPrecheckId() {
        return this.precheckId;
    }

    public CreateVpcFirewallPrecheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
