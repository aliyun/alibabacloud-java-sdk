// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallConfigureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcFirewallConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallConfigureResponseBody self = new DeleteVpcFirewallConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
