// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateChatConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatConfigResponseBody body;

    public static CreateChatConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatConfigResponse self = new CreateChatConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatConfigResponse setBody(CreateChatConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatConfigResponseBody getBody() {
        return this.body;
    }

}
