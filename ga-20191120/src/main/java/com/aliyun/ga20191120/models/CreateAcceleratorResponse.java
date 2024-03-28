// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAcceleratorResponseBody body;

    public static CreateAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAcceleratorResponse self = new CreateAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public CreateAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAcceleratorResponse setBody(CreateAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAcceleratorResponseBody getBody() {
        return this.body;
    }

}
