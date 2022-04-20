// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StopCallInConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopCallInConfigResponseBody body;

    public static StopCallInConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCallInConfigResponse self = new StopCallInConfigResponse();
        return TeaModel.build(map, self);
    }

    public StopCallInConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCallInConfigResponse setBody(StopCallInConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCallInConfigResponseBody getBody() {
        return this.body;
    }

}
