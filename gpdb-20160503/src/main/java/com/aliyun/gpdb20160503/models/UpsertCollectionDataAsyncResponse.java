// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertCollectionDataAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpsertCollectionDataAsyncResponseBody body;

    public static UpsertCollectionDataAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertCollectionDataAsyncResponse self = new UpsertCollectionDataAsyncResponse();
        return TeaModel.build(map, self);
    }

    public UpsertCollectionDataAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertCollectionDataAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertCollectionDataAsyncResponse setBody(UpsertCollectionDataAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertCollectionDataAsyncResponseBody getBody() {
        return this.body;
    }

}
