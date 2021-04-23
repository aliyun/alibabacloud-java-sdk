// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartPlaylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartPlaylistResponseBody body;

    public static StartPlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPlaylistResponse self = new StartPlaylistResponse();
        return TeaModel.build(map, self);
    }

    public StartPlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPlaylistResponse setBody(StartPlaylistResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPlaylistResponseBody getBody() {
        return this.body;
    }

}
