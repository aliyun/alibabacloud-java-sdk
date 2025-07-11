// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateChatFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateChatFlowResponseBody body;

    public static UpdateChatFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatFlowResponse self = new UpdateChatFlowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChatFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChatFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChatFlowResponse setBody(UpdateChatFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChatFlowResponseBody getBody() {
        return this.body;
    }

}
