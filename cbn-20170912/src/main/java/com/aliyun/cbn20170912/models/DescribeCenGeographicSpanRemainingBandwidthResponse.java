// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpanRemainingBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCenGeographicSpanRemainingBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenGeographicSpanRemainingBandwidthResponse setBody(DescribeCenGeographicSpanRemainingBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenGeographicSpanRemainingBandwidthResponseBody getBody() {
        return this.body;
    }

}
