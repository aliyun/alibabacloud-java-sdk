// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationTokenExpirationTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationTokenExpirationTimeResponseBody body;

    public static UpdateApplicationTokenExpirationTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationTokenExpirationTimeResponse self = new UpdateApplicationTokenExpirationTimeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationTokenExpirationTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationTokenExpirationTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationTokenExpirationTimeResponse setBody(UpdateApplicationTokenExpirationTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationTokenExpirationTimeResponseBody getBody() {
        return this.body;
    }

}
