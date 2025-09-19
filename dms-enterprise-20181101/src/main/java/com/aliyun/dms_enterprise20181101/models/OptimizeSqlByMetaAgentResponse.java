// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class OptimizeSqlByMetaAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OptimizeSqlByMetaAgentResponseBody body;

    public static OptimizeSqlByMetaAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        OptimizeSqlByMetaAgentResponse self = new OptimizeSqlByMetaAgentResponse();
        return TeaModel.build(map, self);
    }

    public OptimizeSqlByMetaAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OptimizeSqlByMetaAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OptimizeSqlByMetaAgentResponse setBody(OptimizeSqlByMetaAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public OptimizeSqlByMetaAgentResponseBody getBody() {
        return this.body;
    }

}
