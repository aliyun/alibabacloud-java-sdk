// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RemoveAlbumPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAlbumPhotosResponseBody body;

    public static RemoveAlbumPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAlbumPhotosResponse self = new RemoveAlbumPhotosResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAlbumPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAlbumPhotosResponse setBody(RemoveAlbumPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAlbumPhotosResponseBody getBody() {
        return this.body;
    }

}
