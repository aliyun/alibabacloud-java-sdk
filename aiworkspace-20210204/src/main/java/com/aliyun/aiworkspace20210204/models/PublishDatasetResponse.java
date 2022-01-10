// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class PublishDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PublishDatasetResponse setBody(PublishDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishDatasetResponseBody getBody() {
        return this.body;
    }

}
