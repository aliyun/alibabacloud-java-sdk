// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteOpenSourcePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOpenSourcePermissionResponseBody body;

    public static DeleteOpenSourcePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSourcePermissionResponse self = new DeleteOpenSourcePermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSourcePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOpenSourcePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOpenSourcePermissionResponse setBody(DeleteOpenSourcePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOpenSourcePermissionResponseBody getBody() {
        return this.body;
    }

}
