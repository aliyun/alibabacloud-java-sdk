// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InstallAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallAgentResponseBody body;

    public static InstallAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentResponse self = new InstallAgentResponse();
        return TeaModel.build(map, self);
    }

    public InstallAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallAgentResponse setBody(InstallAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallAgentResponseBody getBody() {
        return this.body;
    }

}
