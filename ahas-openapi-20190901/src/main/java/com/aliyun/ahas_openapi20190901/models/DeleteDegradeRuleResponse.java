// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDegradeRuleResponseBody body;

    public static DeleteDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDegradeRuleResponse self = new DeleteDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDegradeRuleResponse setBody(DeleteDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
