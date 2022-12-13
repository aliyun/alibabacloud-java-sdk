// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CancelProblemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelProblemResponseBody body;

    public static CancelProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelProblemResponse self = new CancelProblemResponse();
        return TeaModel.build(map, self);
    }

    public CancelProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelProblemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelProblemResponse setBody(CancelProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelProblemResponseBody getBody() {
        return this.body;
    }

}
