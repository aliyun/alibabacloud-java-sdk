// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAIProduceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLiveAIProduceRulesResponseBody body;

    public static AddLiveAIProduceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAIProduceRulesResponse self = new AddLiveAIProduceRulesResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAIProduceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveAIProduceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveAIProduceRulesResponse setBody(AddLiveAIProduceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveAIProduceRulesResponseBody getBody() {
        return this.body;
    }

}
