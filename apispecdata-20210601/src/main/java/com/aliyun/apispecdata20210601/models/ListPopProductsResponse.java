// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListPopProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPopProductsResponseBody body;

    public static ListPopProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPopProductsResponse self = new ListPopProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListPopProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPopProductsResponse setBody(ListPopProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPopProductsResponseBody getBody() {
        return this.body;
    }

}
