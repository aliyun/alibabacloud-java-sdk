// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskInfoResponseBody body;

    public static DescribeTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInfoResponse self = new DescribeTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskInfoResponse setBody(DescribeTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskInfoResponseBody getBody() {
        return this.body;
    }

}
