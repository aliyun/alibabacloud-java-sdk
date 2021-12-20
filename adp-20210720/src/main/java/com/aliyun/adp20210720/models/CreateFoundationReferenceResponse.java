// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateFoundationReferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFoundationReferenceResponseBody body;

    public static CreateFoundationReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFoundationReferenceResponse self = new CreateFoundationReferenceResponse();
        return TeaModel.build(map, self);
    }

    public CreateFoundationReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFoundationReferenceResponse setBody(CreateFoundationReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFoundationReferenceResponseBody getBody() {
        return this.body;
    }

}
