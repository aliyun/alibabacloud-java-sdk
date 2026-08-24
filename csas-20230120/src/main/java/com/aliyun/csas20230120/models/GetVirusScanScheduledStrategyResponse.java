// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVirusScanScheduledStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVirusScanScheduledStrategyResponseBody body;

    public static GetVirusScanScheduledStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanScheduledStrategyResponse self = new GetVirusScanScheduledStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetVirusScanScheduledStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVirusScanScheduledStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVirusScanScheduledStrategyResponse setBody(GetVirusScanScheduledStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVirusScanScheduledStrategyResponseBody getBody() {
        return this.body;
    }

}
