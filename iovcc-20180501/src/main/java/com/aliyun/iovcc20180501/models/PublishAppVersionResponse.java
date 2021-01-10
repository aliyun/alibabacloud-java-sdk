// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishAppVersionResponseBody body;

    public static PublishAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishAppVersionResponse self = new PublishAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishAppVersionResponse setBody(PublishAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishAppVersionResponseBody getBody() {
        return this.body;
    }

}
