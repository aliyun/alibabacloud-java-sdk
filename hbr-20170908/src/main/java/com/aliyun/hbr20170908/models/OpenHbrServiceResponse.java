// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class OpenHbrServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenHbrServiceResponseBody body;

    public static OpenHbrServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenHbrServiceResponse self = new OpenHbrServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenHbrServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenHbrServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenHbrServiceResponse setBody(OpenHbrServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenHbrServiceResponseBody getBody() {
        return this.body;
    }

}
