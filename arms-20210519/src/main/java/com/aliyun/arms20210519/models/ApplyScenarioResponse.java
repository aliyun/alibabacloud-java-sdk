// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ApplyScenarioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyScenarioResponseBody body;

    public static ApplyScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyScenarioResponse self = new ApplyScenarioResponse();
        return TeaModel.build(map, self);
    }

    public ApplyScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyScenarioResponse setBody(ApplyScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyScenarioResponseBody getBody() {
        return this.body;
    }

}
