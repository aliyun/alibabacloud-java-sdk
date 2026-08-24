// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CancelVulScanTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelVulScanTasksResponseBody body;

    public static CancelVulScanTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelVulScanTasksResponse self = new CancelVulScanTasksResponse();
        return TeaModel.build(map, self);
    }

    public CancelVulScanTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelVulScanTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelVulScanTasksResponse setBody(CancelVulScanTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelVulScanTasksResponseBody getBody() {
        return this.body;
    }

}
