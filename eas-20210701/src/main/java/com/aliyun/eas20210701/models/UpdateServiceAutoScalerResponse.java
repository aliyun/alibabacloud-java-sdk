// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceAutoScalerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceAutoScalerResponseBody body;

    public static UpdateServiceAutoScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceAutoScalerResponse self = new UpdateServiceAutoScalerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceAutoScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceAutoScalerResponse setBody(UpdateServiceAutoScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

}
