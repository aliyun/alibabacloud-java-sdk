// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVulScanScheduledStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVulScanScheduledStrategyResponseBody body;

    public static UpdateVulScanScheduledStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVulScanScheduledStrategyResponse self = new UpdateVulScanScheduledStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVulScanScheduledStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVulScanScheduledStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVulScanScheduledStrategyResponse setBody(UpdateVulScanScheduledStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVulScanScheduledStrategyResponseBody getBody() {
        return this.body;
    }

}
