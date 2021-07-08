// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopLiveResponseBody body;

    public static StopLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveResponse self = new StopLiveResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLiveResponse setBody(StopLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLiveResponseBody getBody() {
        return this.body;
    }

}
