// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckMonitorAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckMonitorAlertResponse setBody(CheckMonitorAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMonitorAlertResponseBody getBody() {
        return this.body;
    }

}
