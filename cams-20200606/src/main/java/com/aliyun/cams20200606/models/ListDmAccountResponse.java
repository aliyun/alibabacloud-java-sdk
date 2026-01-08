// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListDmAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDmAccountResponseBody body;

    public static ListDmAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDmAccountResponse self = new ListDmAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListDmAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDmAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDmAccountResponse setBody(ListDmAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDmAccountResponseBody getBody() {
        return this.body;
    }

}
