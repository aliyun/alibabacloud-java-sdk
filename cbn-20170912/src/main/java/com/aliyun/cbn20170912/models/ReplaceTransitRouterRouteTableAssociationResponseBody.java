// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ReplaceTransitRouterRouteTableAssociationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>160BD7D3-3D1E-5702-9AF0-56E4B15FCB65</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReplaceTransitRouterRouteTableAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceTransitRouterRouteTableAssociationResponseBody self = new ReplaceTransitRouterRouteTableAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceTransitRouterRouteTableAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
