// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryAvatarListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAvatarListResponseBody body;

    public static QueryAvatarListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarListResponse self = new QueryAvatarListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvatarListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvatarListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAvatarListResponse setBody(QueryAvatarListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvatarListResponseBody getBody() {
        return this.body;
    }

}
