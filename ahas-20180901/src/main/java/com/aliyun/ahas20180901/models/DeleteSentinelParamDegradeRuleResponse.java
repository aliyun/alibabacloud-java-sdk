// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSentinelParamDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSentinelParamDegradeRuleResponseBody body;

    public static DeleteSentinelParamDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSentinelParamDegradeRuleResponse self = new DeleteSentinelParamDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSentinelParamDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSentinelParamDegradeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSentinelParamDegradeRuleResponse setBody(DeleteSentinelParamDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSentinelParamDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
