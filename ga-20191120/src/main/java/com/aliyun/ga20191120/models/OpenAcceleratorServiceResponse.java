// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class OpenAcceleratorServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenAcceleratorServiceResponseBody body;

    public static OpenAcceleratorServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAcceleratorServiceResponse self = new OpenAcceleratorServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenAcceleratorServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAcceleratorServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenAcceleratorServiceResponse setBody(OpenAcceleratorServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAcceleratorServiceResponseBody getBody() {
        return this.body;
    }

}
