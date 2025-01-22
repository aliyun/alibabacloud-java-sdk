// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateSourceLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSourceLocationResponseBody body;

    public static UpdateSourceLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSourceLocationResponse self = new UpdateSourceLocationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSourceLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSourceLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSourceLocationResponse setBody(UpdateSourceLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSourceLocationResponseBody getBody() {
        return this.body;
    }

}
