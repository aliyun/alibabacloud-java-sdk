// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListUmengAppkeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListUmengAppkeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUmengAppkeysResponse setBody(ListUmengAppkeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUmengAppkeysResponseBody getBody() {
        return this.body;
    }

}
