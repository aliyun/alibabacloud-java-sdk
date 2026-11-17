// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteModelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelGroupResponseBody body;

    public static DeleteModelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelGroupResponse self = new DeleteModelGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelGroupResponse setBody(DeleteModelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelGroupResponseBody getBody() {
        return this.body;
    }

}
