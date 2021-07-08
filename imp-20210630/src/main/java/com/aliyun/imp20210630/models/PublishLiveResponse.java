// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class PublishLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishLiveResponseBody body;

    public static PublishLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveResponse self = new PublishLiveResponse();
        return TeaModel.build(map, self);
    }

    public PublishLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishLiveResponse setBody(PublishLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishLiveResponseBody getBody() {
        return this.body;
    }

}
