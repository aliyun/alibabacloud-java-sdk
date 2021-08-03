// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyScaleStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScaleStrategyResponseBody body;

    public static ModifyScaleStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScaleStrategyResponse self = new ModifyScaleStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScaleStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScaleStrategyResponse setBody(ModifyScaleStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScaleStrategyResponseBody getBody() {
        return this.body;
    }

}
