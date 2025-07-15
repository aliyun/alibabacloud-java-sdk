// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveStreamBlockResponseBody body;

    public static DeleteLiveStreamBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamBlockResponse self = new DeleteLiveStreamBlockResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveStreamBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveStreamBlockResponse setBody(DeleteLiveStreamBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveStreamBlockResponseBody getBody() {
        return this.body;
    }

}
