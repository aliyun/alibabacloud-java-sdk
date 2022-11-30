// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitNumberResponseBody body;

    public static SubmitNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitNumberResponse self = new SubmitNumberResponse();
        return TeaModel.build(map, self);
    }

    public SubmitNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitNumberResponse setBody(SubmitNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitNumberResponseBody getBody() {
        return this.body;
    }

}
