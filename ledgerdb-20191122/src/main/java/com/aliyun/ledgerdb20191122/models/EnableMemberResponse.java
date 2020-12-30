// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class EnableMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMemberResponseBody body;

    public static EnableMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMemberResponse self = new EnableMemberResponse();
        return TeaModel.build(map, self);
    }

    public EnableMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMemberResponse setBody(EnableMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMemberResponseBody getBody() {
        return this.body;
    }

}
