// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupIpMappingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupIpMappingRuleResponseBody body;

    public static UpdateGroupIpMappingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupIpMappingRuleResponse self = new UpdateGroupIpMappingRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupIpMappingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupIpMappingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupIpMappingRuleResponse setBody(UpdateGroupIpMappingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupIpMappingRuleResponseBody getBody() {
        return this.body;
    }

}
