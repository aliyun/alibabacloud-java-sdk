// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMonitorGroupInstancesResponseBody body;

    public static CreateMonitorGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupInstancesResponse self = new CreateMonitorGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorGroupInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorGroupInstancesResponse setBody(CreateMonitorGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
