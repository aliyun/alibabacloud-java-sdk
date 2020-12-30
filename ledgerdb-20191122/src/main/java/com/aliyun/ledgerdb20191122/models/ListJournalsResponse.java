// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListJournalsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListJournalsResponseBody body;

    public static ListJournalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJournalsResponse self = new ListJournalsResponse();
        return TeaModel.build(map, self);
    }

    public ListJournalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJournalsResponse setBody(ListJournalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJournalsResponseBody getBody() {
        return this.body;
    }

}
