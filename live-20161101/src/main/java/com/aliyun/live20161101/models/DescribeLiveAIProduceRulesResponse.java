// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAIProduceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveAIProduceRulesResponseBody body;

    public static DescribeLiveAIProduceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAIProduceRulesResponse self = new DescribeLiveAIProduceRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAIProduceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveAIProduceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveAIProduceRulesResponse setBody(DescribeLiveAIProduceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveAIProduceRulesResponseBody getBody() {
        return this.body;
    }

}
