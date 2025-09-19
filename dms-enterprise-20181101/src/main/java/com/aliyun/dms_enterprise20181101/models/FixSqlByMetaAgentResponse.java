// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class FixSqlByMetaAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FixSqlByMetaAgentResponseBody body;

    public static FixSqlByMetaAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        FixSqlByMetaAgentResponse self = new FixSqlByMetaAgentResponse();
        return TeaModel.build(map, self);
    }

    public FixSqlByMetaAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FixSqlByMetaAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FixSqlByMetaAgentResponse setBody(FixSqlByMetaAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public FixSqlByMetaAgentResponseBody getBody() {
        return this.body;
    }

}
