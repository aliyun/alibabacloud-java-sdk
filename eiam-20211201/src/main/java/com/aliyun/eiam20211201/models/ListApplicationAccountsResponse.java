// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationAccountsResponseBody body;

    public static ListApplicationAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAccountsResponse self = new ListApplicationAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationAccountsResponse setBody(ListApplicationAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationAccountsResponseBody getBody() {
        return this.body;
    }

}
