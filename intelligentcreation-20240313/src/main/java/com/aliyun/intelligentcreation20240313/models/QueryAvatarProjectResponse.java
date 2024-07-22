// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAvatarProjectResponseBody body;

    public static QueryAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarProjectResponse self = new QueryAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAvatarProjectResponse setBody(QueryAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
