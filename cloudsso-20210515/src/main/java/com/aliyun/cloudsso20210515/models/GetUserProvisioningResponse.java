// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserProvisioningResponseBody body;

    public static GetUserProvisioningResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningResponse self = new GetUserProvisioningResponse();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserProvisioningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserProvisioningResponse setBody(GetUserProvisioningResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserProvisioningResponseBody getBody() {
        return this.body;
    }

}
