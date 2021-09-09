// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ReinstallCollectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReinstallCollectorResponseBody body;

    public static ReinstallCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinstallCollectorResponse self = new ReinstallCollectorResponse();
        return TeaModel.build(map, self);
    }

    public ReinstallCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinstallCollectorResponse setBody(ReinstallCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinstallCollectorResponseBody getBody() {
        return this.body;
    }

}
