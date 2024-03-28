// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenServiceResponseBody body;

    public static OpenServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceResponse self = new OpenServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenServiceResponse setBody(OpenServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenServiceResponseBody getBody() {
        return this.body;
    }

}
