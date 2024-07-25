// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PublishHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishHttpApiResponseBody body;

    public static PublishHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishHttpApiResponse self = new PublishHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public PublishHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishHttpApiResponse setBody(PublishHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishHttpApiResponseBody getBody() {
        return this.body;
    }

}
