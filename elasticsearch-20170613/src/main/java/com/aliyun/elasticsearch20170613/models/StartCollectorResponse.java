// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StartCollectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartCollectorResponseBody body;

    public static StartCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCollectorResponse self = new StartCollectorResponse();
        return TeaModel.build(map, self);
    }

    public StartCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCollectorResponse setBody(StartCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCollectorResponseBody getBody() {
        return this.body;
    }

}
