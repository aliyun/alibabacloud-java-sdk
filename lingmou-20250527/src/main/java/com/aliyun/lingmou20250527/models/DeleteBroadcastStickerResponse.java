// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class DeleteBroadcastStickerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBroadcastStickerResponseBody body;

    public static DeleteBroadcastStickerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBroadcastStickerResponse self = new DeleteBroadcastStickerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBroadcastStickerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBroadcastStickerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBroadcastStickerResponse setBody(DeleteBroadcastStickerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBroadcastStickerResponseBody getBody() {
        return this.body;
    }

}
