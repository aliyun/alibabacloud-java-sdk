// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRulesAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRulesAttributeResponseBody body;

    public static UpdateRulesAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRulesAttributeResponse self = new UpdateRulesAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRulesAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRulesAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRulesAttributeResponse setBody(UpdateRulesAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRulesAttributeResponseBody getBody() {
        return this.body;
    }

}
