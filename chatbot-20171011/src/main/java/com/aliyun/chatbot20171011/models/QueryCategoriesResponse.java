// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCategoriesResponseBody body;

    public static QueryCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCategoriesResponse self = new QueryCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCategoriesResponse setBody(QueryCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCategoriesResponseBody getBody() {
        return this.body;
    }

}
