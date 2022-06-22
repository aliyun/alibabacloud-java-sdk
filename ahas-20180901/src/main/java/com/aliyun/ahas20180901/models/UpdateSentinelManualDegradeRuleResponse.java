// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelManualDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSentinelManualDegradeRuleResponseBody body;

    public static UpdateSentinelManualDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelManualDegradeRuleResponse self = new UpdateSentinelManualDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelManualDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSentinelManualDegradeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSentinelManualDegradeRuleResponse setBody(UpdateSentinelManualDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSentinelManualDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
