// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAsyncStatusByJobIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAsyncStatusByJobIdResponseBody body;

    public static DescribeAsyncStatusByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncStatusByJobIdResponse self = new DescribeAsyncStatusByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncStatusByJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAsyncStatusByJobIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAsyncStatusByJobIdResponse setBody(DescribeAsyncStatusByJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAsyncStatusByJobIdResponseBody getBody() {
        return this.body;
    }

}
