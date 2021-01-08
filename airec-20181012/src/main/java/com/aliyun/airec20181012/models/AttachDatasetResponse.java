// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class AttachDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachDatasetResponseBody body;

    public static AttachDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDatasetResponse self = new AttachDatasetResponse();
        return TeaModel.build(map, self);
    }

    public AttachDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDatasetResponse setBody(AttachDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDatasetResponseBody getBody() {
        return this.body;
    }

}
