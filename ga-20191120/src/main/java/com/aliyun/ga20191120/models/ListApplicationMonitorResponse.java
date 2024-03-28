// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationMonitorResponseBody body;

    public static ListApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMonitorResponse self = new ListApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationMonitorResponse setBody(ListApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
