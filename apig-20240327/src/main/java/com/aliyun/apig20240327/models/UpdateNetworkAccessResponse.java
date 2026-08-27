// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateNetworkAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNetworkAccessResponseBody body;

    public static UpdateNetworkAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAccessResponse self = new UpdateNetworkAccessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetworkAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNetworkAccessResponse setBody(UpdateNetworkAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetworkAccessResponseBody getBody() {
        return this.body;
    }

}
