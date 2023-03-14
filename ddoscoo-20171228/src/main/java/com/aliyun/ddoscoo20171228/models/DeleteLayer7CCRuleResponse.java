// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer7CCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLayer7CCRuleResponseBody body;

    public static DeleteLayer7CCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer7CCRuleResponse self = new DeleteLayer7CCRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLayer7CCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLayer7CCRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLayer7CCRuleResponse setBody(DeleteLayer7CCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLayer7CCRuleResponseBody getBody() {
        return this.body;
    }

}
