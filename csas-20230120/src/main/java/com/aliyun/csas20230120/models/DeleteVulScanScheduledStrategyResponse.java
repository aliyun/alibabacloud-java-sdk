// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteVulScanScheduledStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVulScanScheduledStrategyResponseBody body;

    public static DeleteVulScanScheduledStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulScanScheduledStrategyResponse self = new DeleteVulScanScheduledStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVulScanScheduledStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVulScanScheduledStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVulScanScheduledStrategyResponse setBody(DeleteVulScanScheduledStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVulScanScheduledStrategyResponseBody getBody() {
        return this.body;
    }

}
