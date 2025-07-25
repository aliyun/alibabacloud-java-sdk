// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceResponseBody body;

    public static UpdateServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceResponse self = new UpdateServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceResponse setBody(UpdateServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceResponseBody getBody() {
        return this.body;
    }

}
