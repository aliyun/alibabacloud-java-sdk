// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitoringAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMonitoringAgentProcessResponseBody body;

    public static CreateMonitoringAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitoringAgentProcessResponse self = new CreateMonitoringAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitoringAgentProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitoringAgentProcessResponse setBody(CreateMonitoringAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

}
