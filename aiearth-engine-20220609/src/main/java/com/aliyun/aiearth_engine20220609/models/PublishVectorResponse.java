// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class PublishVectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishVectorResponseBody body;

    public static PublishVectorResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishVectorResponse self = new PublishVectorResponse();
        return TeaModel.build(map, self);
    }

    public PublishVectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishVectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishVectorResponse setBody(PublishVectorResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishVectorResponseBody getBody() {
        return this.body;
    }

}
