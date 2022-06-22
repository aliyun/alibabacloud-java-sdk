// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryFissionSceneFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFissionSceneFunctionsResponseBody body;

    public static QueryFissionSceneFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFissionSceneFunctionsResponse self = new QueryFissionSceneFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryFissionSceneFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFissionSceneFunctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFissionSceneFunctionsResponse setBody(QueryFissionSceneFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFissionSceneFunctionsResponseBody getBody() {
        return this.body;
    }

}
