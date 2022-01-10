// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class PublishImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishImageResponseBody body;

    public static PublishImageResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishImageResponse self = new PublishImageResponse();
        return TeaModel.build(map, self);
    }

    public PublishImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishImageResponse setBody(PublishImageResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishImageResponseBody getBody() {
        return this.body;
    }

}
