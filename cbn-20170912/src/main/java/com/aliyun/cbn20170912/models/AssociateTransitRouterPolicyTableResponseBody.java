// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterPolicyTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the association between the policy route table and the network instance connection.</p>
     * 
     * <strong>example:</strong>
     * <p>pta-123asfzc</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD98358-D265-4060-87CB-A2427F5A8944</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateTransitRouterPolicyTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateTransitRouterPolicyTableResponseBody self = new AssociateTransitRouterPolicyTableResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateTransitRouterPolicyTableResponseBody setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public AssociateTransitRouterPolicyTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
