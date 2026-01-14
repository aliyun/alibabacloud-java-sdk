// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class QueryAgentInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAgentInfoResponseBody body;

    public static QueryAgentInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentInfoResponse self = new QueryAgentInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgentInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAgentInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAgentInfoResponse setBody(QueryAgentInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAgentInfoResponseBody getBody() {
        return this.body;
    }

}
