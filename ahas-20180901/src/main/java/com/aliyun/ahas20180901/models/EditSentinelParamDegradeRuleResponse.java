// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EditSentinelParamDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditSentinelParamDegradeRuleResponseBody body;

    public static EditSentinelParamDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EditSentinelParamDegradeRuleResponse self = new EditSentinelParamDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public EditSentinelParamDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditSentinelParamDegradeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditSentinelParamDegradeRuleResponse setBody(EditSentinelParamDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EditSentinelParamDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
