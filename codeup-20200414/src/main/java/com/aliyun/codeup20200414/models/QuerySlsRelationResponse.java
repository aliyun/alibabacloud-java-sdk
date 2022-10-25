// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class QuerySlsRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySlsRelationResponseBody body;

    public static QuerySlsRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsRelationResponse self = new QuerySlsRelationResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlsRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlsRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySlsRelationResponse setBody(QuerySlsRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlsRelationResponseBody getBody() {
        return this.body;
    }

}
