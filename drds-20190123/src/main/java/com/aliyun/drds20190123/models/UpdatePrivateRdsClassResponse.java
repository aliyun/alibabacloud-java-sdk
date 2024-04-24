// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdatePrivateRdsClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrivateRdsClassResponseBody body;

    public static UpdatePrivateRdsClassResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateRdsClassResponse self = new UpdatePrivateRdsClassResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateRdsClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivateRdsClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrivateRdsClassResponse setBody(UpdatePrivateRdsClassResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateRdsClassResponseBody getBody() {
        return this.body;
    }

}
