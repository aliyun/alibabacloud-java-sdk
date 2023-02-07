// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditQualityRuleResponseBody body;

    public static EditQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EditQualityRuleResponse self = new EditQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public EditQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditQualityRuleResponse setBody(EditQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EditQualityRuleResponseBody getBody() {
        return this.body;
    }

}
