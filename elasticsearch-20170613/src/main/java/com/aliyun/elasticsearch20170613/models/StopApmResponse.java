// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopApmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopApmResponseBody body;

    public static StopApmResponse build(java.util.Map<String, ?> map) throws Exception {
        StopApmResponse self = new StopApmResponse();
        return TeaModel.build(map, self);
    }

    public StopApmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopApmResponse setBody(StopApmResponseBody body) {
        this.body = body;
        return this;
    }
    public StopApmResponseBody getBody() {
        return this.body;
    }

}
