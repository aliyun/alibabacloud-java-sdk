// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateListenerAttributeResponseBody body;

    public static UpdateListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerAttributeResponse self = new UpdateListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateListenerAttributeResponse setBody(UpdateListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
