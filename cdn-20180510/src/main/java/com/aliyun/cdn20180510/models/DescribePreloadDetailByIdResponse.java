// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribePreloadDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePreloadDetailByIdResponseBody body;

    public static DescribePreloadDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePreloadDetailByIdResponse self = new DescribePreloadDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribePreloadDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePreloadDetailByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePreloadDetailByIdResponse setBody(DescribePreloadDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePreloadDetailByIdResponseBody getBody() {
        return this.body;
    }

}
