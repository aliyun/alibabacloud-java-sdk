// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVulScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVulScanTaskResponseBody body;

    public static CreateVulScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVulScanTaskResponse self = new CreateVulScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVulScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVulScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVulScanTaskResponse setBody(CreateVulScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVulScanTaskResponseBody getBody() {
        return this.body;
    }

}
