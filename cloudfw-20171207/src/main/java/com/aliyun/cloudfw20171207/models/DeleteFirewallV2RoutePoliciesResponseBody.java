// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteFirewallV2RoutePoliciesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFirewallV2RoutePoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFirewallV2RoutePoliciesResponseBody self = new DeleteFirewallV2RoutePoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFirewallV2RoutePoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
