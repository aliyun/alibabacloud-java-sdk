// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer4RuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLayer4RuleResponseBody body;

    public static DeleteLayer4RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer4RuleResponse self = new DeleteLayer4RuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLayer4RuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLayer4RuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLayer4RuleResponse setBody(DeleteLayer4RuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLayer4RuleResponseBody getBody() {
        return this.body;
    }

}
