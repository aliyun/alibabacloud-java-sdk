// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteContainerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContainerGroupResponseBody body;

    public static DeleteContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerGroupResponse self = new DeleteContainerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContainerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContainerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContainerGroupResponse setBody(DeleteContainerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContainerGroupResponseBody getBody() {
        return this.body;
    }

}
