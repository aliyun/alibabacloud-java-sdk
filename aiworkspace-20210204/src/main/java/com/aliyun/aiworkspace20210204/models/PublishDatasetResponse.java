// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class PublishDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishDatasetResponseBody body;

    public static PublishDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishDatasetResponse self = new PublishDatasetResponse();
        return TeaModel.build(map, self);
    }

    public PublishDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishDatasetResponse setBody(PublishDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishDatasetResponseBody getBody() {
        return this.body;
    }

}
