// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveMessageGroupResponseBody body;

    public static DeleteLiveMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveMessageGroupResponse self = new DeleteLiveMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveMessageGroupResponse setBody(DeleteLiveMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveMessageGroupResponseBody getBody() {
        return this.body;
    }

}
