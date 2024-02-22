// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteLogMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLogMonitorResponseBody body;

    public static DeleteLogMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogMonitorResponse self = new DeleteLogMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogMonitorResponse setBody(DeleteLogMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogMonitorResponseBody getBody() {
        return this.body;
    }

}
