// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateCenBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateCenBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateCenBandwidthPackageResponseBody self = new AssociateCenBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateCenBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
