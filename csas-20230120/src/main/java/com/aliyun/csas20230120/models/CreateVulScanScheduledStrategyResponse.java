// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVulScanScheduledStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVulScanScheduledStrategyResponseBody body;

    public static CreateVulScanScheduledStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVulScanScheduledStrategyResponse self = new CreateVulScanScheduledStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateVulScanScheduledStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVulScanScheduledStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVulScanScheduledStrategyResponse setBody(CreateVulScanScheduledStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVulScanScheduledStrategyResponseBody getBody() {
        return this.body;
    }

}
