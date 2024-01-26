// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpgradeAddonReleaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeAddonReleaseResponseBody body;

    public static UpgradeAddonReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAddonReleaseResponse self = new UpgradeAddonReleaseResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeAddonReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeAddonReleaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeAddonReleaseResponse setBody(UpgradeAddonReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeAddonReleaseResponseBody getBody() {
        return this.body;
    }

}
