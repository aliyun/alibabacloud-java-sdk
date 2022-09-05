// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDriveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDriveResponseBody body;

    public static DeleteDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDriveResponse self = new DeleteDriveResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDriveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDriveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDriveResponse setBody(DeleteDriveResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDriveResponseBody getBody() {
        return this.body;
    }

}
