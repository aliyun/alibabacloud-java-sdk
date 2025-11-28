// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeAdminInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdminInfoResponseBody body;

    public static DescribeAdminInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdminInfoResponse self = new DescribeAdminInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdminInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdminInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdminInfoResponse setBody(DescribeAdminInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdminInfoResponseBody getBody() {
        return this.body;
    }

}
