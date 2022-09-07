// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteGroupIpMappingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGroupIpMappingRuleResponseBody body;

    public static DeleteGroupIpMappingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupIpMappingRuleResponse self = new DeleteGroupIpMappingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupIpMappingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupIpMappingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupIpMappingRuleResponse setBody(DeleteGroupIpMappingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupIpMappingRuleResponseBody getBody() {
        return this.body;
    }

}
