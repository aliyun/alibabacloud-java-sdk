// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailTeaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryItemDetailTeaResponseBody body;

    public static QueryItemDetailTeaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailTeaResponse self = new QueryItemDetailTeaResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailTeaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemDetailTeaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemDetailTeaResponse setBody(QueryItemDetailTeaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemDetailTeaResponseBody getBody() {
        return this.body;
    }

}
