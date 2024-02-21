// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class OpenCdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenCdnServiceResponseBody body;

    public static OpenCdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCdnServiceResponse self = new OpenCdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenCdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCdnServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenCdnServiceResponse setBody(OpenCdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCdnServiceResponseBody getBody() {
        return this.body;
    }

}
