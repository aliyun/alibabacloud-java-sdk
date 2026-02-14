// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OperateCustomAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateCustomAgentResponseBody body;

    public static OperateCustomAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateCustomAgentResponse self = new OperateCustomAgentResponse();
        return TeaModel.build(map, self);
    }

    public OperateCustomAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateCustomAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateCustomAgentResponse setBody(OperateCustomAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateCustomAgentResponseBody getBody() {
        return this.body;
    }

}
