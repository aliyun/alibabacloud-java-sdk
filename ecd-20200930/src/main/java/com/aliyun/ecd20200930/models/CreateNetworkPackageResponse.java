// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkPackageResponseBody body;

    public static CreateNetworkPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkPackageResponse self = new CreateNetworkPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkPackageResponse setBody(CreateNetworkPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkPackageResponseBody getBody() {
        return this.body;
    }

}
