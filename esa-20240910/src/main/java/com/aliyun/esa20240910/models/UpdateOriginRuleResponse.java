// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOriginRuleResponseBody body;

    public static UpdateOriginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginRuleResponse self = new UpdateOriginRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOriginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOriginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOriginRuleResponse setBody(UpdateOriginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOriginRuleResponseBody getBody() {
        return this.body;
    }

}
