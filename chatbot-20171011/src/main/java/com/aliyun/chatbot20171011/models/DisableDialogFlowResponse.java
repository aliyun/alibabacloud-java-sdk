// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DisableDialogFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDialogFlowResponseBody body;

    public static DisableDialogFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDialogFlowResponse self = new DisableDialogFlowResponse();
        return TeaModel.build(map, self);
    }

    public DisableDialogFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDialogFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDialogFlowResponse setBody(DisableDialogFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDialogFlowResponseBody getBody() {
        return this.body;
    }

}
