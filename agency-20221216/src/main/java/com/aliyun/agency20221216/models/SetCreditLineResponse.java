// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetCreditLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetCreditLineResponseBody body;

    public static SetCreditLineResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLineResponse self = new SetCreditLineResponse();
        return TeaModel.build(map, self);
    }

    public SetCreditLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCreditLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCreditLineResponse setBody(SetCreditLineResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCreditLineResponseBody getBody() {
        return this.body;
    }

}
