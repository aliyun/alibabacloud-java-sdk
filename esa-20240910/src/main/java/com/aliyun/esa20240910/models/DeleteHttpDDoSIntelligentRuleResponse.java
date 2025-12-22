// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpDDoSIntelligentRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpDDoSIntelligentRuleResponseBody body;

    public static DeleteHttpDDoSIntelligentRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpDDoSIntelligentRuleResponse self = new DeleteHttpDDoSIntelligentRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpDDoSIntelligentRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpDDoSIntelligentRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpDDoSIntelligentRuleResponse setBody(DeleteHttpDDoSIntelligentRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpDDoSIntelligentRuleResponseBody getBody() {
        return this.body;
    }

}
