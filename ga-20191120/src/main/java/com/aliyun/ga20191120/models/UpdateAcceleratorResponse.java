// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAcceleratorResponseBody body;

    public static UpdateAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorResponse self = new UpdateAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAcceleratorResponse setBody(UpdateAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAcceleratorResponseBody getBody() {
        return this.body;
    }

}
