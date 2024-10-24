// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDatasetVersionResponseBody body;

    public static UpdateDatasetVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetVersionResponse self = new UpdateDatasetVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDatasetVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDatasetVersionResponse setBody(UpdateDatasetVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatasetVersionResponseBody getBody() {
        return this.body;
    }

}
