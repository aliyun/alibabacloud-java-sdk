// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateDialogFlowResponse setBody(UpdateDialogFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDialogFlowResponseBody getBody() {
        return this.body;
    }

}
