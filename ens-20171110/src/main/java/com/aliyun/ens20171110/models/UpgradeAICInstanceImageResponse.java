// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeAICInstanceImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeAICInstanceImageResponseBody body;

    public static UpgradeAICInstanceImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAICInstanceImageResponse self = new UpgradeAICInstanceImageResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeAICInstanceImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeAICInstanceImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeAICInstanceImageResponse setBody(UpgradeAICInstanceImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeAICInstanceImageResponseBody getBody() {
        return this.body;
    }

}
