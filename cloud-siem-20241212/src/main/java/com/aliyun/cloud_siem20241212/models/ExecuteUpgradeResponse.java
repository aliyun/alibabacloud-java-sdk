// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ExecuteUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteUpgradeResponseBody body;

    public static ExecuteUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteUpgradeResponse self = new ExecuteUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteUpgradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteUpgradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteUpgradeResponse setBody(ExecuteUpgradeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteUpgradeResponseBody getBody() {
        return this.body;
    }

}
