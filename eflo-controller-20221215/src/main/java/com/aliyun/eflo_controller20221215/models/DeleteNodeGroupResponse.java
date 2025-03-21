// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNodeGroupResponseBody body;

    public static DeleteNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeGroupResponse self = new DeleteNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNodeGroupResponse setBody(DeleteNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNodeGroupResponseBody getBody() {
        return this.body;
    }

}
