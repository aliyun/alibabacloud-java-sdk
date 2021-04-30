// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRuleAttributeResponseBody body;

    public static UpdateRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleAttributeResponse self = new UpdateRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleAttributeResponse setBody(UpdateRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
