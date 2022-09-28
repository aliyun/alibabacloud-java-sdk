// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetCreditStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetCreditStatusResponseBody body;

    public static SetCreditStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCreditStatusResponse self = new SetCreditStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetCreditStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCreditStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCreditStatusResponse setBody(SetCreditStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCreditStatusResponseBody getBody() {
        return this.body;
    }

}
