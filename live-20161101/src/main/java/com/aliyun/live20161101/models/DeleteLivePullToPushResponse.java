// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePullToPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLivePullToPushResponseBody body;

    public static DeleteLivePullToPushResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePullToPushResponse self = new DeleteLivePullToPushResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivePullToPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLivePullToPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLivePullToPushResponse setBody(DeleteLivePullToPushResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLivePullToPushResponseBody getBody() {
        return this.body;
    }

}
