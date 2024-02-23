// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRulesResponseBody body;

    public static DeleteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRulesResponse self = new DeleteRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRulesResponse setBody(DeleteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRulesResponseBody getBody() {
        return this.body;
    }

}
