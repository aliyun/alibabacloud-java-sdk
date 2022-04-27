// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCardsResponseBody body;

    public static ListCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCardsResponse self = new ListCardsResponse();
        return TeaModel.build(map, self);
    }

    public ListCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCardsResponse setBody(ListCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCardsResponseBody getBody() {
        return this.body;
    }

}
