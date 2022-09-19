// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAsyncResultsByJobIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAsyncResultsByJobIdResponseBody body;

    public static DescribeAsyncResultsByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncResultsByJobIdResponse self = new DescribeAsyncResultsByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncResultsByJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAsyncResultsByJobIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAsyncResultsByJobIdResponse setBody(DescribeAsyncResultsByJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAsyncResultsByJobIdResponseBody getBody() {
        return this.body;
    }

}
