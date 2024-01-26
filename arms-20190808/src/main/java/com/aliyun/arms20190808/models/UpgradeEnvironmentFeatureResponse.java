// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpgradeEnvironmentFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeEnvironmentFeatureResponseBody body;

    public static UpgradeEnvironmentFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEnvironmentFeatureResponse self = new UpgradeEnvironmentFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeEnvironmentFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeEnvironmentFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeEnvironmentFeatureResponse setBody(UpgradeEnvironmentFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeEnvironmentFeatureResponseBody getBody() {
        return this.body;
    }

}
