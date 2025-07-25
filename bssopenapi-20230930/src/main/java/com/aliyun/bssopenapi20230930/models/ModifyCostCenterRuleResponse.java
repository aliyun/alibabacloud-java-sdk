// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCostCenterRuleResponseBody body;

    public static ModifyCostCenterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostCenterRuleResponse self = new ModifyCostCenterRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCostCenterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCostCenterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCostCenterRuleResponse setBody(ModifyCostCenterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCostCenterRuleResponseBody getBody() {
        return this.body;
    }

}
