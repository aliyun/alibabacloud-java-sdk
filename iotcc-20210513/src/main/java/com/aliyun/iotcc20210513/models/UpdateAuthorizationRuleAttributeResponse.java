// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAuthorizationRuleAttributeResponseBody body;

    public static UpdateAuthorizationRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleAttributeResponse self = new UpdateAuthorizationRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationRuleAttributeResponse setBody(UpdateAuthorizationRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
