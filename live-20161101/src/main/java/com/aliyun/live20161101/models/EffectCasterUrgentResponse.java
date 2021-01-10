// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterUrgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EffectCasterUrgentResponseBody body;

    public static EffectCasterUrgentResponse build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterUrgentResponse self = new EffectCasterUrgentResponse();
        return TeaModel.build(map, self);
    }

    public EffectCasterUrgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EffectCasterUrgentResponse setBody(EffectCasterUrgentResponseBody body) {
        this.body = body;
        return this;
    }
    public EffectCasterUrgentResponseBody getBody() {
        return this.body;
    }

}
