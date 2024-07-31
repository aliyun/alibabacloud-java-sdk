// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateAndPulishAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAndPulishAgentResponseBody body;

    public static CreateAndPulishAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndPulishAgentResponse self = new CreateAndPulishAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndPulishAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndPulishAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndPulishAgentResponse setBody(CreateAndPulishAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndPulishAgentResponseBody getBody() {
        return this.body;
    }

}
