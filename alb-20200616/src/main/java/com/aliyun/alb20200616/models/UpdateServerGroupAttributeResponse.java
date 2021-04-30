// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateServerGroupAttributeResponse setBody(UpdateServerGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
