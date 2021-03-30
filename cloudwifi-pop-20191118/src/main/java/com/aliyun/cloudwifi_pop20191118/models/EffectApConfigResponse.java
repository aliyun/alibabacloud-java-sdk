// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class EffectApConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EffectApConfigResponseBody body;

    public static EffectApConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        EffectApConfigResponse self = new EffectApConfigResponse();
        return TeaModel.build(map, self);
    }

    public EffectApConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EffectApConfigResponse setBody(EffectApConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public EffectApConfigResponseBody getBody() {
        return this.body;
    }

}
