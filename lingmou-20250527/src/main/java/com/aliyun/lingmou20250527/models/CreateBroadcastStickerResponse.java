// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBroadcastStickerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBroadcastStickerResponseBody body;

    public static CreateBroadcastStickerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBroadcastStickerResponse self = new CreateBroadcastStickerResponse();
        return TeaModel.build(map, self);
    }

    public CreateBroadcastStickerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBroadcastStickerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBroadcastStickerResponse setBody(CreateBroadcastStickerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBroadcastStickerResponseBody getBody() {
        return this.body;
    }

}
