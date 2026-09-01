// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataAgentFeedbackResponseBody body;

    public static CreateDataAgentFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentFeedbackResponse self = new CreateDataAgentFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAgentFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataAgentFeedbackResponse setBody(CreateDataAgentFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAgentFeedbackResponseBody getBody() {
        return this.body;
    }

}
