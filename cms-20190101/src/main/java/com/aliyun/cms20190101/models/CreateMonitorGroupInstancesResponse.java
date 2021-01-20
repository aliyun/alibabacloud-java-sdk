// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMonitorGroupInstancesResponse setBody(CreateMonitorGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
