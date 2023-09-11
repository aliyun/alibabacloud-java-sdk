// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateServiceManagedControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceManagedControlResponseBody body;

    public static UpdateServiceManagedControlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceManagedControlResponse self = new UpdateServiceManagedControlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceManagedControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceManagedControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceManagedControlResponse setBody(UpdateServiceManagedControlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceManagedControlResponseBody getBody() {
        return this.body;
    }

}
