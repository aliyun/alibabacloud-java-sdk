// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByTrafficControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisByTrafficControlResponseBody body;

    public static DescribeApisByTrafficControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByTrafficControlResponse self = new DescribeApisByTrafficControlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisByTrafficControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisByTrafficControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisByTrafficControlResponse setBody(DescribeApisByTrafficControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisByTrafficControlResponseBody getBody() {
        return this.body;
    }

}
