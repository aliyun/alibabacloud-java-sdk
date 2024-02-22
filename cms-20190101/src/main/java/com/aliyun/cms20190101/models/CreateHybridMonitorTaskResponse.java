// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHybridMonitorTaskResponseBody body;

    public static CreateHybridMonitorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridMonitorTaskResponse self = new CreateHybridMonitorTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridMonitorTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridMonitorTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHybridMonitorTaskResponse setBody(CreateHybridMonitorTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridMonitorTaskResponseBody getBody() {
        return this.body;
    }

}
