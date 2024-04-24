// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class EditRecognizeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditRecognizeRuleResponseBody body;

    public static EditRecognizeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EditRecognizeRuleResponse self = new EditRecognizeRuleResponse();
        return TeaModel.build(map, self);
    }

    public EditRecognizeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditRecognizeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditRecognizeRuleResponse setBody(EditRecognizeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EditRecognizeRuleResponseBody getBody() {
        return this.body;
    }

}
