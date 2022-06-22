// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySceneFunctionsBySceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySceneFunctionsBySceneResponseBody body;

    public static QuerySceneFunctionsBySceneResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneFunctionsBySceneResponse self = new QuerySceneFunctionsBySceneResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneFunctionsBySceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneFunctionsBySceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneFunctionsBySceneResponse setBody(QuerySceneFunctionsBySceneResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneFunctionsBySceneResponseBody getBody() {
        return this.body;
    }

}
