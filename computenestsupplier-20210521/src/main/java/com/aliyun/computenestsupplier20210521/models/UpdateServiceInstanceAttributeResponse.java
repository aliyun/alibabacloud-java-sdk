// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceInstanceAttributeResponseBody body;

    public static UpdateServiceInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceAttributeResponse self = new UpdateServiceInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceInstanceAttributeResponse setBody(UpdateServiceInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
