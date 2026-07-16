// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpgradeEnvironmentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeEnvironmentVersionResponseBody body;

    public static UpgradeEnvironmentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEnvironmentVersionResponse self = new UpgradeEnvironmentVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeEnvironmentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeEnvironmentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeEnvironmentVersionResponse setBody(UpgradeEnvironmentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeEnvironmentVersionResponseBody getBody() {
        return this.body;
    }

}
