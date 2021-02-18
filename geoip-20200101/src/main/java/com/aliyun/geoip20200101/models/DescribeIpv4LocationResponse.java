// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeIpv4LocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpv4LocationResponseBody body;

    public static DescribeIpv4LocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv4LocationResponse self = new DescribeIpv4LocationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv4LocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpv4LocationResponse setBody(DescribeIpv4LocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpv4LocationResponseBody getBody() {
        return this.body;
    }

}
