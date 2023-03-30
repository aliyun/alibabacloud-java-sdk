// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVpdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateVpdResponseBody body;

    public static UpdateVpdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpdResponse self = new UpdateVpdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVpdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVpdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVpdResponse setBody(UpdateVpdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVpdResponseBody getBody() {
        return this.body;
    }

}
