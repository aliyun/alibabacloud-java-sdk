// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubAlbumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubAlbumResponseBody body;

    public static ListSubAlbumResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubAlbumResponse self = new ListSubAlbumResponse();
        return TeaModel.build(map, self);
    }

    public ListSubAlbumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubAlbumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubAlbumResponse setBody(ListSubAlbumResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubAlbumResponseBody getBody() {
        return this.body;
    }

}
