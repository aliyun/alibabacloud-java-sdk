// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVirusScanScheduledStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirusScanScheduledStrategyResponseBody body;

    public static CreateVirusScanScheduledStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanScheduledStrategyResponse self = new CreateVirusScanScheduledStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanScheduledStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirusScanScheduledStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirusScanScheduledStrategyResponse setBody(CreateVirusScanScheduledStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirusScanScheduledStrategyResponseBody getBody() {
        return this.body;
    }

}
