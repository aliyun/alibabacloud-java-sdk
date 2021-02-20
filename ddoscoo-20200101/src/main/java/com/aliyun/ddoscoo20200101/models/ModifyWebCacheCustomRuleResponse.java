// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheCustomRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebCacheCustomRuleResponseBody body;

    public static ModifyWebCacheCustomRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheCustomRuleResponse self = new ModifyWebCacheCustomRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheCustomRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebCacheCustomRuleResponse setBody(ModifyWebCacheCustomRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebCacheCustomRuleResponseBody getBody() {
        return this.body;
    }

}
