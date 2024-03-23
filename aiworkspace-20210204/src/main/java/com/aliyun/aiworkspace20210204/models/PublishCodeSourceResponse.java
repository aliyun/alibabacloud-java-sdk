// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class PublishCodeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishCodeSourceResponseBody body;

    public static PublishCodeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishCodeSourceResponse self = new PublishCodeSourceResponse();
        return TeaModel.build(map, self);
    }

    public PublishCodeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishCodeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishCodeSourceResponse setBody(PublishCodeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishCodeSourceResponseBody getBody() {
        return this.body;
    }

}
