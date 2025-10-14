// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDetectionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDetectionRuleResponseBody body;

    public static CreateDetectionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectionRuleResponse self = new CreateDetectionRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDetectionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDetectionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDetectionRuleResponse setBody(CreateDetectionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDetectionRuleResponseBody getBody() {
        return this.body;
    }

}
