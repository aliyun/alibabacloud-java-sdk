// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layoutadmin20220801.models;

import com.aliyun.tea.*;

public class QueryRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRelationResponseBody body;

    public static QueryRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationResponse self = new QueryRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRelationResponse setBody(QueryRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRelationResponseBody getBody() {
        return this.body;
    }

}
