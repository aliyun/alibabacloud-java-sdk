// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeletePushRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePushRuleResponseBody body;

    public static DeletePushRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePushRuleResponse self = new DeletePushRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeletePushRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePushRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePushRuleResponse setBody(DeletePushRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePushRuleResponseBody getBody() {
        return this.body;
    }

}
