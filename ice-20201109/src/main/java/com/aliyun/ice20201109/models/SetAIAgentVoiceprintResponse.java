// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetAIAgentVoiceprintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAIAgentVoiceprintResponseBody body;

    public static SetAIAgentVoiceprintResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAIAgentVoiceprintResponse self = new SetAIAgentVoiceprintResponse();
        return TeaModel.build(map, self);
    }

    public SetAIAgentVoiceprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAIAgentVoiceprintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAIAgentVoiceprintResponse setBody(SetAIAgentVoiceprintResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAIAgentVoiceprintResponseBody getBody() {
        return this.body;
    }

}
