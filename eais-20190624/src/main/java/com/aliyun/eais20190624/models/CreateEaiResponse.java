// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEaiResponseBody body;

    public static CreateEaiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiResponse self = new CreateEaiResponse();
        return TeaModel.build(map, self);
    }

    public CreateEaiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEaiResponse setBody(CreateEaiResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEaiResponseBody getBody() {
        return this.body;
    }

}
