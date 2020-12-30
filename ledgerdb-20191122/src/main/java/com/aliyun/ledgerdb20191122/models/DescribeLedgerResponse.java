// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DescribeLedgerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLedgerResponseBody body;

    public static DescribeLedgerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLedgerResponse self = new DescribeLedgerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLedgerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLedgerResponse setBody(DescribeLedgerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLedgerResponseBody getBody() {
        return this.body;
    }

}
