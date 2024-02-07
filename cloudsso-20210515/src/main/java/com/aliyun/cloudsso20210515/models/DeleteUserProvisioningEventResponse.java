// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserProvisioningEventResponseBody body;

    public static DeleteUserProvisioningEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserProvisioningEventResponse self = new DeleteUserProvisioningEventResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserProvisioningEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserProvisioningEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserProvisioningEventResponse setBody(DeleteUserProvisioningEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserProvisioningEventResponseBody getBody() {
        return this.body;
    }

}
