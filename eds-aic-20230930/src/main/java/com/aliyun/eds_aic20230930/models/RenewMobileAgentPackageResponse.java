// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewMobileAgentPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewMobileAgentPackageResponseBody body;

    public static RenewMobileAgentPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewMobileAgentPackageResponse self = new RenewMobileAgentPackageResponse();
        return TeaModel.build(map, self);
    }

    public RenewMobileAgentPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewMobileAgentPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewMobileAgentPackageResponse setBody(RenewMobileAgentPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewMobileAgentPackageResponseBody getBody() {
        return this.body;
    }

}
