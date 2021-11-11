// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StartApmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartApmResponseBody body;

    public static StartApmResponse build(java.util.Map<String, ?> map) throws Exception {
        StartApmResponse self = new StartApmResponse();
        return TeaModel.build(map, self);
    }

    public StartApmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartApmResponse setBody(StartApmResponseBody body) {
        this.body = body;
        return this;
    }
    public StartApmResponseBody getBody() {
        return this.body;
    }

}
