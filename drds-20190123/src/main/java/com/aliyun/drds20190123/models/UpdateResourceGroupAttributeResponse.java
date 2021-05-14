// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResourceGroupAttributeResponseBody body;

    public static UpdateResourceGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupAttributeResponse self = new UpdateResourceGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceGroupAttributeResponse setBody(UpdateResourceGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
