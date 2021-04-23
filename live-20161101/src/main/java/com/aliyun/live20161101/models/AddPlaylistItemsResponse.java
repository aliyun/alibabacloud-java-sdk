// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddPlaylistItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddPlaylistItemsResponseBody body;

    public static AddPlaylistItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPlaylistItemsResponse self = new AddPlaylistItemsResponse();
        return TeaModel.build(map, self);
    }

    public AddPlaylistItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPlaylistItemsResponse setBody(AddPlaylistItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPlaylistItemsResponseBody getBody() {
        return this.body;
    }

}
