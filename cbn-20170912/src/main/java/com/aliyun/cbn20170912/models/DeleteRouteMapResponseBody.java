// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteMapResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteMapResponseBody self = new DeleteRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
