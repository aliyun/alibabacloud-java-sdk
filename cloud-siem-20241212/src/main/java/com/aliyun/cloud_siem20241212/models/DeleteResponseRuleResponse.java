// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteResponseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResponseRuleResponseBody body;

    public static DeleteResponseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResponseRuleResponse self = new DeleteResponseRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResponseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResponseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResponseRuleResponse setBody(DeleteResponseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResponseRuleResponseBody getBody() {
        return this.body;
    }

}
