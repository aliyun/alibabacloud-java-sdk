// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyHotParamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHotParamRuleResponseBody body;

    public static ModifyHotParamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHotParamRuleResponse self = new ModifyHotParamRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHotParamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHotParamRuleResponse setBody(ModifyHotParamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHotParamRuleResponseBody getBody() {
        return this.body;
    }

}
