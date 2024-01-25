// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiProductApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiProductApisResponseBody body;

    public static DescribeApiProductApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiProductApisResponse self = new DescribeApiProductApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiProductApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiProductApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiProductApisResponse setBody(DescribeApiProductApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiProductApisResponseBody getBody() {
        return this.body;
    }

}
