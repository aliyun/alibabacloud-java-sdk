// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DeleteLedgerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLedgerResponseBody body;

    public static DeleteLedgerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLedgerResponse self = new DeleteLedgerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLedgerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLedgerResponse setBody(DeleteLedgerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLedgerResponseBody getBody() {
        return this.body;
    }

}
