// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMonitorAgentProcessResponse setBody(CreateMonitorAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorAgentProcessResponseBody getBody() {
        return this.body;
    }

}
