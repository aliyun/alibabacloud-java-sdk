// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryOrgHonorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrgHonorsResponseBody body;

    public static QueryOrgHonorsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgHonorsResponse self = new QueryOrgHonorsResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrgHonorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrgHonorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrgHonorsResponse setBody(QueryOrgHonorsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrgHonorsResponseBody getBody() {
        return this.body;
    }

}
