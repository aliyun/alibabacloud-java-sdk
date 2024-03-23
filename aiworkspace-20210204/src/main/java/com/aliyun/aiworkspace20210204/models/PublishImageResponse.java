// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class PublishImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public PublishImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishImageResponse setBody(PublishImageResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishImageResponseBody getBody() {
        return this.body;
    }

}
