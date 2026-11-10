// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPolicyTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ptbl-44m0p68spvlrqq****</p>
     */
    @NameInMap("PolicyTableId")
    public String policyTableId;

    /**
     * <strong>example:</strong>
     * <p>2BFA6822-240E-4E27-B4C8-AA400EF7474D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTransitRouterPolicyTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPolicyTableResponseBody self = new CreateTransitRouterPolicyTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPolicyTableResponseBody setPolicyTableId(String policyTableId) {
        this.policyTableId = policyTableId;
        return this;
    }
    public String getPolicyTableId() {
        return this.policyTableId;
    }

    public CreateTransitRouterPolicyTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
