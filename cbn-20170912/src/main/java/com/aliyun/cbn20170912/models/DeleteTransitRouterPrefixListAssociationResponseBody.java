// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPrefixListAssociationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>835E7F4B-B380-4E0F-96A5-6EA572388047</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterPrefixListAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPrefixListAssociationResponseBody self = new DeleteTransitRouterPrefixListAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPrefixListAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
