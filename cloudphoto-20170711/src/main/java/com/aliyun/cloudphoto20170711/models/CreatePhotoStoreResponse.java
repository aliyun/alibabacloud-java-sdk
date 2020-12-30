// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreatePhotoStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePhotoStoreResponseBody body;

    public static CreatePhotoStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhotoStoreResponse self = new CreatePhotoStoreResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhotoStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhotoStoreResponse setBody(CreatePhotoStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhotoStoreResponseBody getBody() {
        return this.body;
    }

}
