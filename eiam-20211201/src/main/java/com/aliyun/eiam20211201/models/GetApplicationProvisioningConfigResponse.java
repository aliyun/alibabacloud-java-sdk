// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationProvisioningConfigResponseBody body;

    public static GetApplicationProvisioningConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningConfigResponse self = new GetApplicationProvisioningConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationProvisioningConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationProvisioningConfigResponse setBody(GetApplicationProvisioningConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationProvisioningConfigResponseBody getBody() {
        return this.body;
    }

}
