// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseDataTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEnterpriseDataTagResponseBody body;

    public static QueryEnterpriseDataTagResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseDataTagResponse self = new QueryEnterpriseDataTagResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseDataTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEnterpriseDataTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEnterpriseDataTagResponse setBody(QueryEnterpriseDataTagResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEnterpriseDataTagResponseBody getBody() {
        return this.body;
    }

}
