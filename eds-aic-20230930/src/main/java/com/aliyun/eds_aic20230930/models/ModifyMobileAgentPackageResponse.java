// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyMobileAgentPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMobileAgentPackageResponseBody body;

    public static ModifyMobileAgentPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMobileAgentPackageResponse self = new ModifyMobileAgentPackageResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMobileAgentPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMobileAgentPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMobileAgentPackageResponse setBody(ModifyMobileAgentPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMobileAgentPackageResponseBody getBody() {
        return this.body;
    }

}
