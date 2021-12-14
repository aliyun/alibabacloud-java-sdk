// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class DestoryNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DestoryNumberResponseBody body;

    public static DestoryNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DestoryNumberResponse self = new DestoryNumberResponse();
        return TeaModel.build(map, self);
    }

    public DestoryNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestoryNumberResponse setBody(DestoryNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DestoryNumberResponseBody getBody() {
        return this.body;
    }

}
