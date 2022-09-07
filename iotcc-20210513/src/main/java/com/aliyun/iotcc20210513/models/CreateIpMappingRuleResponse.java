// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIpMappingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIpMappingRuleResponseBody body;

    public static CreateIpMappingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpMappingRuleResponse self = new CreateIpMappingRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpMappingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpMappingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpMappingRuleResponse setBody(CreateIpMappingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpMappingRuleResponseBody getBody() {
        return this.body;
    }

}
