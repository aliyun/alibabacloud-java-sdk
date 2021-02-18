// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGeoipInstancesResponseBody body;

    public static DescribeGeoipInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstancesResponse self = new DescribeGeoipInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGeoipInstancesResponse setBody(DescribeGeoipInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGeoipInstancesResponseBody getBody() {
        return this.body;
    }

}
