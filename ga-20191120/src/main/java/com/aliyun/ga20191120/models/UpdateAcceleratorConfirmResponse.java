// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorConfirmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAcceleratorConfirmResponseBody body;

    public static UpdateAcceleratorConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorConfirmResponse self = new UpdateAcceleratorConfirmResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAcceleratorConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAcceleratorConfirmResponse setBody(UpdateAcceleratorConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAcceleratorConfirmResponseBody getBody() {
        return this.body;
    }

}
