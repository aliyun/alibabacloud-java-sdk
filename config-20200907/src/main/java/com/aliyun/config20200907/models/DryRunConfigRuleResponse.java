// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DryRunConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DryRunConfigRuleResponseBody body;

    public static DryRunConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DryRunConfigRuleResponse self = new DryRunConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public DryRunConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DryRunConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DryRunConfigRuleResponse setBody(DryRunConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DryRunConfigRuleResponseBody getBody() {
        return this.body;
    }

}
