// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteNetworkRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DeleteNetworkRuleResponse setBody(DeleteNetworkRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkRuleResponseBody getBody() {
        return this.body;
    }

}
