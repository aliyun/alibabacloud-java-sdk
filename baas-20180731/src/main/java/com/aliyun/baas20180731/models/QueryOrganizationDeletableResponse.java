// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryOrganizationDeletableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrganizationDeletableResponseBody body;

    public static QueryOrganizationDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationDeletableResponse self = new QueryOrganizationDeletableResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrganizationDeletableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrganizationDeletableResponse setBody(QueryOrganizationDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrganizationDeletableResponseBody getBody() {
        return this.body;
    }

}
