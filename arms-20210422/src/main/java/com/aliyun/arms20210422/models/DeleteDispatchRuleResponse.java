// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDispatchRuleResponseBody body;

    public static DeleteDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDispatchRuleResponse self = new DeleteDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDispatchRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDispatchRuleResponse setBody(DeleteDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
