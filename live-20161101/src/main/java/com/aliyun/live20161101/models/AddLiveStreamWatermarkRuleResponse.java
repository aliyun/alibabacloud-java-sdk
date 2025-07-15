// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamWatermarkRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLiveStreamWatermarkRuleResponseBody body;

    public static AddLiveStreamWatermarkRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamWatermarkRuleResponse self = new AddLiveStreamWatermarkRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamWatermarkRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveStreamWatermarkRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveStreamWatermarkRuleResponse setBody(AddLiveStreamWatermarkRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveStreamWatermarkRuleResponseBody getBody() {
        return this.body;
    }

}
