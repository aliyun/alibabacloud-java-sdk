// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatappTemplateResponseBody body;

    public static CreateChatappTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateResponse self = new CreateChatappTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatappTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatappTemplateResponse setBody(CreateChatappTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatappTemplateResponseBody getBody() {
        return this.body;
    }

}
