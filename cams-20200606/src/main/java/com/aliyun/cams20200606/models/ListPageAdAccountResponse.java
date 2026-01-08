// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListPageAdAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPageAdAccountResponseBody body;

    public static ListPageAdAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPageAdAccountResponse self = new ListPageAdAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListPageAdAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPageAdAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPageAdAccountResponse setBody(ListPageAdAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPageAdAccountResponseBody getBody() {
        return this.body;
    }

}
