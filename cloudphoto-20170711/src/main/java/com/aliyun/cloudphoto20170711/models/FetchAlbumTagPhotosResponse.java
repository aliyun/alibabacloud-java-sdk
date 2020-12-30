// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchAlbumTagPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FetchAlbumTagPhotosResponseBody body;

    public static FetchAlbumTagPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchAlbumTagPhotosResponse self = new FetchAlbumTagPhotosResponse();
        return TeaModel.build(map, self);
    }

    public FetchAlbumTagPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchAlbumTagPhotosResponse setBody(FetchAlbumTagPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchAlbumTagPhotosResponseBody getBody() {
        return this.body;
    }

}
