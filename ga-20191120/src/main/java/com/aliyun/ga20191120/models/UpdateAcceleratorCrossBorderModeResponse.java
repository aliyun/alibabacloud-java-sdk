// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorCrossBorderModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAcceleratorCrossBorderModeResponseBody body;

    public static UpdateAcceleratorCrossBorderModeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorCrossBorderModeResponse self = new UpdateAcceleratorCrossBorderModeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorCrossBorderModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAcceleratorCrossBorderModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAcceleratorCrossBorderModeResponse setBody(UpdateAcceleratorCrossBorderModeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAcceleratorCrossBorderModeResponseBody getBody() {
        return this.body;
    }

}
