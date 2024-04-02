// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebsiteStatResponseBody body;

    public static DescribeWebsiteStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteStatResponse self = new DescribeWebsiteStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebsiteStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebsiteStatResponse setBody(DescribeWebsiteStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebsiteStatResponseBody getBody() {
        return this.body;
    }

}
