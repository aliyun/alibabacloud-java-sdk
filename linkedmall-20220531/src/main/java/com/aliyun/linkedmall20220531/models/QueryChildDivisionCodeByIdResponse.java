// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryChildDivisionCodeByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryChildDivisionCodeByIdResponseBody body;

    public static QueryChildDivisionCodeByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChildDivisionCodeByIdResponse self = new QueryChildDivisionCodeByIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryChildDivisionCodeByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChildDivisionCodeByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChildDivisionCodeByIdResponse setBody(QueryChildDivisionCodeByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChildDivisionCodeByIdResponseBody getBody() {
        return this.body;
    }

}
