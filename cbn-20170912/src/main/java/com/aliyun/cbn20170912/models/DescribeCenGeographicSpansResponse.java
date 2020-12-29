// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCenGeographicSpansResponse setBody(DescribeCenGeographicSpansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenGeographicSpansResponseBody getBody() {
        return this.body;
    }

}
