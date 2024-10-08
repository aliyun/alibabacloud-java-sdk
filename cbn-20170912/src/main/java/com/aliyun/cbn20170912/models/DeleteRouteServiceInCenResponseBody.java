// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteServiceInCenResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD97C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRouteServiceInCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteServiceInCenResponseBody self = new DeleteRouteServiceInCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRouteServiceInCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
