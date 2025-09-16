// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpIncomingRequestHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpIncomingRequestHeaderModificationRuleResponseBody body;

    public static UpdateHttpIncomingRequestHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpIncomingRequestHeaderModificationRuleResponse self = new UpdateHttpIncomingRequestHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleResponse setBody(UpdateHttpIncomingRequestHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpIncomingRequestHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
