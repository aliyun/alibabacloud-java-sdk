// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MoveAlbumPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveAlbumPhotosResponseBody body;

    public static MoveAlbumPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveAlbumPhotosResponse self = new MoveAlbumPhotosResponse();
        return TeaModel.build(map, self);
    }

    public MoveAlbumPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveAlbumPhotosResponse setBody(MoveAlbumPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveAlbumPhotosResponseBody getBody() {
        return this.body;
    }

}
