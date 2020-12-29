// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class AcceptFabricInvitationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AcceptFabricInvitationResponse setBody(AcceptFabricInvitationResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptFabricInvitationResponseBody getBody() {
        return this.body;
    }

}
