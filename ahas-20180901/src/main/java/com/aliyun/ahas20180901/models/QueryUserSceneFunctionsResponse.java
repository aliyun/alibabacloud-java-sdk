// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryUserSceneFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserSceneFunctionsResponseBody body;

    public static QueryUserSceneFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserSceneFunctionsResponse self = new QueryUserSceneFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserSceneFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserSceneFunctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserSceneFunctionsResponse setBody(QueryUserSceneFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserSceneFunctionsResponseBody getBody() {
        return this.body;
    }

}
