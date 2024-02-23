// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupServersAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServerGroupServersAttributeResponseBody body;

    public static UpdateServerGroupServersAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupServersAttributeResponse self = new UpdateServerGroupServersAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupServersAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServerGroupServersAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServerGroupServersAttributeResponse setBody(UpdateServerGroupServersAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServerGroupServersAttributeResponseBody getBody() {
        return this.body;
    }

}
