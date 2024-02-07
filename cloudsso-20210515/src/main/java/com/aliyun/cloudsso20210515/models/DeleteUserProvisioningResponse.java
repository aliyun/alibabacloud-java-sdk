// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserProvisioningResponseBody body;

    public static DeleteUserProvisioningResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserProvisioningResponse self = new DeleteUserProvisioningResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserProvisioningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserProvisioningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserProvisioningResponse setBody(DeleteUserProvisioningResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserProvisioningResponseBody getBody() {
        return this.body;
    }

}
