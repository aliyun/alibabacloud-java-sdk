// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryQuickSceneByCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryQuickSceneByCategoryResponseBody body;

    public static QueryQuickSceneByCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQuickSceneByCategoryResponse self = new QueryQuickSceneByCategoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryQuickSceneByCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQuickSceneByCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryQuickSceneByCategoryResponse setBody(QueryQuickSceneByCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQuickSceneByCategoryResponseBody getBody() {
        return this.body;
    }

}
