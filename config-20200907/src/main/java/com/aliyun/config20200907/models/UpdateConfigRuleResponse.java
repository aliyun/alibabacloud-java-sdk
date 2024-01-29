// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigRuleResponseBody body;

    public static UpdateConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRuleResponse self = new UpdateConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigRuleResponse setBody(UpdateConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigRuleResponseBody getBody() {
        return this.body;
    }

}
