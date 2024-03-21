// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineCanaryEnvsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRoutineCanaryEnvsResponseBody body;

    public static DescribeRoutineCanaryEnvsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineCanaryEnvsResponse self = new DescribeRoutineCanaryEnvsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineCanaryEnvsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoutineCanaryEnvsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRoutineCanaryEnvsResponse setBody(DescribeRoutineCanaryEnvsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoutineCanaryEnvsResponseBody getBody() {
        return this.body;
    }

}
