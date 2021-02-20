// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebCCRuleResponseBody body;

    public static ModifyWebCCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCCRuleResponse self = new ModifyWebCCRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebCCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebCCRuleResponse setBody(ModifyWebCCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebCCRuleResponseBody getBody() {
        return this.body;
    }

}
