// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseDataListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEnterpriseDataListResponseBody body;

    public static QueryEnterpriseDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseDataListResponse self = new QueryEnterpriseDataListResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEnterpriseDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEnterpriseDataListResponse setBody(QueryEnterpriseDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEnterpriseDataListResponseBody getBody() {
        return this.body;
    }

}
