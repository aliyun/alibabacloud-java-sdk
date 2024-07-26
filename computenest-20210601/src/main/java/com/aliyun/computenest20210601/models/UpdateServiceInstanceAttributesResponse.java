// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceInstanceAttributesResponseBody body;

    public static UpdateServiceInstanceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceAttributesResponse self = new UpdateServiceInstanceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceInstanceAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceInstanceAttributesResponse setBody(UpdateServiceInstanceAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceInstanceAttributesResponseBody getBody() {
        return this.body;
    }

}
