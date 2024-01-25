// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceVersionResponseBody body;

    public static UpdateServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceVersionResponse self = new UpdateServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceVersionResponse setBody(UpdateServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceVersionResponseBody getBody() {
        return this.body;
    }

}
