// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryGlobalMonitorSceneFunctionCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGlobalMonitorSceneFunctionCategoriesResponseBody body;

    public static QueryGlobalMonitorSceneFunctionCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGlobalMonitorSceneFunctionCategoriesResponse self = new QueryGlobalMonitorSceneFunctionCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryGlobalMonitorSceneFunctionCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGlobalMonitorSceneFunctionCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGlobalMonitorSceneFunctionCategoriesResponse setBody(QueryGlobalMonitorSceneFunctionCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGlobalMonitorSceneFunctionCategoriesResponseBody getBody() {
        return this.body;
    }

}
