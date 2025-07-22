// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCostCenterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCostCenterRuleResponseBody body;

    public static DeleteCostCenterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostCenterRuleResponse self = new DeleteCostCenterRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCostCenterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCostCenterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCostCenterRuleResponse setBody(DeleteCostCenterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCostCenterRuleResponseBody getBody() {
        return this.body;
    }

}
