// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCenGeographicSpansResponseBody body;

    public static DescribeCenGeographicSpansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenGeographicSpansResponse self = new DescribeCenGeographicSpansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenGeographicSpansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenGeographicSpansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenGeographicSpansResponse setBody(DescribeCenGeographicSpansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenGeographicSpansResponseBody getBody() {
        return this.body;
    }

}
