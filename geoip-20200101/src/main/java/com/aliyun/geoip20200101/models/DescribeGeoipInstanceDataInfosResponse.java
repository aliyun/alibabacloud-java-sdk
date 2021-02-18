// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceDataInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGeoipInstanceDataInfosResponseBody body;

    public static DescribeGeoipInstanceDataInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceDataInfosResponse self = new DescribeGeoipInstanceDataInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceDataInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGeoipInstanceDataInfosResponse setBody(DescribeGeoipInstanceDataInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGeoipInstanceDataInfosResponseBody getBody() {
        return this.body;
    }

}
