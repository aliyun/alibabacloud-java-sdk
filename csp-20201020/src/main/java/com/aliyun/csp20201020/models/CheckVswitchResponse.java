// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckVswitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckVswitchResponseBody body;

    public static CheckVswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVswitchResponse self = new CheckVswitchResponse();
        return TeaModel.build(map, self);
    }

    public CheckVswitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckVswitchResponse setBody(CheckVswitchResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckVswitchResponseBody getBody() {
        return this.body;
    }

}
