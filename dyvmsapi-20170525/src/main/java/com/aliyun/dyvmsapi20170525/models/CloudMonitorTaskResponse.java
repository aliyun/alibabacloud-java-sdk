// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudMonitorTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudMonitorTaskResponseBody body;

    public static CloudMonitorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitorTaskResponse self = new CloudMonitorTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloudMonitorTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudMonitorTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudMonitorTaskResponse setBody(CloudMonitorTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudMonitorTaskResponseBody getBody() {
        return this.body;
    }

}
