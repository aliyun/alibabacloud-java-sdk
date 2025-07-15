// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveMessageUserMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveMessageUserMessageResponseBody body;

    public static DeleteLiveMessageUserMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveMessageUserMessageResponse self = new DeleteLiveMessageUserMessageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveMessageUserMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveMessageUserMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveMessageUserMessageResponse setBody(DeleteLiveMessageUserMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveMessageUserMessageResponseBody getBody() {
        return this.body;
    }

}
