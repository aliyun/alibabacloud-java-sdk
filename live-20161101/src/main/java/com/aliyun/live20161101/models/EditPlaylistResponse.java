// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditPlaylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditPlaylistResponseBody body;

    public static EditPlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        EditPlaylistResponse self = new EditPlaylistResponse();
        return TeaModel.build(map, self);
    }

    public EditPlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditPlaylistResponse setBody(EditPlaylistResponseBody body) {
        this.body = body;
        return this;
    }
    public EditPlaylistResponseBody getBody() {
        return this.body;
    }

}
