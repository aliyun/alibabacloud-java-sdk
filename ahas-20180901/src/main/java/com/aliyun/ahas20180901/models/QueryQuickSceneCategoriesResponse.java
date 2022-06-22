// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryQuickSceneCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryQuickSceneCategoriesResponseBody body;

    public static QueryQuickSceneCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQuickSceneCategoriesResponse self = new QueryQuickSceneCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryQuickSceneCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQuickSceneCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryQuickSceneCategoriesResponse setBody(QueryQuickSceneCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQuickSceneCategoriesResponseBody getBody() {
        return this.body;
    }

}
