// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpApiOperationResponseBody body;

    public static UpdateHttpApiOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiOperationResponse self = new UpdateHttpApiOperationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpApiOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpApiOperationResponse setBody(UpdateHttpApiOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpApiOperationResponseBody getBody() {
        return this.body;
    }

}
