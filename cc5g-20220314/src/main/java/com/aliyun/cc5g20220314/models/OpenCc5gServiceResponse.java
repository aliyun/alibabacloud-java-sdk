// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class OpenCc5gServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenCc5gServiceResponseBody body;

    public static OpenCc5gServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCc5gServiceResponse self = new OpenCc5gServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenCc5gServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCc5gServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenCc5gServiceResponse setBody(OpenCc5gServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCc5gServiceResponseBody getBody() {
        return this.body;
    }

}
