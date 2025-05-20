// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class CreateChatSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatSessionResponseBody body;

    public static CreateChatSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatSessionResponse self = new CreateChatSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatSessionResponse setBody(CreateChatSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatSessionResponseBody getBody() {
        return this.body;
    }

}
