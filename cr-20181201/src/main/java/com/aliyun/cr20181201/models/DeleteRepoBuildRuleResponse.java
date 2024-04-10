// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRepoBuildRuleResponseBody body;

    public static DeleteRepoBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoBuildRuleResponse self = new DeleteRepoBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepoBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepoBuildRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepoBuildRuleResponse setBody(DeleteRepoBuildRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepoBuildRuleResponseBody getBody() {
        return this.body;
    }

}
