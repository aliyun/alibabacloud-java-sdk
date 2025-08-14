// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SaveCostCenterShareRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveCostCenterShareRuleResponseBody body;

    public static SaveCostCenterShareRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveCostCenterShareRuleResponse self = new SaveCostCenterShareRuleResponse();
        return TeaModel.build(map, self);
    }

    public SaveCostCenterShareRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveCostCenterShareRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveCostCenterShareRuleResponse setBody(SaveCostCenterShareRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveCostCenterShareRuleResponseBody getBody() {
        return this.body;
    }

}
