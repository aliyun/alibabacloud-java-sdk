// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateKeyVersionResponseBody body;

    public static CreateKeyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyVersionResponse self = new CreateKeyVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateKeyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKeyVersionResponse setBody(CreateKeyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKeyVersionResponseBody getBody() {
        return this.body;
    }

}
