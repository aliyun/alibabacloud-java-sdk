// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KopilotFeedbackResponseBody body;

    public static KopilotFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        KopilotFeedbackResponse self = new KopilotFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public KopilotFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KopilotFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KopilotFeedbackResponse setBody(KopilotFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public KopilotFeedbackResponseBody getBody() {
        return this.body;
    }

}
