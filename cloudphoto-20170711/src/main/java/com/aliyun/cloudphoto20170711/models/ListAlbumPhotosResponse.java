// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListAlbumPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlbumPhotosResponseBody body;

    public static ListAlbumPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumPhotosResponse self = new ListAlbumPhotosResponse();
        return TeaModel.build(map, self);
    }

    public ListAlbumPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlbumPhotosResponse setBody(ListAlbumPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlbumPhotosResponseBody getBody() {
        return this.body;
    }

}
