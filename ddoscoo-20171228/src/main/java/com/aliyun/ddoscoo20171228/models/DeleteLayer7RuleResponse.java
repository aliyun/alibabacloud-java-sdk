// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer7RuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLayer7RuleResponseBody body;

    public static DeleteLayer7RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer7RuleResponse self = new DeleteLayer7RuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLayer7RuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLayer7RuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLayer7RuleResponse setBody(DeleteLayer7RuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLayer7RuleResponseBody getBody() {
        return this.body;
    }

}
