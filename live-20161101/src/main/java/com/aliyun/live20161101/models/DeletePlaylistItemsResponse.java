// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeletePlaylistItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePlaylistItemsResponseBody body;

    public static DeletePlaylistItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaylistItemsResponse self = new DeletePlaylistItemsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePlaylistItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePlaylistItemsResponse setBody(DeletePlaylistItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePlaylistItemsResponseBody getBody() {
        return this.body;
    }

}
