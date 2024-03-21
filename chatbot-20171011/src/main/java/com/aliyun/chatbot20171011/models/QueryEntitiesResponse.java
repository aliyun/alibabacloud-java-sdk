// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEntitiesResponseBody body;

    public static QueryEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEntitiesResponse self = new QueryEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEntitiesResponse setBody(QueryEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEntitiesResponseBody getBody() {
        return this.body;
    }

}
