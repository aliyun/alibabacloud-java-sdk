// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListOpenSourceAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOpenSourceAccountsResponseBody body;

    public static ListOpenSourceAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenSourceAccountsResponse self = new ListOpenSourceAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenSourceAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpenSourceAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOpenSourceAccountsResponse setBody(ListOpenSourceAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenSourceAccountsResponseBody getBody() {
        return this.body;
    }

}
