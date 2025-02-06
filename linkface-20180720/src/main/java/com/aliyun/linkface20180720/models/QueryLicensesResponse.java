// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryLicensesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLicensesResponseBody body;

    public static QueryLicensesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLicensesResponse self = new QueryLicensesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLicensesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLicensesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLicensesResponse setBody(QueryLicensesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLicensesResponseBody getBody() {
        return this.body;
    }

}
