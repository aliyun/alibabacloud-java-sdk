// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateIndexTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIndexTemplateResponseBody body;

    public static CreateIndexTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexTemplateResponse self = new CreateIndexTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateIndexTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIndexTemplateResponse setBody(CreateIndexTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIndexTemplateResponseBody getBody() {
        return this.body;
    }

}
