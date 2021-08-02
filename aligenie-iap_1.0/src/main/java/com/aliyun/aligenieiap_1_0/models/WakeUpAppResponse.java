// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class WakeUpAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public WakeUpAppResponseBody body;

    public static WakeUpAppResponse build(java.util.Map<String, ?> map) throws Exception {
        WakeUpAppResponse self = new WakeUpAppResponse();
        return TeaModel.build(map, self);
    }

    public WakeUpAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WakeUpAppResponse setBody(WakeUpAppResponseBody body) {
        this.body = body;
        return this;
    }
    public WakeUpAppResponseBody getBody() {
        return this.body;
    }

}
