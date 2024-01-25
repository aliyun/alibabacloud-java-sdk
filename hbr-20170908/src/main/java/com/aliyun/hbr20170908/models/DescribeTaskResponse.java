// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskResponseBody body;

    public static DescribeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskResponse self = new DescribeTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskResponse setBody(DescribeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskResponseBody getBody() {
        return this.body;
    }

}
