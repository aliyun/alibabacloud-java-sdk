// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeEncryptRoutineUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEncryptRoutineUidResponseBody body;

    public static DescribeEncryptRoutineUidResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptRoutineUidResponse self = new DescribeEncryptRoutineUidResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptRoutineUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEncryptRoutineUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEncryptRoutineUidResponse setBody(DescribeEncryptRoutineUidResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEncryptRoutineUidResponseBody getBody() {
        return this.body;
    }

}
