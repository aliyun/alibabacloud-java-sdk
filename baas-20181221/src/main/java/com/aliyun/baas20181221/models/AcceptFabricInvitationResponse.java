// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class AcceptFabricInvitationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptFabricInvitationResponseBody body;

    public static AcceptFabricInvitationResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptFabricInvitationResponse self = new AcceptFabricInvitationResponse();
        return TeaModel.build(map, self);
    }

    public AcceptFabricInvitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptFabricInvitationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptFabricInvitationResponse setBody(AcceptFabricInvitationResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptFabricInvitationResponseBody getBody() {
        return this.body;
    }

}
