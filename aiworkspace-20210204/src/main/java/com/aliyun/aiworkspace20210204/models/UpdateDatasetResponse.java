// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDatasetResponse setBody(UpdateDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatasetResponseBody getBody() {
        return this.body;
    }

}
