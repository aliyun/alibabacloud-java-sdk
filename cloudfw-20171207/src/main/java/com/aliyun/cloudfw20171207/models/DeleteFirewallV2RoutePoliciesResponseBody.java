// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteFirewallV2RoutePoliciesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>22B6B889-4E9F-56B3-AF3D-53749C477D1D</p>
     */
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
