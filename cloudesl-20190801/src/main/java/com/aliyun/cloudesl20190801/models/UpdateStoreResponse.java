// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UpdateStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStoreResponseBody body;

    public static UpdateStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoreResponse self = new UpdateStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStoreResponse setBody(UpdateStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStoreResponseBody getBody() {
        return this.body;
    }

}
