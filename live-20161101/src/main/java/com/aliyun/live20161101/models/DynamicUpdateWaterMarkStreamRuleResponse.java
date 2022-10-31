// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DynamicUpdateWaterMarkStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DynamicUpdateWaterMarkStreamRuleResponseBody body;

    public static DynamicUpdateWaterMarkStreamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DynamicUpdateWaterMarkStreamRuleResponse self = new DynamicUpdateWaterMarkStreamRuleResponse();
        return TeaModel.build(map, self);
    }

    public DynamicUpdateWaterMarkStreamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DynamicUpdateWaterMarkStreamRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DynamicUpdateWaterMarkStreamRuleResponse setBody(DynamicUpdateWaterMarkStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DynamicUpdateWaterMarkStreamRuleResponseBody getBody() {
        return this.body;
    }

}
