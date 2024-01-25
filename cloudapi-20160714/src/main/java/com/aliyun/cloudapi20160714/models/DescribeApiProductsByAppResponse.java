// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiProductsByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiProductsByAppResponseBody body;

    public static DescribeApiProductsByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiProductsByAppResponse self = new DescribeApiProductsByAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiProductsByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiProductsByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiProductsByAppResponse setBody(DescribeApiProductsByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiProductsByAppResponseBody getBody() {
        return this.body;
    }

}
