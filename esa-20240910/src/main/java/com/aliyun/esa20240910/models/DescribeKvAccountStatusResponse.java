// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeKvAccountStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKvAccountStatusResponseBody body;

    public static DescribeKvAccountStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvAccountStatusResponse self = new DescribeKvAccountStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKvAccountStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKvAccountStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKvAccountStatusResponse setBody(DescribeKvAccountStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKvAccountStatusResponseBody getBody() {
        return this.body;
    }

}
