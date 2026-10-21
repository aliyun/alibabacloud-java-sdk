// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetCopilotConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCopilotConversationResponseBody body;

    public static GetCopilotConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotConversationResponse self = new GetCopilotConversationResponse();
        return TeaModel.build(map, self);
    }

    public GetCopilotConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopilotConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCopilotConversationResponse setBody(GetCopilotConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopilotConversationResponseBody getBody() {
        return this.body;
    }

}
