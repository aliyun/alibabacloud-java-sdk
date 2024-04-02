// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteInstanceKeyUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebsiteInstanceKeyUrlResponseBody body;

    public static DescribeWebsiteInstanceKeyUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteInstanceKeyUrlResponse self = new DescribeWebsiteInstanceKeyUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteInstanceKeyUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebsiteInstanceKeyUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebsiteInstanceKeyUrlResponse setBody(DescribeWebsiteInstanceKeyUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebsiteInstanceKeyUrlResponseBody getBody() {
        return this.body;
    }

}
