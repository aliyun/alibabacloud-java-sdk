// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateMobileAgentPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMobileAgentPackageResponseBody body;

    public static CreateMobileAgentPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMobileAgentPackageResponse self = new CreateMobileAgentPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateMobileAgentPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMobileAgentPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMobileAgentPackageResponse setBody(CreateMobileAgentPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMobileAgentPackageResponseBody getBody() {
        return this.body;
    }

}
