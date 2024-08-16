// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenRouteMapResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5903EE99-D542-4E14-BC65-AAC1CB2D3D03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCenRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenRouteMapResponseBody self = new DeleteCenRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCenRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
