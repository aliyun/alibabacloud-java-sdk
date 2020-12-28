// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateHotParamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHotParamRuleResponseBody body;

    public static CreateHotParamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHotParamRuleResponse self = new CreateHotParamRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateHotParamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHotParamRuleResponse setBody(CreateHotParamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHotParamRuleResponseBody getBody() {
        return this.body;
    }

}
