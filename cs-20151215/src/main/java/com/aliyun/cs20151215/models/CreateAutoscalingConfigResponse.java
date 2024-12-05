// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoscalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutoscalingConfigResponseBody body;

    public static CreateAutoscalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoscalingConfigResponse self = new CreateAutoscalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoscalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoscalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoscalingConfigResponse setBody(CreateAutoscalingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoscalingConfigResponseBody getBody() {
        return this.body;
    }

}
