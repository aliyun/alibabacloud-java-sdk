// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ClaimGPUInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ClaimGPUInstanceResponseBody body;

    public static ClaimGPUInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ClaimGPUInstanceResponse self = new ClaimGPUInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ClaimGPUInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClaimGPUInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClaimGPUInstanceResponse setBody(ClaimGPUInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ClaimGPUInstanceResponseBody getBody() {
        return this.body;
    }

}
