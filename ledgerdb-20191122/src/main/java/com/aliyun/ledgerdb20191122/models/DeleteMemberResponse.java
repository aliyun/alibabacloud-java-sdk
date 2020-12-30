// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DeleteMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMemberResponseBody body;

    public static DeleteMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemberResponse self = new DeleteMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemberResponse setBody(DeleteMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemberResponseBody getBody() {
        return this.body;
    }

}
