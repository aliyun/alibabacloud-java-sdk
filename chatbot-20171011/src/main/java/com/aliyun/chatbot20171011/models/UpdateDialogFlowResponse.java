// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDialogFlowResponseBody body;

    public static UpdateDialogFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogFlowResponse self = new UpdateDialogFlowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDialogFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDialogFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDialogFlowResponse setBody(UpdateDialogFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDialogFlowResponseBody getBody() {
        return this.body;
    }

}
