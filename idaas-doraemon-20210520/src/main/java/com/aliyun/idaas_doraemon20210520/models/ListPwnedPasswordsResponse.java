// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListPwnedPasswordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPwnedPasswordsResponseBody body;

    public static ListPwnedPasswordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPwnedPasswordsResponse self = new ListPwnedPasswordsResponse();
        return TeaModel.build(map, self);
    }

    public ListPwnedPasswordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPwnedPasswordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPwnedPasswordsResponse setBody(ListPwnedPasswordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPwnedPasswordsResponseBody getBody() {
        return this.body;
    }

}
