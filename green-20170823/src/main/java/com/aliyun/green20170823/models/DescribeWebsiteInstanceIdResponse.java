// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebsiteInstanceIdResponseBody body;

    public static DescribeWebsiteInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteInstanceIdResponse self = new DescribeWebsiteInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebsiteInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebsiteInstanceIdResponse setBody(DescribeWebsiteInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebsiteInstanceIdResponseBody getBody() {
        return this.body;
    }

}
