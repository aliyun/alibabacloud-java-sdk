// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySignInRecordPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySignInRecordPopResponseBody body;

    public static QuerySignInRecordPopResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySignInRecordPopResponse self = new QuerySignInRecordPopResponse();
        return TeaModel.build(map, self);
    }

    public QuerySignInRecordPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySignInRecordPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySignInRecordPopResponse setBody(QuerySignInRecordPopResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySignInRecordPopResponseBody getBody() {
        return this.body;
    }

}
