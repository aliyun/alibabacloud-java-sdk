// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class MetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MetadataResponseBody body;

    public static MetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        MetadataResponse self = new MetadataResponse();
        return TeaModel.build(map, self);
    }

    public MetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MetadataResponse setBody(MetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public MetadataResponseBody getBody() {
        return this.body;
    }

}
