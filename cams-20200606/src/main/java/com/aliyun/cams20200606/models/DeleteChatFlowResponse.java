// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChatFlowResponseBody body;

    public static DeleteChatFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatFlowResponse self = new DeleteChatFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChatFlowResponse setBody(DeleteChatFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatFlowResponseBody getBody() {
        return this.body;
    }

}
