// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CreateCloudMonitorSLRResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudMonitorSLRResponseBody body;

    public static CreateCloudMonitorSLRResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudMonitorSLRResponse self = new CreateCloudMonitorSLRResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudMonitorSLRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudMonitorSLRResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudMonitorSLRResponse setBody(CreateCloudMonitorSLRResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudMonitorSLRResponseBody getBody() {
        return this.body;
    }

}
