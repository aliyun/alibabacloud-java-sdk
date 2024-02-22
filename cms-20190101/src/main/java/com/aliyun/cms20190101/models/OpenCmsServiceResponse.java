// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class OpenCmsServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenCmsServiceResponseBody body;

    public static OpenCmsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCmsServiceResponse self = new OpenCmsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenCmsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCmsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenCmsServiceResponse setBody(OpenCmsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCmsServiceResponseBody getBody() {
        return this.body;
    }

}
