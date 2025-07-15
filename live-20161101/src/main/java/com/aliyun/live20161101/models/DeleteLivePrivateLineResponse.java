// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePrivateLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLivePrivateLineResponseBody body;

    public static DeleteLivePrivateLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePrivateLineResponse self = new DeleteLivePrivateLineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivePrivateLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLivePrivateLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLivePrivateLineResponse setBody(DeleteLivePrivateLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLivePrivateLineResponseBody getBody() {
        return this.body;
    }

}
