// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorCrossBorderStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAcceleratorCrossBorderStatusResponseBody body;

    public static UpdateAcceleratorCrossBorderStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorCrossBorderStatusResponse self = new UpdateAcceleratorCrossBorderStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorCrossBorderStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAcceleratorCrossBorderStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAcceleratorCrossBorderStatusResponse setBody(UpdateAcceleratorCrossBorderStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAcceleratorCrossBorderStatusResponseBody getBody() {
        return this.body;
    }

}
