// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySceneFunctionCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySceneFunctionCategoriesResponseBody body;

    public static QuerySceneFunctionCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneFunctionCategoriesResponse self = new QuerySceneFunctionCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneFunctionCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneFunctionCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneFunctionCategoriesResponse setBody(QuerySceneFunctionCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneFunctionCategoriesResponseBody getBody() {
        return this.body;
    }

}
