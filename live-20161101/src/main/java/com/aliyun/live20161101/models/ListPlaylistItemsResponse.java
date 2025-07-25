// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListPlaylistItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPlaylistItemsResponse setBody(ListPlaylistItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPlaylistItemsResponseBody getBody() {
        return this.body;
    }

}
