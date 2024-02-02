// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishThingModelAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishThingModelAsyncResponseBody body;

    public static PublishThingModelAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishThingModelAsyncResponse self = new PublishThingModelAsyncResponse();
        return TeaModel.build(map, self);
    }

    public PublishThingModelAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishThingModelAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishThingModelAsyncResponse setBody(PublishThingModelAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishThingModelAsyncResponseBody getBody() {
        return this.body;
    }

}
