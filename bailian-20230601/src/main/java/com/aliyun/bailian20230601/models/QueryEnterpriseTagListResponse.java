// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseTagListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEnterpriseTagListResponseBody body;

    public static QueryEnterpriseTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseTagListResponse self = new QueryEnterpriseTagListResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEnterpriseTagListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEnterpriseTagListResponse setBody(QueryEnterpriseTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEnterpriseTagListResponseBody getBody() {
        return this.body;
    }

}
