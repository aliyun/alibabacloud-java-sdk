// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class RefreshMqttTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshMqttTokenResponseBody body;

    public static RefreshMqttTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshMqttTokenResponse self = new RefreshMqttTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshMqttTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshMqttTokenResponse setBody(RefreshMqttTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshMqttTokenResponseBody getBody() {
        return this.body;
    }

}
