// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class CreateMixResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMixResponseBody body;

    public static CreateMixResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMixResponse self = new CreateMixResponse();
        return TeaModel.build(map, self);
    }

    public CreateMixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMixResponse setBody(CreateMixResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMixResponseBody getBody() {
        return this.body;
    }

}
