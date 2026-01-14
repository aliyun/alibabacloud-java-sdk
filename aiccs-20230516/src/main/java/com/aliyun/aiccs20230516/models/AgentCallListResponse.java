// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentCallListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentCallListResponseBody body;

    public static AgentCallListResponse build(java.util.Map<String, ?> map) throws Exception {
        AgentCallListResponse self = new AgentCallListResponse();
        return TeaModel.build(map, self);
    }

    public AgentCallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgentCallListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgentCallListResponse setBody(AgentCallListResponseBody body) {
        this.body = body;
        return this;
    }
    public AgentCallListResponseBody getBody() {
        return this.body;
    }

}
