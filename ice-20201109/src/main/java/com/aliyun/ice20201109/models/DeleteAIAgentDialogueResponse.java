// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteAIAgentDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAIAgentDialogueResponseBody body;

    public static DeleteAIAgentDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIAgentDialogueResponse self = new DeleteAIAgentDialogueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIAgentDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIAgentDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAIAgentDialogueResponse setBody(DeleteAIAgentDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIAgentDialogueResponseBody getBody() {
        return this.body;
    }

}
