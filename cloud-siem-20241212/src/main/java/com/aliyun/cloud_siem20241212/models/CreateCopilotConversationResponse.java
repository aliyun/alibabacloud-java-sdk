// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateCopilotConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCopilotConversationResponseBody body;

    public static CreateCopilotConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCopilotConversationResponse self = new CreateCopilotConversationResponse();
        return TeaModel.build(map, self);
    }

    public CreateCopilotConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCopilotConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCopilotConversationResponse setBody(CreateCopilotConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCopilotConversationResponseBody getBody() {
        return this.body;
    }

}
