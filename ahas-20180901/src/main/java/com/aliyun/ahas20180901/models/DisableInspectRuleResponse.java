// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableInspectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableInspectRuleResponseBody body;

    public static DisableInspectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableInspectRuleResponse self = new DisableInspectRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableInspectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableInspectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableInspectRuleResponse setBody(DisableInspectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInspectRuleResponseBody getBody() {
        return this.body;
    }

}
