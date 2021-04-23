// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPlaylistItemsResponseBody body;

    public static ListPlaylistItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistItemsResponse self = new ListPlaylistItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListPlaylistItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPlaylistItemsResponse setBody(ListPlaylistItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPlaylistItemsResponseBody getBody() {
        return this.body;
    }

}
