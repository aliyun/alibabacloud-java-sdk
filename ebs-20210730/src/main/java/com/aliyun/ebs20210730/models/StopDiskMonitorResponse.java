// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StopDiskMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopDiskMonitorResponseBody body;

    public static StopDiskMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDiskMonitorResponse self = new StopDiskMonitorResponse();
        return TeaModel.build(map, self);
    }

    public StopDiskMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDiskMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDiskMonitorResponse setBody(StopDiskMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDiskMonitorResponseBody getBody() {
        return this.body;
    }

}
