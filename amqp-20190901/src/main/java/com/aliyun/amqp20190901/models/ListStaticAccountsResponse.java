// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListStaticAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStaticAccountsResponseBody body;

    public static ListStaticAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStaticAccountsResponse self = new ListStaticAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListStaticAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStaticAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStaticAccountsResponse setBody(ListStaticAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStaticAccountsResponseBody getBody() {
        return this.body;
    }

}
