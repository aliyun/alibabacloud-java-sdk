// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateChatappTemplateResponse setBody(CreateChatappTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatappTemplateResponseBody getBody() {
        return this.body;
    }

}
