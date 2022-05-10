// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveResponseBody body;

    public static DeleteLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveResponse self = new DeleteLiveResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveResponse setBody(DeleteLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveResponseBody getBody() {
        return this.body;
    }

}
