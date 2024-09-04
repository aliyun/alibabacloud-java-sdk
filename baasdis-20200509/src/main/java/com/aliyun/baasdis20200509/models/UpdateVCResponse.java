// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class UpdateVCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVCResponseBody body;

    public static UpdateVCResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVCResponse self = new UpdateVCResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVCResponse setBody(UpdateVCResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVCResponseBody getBody() {
        return this.body;
    }

}
