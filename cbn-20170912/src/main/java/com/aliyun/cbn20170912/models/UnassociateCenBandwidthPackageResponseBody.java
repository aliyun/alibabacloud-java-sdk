// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UnassociateCenBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociateCenBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociateCenBandwidthPackageResponseBody self = new UnassociateCenBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociateCenBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
