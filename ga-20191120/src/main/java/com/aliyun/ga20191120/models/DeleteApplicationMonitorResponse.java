// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationMonitorResponseBody body;

    public static DeleteApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationMonitorResponse self = new DeleteApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationMonitorResponse setBody(DeleteApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
