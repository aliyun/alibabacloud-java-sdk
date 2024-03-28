// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationMonitorResponseBody body;

    public static CreateApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationMonitorResponse self = new CreateApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationMonitorResponse setBody(CreateApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
