// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenWebHostingServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenWebHostingServiceResponseBody body;

    public static OpenWebHostingServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenWebHostingServiceResponse self = new OpenWebHostingServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenWebHostingServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenWebHostingServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenWebHostingServiceResponse setBody(OpenWebHostingServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenWebHostingServiceResponseBody getBody() {
        return this.body;
    }

}
