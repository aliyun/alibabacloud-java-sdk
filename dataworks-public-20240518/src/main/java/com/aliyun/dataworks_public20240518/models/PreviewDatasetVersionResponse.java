// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PreviewDatasetVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewDatasetVersionResponseBody body;

    public static PreviewDatasetVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewDatasetVersionResponse self = new PreviewDatasetVersionResponse();
        return TeaModel.build(map, self);
    }

    public PreviewDatasetVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewDatasetVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewDatasetVersionResponse setBody(PreviewDatasetVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewDatasetVersionResponseBody getBody() {
        return this.body;
    }

}
