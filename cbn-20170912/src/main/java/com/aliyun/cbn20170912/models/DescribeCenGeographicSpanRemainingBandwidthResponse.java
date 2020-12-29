// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpanRemainingBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCenGeographicSpanRemainingBandwidthResponseBody body;

    public static DescribeCenGeographicSpanRemainingBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenGeographicSpanRemainingBandwidthResponse self = new DescribeCenGeographicSpanRemainingBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenGeographicSpanRemainingBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenGeographicSpanRemainingBandwidthResponse setBody(DescribeCenGeographicSpanRemainingBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenGeographicSpanRemainingBandwidthResponseBody getBody() {
        return this.body;
    }

}
