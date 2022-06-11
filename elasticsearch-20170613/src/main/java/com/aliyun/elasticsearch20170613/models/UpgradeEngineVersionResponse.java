// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeEngineVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeEngineVersionResponseBody body;

    public static UpgradeEngineVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEngineVersionResponse self = new UpgradeEngineVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeEngineVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeEngineVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeEngineVersionResponse setBody(UpgradeEngineVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeEngineVersionResponseBody getBody() {
        return this.body;
    }

}
