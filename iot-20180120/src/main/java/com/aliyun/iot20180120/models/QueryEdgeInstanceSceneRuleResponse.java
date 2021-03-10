// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEdgeInstanceSceneRuleResponseBody body;

    public static QueryEdgeInstanceSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceSceneRuleResponse self = new QueryEdgeInstanceSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceSceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceSceneRuleResponse setBody(QueryEdgeInstanceSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceSceneRuleResponseBody getBody() {
        return this.body;
    }

}
