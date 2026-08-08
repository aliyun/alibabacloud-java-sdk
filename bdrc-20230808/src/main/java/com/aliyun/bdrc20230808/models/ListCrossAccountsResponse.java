// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListCrossAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCrossAccountsResponseBody body;

    public static ListCrossAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrossAccountsResponse self = new ListCrossAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListCrossAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrossAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrossAccountsResponse setBody(ListCrossAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrossAccountsResponseBody getBody() {
        return this.body;
    }

}
