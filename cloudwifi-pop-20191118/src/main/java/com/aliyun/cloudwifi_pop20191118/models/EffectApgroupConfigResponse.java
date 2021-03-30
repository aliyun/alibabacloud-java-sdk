// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class EffectApgroupConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EffectApgroupConfigResponseBody body;

    public static EffectApgroupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        EffectApgroupConfigResponse self = new EffectApgroupConfigResponse();
        return TeaModel.build(map, self);
    }

    public EffectApgroupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EffectApgroupConfigResponse setBody(EffectApgroupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public EffectApgroupConfigResponseBody getBody() {
        return this.body;
    }

}
