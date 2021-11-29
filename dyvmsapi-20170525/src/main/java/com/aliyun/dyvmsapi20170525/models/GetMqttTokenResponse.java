// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMqttTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqttTokenResponseBody body;

    public static GetMqttTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqttTokenResponse self = new GetMqttTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetMqttTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqttTokenResponse setBody(GetMqttTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqttTokenResponseBody getBody() {
        return this.body;
    }

}
