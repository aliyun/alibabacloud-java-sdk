// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVulScanScheduledStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVulScanScheduledStrategyResponseBody body;

    public static GetVulScanScheduledStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulScanScheduledStrategyResponse self = new GetVulScanScheduledStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetVulScanScheduledStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulScanScheduledStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVulScanScheduledStrategyResponse setBody(GetVulScanScheduledStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulScanScheduledStrategyResponseBody getBody() {
        return this.body;
    }

}
