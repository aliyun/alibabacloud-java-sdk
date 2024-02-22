// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteCustomizeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomizeRuleResponseBody body;

    public static DeleteCustomizeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizeRuleResponse self = new DeleteCustomizeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomizeRuleResponse setBody(DeleteCustomizeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizeRuleResponseBody getBody() {
        return this.body;
    }

}
