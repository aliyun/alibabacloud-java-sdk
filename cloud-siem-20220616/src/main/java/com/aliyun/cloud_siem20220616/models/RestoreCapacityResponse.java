// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class RestoreCapacityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreCapacityResponseBody body;

    public static RestoreCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreCapacityResponse self = new RestoreCapacityResponse();
        return TeaModel.build(map, self);
    }

    public RestoreCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreCapacityResponse setBody(RestoreCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreCapacityResponseBody getBody() {
        return this.body;
    }

}
