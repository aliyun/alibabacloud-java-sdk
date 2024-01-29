// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateServiceSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceSourceResponseBody body;

    public static UpdateServiceSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSourceResponse self = new UpdateServiceSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceSourceResponse setBody(UpdateServiceSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceSourceResponseBody getBody() {
        return this.body;
    }

}
