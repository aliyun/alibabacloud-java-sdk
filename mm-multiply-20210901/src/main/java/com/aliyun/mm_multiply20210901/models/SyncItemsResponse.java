// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class SyncItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncItemsResponseBody body;

    public static SyncItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncItemsResponse self = new SyncItemsResponse();
        return TeaModel.build(map, self);
    }

    public SyncItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncItemsResponse setBody(SyncItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncItemsResponseBody getBody() {
        return this.body;
    }

}
