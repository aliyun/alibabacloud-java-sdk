// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubResellerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InviteSubResellerResponseBody body;

    public static InviteSubResellerResponse build(java.util.Map<String, ?> map) throws Exception {
        InviteSubResellerResponse self = new InviteSubResellerResponse();
        return TeaModel.build(map, self);
    }

    public InviteSubResellerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InviteSubResellerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InviteSubResellerResponse setBody(InviteSubResellerResponseBody body) {
        this.body = body;
        return this;
    }
    public InviteSubResellerResponseBody getBody() {
        return this.body;
    }

}
