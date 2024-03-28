// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAcceleratorAutoRenewAttributeResponseBody body;

    public static UpdateAcceleratorAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorAutoRenewAttributeResponse self = new UpdateAcceleratorAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAcceleratorAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAcceleratorAutoRenewAttributeResponse setBody(UpdateAcceleratorAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAcceleratorAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
