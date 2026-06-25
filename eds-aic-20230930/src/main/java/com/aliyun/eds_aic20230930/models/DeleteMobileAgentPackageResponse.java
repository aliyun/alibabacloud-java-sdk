// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteMobileAgentPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMobileAgentPackageResponseBody body;

    public static DeleteMobileAgentPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMobileAgentPackageResponse self = new DeleteMobileAgentPackageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMobileAgentPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMobileAgentPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMobileAgentPackageResponse setBody(DeleteMobileAgentPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMobileAgentPackageResponseBody getBody() {
        return this.body;
    }

}
