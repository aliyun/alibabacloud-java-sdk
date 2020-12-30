// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreateAlbumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAlbumResponseBody body;

    public static CreateAlbumResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlbumResponse self = new CreateAlbumResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlbumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlbumResponse setBody(CreateAlbumResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlbumResponseBody getBody() {
        return this.body;
    }

}
