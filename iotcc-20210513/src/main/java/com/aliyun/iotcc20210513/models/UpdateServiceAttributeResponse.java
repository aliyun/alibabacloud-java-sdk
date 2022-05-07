// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateServiceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceAttributeResponseBody body;

    public static UpdateServiceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceAttributeResponse self = new UpdateServiceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceAttributeResponse setBody(UpdateServiceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceAttributeResponseBody getBody() {
        return this.body;
    }

}
