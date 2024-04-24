// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddRecognizeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRecognizeRuleResponseBody body;

    public static AddRecognizeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRecognizeRuleResponse self = new AddRecognizeRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddRecognizeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRecognizeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRecognizeRuleResponse setBody(AddRecognizeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecognizeRuleResponseBody getBody() {
        return this.body;
    }

}
