// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSourceResponseBody body;

    public static UpdateSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSourceResponse self = new UpdateSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSourceResponse setBody(UpdateSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSourceResponseBody getBody() {
        return this.body;
    }

}
