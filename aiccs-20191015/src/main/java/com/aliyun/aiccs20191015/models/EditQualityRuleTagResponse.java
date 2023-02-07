// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityRuleTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditQualityRuleTagResponseBody body;

    public static EditQualityRuleTagResponse build(java.util.Map<String, ?> map) throws Exception {
        EditQualityRuleTagResponse self = new EditQualityRuleTagResponse();
        return TeaModel.build(map, self);
    }

    public EditQualityRuleTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditQualityRuleTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditQualityRuleTagResponse setBody(EditQualityRuleTagResponseBody body) {
        this.body = body;
        return this;
    }
    public EditQualityRuleTagResponseBody getBody() {
        return this.body;
    }

}
