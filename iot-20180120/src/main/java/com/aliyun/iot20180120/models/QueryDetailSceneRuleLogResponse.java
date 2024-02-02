// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDetailSceneRuleLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDetailSceneRuleLogResponseBody body;

    public static QueryDetailSceneRuleLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailSceneRuleLogResponse self = new QueryDetailSceneRuleLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryDetailSceneRuleLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDetailSceneRuleLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDetailSceneRuleLogResponse setBody(QueryDetailSceneRuleLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDetailSceneRuleLogResponseBody getBody() {
        return this.body;
    }

}
