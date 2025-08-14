// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ClearAIAgentVoiceprintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearAIAgentVoiceprintResponseBody body;

    public static ClearAIAgentVoiceprintResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearAIAgentVoiceprintResponse self = new ClearAIAgentVoiceprintResponse();
        return TeaModel.build(map, self);
    }

    public ClearAIAgentVoiceprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearAIAgentVoiceprintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearAIAgentVoiceprintResponse setBody(ClearAIAgentVoiceprintResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearAIAgentVoiceprintResponseBody getBody() {
        return this.body;
    }

}
