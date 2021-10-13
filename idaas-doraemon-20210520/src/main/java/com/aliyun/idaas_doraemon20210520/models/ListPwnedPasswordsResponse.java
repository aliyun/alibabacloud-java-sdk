// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListPwnedPasswordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListPwnedPasswordsResponse setBody(ListPwnedPasswordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPwnedPasswordsResponseBody getBody() {
        return this.body;
    }

}
