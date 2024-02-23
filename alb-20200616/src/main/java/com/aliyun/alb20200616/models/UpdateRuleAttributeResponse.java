// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateRuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRuleAttributeResponse setBody(UpdateRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
