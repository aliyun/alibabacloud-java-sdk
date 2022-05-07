// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupAuthorizationRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupAuthorizationRuleAttributeResponseBody body;

    public static UpdateGroupAuthorizationRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupAuthorizationRuleAttributeResponse self = new UpdateGroupAuthorizationRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupAuthorizationRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupAuthorizationRuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupAuthorizationRuleAttributeResponse setBody(UpdateGroupAuthorizationRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupAuthorizationRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
