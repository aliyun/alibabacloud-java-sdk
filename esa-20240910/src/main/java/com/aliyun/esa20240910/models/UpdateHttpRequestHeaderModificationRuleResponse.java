// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpRequestHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpRequestHeaderModificationRuleResponseBody body;

    public static UpdateHttpRequestHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpRequestHeaderModificationRuleResponse self = new UpdateHttpRequestHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpRequestHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpRequestHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpRequestHeaderModificationRuleResponse setBody(UpdateHttpRequestHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpRequestHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
