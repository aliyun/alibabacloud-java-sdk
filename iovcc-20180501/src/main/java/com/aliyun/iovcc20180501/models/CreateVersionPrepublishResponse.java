// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionPrepublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVersionPrepublishResponseBody body;

    public static CreateVersionPrepublishResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPrepublishResponse self = new CreateVersionPrepublishResponse();
        return TeaModel.build(map, self);
    }

    public CreateVersionPrepublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVersionPrepublishResponse setBody(CreateVersionPrepublishResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVersionPrepublishResponseBody getBody() {
        return this.body;
    }

}
