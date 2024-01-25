// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceInstanceResponseBody body;

    public static UpdateServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceResponse self = new UpdateServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceInstanceResponse setBody(UpdateServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
