// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateAutoScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutoScalingConfigResponseBody body;

    public static CreateAutoScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingConfigResponse self = new CreateAutoScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoScalingConfigResponse setBody(CreateAutoScalingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoScalingConfigResponseBody getBody() {
        return this.body;
    }

}
