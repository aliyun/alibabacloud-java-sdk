// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRoutineSpecResponseBody body;

    public static DescribeRoutineSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineSpecResponse self = new DescribeRoutineSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoutineSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRoutineSpecResponse setBody(DescribeRoutineSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoutineSpecResponseBody getBody() {
        return this.body;
    }

}
