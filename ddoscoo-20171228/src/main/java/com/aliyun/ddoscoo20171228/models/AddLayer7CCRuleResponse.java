// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class AddLayer7CCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddLayer7CCRuleResponseBody body;

    public static AddLayer7CCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLayer7CCRuleResponse self = new AddLayer7CCRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddLayer7CCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLayer7CCRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLayer7CCRuleResponse setBody(AddLayer7CCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLayer7CCRuleResponseBody getBody() {
        return this.body;
    }

}
