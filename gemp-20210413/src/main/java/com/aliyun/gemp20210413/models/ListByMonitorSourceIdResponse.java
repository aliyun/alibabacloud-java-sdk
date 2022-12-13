// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListByMonitorSourceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListByMonitorSourceIdResponseBody body;

    public static ListByMonitorSourceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListByMonitorSourceIdResponse self = new ListByMonitorSourceIdResponse();
        return TeaModel.build(map, self);
    }

    public ListByMonitorSourceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListByMonitorSourceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListByMonitorSourceIdResponse setBody(ListByMonitorSourceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListByMonitorSourceIdResponseBody getBody() {
        return this.body;
    }

}
