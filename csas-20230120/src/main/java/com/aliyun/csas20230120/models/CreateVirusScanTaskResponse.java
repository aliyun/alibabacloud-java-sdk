// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVirusScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirusScanTaskResponseBody body;

    public static CreateVirusScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanTaskResponse self = new CreateVirusScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirusScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirusScanTaskResponse setBody(CreateVirusScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirusScanTaskResponseBody getBody() {
        return this.body;
    }

}
