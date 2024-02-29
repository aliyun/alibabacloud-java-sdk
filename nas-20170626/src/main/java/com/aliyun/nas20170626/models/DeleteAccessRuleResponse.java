// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccessRuleResponseBody body;

    public static DeleteAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessRuleResponse self = new DeleteAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessRuleResponse setBody(DeleteAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessRuleResponseBody getBody() {
        return this.body;
    }

}
