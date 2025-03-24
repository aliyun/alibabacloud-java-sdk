// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class OpenEmasServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenEmasServiceResponseBody body;

    public static OpenEmasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenEmasServiceResponse self = new OpenEmasServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenEmasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenEmasServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenEmasServiceResponse setBody(OpenEmasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenEmasServiceResponseBody getBody() {
        return this.body;
    }

}
