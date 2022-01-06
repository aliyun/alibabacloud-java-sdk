// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateApplicationMonitorResponseBody body;

    public static UpdateApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationMonitorResponse self = new UpdateApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationMonitorResponse setBody(UpdateApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
