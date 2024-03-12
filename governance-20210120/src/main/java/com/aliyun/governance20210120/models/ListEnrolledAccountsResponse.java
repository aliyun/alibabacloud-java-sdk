// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEnrolledAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnrolledAccountsResponseBody body;

    public static ListEnrolledAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnrolledAccountsResponse self = new ListEnrolledAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnrolledAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnrolledAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnrolledAccountsResponse setBody(ListEnrolledAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnrolledAccountsResponseBody getBody() {
        return this.body;
    }

}
