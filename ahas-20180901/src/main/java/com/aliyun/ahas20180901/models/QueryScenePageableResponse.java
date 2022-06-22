// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryScenePageableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryScenePageableResponseBody body;

    public static QueryScenePageableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScenePageableResponse self = new QueryScenePageableResponse();
        return TeaModel.build(map, self);
    }

    public QueryScenePageableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScenePageableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScenePageableResponse setBody(QueryScenePageableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScenePageableResponseBody getBody() {
        return this.body;
    }

}
