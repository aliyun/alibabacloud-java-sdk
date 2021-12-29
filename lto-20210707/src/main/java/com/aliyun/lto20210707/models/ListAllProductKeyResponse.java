// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllProductKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllProductKeyResponseBody body;

    public static ListAllProductKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllProductKeyResponse self = new ListAllProductKeyResponse();
        return TeaModel.build(map, self);
    }

    public ListAllProductKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllProductKeyResponse setBody(ListAllProductKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllProductKeyResponseBody getBody() {
        return this.body;
    }

}
