// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateScheduleMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScheduleMonitorResponseBody body;

    public static CreateScheduleMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleMonitorResponse self = new CreateScheduleMonitorResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduleMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduleMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduleMonitorResponse setBody(CreateScheduleMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduleMonitorResponseBody getBody() {
        return this.body;
    }

}
