// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebAccessModeResponseBody body;

    public static DescribeWebAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessModeResponse self = new DescribeWebAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebAccessModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebAccessModeResponse setBody(DescribeWebAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebAccessModeResponseBody getBody() {
        return this.body;
    }

}
