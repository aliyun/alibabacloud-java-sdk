// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RenameAlbumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenameAlbumResponseBody body;

    public static RenameAlbumResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameAlbumResponse self = new RenameAlbumResponse();
        return TeaModel.build(map, self);
    }

    public RenameAlbumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameAlbumResponse setBody(RenameAlbumResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameAlbumResponseBody getBody() {
        return this.body;
    }

}
