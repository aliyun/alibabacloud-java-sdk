// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySceneRuleResponseBody body;

    public static QuerySceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneRuleResponse self = new QuerySceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneRuleResponse setBody(QuerySceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneRuleResponseBody getBody() {
        return this.body;
    }

}
