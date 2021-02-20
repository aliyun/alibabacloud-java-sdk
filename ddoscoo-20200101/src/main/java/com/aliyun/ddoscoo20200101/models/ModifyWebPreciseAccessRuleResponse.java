// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebPreciseAccessRuleResponseBody body;

    public static ModifyWebPreciseAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPreciseAccessRuleResponse self = new ModifyWebPreciseAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebPreciseAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebPreciseAccessRuleResponse setBody(ModifyWebPreciseAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebPreciseAccessRuleResponseBody getBody() {
        return this.body;
    }

}
