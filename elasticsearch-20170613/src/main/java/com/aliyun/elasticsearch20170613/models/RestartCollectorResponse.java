// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartCollectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartCollectorResponseBody body;

    public static RestartCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartCollectorResponse self = new RestartCollectorResponse();
        return TeaModel.build(map, self);
    }

    public RestartCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartCollectorResponse setBody(RestartCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartCollectorResponseBody getBody() {
        return this.body;
    }

}
