// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListScheduleMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduleMonitorResponseBody body;

    public static ListScheduleMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleMonitorResponse self = new ListScheduleMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduleMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduleMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduleMonitorResponse setBody(ListScheduleMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduleMonitorResponseBody getBody() {
        return this.body;
    }

}
