// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateConversationalAutomationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConversationalAutomationResponseBody body;

    public static UpdateConversationalAutomationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConversationalAutomationResponse self = new UpdateConversationalAutomationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConversationalAutomationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConversationalAutomationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConversationalAutomationResponse setBody(UpdateConversationalAutomationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConversationalAutomationResponseBody getBody() {
        return this.body;
    }

}
