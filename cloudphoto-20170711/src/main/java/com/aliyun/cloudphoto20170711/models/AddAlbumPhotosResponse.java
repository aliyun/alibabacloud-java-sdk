// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class AddAlbumPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAlbumPhotosResponseBody body;

    public static AddAlbumPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAlbumPhotosResponse self = new AddAlbumPhotosResponse();
        return TeaModel.build(map, self);
    }

    public AddAlbumPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAlbumPhotosResponse setBody(AddAlbumPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAlbumPhotosResponseBody getBody() {
        return this.body;
    }

}
