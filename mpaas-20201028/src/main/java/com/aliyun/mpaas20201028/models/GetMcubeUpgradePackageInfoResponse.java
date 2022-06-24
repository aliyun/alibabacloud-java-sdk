// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeUpgradePackageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMcubeUpgradePackageInfoResponseBody body;

    public static GetMcubeUpgradePackageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeUpgradePackageInfoResponse self = new GetMcubeUpgradePackageInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMcubeUpgradePackageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcubeUpgradePackageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcubeUpgradePackageInfoResponse setBody(GetMcubeUpgradePackageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcubeUpgradePackageInfoResponseBody getBody() {
        return this.body;
    }

}
