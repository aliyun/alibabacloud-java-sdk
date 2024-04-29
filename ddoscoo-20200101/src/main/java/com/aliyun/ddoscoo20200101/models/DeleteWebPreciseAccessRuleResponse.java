// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebPreciseAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebPreciseAccessRuleResponseBody body;

    public static DeleteWebPreciseAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebPreciseAccessRuleResponse self = new DeleteWebPreciseAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebPreciseAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebPreciseAccessRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebPreciseAccessRuleResponse setBody(DeleteWebPreciseAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebPreciseAccessRuleResponseBody getBody() {
        return this.body;
    }

}
