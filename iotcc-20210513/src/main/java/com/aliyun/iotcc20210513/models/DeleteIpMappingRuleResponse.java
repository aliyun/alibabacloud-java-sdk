// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIpMappingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIpMappingRuleResponseBody body;

    public static DeleteIpMappingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpMappingRuleResponse self = new DeleteIpMappingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpMappingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpMappingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpMappingRuleResponse setBody(DeleteIpMappingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpMappingRuleResponseBody getBody() {
        return this.body;
    }

}
