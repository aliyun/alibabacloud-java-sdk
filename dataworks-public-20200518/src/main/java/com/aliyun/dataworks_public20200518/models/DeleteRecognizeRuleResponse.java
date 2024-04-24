// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteRecognizeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecognizeRuleResponseBody body;

    public static DeleteRecognizeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecognizeRuleResponse self = new DeleteRecognizeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecognizeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecognizeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecognizeRuleResponse setBody(DeleteRecognizeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecognizeRuleResponseBody getBody() {
        return this.body;
    }

}
