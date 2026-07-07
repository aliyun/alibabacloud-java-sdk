// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateEdgeMobileAgentPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeMobileAgentPackageResponseBody body;

    public static CreateEdgeMobileAgentPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeMobileAgentPackageResponse self = new CreateEdgeMobileAgentPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeMobileAgentPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeMobileAgentPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeMobileAgentPackageResponse setBody(CreateEdgeMobileAgentPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeMobileAgentPackageResponseBody getBody() {
        return this.body;
    }

}
