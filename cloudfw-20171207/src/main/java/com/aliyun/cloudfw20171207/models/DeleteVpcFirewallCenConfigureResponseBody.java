// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallCenConfigureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcFirewallCenConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallCenConfigureResponseBody self = new DeleteVpcFirewallCenConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallCenConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
