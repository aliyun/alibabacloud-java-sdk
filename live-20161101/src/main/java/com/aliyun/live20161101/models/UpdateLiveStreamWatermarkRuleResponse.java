// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamWatermarkRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveStreamWatermarkRuleResponseBody body;

    public static UpdateLiveStreamWatermarkRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamWatermarkRuleResponse self = new UpdateLiveStreamWatermarkRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamWatermarkRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveStreamWatermarkRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveStreamWatermarkRuleResponse setBody(UpdateLiveStreamWatermarkRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveStreamWatermarkRuleResponseBody getBody() {
        return this.body;
    }

}
