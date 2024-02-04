// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckMonitorAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckMonitorAlertResponseBody body;

    public static CheckMonitorAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMonitorAlertResponse self = new CheckMonitorAlertResponse();
        return TeaModel.build(map, self);
    }

    public CheckMonitorAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMonitorAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMonitorAlertResponse setBody(CheckMonitorAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMonitorAlertResponseBody getBody() {
        return this.body;
    }

}
