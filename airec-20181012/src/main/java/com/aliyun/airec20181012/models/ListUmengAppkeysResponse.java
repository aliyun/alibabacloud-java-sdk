// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListUmengAppkeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUmengAppkeysResponseBody body;

    public static ListUmengAppkeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUmengAppkeysResponse self = new ListUmengAppkeysResponse();
        return TeaModel.build(map, self);
    }

    public ListUmengAppkeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUmengAppkeysResponse setBody(ListUmengAppkeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUmengAppkeysResponseBody getBody() {
        return this.body;
    }

}
