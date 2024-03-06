// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class OpenKmsServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenKmsServiceResponseBody body;

    public static OpenKmsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenKmsServiceResponse self = new OpenKmsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenKmsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenKmsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenKmsServiceResponse setBody(OpenKmsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenKmsServiceResponseBody getBody() {
        return this.body;
    }

}
