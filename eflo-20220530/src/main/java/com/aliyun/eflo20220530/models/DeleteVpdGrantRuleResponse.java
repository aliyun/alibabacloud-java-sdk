// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVpdGrantRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVpdGrantRuleResponseBody body;

    public static DeleteVpdGrantRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpdGrantRuleResponse self = new DeleteVpdGrantRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpdGrantRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpdGrantRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpdGrantRuleResponse setBody(DeleteVpdGrantRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpdGrantRuleResponseBody getBody() {
        return this.body;
    }

}
