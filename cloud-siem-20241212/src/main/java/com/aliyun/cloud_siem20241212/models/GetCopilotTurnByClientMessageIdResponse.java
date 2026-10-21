// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetCopilotTurnByClientMessageIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCopilotTurnByClientMessageIdResponseBody body;

    public static GetCopilotTurnByClientMessageIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotTurnByClientMessageIdResponse self = new GetCopilotTurnByClientMessageIdResponse();
        return TeaModel.build(map, self);
    }

    public GetCopilotTurnByClientMessageIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopilotTurnByClientMessageIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCopilotTurnByClientMessageIdResponse setBody(GetCopilotTurnByClientMessageIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopilotTurnByClientMessageIdResponseBody getBody() {
        return this.body;
    }

}
