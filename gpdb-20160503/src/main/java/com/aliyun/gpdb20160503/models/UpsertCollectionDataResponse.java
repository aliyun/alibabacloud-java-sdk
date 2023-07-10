// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertCollectionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpsertCollectionDataResponseBody body;

    public static UpsertCollectionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertCollectionDataResponse self = new UpsertCollectionDataResponse();
        return TeaModel.build(map, self);
    }

    public UpsertCollectionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertCollectionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertCollectionDataResponse setBody(UpsertCollectionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertCollectionDataResponseBody getBody() {
        return this.body;
    }

}
