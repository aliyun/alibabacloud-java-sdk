// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class OpenAckServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenAckServiceResponseBody body;

    public static OpenAckServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAckServiceResponse self = new OpenAckServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenAckServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAckServiceResponse setBody(OpenAckServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAckServiceResponseBody getBody() {
        return this.body;
    }

}
