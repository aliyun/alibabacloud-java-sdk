// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteNetworkRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkRuleResponseBody body;

    public static DeleteNetworkRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkRuleResponse self = new DeleteNetworkRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkRuleResponse setBody(DeleteNetworkRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkRuleResponseBody getBody() {
        return this.body;
    }

}
