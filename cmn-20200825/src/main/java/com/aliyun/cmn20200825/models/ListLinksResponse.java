// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLinksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinksResponseBody body;

    public static ListLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinksResponse self = new ListLinksResponse();
        return TeaModel.build(map, self);
    }

    public ListLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinksResponse setBody(ListLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinksResponseBody getBody() {
        return this.body;
    }

}
