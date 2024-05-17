// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeExtensionsResponseBody body;

    public static UpgradeExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeExtensionsResponse self = new UpgradeExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeExtensionsResponse setBody(UpgradeExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeExtensionsResponseBody getBody() {
        return this.body;
    }

}
