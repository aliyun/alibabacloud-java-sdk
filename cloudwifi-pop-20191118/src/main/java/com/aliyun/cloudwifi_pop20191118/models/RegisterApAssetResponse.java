// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RegisterApAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterApAssetResponseBody body;

    public static RegisterApAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterApAssetResponse self = new RegisterApAssetResponse();
        return TeaModel.build(map, self);
    }

    public RegisterApAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterApAssetResponse setBody(RegisterApAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterApAssetResponseBody getBody() {
        return this.body;
    }

}
