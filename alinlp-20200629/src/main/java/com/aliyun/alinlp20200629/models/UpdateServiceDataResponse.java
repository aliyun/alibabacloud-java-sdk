// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class UpdateServiceDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceDataResponseBody body;

    public static UpdateServiceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceDataResponse self = new UpdateServiceDataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceDataResponse setBody(UpdateServiceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceDataResponseBody getBody() {
        return this.body;
    }

}
