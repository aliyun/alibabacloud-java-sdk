// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLogStoreResponseBody body;

    public static CreateLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogStoreResponse self = new CreateLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogStoreResponse setBody(CreateLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogStoreResponseBody getBody() {
        return this.body;
    }

}
