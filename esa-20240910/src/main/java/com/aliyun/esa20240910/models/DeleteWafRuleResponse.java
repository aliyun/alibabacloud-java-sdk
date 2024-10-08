// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteWafRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWafRuleResponseBody body;

    public static DeleteWafRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWafRuleResponse self = new DeleteWafRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWafRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWafRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWafRuleResponse setBody(DeleteWafRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWafRuleResponseBody getBody() {
        return this.body;
    }

}
