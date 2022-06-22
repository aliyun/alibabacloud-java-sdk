// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySceneFunctionUsedCountByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySceneFunctionUsedCountByIdResponseBody body;

    public static QuerySceneFunctionUsedCountByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneFunctionUsedCountByIdResponse self = new QuerySceneFunctionUsedCountByIdResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneFunctionUsedCountByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneFunctionUsedCountByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneFunctionUsedCountByIdResponse setBody(QuerySceneFunctionUsedCountByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneFunctionUsedCountByIdResponseBody getBody() {
        return this.body;
    }

}
