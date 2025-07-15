// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamWatermarkRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveStreamWatermarkRuleResponseBody body;

    public static DeleteLiveStreamWatermarkRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamWatermarkRuleResponse self = new DeleteLiveStreamWatermarkRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamWatermarkRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveStreamWatermarkRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveStreamWatermarkRuleResponse setBody(DeleteLiveStreamWatermarkRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveStreamWatermarkRuleResponseBody getBody() {
        return this.body;
    }

}
