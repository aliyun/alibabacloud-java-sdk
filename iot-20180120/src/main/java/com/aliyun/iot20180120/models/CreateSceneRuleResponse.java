// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSceneRuleResponseBody body;

    public static CreateSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneRuleResponse self = new CreateSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSceneRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSceneRuleResponse setBody(CreateSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSceneRuleResponseBody getBody() {
        return this.body;
    }

}
