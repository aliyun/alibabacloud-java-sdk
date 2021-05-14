// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SwitchGlobalBroadcastTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchGlobalBroadcastTypeResponseBody body;

    public static SwitchGlobalBroadcastTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchGlobalBroadcastTypeResponse self = new SwitchGlobalBroadcastTypeResponse();
        return TeaModel.build(map, self);
    }

    public SwitchGlobalBroadcastTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchGlobalBroadcastTypeResponse setBody(SwitchGlobalBroadcastTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchGlobalBroadcastTypeResponseBody getBody() {
        return this.body;
    }

}
