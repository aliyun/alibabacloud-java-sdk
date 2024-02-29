// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBusinessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBusinessResponseBody body;

    public static UpdateBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessResponse self = new UpdateBusinessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBusinessResponse setBody(UpdateBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBusinessResponseBody getBody() {
        return this.body;
    }

}
