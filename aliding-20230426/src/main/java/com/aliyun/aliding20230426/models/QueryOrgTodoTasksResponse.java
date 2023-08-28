// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryOrgTodoTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrgTodoTasksResponseBody body;

    public static QueryOrgTodoTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgTodoTasksResponse self = new QueryOrgTodoTasksResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrgTodoTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrgTodoTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrgTodoTasksResponse setBody(QueryOrgTodoTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrgTodoTasksResponseBody getBody() {
        return this.body;
    }

}
