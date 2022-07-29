// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlbumIsAddedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlbumIsAddedResponseBody body;

    public static ListAlbumIsAddedResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumIsAddedResponse self = new ListAlbumIsAddedResponse();
        return TeaModel.build(map, self);
    }

    public ListAlbumIsAddedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlbumIsAddedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlbumIsAddedResponse setBody(ListAlbumIsAddedResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlbumIsAddedResponseBody getBody() {
        return this.body;
    }

}
