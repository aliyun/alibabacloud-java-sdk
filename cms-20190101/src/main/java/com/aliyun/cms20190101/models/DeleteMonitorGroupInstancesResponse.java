// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMonitorGroupInstancesResponseBody body;

    public static DeleteMonitorGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupInstancesResponse self = new DeleteMonitorGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMonitorGroupInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMonitorGroupInstancesResponse setBody(DeleteMonitorGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
