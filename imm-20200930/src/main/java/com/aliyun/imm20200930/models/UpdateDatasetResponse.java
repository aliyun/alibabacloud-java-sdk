// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDatasetResponseBody body;

    public static UpdateDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetResponse self = new UpdateDatasetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDatasetResponse setBody(UpdateDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatasetResponseBody getBody() {
        return this.body;
    }

}
