// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenInterRegionBandwidthLimitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCenInterRegionBandwidthLimitsResponseBody body;

    public static DescribeCenInterRegionBandwidthLimitsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenInterRegionBandwidthLimitsResponse self = new DescribeCenInterRegionBandwidthLimitsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenInterRegionBandwidthLimitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenInterRegionBandwidthLimitsResponse setBody(DescribeCenInterRegionBandwidthLimitsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenInterRegionBandwidthLimitsResponseBody getBody() {
        return this.body;
    }

}
