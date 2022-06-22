// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryUserScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserScenesResponseBody body;

    public static QueryUserScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserScenesResponse self = new QueryUserScenesResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserScenesResponse setBody(QueryUserScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserScenesResponseBody getBody() {
        return this.body;
    }

}
