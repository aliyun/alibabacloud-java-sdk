// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterVideoResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EffectCasterVideoResourceResponseBody body;

    public static EffectCasterVideoResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterVideoResourceResponse self = new EffectCasterVideoResourceResponse();
        return TeaModel.build(map, self);
    }

    public EffectCasterVideoResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EffectCasterVideoResourceResponse setBody(EffectCasterVideoResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EffectCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

}
