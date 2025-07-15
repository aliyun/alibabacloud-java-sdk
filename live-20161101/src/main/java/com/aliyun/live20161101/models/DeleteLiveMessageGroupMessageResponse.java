// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveMessageGroupMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveMessageGroupMessageResponseBody body;

    public static DeleteLiveMessageGroupMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveMessageGroupMessageResponse self = new DeleteLiveMessageGroupMessageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveMessageGroupMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveMessageGroupMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveMessageGroupMessageResponse setBody(DeleteLiveMessageGroupMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveMessageGroupMessageResponseBody getBody() {
        return this.body;
    }

}
