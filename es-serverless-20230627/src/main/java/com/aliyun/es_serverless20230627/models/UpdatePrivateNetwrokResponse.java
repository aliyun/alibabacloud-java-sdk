// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdatePrivateNetwrokResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrivateNetwrokResponseBody body;

    public static UpdatePrivateNetwrokResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateNetwrokResponse self = new UpdatePrivateNetwrokResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateNetwrokResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivateNetwrokResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrivateNetwrokResponse setBody(UpdatePrivateNetwrokResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateNetwrokResponseBody getBody() {
        return this.body;
    }

}
