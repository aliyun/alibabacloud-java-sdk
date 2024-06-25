// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class UpdateAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentStatusResponseBody body;

    public static UpdateAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentStatusResponse self = new UpdateAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentStatusResponse setBody(UpdateAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentStatusResponseBody getBody() {
        return this.body;
    }

}
