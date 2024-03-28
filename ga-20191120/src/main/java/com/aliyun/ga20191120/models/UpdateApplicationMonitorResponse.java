// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateApplicationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationMonitorResponse setBody(UpdateApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
