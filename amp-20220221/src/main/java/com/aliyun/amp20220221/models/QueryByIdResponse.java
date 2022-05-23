// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amp20220221.models;

import com.aliyun.tea.*;

public class QueryByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryByIdResponseBody body;

    public static QueryByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryByIdResponse self = new QueryByIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryByIdResponse setBody(QueryByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryByIdResponseBody getBody() {
        return this.body;
    }

}
