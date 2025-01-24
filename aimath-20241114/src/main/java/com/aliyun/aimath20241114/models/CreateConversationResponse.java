// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class CreateConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConversationResponseBody body;

    public static CreateConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConversationResponse self = new CreateConversationResponse();
        return TeaModel.build(map, self);
    }

    public CreateConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConversationResponse setBody(CreateConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConversationResponseBody getBody() {
        return this.body;
    }

}
