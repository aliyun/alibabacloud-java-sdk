// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBasicAcceleratorResponseBody body;

    public static UpdateBasicAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicAcceleratorResponse self = new UpdateBasicAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBasicAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBasicAcceleratorResponse setBody(UpdateBasicAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBasicAcceleratorResponseBody getBody() {
        return this.body;
    }

}
