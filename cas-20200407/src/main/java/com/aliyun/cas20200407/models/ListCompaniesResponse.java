// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCompaniesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCompaniesResponseBody body;

    public static ListCompaniesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCompaniesResponse self = new ListCompaniesResponse();
        return TeaModel.build(map, self);
    }

    public ListCompaniesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCompaniesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCompaniesResponse setBody(ListCompaniesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCompaniesResponseBody getBody() {
        return this.body;
    }

}
