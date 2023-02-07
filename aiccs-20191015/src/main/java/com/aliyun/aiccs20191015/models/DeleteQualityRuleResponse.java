// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQualityRuleResponseBody body;

    public static DeleteQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRuleResponse self = new DeleteQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualityRuleResponse setBody(DeleteQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityRuleResponseBody getBody() {
        return this.body;
    }

}
