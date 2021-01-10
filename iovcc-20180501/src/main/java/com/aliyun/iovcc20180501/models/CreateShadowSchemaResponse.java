// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateShadowSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateShadowSchemaResponseBody body;

    public static CreateShadowSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShadowSchemaResponse self = new CreateShadowSchemaResponse();
        return TeaModel.build(map, self);
    }

    public CreateShadowSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShadowSchemaResponse setBody(CreateShadowSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateShadowSchemaResponseBody getBody() {
        return this.body;
    }

}
