// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteDriveSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDriveSpaceResponseBody body;

    public static DeleteDriveSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDriveSpaceResponse self = new DeleteDriveSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDriveSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDriveSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDriveSpaceResponse setBody(DeleteDriveSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDriveSpaceResponseBody getBody() {
        return this.body;
    }

}
