// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListTimeAnchorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTimeAnchorsResponseBody body;

    public static ListTimeAnchorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTimeAnchorsResponse self = new ListTimeAnchorsResponse();
        return TeaModel.build(map, self);
    }

    public ListTimeAnchorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTimeAnchorsResponse setBody(ListTimeAnchorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTimeAnchorsResponseBody getBody() {
        return this.body;
    }

}
