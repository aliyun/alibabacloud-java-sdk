// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody self = new UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
