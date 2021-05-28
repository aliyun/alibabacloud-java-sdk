// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class OpenArmsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenArmsServiceResponseBody body;

    public static OpenArmsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsServiceResponse self = new OpenArmsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenArmsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenArmsServiceResponse setBody(OpenArmsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenArmsServiceResponseBody getBody() {
        return this.body;
    }

}
