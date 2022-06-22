// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySceneFunctionPageableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySceneFunctionPageableResponseBody body;

    public static QuerySceneFunctionPageableResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneFunctionPageableResponse self = new QuerySceneFunctionPageableResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneFunctionPageableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneFunctionPageableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneFunctionPageableResponse setBody(QuerySceneFunctionPageableResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneFunctionPageableResponseBody getBody() {
        return this.body;
    }

}
