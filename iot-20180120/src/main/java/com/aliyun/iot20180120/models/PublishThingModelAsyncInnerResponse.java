// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishThingModelAsyncInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishThingModelAsyncInnerResponseBody body;

    public static PublishThingModelAsyncInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishThingModelAsyncInnerResponse self = new PublishThingModelAsyncInnerResponse();
        return TeaModel.build(map, self);
    }

    public PublishThingModelAsyncInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishThingModelAsyncInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishThingModelAsyncInnerResponse setBody(PublishThingModelAsyncInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishThingModelAsyncInnerResponseBody getBody() {
        return this.body;
    }

}
