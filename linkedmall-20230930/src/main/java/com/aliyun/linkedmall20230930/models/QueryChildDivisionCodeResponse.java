// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class QueryChildDivisionCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DivisionPageResult body;

    public static QueryChildDivisionCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChildDivisionCodeResponse self = new QueryChildDivisionCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryChildDivisionCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChildDivisionCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChildDivisionCodeResponse setBody(DivisionPageResult body) {
        this.body = body;
        return this;
    }
    public DivisionPageResult getBody() {
        return this.body;
    }

}
