// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebRuleResponseBody body;

    public static ModifyWebRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebRuleResponse self = new ModifyWebRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebRuleResponse setBody(ModifyWebRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebRuleResponseBody getBody() {
        return this.body;
    }

}
