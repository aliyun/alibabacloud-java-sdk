// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAttackInstanceResponseBody body;

    public static QueryAttackInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceResponse self = new QueryAttackInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttackInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttackInstanceResponse setBody(QueryAttackInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAttackInstanceResponseBody getBody() {
        return this.body;
    }

}
