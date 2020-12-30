// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreatePhotoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePhotoResponseBody body;

    public static CreatePhotoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhotoResponse self = new CreatePhotoResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhotoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhotoResponse setBody(CreatePhotoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhotoResponseBody getBody() {
        return this.body;
    }

}
