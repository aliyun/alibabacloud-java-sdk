// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class OpenChatappServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenChatappServiceResponseBody body;

    public static OpenChatappServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenChatappServiceResponse self = new OpenChatappServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenChatappServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenChatappServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenChatappServiceResponse setBody(OpenChatappServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenChatappServiceResponseBody getBody() {
        return this.body;
    }

}
