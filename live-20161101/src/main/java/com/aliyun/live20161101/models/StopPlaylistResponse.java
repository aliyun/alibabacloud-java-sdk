// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopPlaylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopPlaylistResponseBody body;

    public static StopPlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        StopPlaylistResponse self = new StopPlaylistResponse();
        return TeaModel.build(map, self);
    }

    public StopPlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopPlaylistResponse setBody(StopPlaylistResponseBody body) {
        this.body = body;
        return this;
    }
    public StopPlaylistResponseBody getBody() {
        return this.body;
    }

}
