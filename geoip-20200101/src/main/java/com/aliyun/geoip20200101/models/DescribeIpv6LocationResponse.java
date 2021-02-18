// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeIpv6LocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpv6LocationResponseBody body;

    public static DescribeIpv6LocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6LocationResponse self = new DescribeIpv6LocationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6LocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpv6LocationResponse setBody(DescribeIpv6LocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpv6LocationResponseBody getBody() {
        return this.body;
    }

}
