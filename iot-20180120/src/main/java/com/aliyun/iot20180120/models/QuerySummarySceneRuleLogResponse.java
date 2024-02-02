// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySummarySceneRuleLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySummarySceneRuleLogResponseBody body;

    public static QuerySummarySceneRuleLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySummarySceneRuleLogResponse self = new QuerySummarySceneRuleLogResponse();
        return TeaModel.build(map, self);
    }

    public QuerySummarySceneRuleLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySummarySceneRuleLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySummarySceneRuleLogResponse setBody(QuerySummarySceneRuleLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySummarySceneRuleLogResponseBody getBody() {
        return this.body;
    }

}
