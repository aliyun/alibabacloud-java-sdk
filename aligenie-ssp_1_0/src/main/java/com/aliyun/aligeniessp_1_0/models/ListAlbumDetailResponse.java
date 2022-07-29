// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlbumDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlbumDetailResponseBody body;

    public static ListAlbumDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumDetailResponse self = new ListAlbumDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListAlbumDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlbumDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlbumDetailResponse setBody(ListAlbumDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlbumDetailResponseBody getBody() {
        return this.body;
    }

}
