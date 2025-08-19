// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNetworkResponseBody body;

    public static UpdateNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkResponse self = new UpdateNetworkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNetworkResponse setBody(UpdateNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetworkResponseBody getBody() {
        return this.body;
    }

}
