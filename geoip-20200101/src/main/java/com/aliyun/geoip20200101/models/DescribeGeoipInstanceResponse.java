// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGeoipInstanceResponseBody body;

    public static DescribeGeoipInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceResponse self = new DescribeGeoipInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGeoipInstanceResponse setBody(DescribeGeoipInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGeoipInstanceResponseBody getBody() {
        return this.body;
    }

}
