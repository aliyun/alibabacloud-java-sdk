// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class OpenArmsDefaultSLRResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenArmsDefaultSLRResponseBody body;

    public static OpenArmsDefaultSLRResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsDefaultSLRResponse self = new OpenArmsDefaultSLRResponse();
        return TeaModel.build(map, self);
    }

    public OpenArmsDefaultSLRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenArmsDefaultSLRResponse setBody(OpenArmsDefaultSLRResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenArmsDefaultSLRResponseBody getBody() {
        return this.body;
    }

}
