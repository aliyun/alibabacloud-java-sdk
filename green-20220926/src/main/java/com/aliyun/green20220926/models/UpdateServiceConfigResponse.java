// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceConfigResponseBody body;

    public static UpdateServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceConfigResponse self = new UpdateServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceConfigResponse setBody(UpdateServiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceConfigResponseBody getBody() {
        return this.body;
    }

}
