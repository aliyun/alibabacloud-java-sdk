// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatFlowResponseBody body;

    public static CreateChatFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatFlowResponse self = new CreateChatFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatFlowResponse setBody(CreateChatFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatFlowResponseBody getBody() {
        return this.body;
    }

}
