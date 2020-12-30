// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class InviteMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InviteMembersResponseBody body;

    public static InviteMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        InviteMembersResponse self = new InviteMembersResponse();
        return TeaModel.build(map, self);
    }

    public InviteMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InviteMembersResponse setBody(InviteMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public InviteMembersResponseBody getBody() {
        return this.body;
    }

}
