// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryAllGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAllGroupsResponseBody body;

    public static QueryAllGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllGroupsResponse self = new QueryAllGroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAllGroupsResponse setBody(QueryAllGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllGroupsResponseBody getBody() {
        return this.body;
    }

}
