// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVccGrantRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVccGrantRuleResponseBody body;

    public static DeleteVccGrantRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVccGrantRuleResponse self = new DeleteVccGrantRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVccGrantRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVccGrantRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVccGrantRuleResponse setBody(DeleteVccGrantRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVccGrantRuleResponseBody getBody() {
        return this.body;
    }

}
