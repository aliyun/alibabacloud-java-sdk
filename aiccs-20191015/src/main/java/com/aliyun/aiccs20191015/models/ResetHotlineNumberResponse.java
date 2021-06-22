// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ResetHotlineNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetHotlineNumberResponseBody body;

    public static ResetHotlineNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetHotlineNumberResponse self = new ResetHotlineNumberResponse();
        return TeaModel.build(map, self);
    }

    public ResetHotlineNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetHotlineNumberResponse setBody(ResetHotlineNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetHotlineNumberResponseBody getBody() {
        return this.body;
    }

}
