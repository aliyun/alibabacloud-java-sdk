// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVccResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVccResponseBody body;

    public static UpdateVccResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVccResponse self = new UpdateVccResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVccResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVccResponse setBody(UpdateVccResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVccResponseBody getBody() {
        return this.body;
    }

}
