// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeletePlaylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePlaylistResponseBody body;

    public static DeletePlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaylistResponse self = new DeletePlaylistResponse();
        return TeaModel.build(map, self);
    }

    public DeletePlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePlaylistResponse setBody(DeletePlaylistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePlaylistResponseBody getBody() {
        return this.body;
    }

}
