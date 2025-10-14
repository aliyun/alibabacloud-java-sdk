// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDetectionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDetectionRuleResponseBody body;

    public static UpdateDetectionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionRuleResponse self = new UpdateDetectionRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDetectionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDetectionRuleResponse setBody(UpdateDetectionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDetectionRuleResponseBody getBody() {
        return this.body;
    }

}
