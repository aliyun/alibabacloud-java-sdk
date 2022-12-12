// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartDiskMonitorResponseBody body;

    public static StartDiskMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDiskMonitorResponse self = new StartDiskMonitorResponse();
        return TeaModel.build(map, self);
    }

    public StartDiskMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDiskMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDiskMonitorResponse setBody(StartDiskMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDiskMonitorResponseBody getBody() {
        return this.body;
    }

}
