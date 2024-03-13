// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UpgradeResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeResourcePackageResponseBody body;

    public static UpgradeResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeResourcePackageResponse self = new UpgradeResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeResourcePackageResponse setBody(UpgradeResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeResourcePackageResponseBody getBody() {
        return this.body;
    }

}
