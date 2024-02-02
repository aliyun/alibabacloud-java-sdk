// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSceneRuleResponseBody body;

    public static DeleteSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneRuleResponse self = new DeleteSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneRuleResponse setBody(DeleteSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneRuleResponseBody getBody() {
        return this.body;
    }

}
