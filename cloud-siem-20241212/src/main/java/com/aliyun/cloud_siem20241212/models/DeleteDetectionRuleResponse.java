// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDetectionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDetectionRuleResponseBody body;

    public static DeleteDetectionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectionRuleResponse self = new DeleteDetectionRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDetectionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDetectionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDetectionRuleResponse setBody(DeleteDetectionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDetectionRuleResponseBody getBody() {
        return this.body;
    }

}
