// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyContentResponseBody body;

    public static DescribeVerifyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyContentResponse self = new DescribeVerifyContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyContentResponse setBody(DescribeVerifyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyContentResponseBody getBody() {
        return this.body;
    }

}
