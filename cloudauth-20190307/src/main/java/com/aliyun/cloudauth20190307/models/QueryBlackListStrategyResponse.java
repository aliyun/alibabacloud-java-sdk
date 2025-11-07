// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryBlackListStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBlackListStrategyResponseBody body;

    public static QueryBlackListStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlackListStrategyResponse self = new QueryBlackListStrategyResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlackListStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBlackListStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBlackListStrategyResponse setBody(QueryBlackListStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBlackListStrategyResponseBody getBody() {
        return this.body;
    }

}
