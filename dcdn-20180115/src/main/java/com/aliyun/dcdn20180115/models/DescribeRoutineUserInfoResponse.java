// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRoutineUserInfoResponseBody body;

    public static DescribeRoutineUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineUserInfoResponse self = new DescribeRoutineUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoutineUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRoutineUserInfoResponse setBody(DescribeRoutineUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoutineUserInfoResponseBody getBody() {
        return this.body;
    }

}
