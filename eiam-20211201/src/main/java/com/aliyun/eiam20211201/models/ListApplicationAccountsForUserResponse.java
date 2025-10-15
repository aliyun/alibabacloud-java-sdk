// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationAccountsForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationAccountsForUserResponseBody body;

    public static ListApplicationAccountsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAccountsForUserResponse self = new ListApplicationAccountsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationAccountsForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationAccountsForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationAccountsForUserResponse setBody(ListApplicationAccountsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationAccountsForUserResponseBody getBody() {
        return this.body;
    }

}
