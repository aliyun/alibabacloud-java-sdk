// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DisableMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMemberResponseBody body;

    public static DisableMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMemberResponse self = new DisableMemberResponse();
        return TeaModel.build(map, self);
    }

    public DisableMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMemberResponse setBody(DisableMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMemberResponseBody getBody() {
        return this.body;
    }

}
