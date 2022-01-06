// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class EnableApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableApplicationMonitorResponseBody body;

    public static EnableApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationMonitorResponse self = new EnableApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationMonitorResponse setBody(EnableApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
