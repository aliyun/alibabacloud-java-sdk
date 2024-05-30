// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceInstanceSpecResponseBody body;

    public static UpdateServiceInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceSpecResponse self = new UpdateServiceInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceInstanceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceInstanceSpecResponse setBody(UpdateServiceInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
