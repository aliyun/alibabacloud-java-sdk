// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InviteSubAccountResponseBody body;

    public static InviteSubAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        InviteSubAccountResponse self = new InviteSubAccountResponse();
        return TeaModel.build(map, self);
    }

    public InviteSubAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InviteSubAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InviteSubAccountResponse setBody(InviteSubAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public InviteSubAccountResponseBody getBody() {
        return this.body;
    }

}
