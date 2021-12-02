// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class UpdateImageAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateImageAttributeResponseBody body;

    public static UpdateImageAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageAttributeResponse self = new UpdateImageAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageAttributeResponse setBody(UpdateImageAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageAttributeResponseBody getBody() {
        return this.body;
    }

}
