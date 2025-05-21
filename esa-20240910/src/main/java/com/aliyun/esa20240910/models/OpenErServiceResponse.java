// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class OpenErServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenErServiceResponseBody body;

    public static OpenErServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenErServiceResponse self = new OpenErServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenErServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenErServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenErServiceResponse setBody(OpenErServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenErServiceResponseBody getBody() {
        return this.body;
    }

}
