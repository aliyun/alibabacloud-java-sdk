// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentImportNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentImportNumberResponseBody body;

    public static AgentImportNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        AgentImportNumberResponse self = new AgentImportNumberResponse();
        return TeaModel.build(map, self);
    }

    public AgentImportNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgentImportNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgentImportNumberResponse setBody(AgentImportNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public AgentImportNumberResponseBody getBody() {
        return this.body;
    }

}
