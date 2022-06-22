// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySceneFunctionsByCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySceneFunctionsByCodeResponseBody body;

    public static QuerySceneFunctionsByCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneFunctionsByCodeResponse self = new QuerySceneFunctionsByCodeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneFunctionsByCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneFunctionsByCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneFunctionsByCodeResponse setBody(QuerySceneFunctionsByCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneFunctionsByCodeResponseBody getBody() {
        return this.body;
    }

}
