// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpResponseHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpResponseHeaderModificationRuleResponseBody body;

    public static UpdateHttpResponseHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpResponseHeaderModificationRuleResponse self = new UpdateHttpResponseHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpResponseHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpResponseHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpResponseHeaderModificationRuleResponse setBody(UpdateHttpResponseHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
