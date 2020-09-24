// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class PublishApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishApiResponseBody body;

    public static PublishApiResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishApiResponse self = new PublishApiResponse();
        return TeaModel.build(map, self);
    }

    public PublishApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishApiResponse setBody(PublishApiResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishApiResponseBody getBody() {
        return this.body;
    }

}
