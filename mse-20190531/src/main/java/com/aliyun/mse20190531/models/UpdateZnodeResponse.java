// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateZnodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateZnodeResponseBody body;

    public static UpdateZnodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateZnodeResponse self = new UpdateZnodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateZnodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateZnodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateZnodeResponse setBody(UpdateZnodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateZnodeResponseBody getBody() {
        return this.body;
    }

}
