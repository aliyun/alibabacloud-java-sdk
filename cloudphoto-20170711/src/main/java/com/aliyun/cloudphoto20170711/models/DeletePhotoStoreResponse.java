// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeletePhotoStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePhotoStoreResponseBody body;

    public static DeletePhotoStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhotoStoreResponse self = new DeletePhotoStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhotoStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePhotoStoreResponse setBody(DeletePhotoStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePhotoStoreResponseBody getBody() {
        return this.body;
    }

}
