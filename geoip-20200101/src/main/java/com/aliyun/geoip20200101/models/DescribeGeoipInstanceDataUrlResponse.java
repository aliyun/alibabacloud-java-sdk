// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceDataUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGeoipInstanceDataUrlResponseBody body;

    public static DescribeGeoipInstanceDataUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceDataUrlResponse self = new DescribeGeoipInstanceDataUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceDataUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGeoipInstanceDataUrlResponse setBody(DescribeGeoipInstanceDataUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGeoipInstanceDataUrlResponseBody getBody() {
        return this.body;
    }

}
