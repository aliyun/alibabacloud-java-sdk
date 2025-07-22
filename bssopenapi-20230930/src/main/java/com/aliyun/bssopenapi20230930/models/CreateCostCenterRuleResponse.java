// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCostCenterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCostCenterRuleResponseBody body;

    public static CreateCostCenterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCostCenterRuleResponse self = new CreateCostCenterRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCostCenterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCostCenterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCostCenterRuleResponse setBody(CreateCostCenterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCostCenterRuleResponseBody getBody() {
        return this.body;
    }

}
