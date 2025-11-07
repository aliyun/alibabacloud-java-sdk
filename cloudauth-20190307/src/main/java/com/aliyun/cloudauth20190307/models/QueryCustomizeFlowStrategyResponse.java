// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryCustomizeFlowStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomizeFlowStrategyResponseBody body;

    public static QueryCustomizeFlowStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomizeFlowStrategyResponse self = new QueryCustomizeFlowStrategyResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomizeFlowStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomizeFlowStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomizeFlowStrategyResponse setBody(QueryCustomizeFlowStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomizeFlowStrategyResponseBody getBody() {
        return this.body;
    }

}
