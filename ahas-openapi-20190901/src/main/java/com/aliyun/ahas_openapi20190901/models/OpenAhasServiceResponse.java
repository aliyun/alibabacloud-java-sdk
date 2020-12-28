// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class OpenAhasServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenAhasServiceResponseBody body;

    public static OpenAhasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAhasServiceResponse self = new OpenAhasServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenAhasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAhasServiceResponse setBody(OpenAhasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAhasServiceResponseBody getBody() {
        return this.body;
    }

}
