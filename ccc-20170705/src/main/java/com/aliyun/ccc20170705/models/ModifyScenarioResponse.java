// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyScenarioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScenarioResponseBody body;

    public static ModifyScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScenarioResponse self = new ModifyScenarioResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScenarioResponse setBody(ModifyScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScenarioResponseBody getBody() {
        return this.body;
    }

}
