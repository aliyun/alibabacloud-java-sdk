// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePushRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePushRuleResponseBody body;

    public static UpdatePushRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePushRuleResponse self = new UpdatePushRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePushRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePushRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePushRuleResponse setBody(UpdatePushRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePushRuleResponseBody getBody() {
        return this.body;
    }

}
