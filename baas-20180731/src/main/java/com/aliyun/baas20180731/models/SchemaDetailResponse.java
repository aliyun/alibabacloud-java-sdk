// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SchemaDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SchemaDetailResponseBody body;

    public static SchemaDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        SchemaDetailResponse self = new SchemaDetailResponse();
        return TeaModel.build(map, self);
    }

    public SchemaDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SchemaDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SchemaDetailResponse setBody(SchemaDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public SchemaDetailResponseBody getBody() {
        return this.body;
    }

}
