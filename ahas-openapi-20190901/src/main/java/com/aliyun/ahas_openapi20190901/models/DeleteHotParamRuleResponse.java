// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteHotParamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHotParamRuleResponseBody body;

    public static DeleteHotParamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotParamRuleResponse self = new DeleteHotParamRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHotParamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHotParamRuleResponse setBody(DeleteHotParamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHotParamRuleResponseBody getBody() {
        return this.body;
    }

}
