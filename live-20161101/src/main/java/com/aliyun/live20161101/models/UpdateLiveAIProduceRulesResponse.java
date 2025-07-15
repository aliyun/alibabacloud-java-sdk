// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAIProduceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveAIProduceRulesResponseBody body;

    public static UpdateLiveAIProduceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAIProduceRulesResponse self = new UpdateLiveAIProduceRulesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAIProduceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveAIProduceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveAIProduceRulesResponse setBody(UpdateLiveAIProduceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveAIProduceRulesResponseBody getBody() {
        return this.body;
    }

}
