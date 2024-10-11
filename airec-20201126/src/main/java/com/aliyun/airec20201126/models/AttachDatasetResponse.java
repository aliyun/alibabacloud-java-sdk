// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class AttachDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AttachDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDatasetResponse setBody(AttachDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDatasetResponseBody getBody() {
        return this.body;
    }

}
