// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListShadowSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListShadowSchemasResponseBody body;

    public static ListShadowSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShadowSchemasResponse self = new ListShadowSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListShadowSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShadowSchemasResponse setBody(ListShadowSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShadowSchemasResponseBody getBody() {
        return this.body;
    }

}
