// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationProvisioningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationProvisioningResponseBody body;

    public static EnableApplicationProvisioningResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationProvisioningResponse self = new EnableApplicationProvisioningResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationProvisioningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationProvisioningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationProvisioningResponse setBody(EnableApplicationProvisioningResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationProvisioningResponseBody getBody() {
        return this.body;
    }

}
