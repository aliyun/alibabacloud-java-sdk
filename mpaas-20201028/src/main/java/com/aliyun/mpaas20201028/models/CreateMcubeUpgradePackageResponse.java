// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeUpgradePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeUpgradePackageResponseBody body;

    public static CreateMcubeUpgradePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeUpgradePackageResponse self = new CreateMcubeUpgradePackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeUpgradePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeUpgradePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeUpgradePackageResponse setBody(CreateMcubeUpgradePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeUpgradePackageResponseBody getBody() {
        return this.body;
    }

}
