// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class InflightTaskTimeoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InflightTaskTimeoutResponseBody body;

    public static InflightTaskTimeoutResponse build(java.util.Map<String, ?> map) throws Exception {
        InflightTaskTimeoutResponse self = new InflightTaskTimeoutResponse();
        return TeaModel.build(map, self);
    }

    public InflightTaskTimeoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InflightTaskTimeoutResponse setBody(InflightTaskTimeoutResponseBody body) {
        this.body = body;
        return this;
    }
    public InflightTaskTimeoutResponseBody getBody() {
        return this.body;
    }

}
