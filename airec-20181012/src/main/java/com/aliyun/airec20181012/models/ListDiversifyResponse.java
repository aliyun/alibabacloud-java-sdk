// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDiversifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDiversifyResponseBody body;

    public static ListDiversifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiversifyResponse self = new ListDiversifyResponse();
        return TeaModel.build(map, self);
    }

    public ListDiversifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiversifyResponse setBody(ListDiversifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiversifyResponseBody getBody() {
        return this.body;
    }

}
