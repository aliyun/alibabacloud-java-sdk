// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserProvisioningResponseBody body;

    public static UpdateUserProvisioningResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserProvisioningResponse self = new UpdateUserProvisioningResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserProvisioningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserProvisioningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserProvisioningResponse setBody(UpdateUserProvisioningResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserProvisioningResponseBody getBody() {
        return this.body;
    }

}
