// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySceneFunctionParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySceneFunctionParametersResponseBody body;

    public static QuerySceneFunctionParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneFunctionParametersResponse self = new QuerySceneFunctionParametersResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneFunctionParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneFunctionParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneFunctionParametersResponse setBody(QuerySceneFunctionParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneFunctionParametersResponseBody getBody() {
        return this.body;
    }

}
