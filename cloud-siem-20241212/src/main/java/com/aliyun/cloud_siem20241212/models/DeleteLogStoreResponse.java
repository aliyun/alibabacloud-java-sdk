// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLogStoreResponseBody body;

    public static DeleteLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogStoreResponse self = new DeleteLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogStoreResponse setBody(DeleteLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogStoreResponseBody getBody() {
        return this.body;
    }

}
