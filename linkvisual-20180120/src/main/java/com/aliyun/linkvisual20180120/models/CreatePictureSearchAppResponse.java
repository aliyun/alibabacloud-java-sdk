// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePictureSearchAppResponseBody body;

    public static CreatePictureSearchAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePictureSearchAppResponse self = new CreatePictureSearchAppResponse();
        return TeaModel.build(map, self);
    }

    public CreatePictureSearchAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePictureSearchAppResponse setBody(CreatePictureSearchAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePictureSearchAppResponseBody getBody() {
        return this.body;
    }

}
