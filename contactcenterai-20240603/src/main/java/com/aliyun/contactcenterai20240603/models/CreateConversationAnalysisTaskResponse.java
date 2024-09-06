// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class CreateConversationAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConversationAnalysisTaskResponseBody body;

    public static CreateConversationAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConversationAnalysisTaskResponse self = new CreateConversationAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateConversationAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConversationAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConversationAnalysisTaskResponse setBody(CreateConversationAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConversationAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
