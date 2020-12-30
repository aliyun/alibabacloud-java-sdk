// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateFacePersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFacePersonResponseBody body;

    public static CreateFacePersonResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFacePersonResponse self = new CreateFacePersonResponse();
        return TeaModel.build(map, self);
    }

    public CreateFacePersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFacePersonResponse setBody(CreateFacePersonResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFacePersonResponseBody getBody() {
        return this.body;
    }

}
