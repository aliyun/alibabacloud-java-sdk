// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class PublishApplicationVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishApplicationVersionResponseBody body;

    public static PublishApplicationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishApplicationVersionResponse self = new PublishApplicationVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishApplicationVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishApplicationVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishApplicationVersionResponse setBody(PublishApplicationVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishApplicationVersionResponseBody getBody() {
        return this.body;
    }

}
