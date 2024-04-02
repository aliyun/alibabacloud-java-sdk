// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteVerifyInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebsiteVerifyInfoResponseBody body;

    public static DescribeWebsiteVerifyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteVerifyInfoResponse self = new DescribeWebsiteVerifyInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteVerifyInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebsiteVerifyInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebsiteVerifyInfoResponse setBody(DescribeWebsiteVerifyInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebsiteVerifyInfoResponseBody getBody() {
        return this.body;
    }

}
