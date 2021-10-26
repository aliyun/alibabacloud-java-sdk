// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class PublishProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishProductResponseBody body;

    public static PublishProductResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishProductResponse self = new PublishProductResponse();
        return TeaModel.build(map, self);
    }

    public PublishProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishProductResponse setBody(PublishProductResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishProductResponseBody getBody() {
        return this.body;
    }

}
