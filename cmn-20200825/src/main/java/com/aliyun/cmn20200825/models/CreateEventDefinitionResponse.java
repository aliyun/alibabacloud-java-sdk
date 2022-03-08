// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateEventDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEventDefinitionResponseBody body;

    public static CreateEventDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEventDefinitionResponse self = new CreateEventDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public CreateEventDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEventDefinitionResponse setBody(CreateEventDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventDefinitionResponseBody getBody() {
        return this.body;
    }

}
