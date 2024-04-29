// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebRuleResponseBody body;

    public static DeleteWebRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebRuleResponse self = new DeleteWebRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebRuleResponse setBody(DeleteWebRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebRuleResponseBody getBody() {
        return this.body;
    }

}
