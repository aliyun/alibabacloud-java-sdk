// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetJournalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJournalResponseBody body;

    public static GetJournalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJournalResponse self = new GetJournalResponse();
        return TeaModel.build(map, self);
    }

    public GetJournalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJournalResponse setBody(GetJournalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJournalResponseBody getBody() {
        return this.body;
    }

}
