// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetCapacityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCapacityResponseBody body;

    public static GetCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCapacityResponse self = new GetCapacityResponse();
        return TeaModel.build(map, self);
    }

    public GetCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCapacityResponse setBody(GetCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCapacityResponseBody getBody() {
        return this.body;
    }

}
