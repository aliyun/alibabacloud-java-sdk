// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPlaylistResponseBody body;

    public static ListPlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistResponse self = new ListPlaylistResponse();
        return TeaModel.build(map, self);
    }

    public ListPlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPlaylistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPlaylistResponse setBody(ListPlaylistResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPlaylistResponseBody getBody() {
        return this.body;
    }

}
