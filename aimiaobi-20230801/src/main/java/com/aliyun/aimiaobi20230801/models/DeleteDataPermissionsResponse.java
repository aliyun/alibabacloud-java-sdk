// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteDataPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataPermissionsResponseBody body;

    public static DeleteDataPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataPermissionsResponse self = new DeleteDataPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataPermissionsResponse setBody(DeleteDataPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataPermissionsResponseBody getBody() {
        return this.body;
    }

}
