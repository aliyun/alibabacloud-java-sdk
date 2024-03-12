// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApplicationProvisioningConfigResponseBody body;

    public static SetApplicationProvisioningConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationProvisioningConfigResponse self = new SetApplicationProvisioningConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetApplicationProvisioningConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApplicationProvisioningConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApplicationProvisioningConfigResponse setBody(SetApplicationProvisioningConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApplicationProvisioningConfigResponseBody getBody() {
        return this.body;
    }

}
