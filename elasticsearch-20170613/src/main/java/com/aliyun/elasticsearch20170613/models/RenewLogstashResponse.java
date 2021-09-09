// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RenewLogstashResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewLogstashResponseBody body;

    public static RenewLogstashResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewLogstashResponse self = new RenewLogstashResponse();
        return TeaModel.build(map, self);
    }

    public RenewLogstashResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewLogstashResponse setBody(RenewLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewLogstashResponseBody getBody() {
        return this.body;
    }

}
