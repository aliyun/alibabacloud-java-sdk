// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryGroupUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGroupUsersResponseBody body;

    public static QueryGroupUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupUsersResponse self = new QueryGroupUsersResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGroupUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGroupUsersResponse setBody(QueryGroupUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGroupUsersResponseBody getBody() {
        return this.body;
    }

}
