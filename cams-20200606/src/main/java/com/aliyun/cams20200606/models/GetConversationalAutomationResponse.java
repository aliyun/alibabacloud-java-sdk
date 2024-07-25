// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetConversationalAutomationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConversationalAutomationResponseBody body;

    public static GetConversationalAutomationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConversationalAutomationResponse self = new GetConversationalAutomationResponse();
        return TeaModel.build(map, self);
    }

    public GetConversationalAutomationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConversationalAutomationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConversationalAutomationResponse setBody(GetConversationalAutomationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConversationalAutomationResponseBody getBody() {
        return this.body;
    }

}
