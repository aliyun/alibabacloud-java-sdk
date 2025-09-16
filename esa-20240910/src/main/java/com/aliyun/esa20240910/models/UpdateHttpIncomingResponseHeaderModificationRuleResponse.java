// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpIncomingResponseHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpIncomingResponseHeaderModificationRuleResponseBody body;

    public static UpdateHttpIncomingResponseHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpIncomingResponseHeaderModificationRuleResponse self = new UpdateHttpIncomingResponseHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleResponse setBody(UpdateHttpIncomingResponseHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpIncomingResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
