// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UpdateStoreConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStoreConfigResponseBody body;

    public static UpdateStoreConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoreConfigResponse self = new UpdateStoreConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStoreConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStoreConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStoreConfigResponse setBody(UpdateStoreConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStoreConfigResponseBody getBody() {
        return this.body;
    }

}
