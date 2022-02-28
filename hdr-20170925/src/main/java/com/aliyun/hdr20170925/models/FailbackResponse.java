// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class FailbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FailbackResponseBody body;

    public static FailbackResponse build(java.util.Map<String, ?> map) throws Exception {
        FailbackResponse self = new FailbackResponse();
        return TeaModel.build(map, self);
    }

    public FailbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailbackResponse setBody(FailbackResponseBody body) {
        this.body = body;
        return this;
    }
    public FailbackResponseBody getBody() {
        return this.body;
    }

}
