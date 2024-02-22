// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMonitorAgentProcessResponseBody body;

    public static CreateMonitorAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorAgentProcessResponse self = new CreateMonitorAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorAgentProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorAgentProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorAgentProcessResponse setBody(CreateMonitorAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorAgentProcessResponseBody getBody() {
        return this.body;
    }

}
