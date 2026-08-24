// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVirusScanScheduledStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVirusScanScheduledStrategyResponseBody body;

    public static UpdateVirusScanScheduledStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirusScanScheduledStrategyResponse self = new UpdateVirusScanScheduledStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVirusScanScheduledStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVirusScanScheduledStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVirusScanScheduledStrategyResponse setBody(UpdateVirusScanScheduledStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirusScanScheduledStrategyResponseBody getBody() {
        return this.body;
    }

}
