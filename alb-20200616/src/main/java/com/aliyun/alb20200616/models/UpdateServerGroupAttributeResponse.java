// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServerGroupAttributeResponseBody body;

    public static UpdateServerGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupAttributeResponse self = new UpdateServerGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServerGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServerGroupAttributeResponse setBody(UpdateServerGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
