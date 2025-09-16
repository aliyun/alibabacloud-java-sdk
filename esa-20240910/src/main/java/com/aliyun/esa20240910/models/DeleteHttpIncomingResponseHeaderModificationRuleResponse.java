// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpIncomingResponseHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpIncomingResponseHeaderModificationRuleResponseBody body;

    public static DeleteHttpIncomingResponseHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpIncomingResponseHeaderModificationRuleResponse self = new DeleteHttpIncomingResponseHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpIncomingResponseHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpIncomingResponseHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpIncomingResponseHeaderModificationRuleResponse setBody(DeleteHttpIncomingResponseHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpIncomingResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
