// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpIncomingRequestHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpIncomingRequestHeaderModificationRuleResponseBody body;

    public static DeleteHttpIncomingRequestHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpIncomingRequestHeaderModificationRuleResponse self = new DeleteHttpIncomingRequestHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpIncomingRequestHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpIncomingRequestHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpIncomingRequestHeaderModificationRuleResponse setBody(DeleteHttpIncomingRequestHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpIncomingRequestHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
