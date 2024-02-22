// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHybridMonitorTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHybridMonitorTaskResponseBody body;

    public static DeleteHybridMonitorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridMonitorTaskResponse self = new DeleteHybridMonitorTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHybridMonitorTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHybridMonitorTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHybridMonitorTaskResponse setBody(DeleteHybridMonitorTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHybridMonitorTaskResponseBody getBody() {
        return this.body;
    }

}
