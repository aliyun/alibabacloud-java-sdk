// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryAvatarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAvatarResponseBody body;

    public static QueryAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarResponse self = new QueryAvatarResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAvatarResponse setBody(QueryAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvatarResponseBody getBody() {
        return this.body;
    }

}
