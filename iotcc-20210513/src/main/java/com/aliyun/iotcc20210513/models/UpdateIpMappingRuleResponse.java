// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIpMappingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIpMappingRuleResponseBody body;

    public static UpdateIpMappingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpMappingRuleResponse self = new UpdateIpMappingRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpMappingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpMappingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpMappingRuleResponse setBody(UpdateIpMappingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpMappingRuleResponseBody getBody() {
        return this.body;
    }

}
