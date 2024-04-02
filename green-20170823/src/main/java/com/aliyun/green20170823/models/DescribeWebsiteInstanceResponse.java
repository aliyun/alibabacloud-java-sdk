// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebsiteInstanceResponseBody body;

    public static DescribeWebsiteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteInstanceResponse self = new DescribeWebsiteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebsiteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebsiteInstanceResponse setBody(DescribeWebsiteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebsiteInstanceResponseBody getBody() {
        return this.body;
    }

}
