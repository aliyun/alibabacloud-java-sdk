// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAIProduceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveAIProduceRulesResponseBody body;

    public static DeleteLiveAIProduceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAIProduceRulesResponse self = new DeleteLiveAIProduceRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAIProduceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveAIProduceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveAIProduceRulesResponse setBody(DeleteLiveAIProduceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveAIProduceRulesResponseBody getBody() {
        return this.body;
    }

}
