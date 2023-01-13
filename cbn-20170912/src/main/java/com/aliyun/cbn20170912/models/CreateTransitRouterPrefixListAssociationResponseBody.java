// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPrefixListAssociationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTransitRouterPrefixListAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPrefixListAssociationResponseBody self = new CreateTransitRouterPrefixListAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPrefixListAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
