// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpResponseHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpResponseHeaderModificationRuleResponseBody body;

    public static DeleteHttpResponseHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpResponseHeaderModificationRuleResponse self = new DeleteHttpResponseHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpResponseHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpResponseHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpResponseHeaderModificationRuleResponse setBody(DeleteHttpResponseHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
