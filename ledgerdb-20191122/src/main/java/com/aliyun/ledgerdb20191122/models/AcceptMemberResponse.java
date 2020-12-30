// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class AcceptMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AcceptMemberResponseBody body;

    public static AcceptMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptMemberResponse self = new AcceptMemberResponse();
        return TeaModel.build(map, self);
    }

    public AcceptMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptMemberResponse setBody(AcceptMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptMemberResponseBody getBody() {
        return this.body;
    }

}
