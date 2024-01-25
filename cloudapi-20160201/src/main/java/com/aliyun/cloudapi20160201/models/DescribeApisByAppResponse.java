// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApisByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisByAppResponseBody body;

    public static DescribeApisByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByAppResponse self = new DescribeApisByAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisByAppResponse setBody(DescribeApisByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisByAppResponseBody getBody() {
        return this.body;
    }

}
