// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyLedgerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyLedgerAttributeResponseBody body;

    public static ModifyLedgerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLedgerAttributeResponse self = new ModifyLedgerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLedgerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLedgerAttributeResponse setBody(ModifyLedgerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLedgerAttributeResponseBody getBody() {
        return this.body;
    }

}
