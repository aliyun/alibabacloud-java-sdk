// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AuthLoginTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthLoginTicketResponseBody body;

    public static AuthLoginTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginTicketResponse self = new AuthLoginTicketResponse();
        return TeaModel.build(map, self);
    }

    public AuthLoginTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthLoginTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthLoginTicketResponse setBody(AuthLoginTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthLoginTicketResponseBody getBody() {
        return this.body;
    }

}
