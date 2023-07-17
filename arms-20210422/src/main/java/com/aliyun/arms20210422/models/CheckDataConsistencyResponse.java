// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CheckDataConsistencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDataConsistencyResponseBody body;

    public static CheckDataConsistencyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDataConsistencyResponse self = new CheckDataConsistencyResponse();
        return TeaModel.build(map, self);
    }

    public CheckDataConsistencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDataConsistencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDataConsistencyResponse setBody(CheckDataConsistencyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDataConsistencyResponseBody getBody() {
        return this.body;
    }

}
