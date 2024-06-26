// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AcceptInvitationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptInvitationResponseBody body;

    public static AcceptInvitationResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptInvitationResponse self = new AcceptInvitationResponse();
        return TeaModel.build(map, self);
    }

    public AcceptInvitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptInvitationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptInvitationResponse setBody(AcceptInvitationResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptInvitationResponseBody getBody() {
        return this.body;
    }

}
