// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOriginRuleResponseBody body;

    public static DeleteOriginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginRuleResponse self = new DeleteOriginRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOriginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOriginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOriginRuleResponse setBody(DeleteOriginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOriginRuleResponseBody getBody() {
        return this.body;
    }

}
