// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSlsLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSlsLogStoreResponseBody body;

    public static UpdateSlsLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlsLogStoreResponse self = new UpdateSlsLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSlsLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSlsLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSlsLogStoreResponse setBody(UpdateSlsLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSlsLogStoreResponseBody getBody() {
        return this.body;
    }

}
