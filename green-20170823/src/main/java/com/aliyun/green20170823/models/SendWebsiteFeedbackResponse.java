// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendWebsiteFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendWebsiteFeedbackResponseBody body;

    public static SendWebsiteFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SendWebsiteFeedbackResponse self = new SendWebsiteFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public SendWebsiteFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendWebsiteFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendWebsiteFeedbackResponse setBody(SendWebsiteFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SendWebsiteFeedbackResponseBody getBody() {
        return this.body;
    }

}
