// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AuthAndRefreshLoginTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthAndRefreshLoginTicketResponseBody body;

    public static AuthAndRefreshLoginTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthAndRefreshLoginTicketResponse self = new AuthAndRefreshLoginTicketResponse();
        return TeaModel.build(map, self);
    }

    public AuthAndRefreshLoginTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthAndRefreshLoginTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthAndRefreshLoginTicketResponse setBody(AuthAndRefreshLoginTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthAndRefreshLoginTicketResponseBody getBody() {
        return this.body;
    }

}
